package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribeClassToCourcesPOM {
private WebDriver driver; 
	
	public SubscribeClassToCourcesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@id='elements_not_in']/option[1]")
	public WebElement selCourseToAssign;
	
	@FindBy(xpath="//em[@class='fa fa-arrow-right']")
	public WebElement assignCourseToClass;
	
	@FindBy(xpath="//button[contains(text(),'Subscribe class to courses')]")
	public WebElement subscribeClassToCourse;
	
	public String clickCourseToAssign()
	{
		String users=selCourseToAssign.getText();
		selCourseToAssign.click();
		return users;
	}
	
	public void clickAssignArrow()
	{
		assignCourseToClass.click();
	}
	
	public ClassesPOM clicksubscribeClassToCourseBtn()
	{
		subscribeClassToCourse.click();
		return new ClassesPOM(driver);
	}
	
	
	
	
	
	
}
