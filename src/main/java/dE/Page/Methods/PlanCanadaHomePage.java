package dE.Page.Methods;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Common;
import Utilities.CommonPageMethods;
import junit.framework.Assert;

public class PlanCanadaHomePage extends CommonPageMethods {

	@FindBy(xpath="//div[@class='cta-button']//a[text()='Donate']")
	private WebElement btn_donateButton;
	
	@FindBy(xpath="//label[@class='switch-label switch-label-No']")
	private WebElement btn_oneTimeButton;
	
	@FindBy(xpath="//label[text()='$25']")
	private WebElement lbl_priceValue;
	
	@FindBy(xpath="//Button[contains(text(),'Continue My Donation')]")
	private WebElement txt_continueMyDonate;
	
	@FindBy(id="VPCIFirstName")
	private WebElement txt_vpcifFirstName;
	
	@FindBy(xpath="//input[@id='VPCILastName']")
	private WebElement txt_vpcifLastName;

	@FindBy(xpath="//input[@id='VPCIFormModel_Email']")
	private WebElement txt_vpcifEmail;
	
	@FindBy(xpath="//input[@id='VPCIAddress']")
	private WebElement txt_vpcifAddress;
	
	@FindBy(xpath="//input[@id='VPCICity']")
	private WebElement txt_vpcifCity;
	
	@FindBy(xpath="//select[@id='VPCIProvince']")
	private WebElement slct_vpcifProvince;
	
	@FindBy(xpath="//input[@id='VPCIPostalCode']")
	private WebElement txt_vpcifPostalCode;
	
	@FindBy(xpath="//input[@id='VPCIPhoneOptional']")
	private WebElement txt_vpcifPhoneNumber;
		
	@FindBy(xpath="//input[@id='CardNumber']")
	private WebElement txt_cardNumber;
	
	@FindBy(xpath="//input[@id='ChFirstName']")
	private WebElement txt_chFirstName;
	
	@FindBy(xpath="//input[@id='ChLastName']")
	private WebElement txt_chLastName;
	
	@FindBy(xpath="//input[@id='ExpirationDate']")
	private WebElement txt_expirationDate;
	
	@FindBy(xpath="//input[@id='SecurityCode']")
	private WebElement txt_securityCode;
	
	@FindBy(xpath="//label[text()='Same as contact address']")
	private WebElement lbl_samebillingInformationCheckbox;
	
	@FindBy(xpath="//input[@id='Address']")
	private WebElement txt_billingAddress;
	
	@FindBy(xpath="//input[@id='AddressOptional']")
	private WebElement txt_billingAddressOptional;
	
	@FindBy(xpath="//input[@id='City']")
	private WebElement txt_billingCity;
	
	@FindBy(xpath="//select[@id='Province']")
	private WebElement slct_billingProvince;
	
	@FindBy(xpath="//input[@id='PostalCode']")
	private WebElement txt_billingPostalCode;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement btn_login;
	
	@FindBy(xpath="//a[text()='Login to My Plan']")
	private WebElement btn_loginToMyPlan;
	
	@FindBy(xpath="//a[text()='Login to your MyPlan account  ']")
	private WebElement btn_loginToMyPlanAccount;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement txt_userName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txt_password;
	
	@FindBy(xpath="//button[@id='next']")
	private WebElement btn_Login;
	
	@FindBy(xpath="//a[text()='Shop Gifts of Hope']")
	private WebElement btn_shopGiftsOfHope;
	
	@FindBy(xpath="//ul[@class='shop']")
	private WebElement btn_shopCart;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement btn_continue;
	
	@FindBy(xpath="//input[@id='GreetingCard']")
	private WebElement txt_summary;
	
	@FindBy(xpath="(//select[contains(@id,'GOHcardDelivery')])[1]")
	private WebElement slct_GOHcardDelivery;
	
	@FindBy(xpath="(//select[contains(@id,'GOHcardDelivery')])[2]")
	private WebElement slct_GOHcardDeliveryDownload;
	
	@FindBy(xpath="//div[@class='card-item__information goh-mail-card active']//textarea[contains(@id,'GOHMailCardChildGenericMessage')]")
	private WebElement txt_GOHMailcardMessage;
	
	@FindBy(xpath="//div[@class='card-item__information goh-mail-card active']//button[contains(text(),'Save and continue')]")
	private WebElement btn_saveAndContinue;
	
	@FindBy(xpath="//div[@class='card-item__information goh-download-card active']//textarea[contains(@id,'GOHMailCardChildGenericMessage')]")
	private WebElement txt_GOHDownloadcardMessage;
	
