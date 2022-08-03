package TestCases;

import java.io.File;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import PageMethods.SearchHotel;
//import PageMethods.SelectHotel;
import Utilities.Common;
import Utilities.GenericKeywords;
import Utilities.TestLinkConnection;
import Utilities.CommonPageMethods;
import dE.Page.Methods.BaseClassPage;
import dE.Page.Methods.PlanCanadaHomePage;


@Listeners({ Utilities.TestListener.class })
public class TestCases extends Common {

	public static int count = 1;
	private BaseClassPage planCanadaApplication;
	private PlanCanadaHomePage planCanadaHomePage;
	
	



	@BeforeClass
	public void start(){	
		GenericKeywords.extent.loadConfig(new File("./Config/extent-config.xml"));		
	}


	public void testStart(String testCaseDescription) {
		GenericKeywords.testFailure = false;
		GenericKeywords.currentStep = 0;
		reportStart(GenericKeywords.testCaseName,testCaseDescription);
		planCanadaApplication=new BaseClassPage();
		planCanadaHomePage=planCanadaApplication.openPlanCanadaApplication();

	}

	public void testEnd() {
		try {
			planCanadaApplication.close();			
		} catch (Exception e) {
			System.out.println("Expception : " + e.getMessage());
		}finally{
			GenericKeywords.extent.endTest(GenericKeywords.parent);
			GenericKeywords.extent.flush();	
			if(getConfigProperty("UpdateTestLinkStatus").toString().trim().toUpperCase().equals("YES")){
				if(GenericKeywords.testFailure){
					TestLinkConnection.updateExecutionStatus(GenericKeywords.testCaseName, "", "FAIL");					
				}else{
					TestLinkConnection.updateExecutionStatus(GenericKeywords.testCaseName, "passed", "PASS");
				}
			}
		}
	}


	@Test(alwaysRun = true)
	public void GOH_Single_Product_Mail_Card() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("GOH Single Product Mail Card");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.clickOnShopGiftsOfHope();
			planCanadaHomePage.clickOnPaginationAndSelectProduct();
			planCanadaHomePage.clickOnShopCart();
			planCanadaHomePage.clickOnContinue();
			planCanadaHomePage.selectCardDeliveryMethod();
//			planCanadaHomePage.gohMailCardMessage();
//			planCanadaHomePage.saveAndContinue();
			planCanadaHomePage.clickOnContinue();
			//planCanadaHomePage.clickOnContinueInActionCalss();
			planCanadaHomePage.enterContactInformationInCartPage();
			planCanadaHomePage.clickOnContinue();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.clickOnContinue();
			
