package com.test.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunApplication {
	
	public static WebDriver driver=null;
	public static String url="https://www.amazon.in";
	public static String chromePath="D:\\GitDemo\\amazon_demo\\drivers\\chromedriver.exe";
	
	 public static String signin="//*[@id='nav-link-yourAccount']/span[1]";
	 public static String username="//*[@id='ap_email']";
	 public static String password="//*[@id='ap_password']";
	 public static  String continueBtn="//*[@id=\"continue\"]";
	 public static String loginbtn="//*[@id='signInSubmit']";
	 
	public static void main(String[] args) {
		
				
		System.setProperty("webdriver.chrome.driver",chromePath);
		driver =new ChromeDriver();
		System.out.println("entered into application");
		
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//driver.get(url);
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath(signin)).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath(username)).sendKeys("anamikajoshi25@gmail.com");
		driver.findElement(By.xpath(continueBtn)).click();
		driver.findElement(By.xpath(password)).sendKeys("amazon@123");
		driver.findElement(By.xpath(loginbtn)).click();
		
		// TODO Auto-generated method stub

	}

}