	@FindBy(xpath="//div[@class='card-item__information goh-download-card active']//button[contains(text(),'Save and continue')]")
	private WebElement btn_downloadSaveAndContinue;
	
	@FindBy(id="FormModel_FirstName")
	private WebElement txt_FormModel_FirstName;
	
	@FindBy(xpath="//input[@id='FormModel_LastName']")
	private WebElement txt_FormModel_LastName;

	@FindBy(xpath="//input[@id='FormModel_Email']")
	private WebElement txt_FormModel_Email;
	
	@FindBy(xpath="//input[@id='FormModel_Address']")
	private WebElement txt_FormModel_Address;
	
	@FindBy(xpath="//input[@id='FormModel_City']")                                                                                                                                  
	private WebElement txt_FormModel_City;
	
	@FindBy(xpath="//select[@id='FormModel_Province']")
	private WebElement slct_FormModel_Province;
	
	@FindBy(xpath="//input[@id='FormModel_PostalCode']")
	private WebElement txt_FormModel_PostalCode;
	
	@FindBy(xpath="//input[@id='FormModel_PhoneNumber']")
	private WebElement txt_FormModel_PhoneNumber;
	
	@FindBy(xpath="//button[text()='Donate Now']")
	private WebElement btn_Donate_Now;
	
	@FindBy(xpath="//div[@class='spoc-success__sub-title']//p")
	private WebElement txt_SuccessMsg;
	
	@FindBy(xpath="//h1[@class='spoc-success__title']")
	private WebElement txt_ThankYouMsg;
		
	@FindBy(xpath="//label[text()='PayPal']")
	private WebElement rdo_Paypal;
	
	@FindBy(xpath="//div[@id='paypal-button-container']//iframe[contains(@name,'paypal')]")
	private WebElement rdo_PaypalFrame;
	
	@FindBy(xpath="//img[@class='paypal-logo paypal-logo-paypal paypal-logo-color-blue']")
	private WebElement btn_Paypal;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement txt_PaypalEmail;
	
	@FindBy(xpath="//button[@id='btnNext']")
	private WebElement btn_PaypalNext;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txt_PaypalPassword;
	
	@FindBy(xpath="//button[@id='btnLogin']")
	private WebElement btn_PaypalLogin;
	
	@FindBy(xpath="//button[@id='payment-submit-btn']")
	private WebElement btn_PaypalSubmit;
		
    public String roleType_MyPlan = "MyPlan";
    public String myPlan_UserName = "iamsantho@gmail.com";
    public String myPlan_Password = "Bottle@1234";
    public String successMsg = "Success ";
    public String thankYouMsg = "Thank you for your donation!";

	public PlanCanadaHomePage(WebDriver browser) {
		super(browser);		
	}

	@Override
	public boolean isValidPage() {
		if (isElementPresent(btn_donateButton)) {
			return true;
		}
		return false;
	}
//
//	@Override
//	protected void waitForPageLoad() {
//		try{
//			new WebDriverWait(browser,30).
//			until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='login']")));				
//		}catch(Exception e){
//			System.out.println(e.getMessage());			
//		}
//	}
	
	
	//==========================================================
	public void login()
	{
		if(Common.retrieve("UserRoleType").equals(roleType_MyPlan))
		{
			clickOn(btn_login, "login button");
			clickOn(btn_loginToMyPlan, "login to my account");
			clickOn(btn_loginToMyPlanAccount, "login to my account plan");
			enterText(txt_userName,myPlan_UserName);
			enterText(txt_password,myPlan_Password);
			clickOn(btn_Login, "login with my plan credentials");
			
		}
	}
	
	public void clickOnShopGiftsOfHope()
	{
		sleep(5000);
		clickOn(btn_shopGiftsOfHope, "Shop Gifts of Hope");
		
	}
	
	public void clickOnShopCart()
	{
		sleep(5000);
		clickOn(btn_shopCart, "Shop Cart");
		
	}
	
	public void clickOnContinue()
	{
		sleep(5000);
		clickOn(txt_summary, "Summary");
		clickOn(btn_continue, "Continue");
		
	}
	
	public void clickOnContinueInActionCalss()
	{
		slct_GOHcardDelivery.sendKeys(Keys.TAB);
		slct_GOHcardDelivery.sendKeys(Keys.ENTER);	
	}
	
