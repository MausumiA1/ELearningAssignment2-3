package com.training.pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseListPOM {
	WebDriver driver ;
	public CourseListPOM(WebDriver driver) {
		this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//table[@id='course-list']//tr")
		private List<WebElement> RowCount; 
		
		@FindBy(xpath="//td[@class='title']")
		private List<WebElement> CourseTitle;
		
		@FindBy(xpath="//td[@class='td_actions']//img[@title='Delete']")
		private List<WebElement> DeleteButton;
		
		
		
		public String deleteCourse() {

			try {
				String CategoryName=CourseTitle.get(0).getText();
				DeleteButton.get(0).click();
				return CategoryName;
				}catch(Exception e) {
					return "none";
				}
		}
		
		public List<String> getCourseName(){
			ArrayList<String> CourseName=new ArrayList<String>();
			for(int i=0;i<CourseTitle.size();i++) {
				CourseName.add(CourseTitle.get(i).getText().trim());
			}
			return CourseName;
		}
		
		public String getMessage() {
			try{
				return driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			}catch(Exception e) {
				System.out.println(e);
				return "none";
			}
		}

}
