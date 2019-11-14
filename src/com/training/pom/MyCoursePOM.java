package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCoursePOM {
	private WebDriver driver; 
	
	public MyCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
/*	//div[@class="inner open"]//li[not(contains(@class,"disabled"))][1]
	enable element */
	@FindBy(id="istooldesc_1757")
	private WebElement assesmentsLink; 
		
	@FindBy(xpath="//img[@title='Add online activity']")
	private WebElement addOnlineActivityIcon; 
	
	@FindBy(xpath="//span[contains(text(),'Tests')]")
	private WebElement selTest;
	
	@FindBy(xpath="//div[contains(text(),'[Choose type of activity to assess]")
	private WebElement activityTypeToAssess; 
	
	@FindBy(id="weight_mask")
	private WebElement weightage;
	
	@FindBy(xpath="//input[@name='visible']")
	private WebElement visibilityCheckBox;
	
	@FindBy(id="add_link_submit")
	private WebElement addLearningActivityToAssesmentBtn; 
	
	@FindBy(xpath="")
	private WebElement Administrator;
	
	public void clickAssesmentsLink() {
		this.assesmentsLink.click();
	}
	
	public void clickAddOnlineActivityIcon() {
		this.addOnlineActivityIcon.click(); 
	}
	
	public void chooseActitivityType() {
		this.activityTypeToAssess.click();
		this.selTest.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setWeightage(String weightage) {
		this.weightage.clear(); 
		this.weightage.sendKeys(weightage);
	}
	
	public void isVisibiltyChecked() {
		if(!visibilityCheckBox.isSelected())
		{
			this.visibilityCheckBox.click();
		}	
	}
	public void clickAddLearningActivityToAssesmentBtn() {
		this.addLearningActivityToAssesmentBtn.click(); 
	}
	
	public AdminPOM clickAdminBtn() {
		this.Administrator.click(); 
		return new AdminPOM(driver);
	}
	
//	public boolean isLoginSuccessfully() {
//		try{
//		if(userImg.isDisplayed())
//			return true;
//		}catch(Exception e) {
//			return false;
//		}
//		return false;
//	}
}