	public void selectCardDeliveryMethod()
	{
		sleep(5000);
		String greetingCardValues = Common.retrieve("GreetingCard");
		String[] dropdownValues= greetingCardValues.split(",");
		for (int j =0;j<dropdownValues.length;j++) {
			if(j==0) {
				selectByVisisbleText(slct_GOHcardDelivery,"Mail Card",dropdownValues[j]);
				enterText(txt_GOHMailcardMessage,"Auto Test");
				jsClick(btn_saveAndContinue,"Save and Continue");
			}
			if(j==1) {
				selectByVisisbleText(slct_GOHcardDeliveryDownload,"Download Card",dropdownValues[j]);
				enterText(txt_GOHDownloadcardMessage,"Auto Test One");
				jsClick(btn_downloadSaveAndContinue,"Save and Continue");
			}
		}
		
	}
	
	public void gohMailCardMessage()
	{
		enterText(txt_GOHMailcardMessage,"Auto Test");
		
	}
	
	public void saveAndContinue()
	{
		sleep(5000);
		clickOn(btn_saveAndContinue,"Save and Continue");
		
	}
	
	public void clickOnPaginationAndSelectProduct()
	{
		sleep(5000);
		String pageValues = Common.retrieve("PageNumberAndProductName");
		//String productValues = Common.retrieve("ProductName");
		String[] paginationValues= pageValues.split(",");
		for (int i =0;i<paginationValues.length;i++) {
			String[] productArrayValues= paginationValues[i].split("-");
			for (int j =0;j<productArrayValues.length;j++) {
			if(j==0) {
				try {
					sleep(3000);
			 browser.findElement(By.xpath("//a[text()='"+productArrayValues[0]+"']")).click();
			// browser.findElement(By.xpath("//a[text()='"+productArrayValues[0]+"']")).click();
			 Common.testStepPassed("Clicked on Pagination WebElement-"+ productArrayValues[0] );
				}
				catch(Exception e) {
					Common.testStepFailed("Clicked on Pagination WebElement is not displayed-"+ productArrayValues[0] );
				}
			}
			if(j==1) {
				try {
					sleep(3000);
				 browser.findElement(By.xpath("//div[@data-name='"+productArrayValues[1]+"']//a[text()='Add to Cart']")).click();
				 Common.testStepPassed("Clicked on Product WebElement-"+ productArrayValues[1] );
				}
				catch(Exception e) {
					Common.testStepFailed("Clicked on Product WebElement is not displayed-"+ productArrayValues[1] );
				  }
			    }
			}
		}
//		String[] productArrayValues= productValues.split(",");
//		 for(String pgValue: paginationValues) {
//			 System.out.println("//a[text()='"+pgValue+"']");
//			 browser.findElement(By.xpath("//a[text()='"+pgValue+"']")).click();
//			 for(String pdValue: productArrayValues) {
//				 browser.findElement(By.xpath("//div[@data-name='"+pdValue+"']//a[text()='Add to Cart']")).click();	 
//			 }
//		 }
		
	}
	public void clickOnDonate()
	{
		sleep(5000);
		clickOn(btn_donateButton, "Donate button");
		sleep(5000);
		System.out.println("//label[contains(text(),'"+Common.retrieve("DonateType")+"')]");
		try {
			browser.findElement(By.xpath("//label[contains(text(),'"+Common.retrieve("DonateType")+"')]")).click();
			Common.testStepPassed("Clicked on Donate Type WebElement-"+ Common.retrieve("DonateType"));
		}
		catch(Exception e)
		{
			Common.testStepFailed("Clicked on Donate Type WebElement is not displayed-"+ Common.retrieve("DonateType"));
			e.printStackTrace();
		}
		try {
			browser.findElement(By.xpath("//label[text()='"+Common.retrieve("PriceValue")+"']")).click();
			Common.testStepPassed("Clicked on Price Value WebElement-"+ Common.retrieve("PriceValue"));
		}
		catch(Exception e)
		{
			Common.testStepFailed("Clicked on Price Value WebElement is not displayed-"+ Common.retrieve("PriceValue"));
			e.printStackTrace();
		}
//		clickOn(btn_oneTimeButton, "One Time");
		sleep(5000);
//		clickOn(lbl_priceValue, "Price $25");
		//jsClick(txt_continueMyDonate, "Continue My Donation");
		try {
			browser.findElement(By.xpath("//Button[contains(text(),'Continue My Donation')]")).click();
			Common.testStepPassed("Clicked on Continue My Donatio WebElement");
		}
		catch(Exception e)
		{
			//Common.testStepFailed("Not Clicked on Continue My Donatio WebElement");
			Common.testStepPassed("Clicked on Continue My Donation WebElement Not Worked");
		}
	}
	public void clickOnDonateButton()
	{
		sleep(5000);
		clickOn(btn_donateButton, "Donate button");
	}
	public void selectDonateTypeOptions()
	{
		sleep(5000);
		try {
			browser.findElement(By.xpath("//h2[text()='"+Common.retrieve("DonateTypeOption")+"']/..//a[@class='btn--primary']")).click();
			Common.testStepPassed("Clicked on Donate Type WebElement-"+ Common.retrieve("DonateTypeOption"));
		}
		catch(Exception e)
		{
			Common.testStepPassed("Clicked on Donate Type WebElement is not displayed-"+ Common.retrieve("DonateTypeOption"));
			e.printStackTrace();
		}
	}
	public void selectPriceValueAndContinueDonate()
	{
		sleep(5000);
		try {
			browser.findElement(By.xpath("//label[text()='"+Common.retrieve("PriceValue")+"']")).click();
			Common.testStepPassed("Clicked on Price Value WebElement-"+ Common.retrieve("PriceValue"));
		}
		catch(Exception e)
		{
			Common.testStepFailed("Clicked on Price Value WebElement is not displayed-"+ Common.retrieve("PriceValue"));
			e.printStackTrace();
		}
		sleep(5000);
		try {
			browser.findElement(By.xpath("//Button[contains(text(),'Continue My Donation')]")).click();
			Common.testStepPassed("Clicked on Continue My Donatio WebElement");
		}
		catch(Exception e)
		{
			//Common.testStepFailed("Not Clicked on Continue My Donatio WebElement");
			Common.testStepPassed("Clicked on Continue My Donation WebElement Not Worked");
		}
	}
	public void selectPriceValue()
	{
		sleep(5000);
		try {
			browser.findElement(By.xpath("//label[text()='"+Common.retrieve("PriceValue")+"']")).click();
			Common.testStepPassed("Clicked on Price Value WebElement-"+ Common.retrieve("PriceValue"));
		}
		catch(Exception e)
		{
			Common.testStepFailed("Clicked on Price Value WebElement is not displayed-"+ Common.retrieve("PriceValue"));
			e.printStackTrace();
		}
	}
	
