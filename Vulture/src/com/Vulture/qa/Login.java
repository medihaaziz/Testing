package com.Vulture.qa;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Login {
	
	WebDriver driver; 
	@Test 
	public void Test1() throws Exception{ 
		driver= new FirefoxDriver(); 
		driver.navigate().to("http://www.qa.vulture.com"); 
		driver.findElement(By.className("login-lightbox")).click(); 		
				Set<String> handlers = driver.getWindowHandles();  
			      if (driver.getWindowHandles().size()>= 1){  
			        for(String handler : handlers){  
			         driver.switchTo().window(handler);
			         driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/header/nav[2]/div[2]/div[4]/div/div[3]/div/div[2]/div/a")).click(); 
			       
			         Set<String> handlers2 = driver.getWindowHandles();  
				      if (driver.getWindowHandles().size()>= 1){  
				        for(String handler1 : handlers2){  
				         driver.switchTo().window(handler1);
				         if (driver.getTitle().equalsIgnoreCase("facebook") ){
				         driver.findElement(By.xpath("//*[@id='email']")).sendKeys("johnfashionista@gmail.com"); 
				         driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("fashion7"); 
				         driver.findElement(By.xpath("//*[@id='u_0_1']")).click(); 
				         if (driver.findElement(By.xpath("/html/body/div[2]/form/div/div[2]/div/div/div[2]/button")).isDisplayed()){ 
				        	 driver.findElement(By.xpath("/html/body/div[2]/form/div/div[2]/div/div/div[2]/button")).click(); 
				        	 Thread.sleep(6000); 
				         }
				         
			         /*driver.findElement(By.id("id_login")).sendKeys("blue57@yahoo.com");
		}	         driver.findElement(By.id("id_password")).sendKeys("blue57"); 
			         driver.findElement(By.id("submit1")).click();*/
}}}}}
	
	}
	
	
	
	
	
}
