package Utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import jxl.Sheet;

import org.w3c.dom.Document;
import org.w3c.dom.Element;




public class PropertiesFile
  extends DataDriver
{
  public static File nf;
  
  public PropertiesFile() {}
  
  public static final ArrayList<String> testCases = new ArrayList();
  public static HashMap<String, String> category = new HashMap<String, String>();
  
  public static void properties() {
    Properties prop = new Properties();
    try
    {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder docBuilder = dbf.newDocumentBuilder();
      Document doc = docBuilder.newDocument();
      Element rootElement = doc.createElement("suite");
      doc.appendChild(rootElement);
      Element test = doc.createElement("test");
      Element classes = doc.createElement("classes");
      Element classs = doc.createElement("class");
      Element methods = doc.createElement("methods");
      rootElement.appendChild(test);
      test.appendChild(classes);
      classes.appendChild(classs);
      classes.appendChild(methods);
      
      rootElement.setAttribute("name", "Suite");
      rootElement.setAttribute("parallel", "none");
      rootElement.setAttribute("configfailurepolicy", "continue");
      test.setAttribute("name", "Test");
      test.setAttribute("preserve-order", "true");
      classs.setAttribute("name", "TestCases.TestCases");
      TransformerFactory tff = TransformerFactory.newInstance();
      DataDriver.useExcelSheet("./src/test/resources/TestConfiguration.xls", 1);
      Sheet readsheet = w.getSheet(0);
      
      for (int i = 1; i < readsheet.getRows(); i++) {
        String Keyword = readsheet.getCell(1, i).getContents();
        String value = readsheet.getCell(2, i).getContents();
        prop.setProperty(Keyword, value);
      }
    //  System.out.println(prop.get("TestDataSheetNumber"));
      //System.out.println(prop.get("TestCaseSettingSheetNumber"));

      prop.store(new FileOutputStream(
        "./config/TestConfiguration.properties"), null);
      w.close();
      
      int TestCaseSettings_SheetNumber = Integer.parseInt(Common.getConfigProperty("TestCaseSettingSheetNumber"));
      int TestCaseSettings_SheetValue = TestCaseSettings_SheetNumber+1;
      DataDriver.useExcelSheet(Common.getConfigProperty("Tc_Settings_Excelpath"), 1);
      Sheet readsheet1 = w.getSheet(TestCaseSettings_SheetNumber);
      for (int i = 1; i < readsheet1.getRows(); i++)
      {
        String value = readsheet1.getCell(5, i).getContents();
        if (value.trim().equalsIgnoreCase("Yes"))
        {
          Element include = doc.createElement("include");
          methods.appendChild(include);
          Keyword = readsheet1.getCell(3, i).getContents();
          categoryvalue = readsheet1.getCell(2, i).getContents();
          testCases.add(Keyword);
          category.put(Keyword, categoryvalue);
          include.setAttribute("name", Keyword);
        } else if (value.trim().equalsIgnoreCase("No")) {
          Element exclude = doc.createElement("exclude");
          methods.appendChild(exclude);
          String Keyword = readsheet1.getCell(3, i).getContents();
          exclude.setAttribute("name", Keyword);
        }
        else if (!value.trim().equalsIgnoreCase(""))
        {
          System.out.println("Warnin!!Invalid/Empty Execution flag");
        }
      }
      

      Transformer transformer = tff.newTransformer();
      transformer.setOutputProperty("indent", "yes");
      transformer.setOutputProperty(
        "{http://xml.apache.org/xslt}indent-amount", "2");
      DOMSource xmlSource = new DOMSource(doc);
      StreamResult outputTarget = new StreamResult(
        ".\\config\\testng.xml");
      transformer.transform(xmlSource, outputTarget);
      w.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static String Keyword;
  public static String categoryvalue;
}