			testStepInfoEnd(testDataSet);
		}
		testEnd();

	}
	
	@Test(alwaysRun = true)
	public void Donate_As_A_GuestUser_OneTime() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Donate As A Guest User");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.clickOnDonate();	
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.clickOnBillingInformationCheckbox();
			planCanadaHomePage.clickOnDonateNow();
			
			testStepInfoEnd(testDataSet);
			
		}
		testEnd();

	}
	
	@Test(alwaysRun = true)
	public void Donate_As_A_GuestUser_Monthly() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Donate As A Guest User");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.clickOnDonate();	
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.clickOnBillingInformationCheckbox();
			planCanadaHomePage.clickOnDonateNow();
			testStepInfoEnd(testDataSet);
		}
		testEnd();

	}
	@Test(alwaysRun = true)
	public void Donate_As_A_GuestUser_OneTime_SameBillingAddress() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Donate As A Guest User");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.clickOnDonate();	
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.enterBillingInformation();
			planCanadaHomePage.clickOnDonateNow();
			testStepInfoEnd(testDataSet);
		}
		testEnd();

	}
	
	@Test(alwaysRun = true)
	public void Donate_As_A_GuestUser_OneTime_Paypal() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Donate As A Guest User");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.clickOnDonate();	
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.clickOnPaypalRadioButton();
			planCanadaHomePage.ThankyouAssertionMessage();
			testStepInfoEnd(testDataSet);
		}
		testEnd();

	}
	@Test(alwaysRun = true)
	public void Donate_As_A_LoginUser_OneTime() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Donate As A Login User");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.login();
			planCanadaHomePage.clickOnDonate();	
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.clickOnBillingInformationCheckbox();
			planCanadaHomePage.clickOnDonateNow();
			
			testStepInfoEnd(testDataSet);
			
		}
		testEnd();

	}
	@Test(alwaysRun = true)
	public void Donate_As_A_LoginUser_OneTime_SameBillingAddress() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Donate As A Login User Same Billing Address");
			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.login();
			planCanadaHomePage.clickOnDonate();	
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.enterBillingInformation();
			planCanadaHomePage.clickOnDonateNow();
			testStepInfoEnd(testDataSet);
		}
		testEnd();

	}
	
	@Test(alwaysRun = true)
	public void Donate_As_A_LoginUser_OneTime_Paypal() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Donate As A Login User With PayPal");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.login();
			planCanadaHomePage.clickOnDonate();	
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.clickOnPaypalRadioButton();
			planCanadaHomePage.ThankyouAssertionMessage();
			testStepInfoEnd(testDataSet);
		}
		testEnd();

	}
	@Test(alwaysRun = true)
	public void Because_I_Am_Girl_Donate_As_A_GuestUser_Monthly_SameBillingAddress() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Because I Am Girl Donate As A Guest User Monthly");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.clickOnDonateButton();
			planCanadaHomePage.selectDonateTypeOptions();
			planCanadaHomePage.selectPriceValueAndContinueDonate();
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.clickOnBillingInformationCheckbox();
			planCanadaHomePage.clickOnDonateNow();
			//planCanadaHomePage.ThankyouAssertionMessage();
			testStepInfoEnd(testDataSet);
			
		}
		testEnd();

	}
	@Test(alwaysRun = true)
	public void Because_I_Am_Girl_Donate_As_A_LoginUser_Monthly_SameBillingAddress() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Because I Am Girl Donate As A Login User Monthly");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.login();
			planCanadaHomePage.clickOnDonateButton();
			planCanadaHomePage.selectDonateTypeOptions();
			planCanadaHomePage.selectPriceValueAndContinueDonate();
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.clickOnBillingInformationCheckbox();
			planCanadaHomePage.clickOnDonateNow();
			//planCanadaHomePage.ThankyouAssertionMessage();
			testStepInfoEnd(testDataSet);
		}
		testEnd();

	}
	@Test(alwaysRun = true)
	public void PlanForChildrenFund_Donate_As_A_GuestUser_Monthly_SameBillingAddress() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Plan For Children Fund Donate As A Guest User Monthly");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.clickOnDonateButton();
			planCanadaHomePage.selectDonateTypeOptions();
			planCanadaHomePage.selectPriceValue();
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.clickOnBillingInformationCheckbox();
			planCanadaHomePage.clickOnDonateNow();
			//planCanadaHomePage.ThankyouAssertionMessage();
			testStepInfoEnd(testDataSet);
			
		}
		testEnd();

	}
	@Test(alwaysRun = true)
	public void PlanForChildrenFund_Donate_As_A_LoginUser_Monthly_SameBillingAddress() {
		GenericKeywords.testCaseName = new Exception().getStackTrace()[0].getMethodName();
		testStart("Plan For Children Fund Donate As A Login User Monthly");


			for (String testDataSet : GenericKeywords.testCaseDataSets) {
			GenericKeywords.testCaseDataRow = returnRowNumber(testDataSet);
			testStepInfoStart(testDataSet);
			Common.testStepPassed("Opened Application Successfully and Maximize The Browser");
			planCanadaHomePage.isValidPage();
			planCanadaHomePage.login();
			planCanadaHomePage.clickOnDonateButton();
			planCanadaHomePage.selectDonateTypeOptions();
			planCanadaHomePage.selectPriceValue();
			planCanadaHomePage.enterContactInformation();
			planCanadaHomePage.enterPaymentInformation();
			planCanadaHomePage.clickOnBillingInformationCheckbox();
			planCanadaHomePage.clickOnDonateNow();
			//planCanadaHomePage.ThankyouAssertionMessage();
			testStepInfoEnd(testDataSet);
		}
		testEnd();

	}




	


	

}
