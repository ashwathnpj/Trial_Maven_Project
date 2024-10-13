package com.trial.Trial_Maven_Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_Page_1 {
	WebDriver driver;

	@FindBy(name="q")
	WebElement search_box;
	
	public void search_India() {
		search_box.sendKeys("India"+Keys.ENTER);
	}

	public Demo_Page_1(WebDriver driver) {
		PageFactory.initElements(driver, this);;
	}
}
