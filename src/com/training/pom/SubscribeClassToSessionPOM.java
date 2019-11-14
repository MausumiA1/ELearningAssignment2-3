package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribeClassToSessionPOM {
private WebDriver driver; 
	
	public SubscribeClassToSessionPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath="//*[@id='elements_not_in']/option[1]")
	public WebElement selSession;
	
	@FindBy(xpath="//em[@class='fa fa-arrow-right']")
	public WebElement arrowBtn;
	
	@FindBy(xpath="//button[contains(text(),'Subscribe class to sessions')]")
	public WebElement subscribeClassToSession;
	
	public String clickSession()
	{
		String users=selSession.getText();
		selSession.click();
		return users;
	}
	
	public void clickAssignArrow()
	{
		arrowBtn.click();
	}
	
	public ClassesPOM clicksubscribeClassToSessionBtn()
	{
		subscribeClassToSession.click();
		return new ClassesPOM(driver);
	}
	
	
	
	
}
