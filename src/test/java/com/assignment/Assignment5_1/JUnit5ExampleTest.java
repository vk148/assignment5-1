package com.assignment.Assignment5_1;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.Assert;
 
class JUnit5ExampleTest {
 
    @Test
    void justAnExample() {
        System.out.println("This test method should be run");
    }
    @Test
    public void testAppSuccess()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\vijay\\Training\\edureka\\Assignments\\Assignment.5\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Starting Test Case-1- Success Scenario");
		driver.get("http://13.233.89.115:3001/");
		String x = driver.getTitle();
	    System.out.println(x);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("login")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("click")).click(); 
		System.out.println(driver.findElement(By.name("hello")).getText());
		Assert.assertTrue(driver.findElement(By.name("hello")).getText().contains("Login Succeeded"));
		System.out.println("Completed Test Case-1- Success Scenario");
		driver.quit();
    }
    
    @Test
    public void testAppFail()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\vijay\\Training\\edureka\\Assignments\\Assignment.5\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Starting Test Case-2- Success Scenario");
		driver.get("http://13.233.89.115:3001/");
		String x = driver.getTitle();
	    System.out.println(x);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("login")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user2");
		driver.findElement(By.name("click")).click(); 
		System.out.println(driver.findElement(By.name("hello")).getText());
		Assert.assertTrue(driver.findElement(By.name("hello")).getText().contains("Login Failed!"));
		System.out.println("Completed Test Case-2- Success Scenario");
		driver.quit();
    }
}