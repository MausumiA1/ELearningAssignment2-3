package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPOM {
	private WebDriver driver; 
	
	public HeaderPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//a[@class='dropdown-toggle']")
	private WebElement userImg; 
		
	@FindBy(xpath="//a[@title='Homepage']")
	private WebElement homePage; 
	
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement myCourses;
	
	@FindBy(xpath="//a[@title='Personal agenda']")
	private WebElement personalAgenda; 
	
	@FindBy(xpath="//a[@title='Reporting']")
	private WebElement reporting; 
	
	@FindBy(xpath="//a[@title='Social network']")
	private WebElement socialNetwork;
	
	@FindBy(xpath="//a[@title='Dashboard']")
	private WebElement dashBoard; 
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement Administrator;
	
	public UserListPOM clickHomeMenuBtn() {
		this.homePage.click();
		return new UserListPOM(driver);
	}
	public void clickMyCoursesBtn() {
		this.myCourses.click(); 
	}
	public void clickAgendaBtn() {
		this.personalAgenda.click(); 
	}
	public void clickReportingBtn() {
		this.reporting.click(); 
	}
	public void clickSocialNetworkBtn() {
		this.socialNetwork.click(); 
	}
	public void clickDashBoardBtn() {
		this.dashBoard.click(); 
	}
	public AdminPOM clickAdminBtn() {
		this.Administrator.click(); 
		return new AdminPOM(driver);
	}
	
	public boolean isLoginSuccessfully() {
		try{
		if(userImg.isDisplayed())
			return true;
		}catch(Exception e) {
			return false;
		}
		return false;
	}
}