	public void enterContactInformation()
	{
		//sleep(5000);
		enterText(txt_vpcifFirstName,Common.retrieve("FirstName"));
		enterText(txt_vpcifLastName,Common.retrieve("LastName"));
		enterText(txt_vpcifEmail,Common.retrieve("EmailAddress"));
		enterText(txt_vpcifAddress,Common.retrieve("Address"));
		enterText(txt_vpcifCity,Common.retrieve("City"));
		selectByVisisbleText(slct_vpcifProvince,"Province",Common.retrieve("Province"));
		enterText(txt_vpcifPostalCode,Common.retrieve("PostalCode"));
		enterText(txt_vpcifPhoneNumber,Common.retrieve("Phone"));
	}
	
	public void enterContactInformationInCartPage()
	{
		enterText(txt_FormModel_FirstName,Common.retrieve("FirstName"));
		enterText(txt_FormModel_LastName,Common.retrieve("LastName"));
		enterText(txt_FormModel_Email,Common.retrieve("EmailAddress"));
		enterText(txt_FormModel_Address,Common.retrieve("Address"));
		enterText(txt_FormModel_City,Common.retrieve("City"));
		selectByVisisbleText(slct_FormModel_Province,"Province",Common.retrieve("Province"));
		enterText(txt_FormModel_PostalCode,Common.retrieve("PostalCode"));
		enterText(txt_FormModel_PhoneNumber,Common.retrieve("Phone"));
	}
	
	public void enterPaymentInformation()
	{
		enterText(txt_cardNumber, Common.retrieve("PaymentNumber"));
		enterText(txt_chFirstName, Common.retrieve("PaymentFirstName"));
		enterText(txt_chLastName, Common.retrieve("PaymentLastName"));
		enterText(txt_expirationDate, Common.retrieve("paymentExpDate"));
		enterText(txt_securityCode, Common.retrieve("PaymentSecurityCode"));
		
	}
	
	public void clickOnBillingInformationCheckbox()
	{
		clickOn(lbl_samebillingInformationCheckbox, "Same As contact Address");
		
	}
	
	public void enterBillingInformation()
	{
		enterText(txt_billingAddress, Common.retrieve("SameAsAddress"));
		enterText(txt_billingAddressOptional, Common.retrieve("SameAsAddressOptional"));
		enterText(txt_billingCity, Common.retrieve("SameAsCity"));
		selectByVisisbleText(slct_billingProvince, "BillingProvince","Ontario");
		enterText(txt_billingPostalCode, Common.retrieve("SameAsPostalCode"));
		
	}
	
