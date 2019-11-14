package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPOM {
	private WebDriver driver; 
	public UserListPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	public WebElement userAddedAlert;
	
	@FindBy(xpath="//div[@class='col-xs-12 col-sm-6 col-md-4'][1]//a[@alt]")
	private WebElement courseName;
	
	public MyCoursePOM clickCourse()
	{
		this.courseName.click();
		return new MyCoursePOM(driver);
		
	}
	
	public String alertMessage()
	{
		return userAddedAlert.getText();
		
	}
	
	
	
	
	
}
