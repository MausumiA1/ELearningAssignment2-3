package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM {
	private WebDriver driver; 
	
	public RegistrationPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[contains(text(),'Teach courses')]")
	private WebElement teachCourses; 
	
	@FindBy(id="registration_firstname")
	private WebElement regFirstName; 
	
	@FindBy(id="registration_lastname")
	private WebElement regLastName;
	
	@FindBy(id="registration_email")
	private WebElement regEmail;
	
	@FindBy(id="username")
	private WebElement regUserName;
	
	@FindBy(id="pass1")
	private WebElement regPassword;
	
	@FindBy(id="pass2")
	public WebElement regConfirmPass;
	
	@FindBy(id="registration_phone")
	private WebElement regPhone; 
	
	@FindBy(xpath="//button[@data-id='registration_language']")
	private WebElement regLangBtn;
	
	@FindBy(xpath="//div[@class='bs-searchbox']/input[@type='text']")
	private WebElement regLangTextBox;
	
	@FindBy(xpath="//a[@role='option'][1]")
	private WebElement regLang;
	
	@FindBy(id="registration_submit")
	private WebElement registerBtn;
	
	@FindBy(xpath="//div[@class='col-xs-12 col-md-12']/p")
	private List<WebElement> readRegSuccessMessage;
	
	@FindBy(xpath="//div[@class='col-xs-12 col-md-12']//p")
	private List<WebElement> msg;
	
	@FindBy(xpath="//div[@class='alert alert-warning']")
	private WebElement alertMsg;
	
	@FindBy(xpath="//li[@class='dropdown avatar-user']")
	private WebElement loggedInUser;
	
	@FindBy(id="logout_button")
	private WebElement logOutBtn;
	
	
	public String alertMessage(){
		return alertMsg.getText();
	}
	
	public boolean MsgValidation(String Name){
		String ActualMsg="";
		for(int i=0;i<msg.size()-1;i++){
		String msgText=msg.get(i).getText();
		ActualMsg=ActualMsg+" "+msgText;
		}
		String expectedText=" Dear "+Name+",\n\nYour personal settings have been registered. An e-mail has been sent to remind you of your login and password.";
		
		return expectedText.contains(ActualMsg);
	}
	
	
	public void clickRegisterBtn(){
		registerBtn.click();
	}
	
	public void clickTeachCourses() {
		this.teachCourses.click();
	}
	
	public void setRegFirstName(String regFirstName) {
		this.regFirstName.clear();
		this.regFirstName.sendKeys(regFirstName);
	}
	
	public void setRegLastName(String regLastName) {
		this.regLastName.clear();
		this.regLastName.sendKeys(regLastName);
	}
	
	public void setRegEmail(String regEmail) {
		this.regEmail.clear();
		this.regEmail.sendKeys(regEmail);
	}
	
	public void setRegUserName(String regUserName) {
		this.regUserName.clear();
		this.regUserName.sendKeys(regUserName);
	}
	
	public void setRegPassword(String regPassword) {
		this.regPassword.clear();
		this.regPassword.sendKeys(regPassword);
	}
	
	public void setRegConfirmPass(String regConfirmPass) {
		this.regConfirmPass.clear();
		this.regConfirmPass.sendKeys(regConfirmPass);
	}
	
	public void setRegPhone(String regPhone) {
		this.regPhone.clear();
		this.regPhone.sendKeys(regPhone);
	}
	
	public void selRegLanguage(String regLang) {
		this.regLangBtn.click();
		this.regLangTextBox.clear();
		this.regLangTextBox.sendKeys(regLang);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.regLang.click();
	}
	
	public void setRegPhone() {
		this.registerBtn.click();
	}
	
	public void logOut() {
		this.loggedInUser.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.logOutBtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
