package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunch {

	public static void main(String[] args)throws InterruptedException {
		//To load your driver file  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//To establish network connection from remote
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//creating object for chrome driver
		
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver();//To open and maximize the window.
		driver.manage().window().maximize();
		//To open a url 
		driver.get("https://www.facebook.com/");
		//To print the title of web page
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();//To close the browser
			
	}
	

	

	}

