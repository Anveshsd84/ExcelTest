package com.openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenrowserTest {
	
	
      @Test
      public void openBrowser(){
    	  System.out.println("browser opening");
      WebDriver driver=new FirefoxDriver();
      driver.get("file:///D:/Selenium%20Data/Selenium%20Software1/Offline%20Website/index.html");
      driver.manage().window().maximize();
      System.out.println("browser opened");
      
  
}
}
