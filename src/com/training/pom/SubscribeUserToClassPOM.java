package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribeUserToClassPOM {
private WebDriver driver; 
	
	public SubscribeUserToClassPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='elements_not_in']/option[1]")
	public WebElement selUserToAssign;
	
	@FindBy(xpath="//em[@class='fa fa-arrow-right']")
	public WebElement assignUserToClass;
	
	@FindBy(xpath="//button[contains(text(),'Subscribe users to class')]")
	public WebElement subscribeUserToClass;
	
	public String clickUserToAssign()
	{
		String users=selUserToAssign.getText();
		selUserToAssign.click();
		return users;
	}
	
	public void clickAssignArrow()
	{
		assignUserToClass.click();
	}
	
	public ClassesPOM clicksubscribeUserToClassBtn()
	{
		subscribeUserToClass.click();
		return new ClassesPOM(driver);
	}
	
	
	
	
	
	
}
