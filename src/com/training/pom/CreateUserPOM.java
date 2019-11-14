package com.training.pom;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPOM {
	private WebDriver driver; 
	private WebElement selProfile;

	
	public CreateUserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	private WebElement firstName;
	
	@FindBy(id="lastname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement userEmail;
	
	@FindBy(id="phone")
	private WebElement userPhone;
	
	//Pending
	@FindBy(id="picture")
	private WebElement addImageBrowseBtn;
	
	@FindBy(id="username")
	private WebElement loginUserName;
	
	@FindBy(xpath="//input[@name='password[password_auto]'][@value='1']")
	private WebElement selAutoGenPass;
	
	@FindBy(xpath="//input[@name='password[password_auto]'][@value='0']")
	private WebElement selEnterManualPass;
	
	@FindBy(xpath="//input[@name='password[password]']")
	private WebElement pass;
	
	@FindBy(xpath="//*[@class='password-verdict']")
	private WebElement passStrength;
	
	@FindBy(xpath="//button[@data-id='status_select']")
	private WebElement profileField;
	
	//Pending
	@FindBy(xpath="//a[@role='option']")
	private List<WebElement> allProfile;
	
	@FindBy(xpath="//button[@data-id='user_add_language']")
	private WebElement langField;
	
	//Pending
	@FindBy(xpath="//a[@role='option']")
	private List<WebElement> allLangs;
	
	@FindBy(xpath="//input[@name='mail[send_mail]'][@value='1']")
	private WebElement mailToNewUser;
	
	@FindBy(xpath="//input[@name='mail[send_mail]'][@value='0']")
	private WebElement noMailToNewUser;
	
	@FindBy(xpath="//input[@name='radio_expiration_date'][@value='1']")
	private WebElement neverExpire;
	
	@FindBy(xpath="//input[@name='radio_expiration_date'][@value='0']")
	private WebElement setExpire;
	
	@FindBy(xpath="//img[@class='ui-datepicker-trigger']")
	private WebElement datePickerIcon;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private List<WebElement> monthPicker;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private List<WebElement> yearPicker;
	
	@FindBy(xpath="//td[@data-handler='selectDay']")
	private List<WebElement> datePicker;
	
	@FindBy(xpath="//button[text()='Done']")
	private WebElement setDate;
	
	@FindBy(xpath="//input[@name='active'][@value='1']")
	private WebElement activeAccount;
	
	@FindBy(xpath="//input[@name='active'][@value='0']")
	private WebElement inactiveAccount;
	
	@FindBy(xpath="//input[@id='extra_legal_accept']")
	private WebElement legal;
	
	@FindBy(xpath="//button[text()=' Add']")
	private WebElement add;
	
	@FindBy(xpath="//button[text()=' Add+']")
	private WebElement addMore;
	
	@FindBy(xpath="//div[@class='alert alert-warning']")
	private WebElement warningMessage;
	
	
	
	public WebElement getWarningMessage() {
		return warningMessage;
	}

	public void setFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	
	public void setEmail(String email) {
		this.userEmail.clear();
		this.userEmail.sendKeys(email);
	}
	
	public void setPhone(String phone) {
		this.userPhone.clear();
		this.userPhone.sendKeys(phone);
	}
	
	public void loginUserName(String loginUser) {
		this.loginUserName.clear();
		this.loginUserName.sendKeys(loginUser);
	}
	
	public void selAutoGenPass() {
		this.selAutoGenPass.click();
	}
	
	public String setPass(String pass) {
		this.selEnterManualPass.click();
		this.pass.clear();
		this.pass.sendKeys(pass);
		return passStrength.getText();
	}
	
	public String setProfile(String profile) {
		this.profileField.click();
		for(int i=0;i<allProfile.size();i++) {
			if(this.allProfile.get(i).getText().trim().equalsIgnoreCase(profile))
			{
				this.selProfile=allProfile.get(i);
				break;
			}
			
		}
		this.selProfile.click();
		return selProfile.getText();
	}
	
	public UserListPOM clickAdd() {
		this.add.click();
		return new UserListPOM(driver);
	}
	
	public String checkWarning()
	{
		return warningMessage.getText();
	}
	
	public CreateUserPOM clickAddMore() {
		this.addMore.click();
		return new CreateUserPOM(driver);
	}
	
	

}