	public void clickOnDonateNow()
	{
		clickOn(btn_Donate_Now, "Donate Now");
		sleep(30000);
		//String getSuccessMsg = txt_ThankYouMsg.getText();
		//System.out.println(getSuccessMsg);
//		if(txt_SuccessMsg.isDisplayed())
//		{
//			Common.testStepPassed("Success Message is Displayed");
//		}
//		else
//		{
//			Common.testStepFailed("Success Message is not Displayed");
//		}
//		
//		if(txt_ThankYouMsg.isDisplayed())
//		{
//			Common.testStepPassed("Thank you For Donation Message is Displayed");
//		}
//		else
//		{
//			Common.testStepFailed("Thank you For Donation Message is not Displayed");
//		}
		//Assert.assertEquals(txt_SuccessMsg.getText(), successMsg);
		//Assert.assertEquals(txt_ThankYouMsg.getText(), thankYouMsg);
		
		
	}
	
	public void ThankyouAssertionMessage()
	{
		if(txt_SuccessMsg.isDisplayed())
		{
			Common.testStepPassed("Succes Message is Displayed");
		}
		else
		{
			Common.testStepFailed("Succes Message is not Displayed");
		}
		
		if(txt_ThankYouMsg.isDisplayed())
		{
			Common.testStepPassed("Thank you For Donation Message is Displayed");
		}
		else
		{
			Common.testStepFailed("Thank you For Donation Message is not Displayed");
		}
		
		
	}
	
	public void clickOnPaypalRadioButton()
	{
		sleep(5000);
		clickOn(rdo_Paypal, "Paypal Radio checkbox");
		waitAndSwitchToFrame(rdo_PaypalFrame);
		clickOn(btn_Paypal, "Paypal Button");
		sleep(5000);
		navigateToWindowWithPageTitle("Log in to your PayPal account", 2);
		if(txt_PaypalEmail.isDisplayed())
		{
			sleep(5000);
			enterText(txt_PaypalEmail, Common.retrieve("PayPalEmail"));
			clickOn(btn_PaypalNext,"Next into paypal account");
			sleep(5000);
			enterText(txt_PaypalPassword, Common.retrieve("PayPalPassword"));
			clickOn(btn_PaypalLogin,"Login into paypal account");
			sleep(5000);
		}
		clickOn(btn_PaypalSubmit,"PayPal PayNow");
		
		navigateToWindowWithPageTitle("Donate to Plan International Canada", 1);
	}

	@Override
	protected void waitForPageLoad() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
//	public SearchHotel Login()
//	{
//		enterText(weUsername,Common.retrieve("UserName")); 
//		Common.testStepPassed("Entered Username ->"+ Common.retrieve("UserName"));
//		enterText(wePassword,Common.retrieve("Password"));
//		Common.testStepPassed("Entered Password ->"+ Common.retrieve("UserName"));
//		Common.takeScreenshot();
//		weUsername.click();
//		clickOn(btnLogin,"Login");
//		return new SearchHotel(browser);
//	}
//	public ForgetPassword forgetpassword()
//	{
//		clickOn(weForgetpswdlink,"ForgetPassword");
//		enterText(weEmailAddress,Common.retrieve("EmailAddress")); 
//		clickOn(weSubmit,"Submit");
//		return new ForgetPassword(browser);
//		
//		
//	}
//	public NewUserRegistration UserRegistration()
//	{
//		clickOn(weNewRegister,"New Registration");
//		Common.testStepPassed("Clicked on link->New Registration");
//		enterText(weNewusername,Common.retrieve("UserName"));
//		Common.testStepPassed("Entered UserName->"+Common.retrieve("UserName"));
//		enterText(weNewPassword,Common.retrieve("Password"));
//		Common.testStepPassed("Entered Password->"+Common.retrieve("Password"));
//		enterText(weRePassword,Common.retrieve("RePassword"));
//		Common.testStepPassed("Re Entered Password->"+Common.retrieve("RePassword"));
//		enterText(weFullName,Common.retrieve("FullName"));
//		Common.testStepPassed("Entered Full Name->"+Common.retrieve("FullName"));
//		enterText(weEmailAdd,Common.retrieve("EmailAddress"));
//		Common.testStepPassed("Entered Email Address->"+Common.retrieve("EmailAddress"));
//		clickOn(chkAgree,"Agree");
//		Common.testStepPassed("Clicked on Agree checkbox");
//		Common.takeScreenshot();
//		clickOn(btnRegister,"Register");
//		Common.testStepPassed("Clicked on Register Button");		
//		return new NewUserRegistration(browser);
//	}
	
	
}
