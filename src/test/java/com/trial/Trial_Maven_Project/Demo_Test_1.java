package com.trial.Trial_Maven_Project;

import org.testng.annotations.Test;


public class Demo_Test_1 extends LaunchQuit {
	@Test
	public void search_product() {
		 Demo_Page_1 search=new  Demo_Page_1(driver);
		 search.search_India();
	}
}
