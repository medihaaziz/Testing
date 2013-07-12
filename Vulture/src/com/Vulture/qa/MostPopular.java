package com.Vulture.qa;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class MostPopular {

	WebDriver driver; 
	@Test 
	public void test() throws Exception { 

	DesiredCapabilities capability = DesiredCapabilities.safari();
	System.setProperty("webdriver.chrome.driver", "C:\\DevTools\\chromedriver.exe"); 
	
	driver= new ChromeDriver(); 
	driver.get("http://www.vulture.com");
      List<WebElement> links = driver.findElements(By.xpath("/html/body/div[3]/div[2]/div/div[3]/div[2]/div/div[3]/div/section[2]/ul"));
        int linkcount = links.size(); 
         
        for (WebElement myElement : links){
        String link = myElement.getText(); 
        System.out.println(link);
        System.out.println(myElement); 
       /* for(int i=0;i<links.size();i++){ 
            System.out.println(links.get(i).getText());*/
            try{ 
            	driver.findElement(By.xpath("//*[@id='number-1']")).click();
            	System.out.println("Clicked link 1");
                Thread.sleep(3000); 
               String aText= driver.findElement(By.xpath("/*[@id='entry-116096']/div[1]/div[2]/header/h1")).getText(); 
               
               System.out.println(aText);
                driver.navigate().back();
            	}catch (Exception e){ 	
            			//System.out.println(e);
            	}
            try{ 
            	driver.findElement(By.xpath("//*[@id='number-2']")).click();
            	System.out.println("Clicked link 2");
                Thread.sleep(3000);
                String bText= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/article/div/div[2]/header/h1")).getText(); 
                System.out.println(bText);
                driver.navigate().back();
           	}catch (Exception e){ 	
            			System.out.println(e);
            		}
           try{ 
            	driver.findElement(By.xpath("//*[@id='number-3']")).click();
            	System.out.println("Clicked link 3");
                Thread.sleep(3000); 
                String cText= driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/article/div/div[2]/header/h1")).getText(); 
                System.out.println(cText);
                driver.navigate().back();
            		}catch (Exception e){ 	
            			System.out.println(e);
            		}
           try{ 
            	driver.findElement(By.xpath("//*[@id='number-4']")).click();
            	System.out.println("Clicked link 4");
                Thread.sleep(3000);
                String dText= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/article/div/div/header/h1")).getText(); 
                System.out.println(dText);
                driver.navigate().back();
            }catch (Exception e){ 	
            		System.out.println(e);
            }
           try{ 
            	driver.findElement(By.xpath("//*[@id='number-5']")).click();
            	System.out.println("Clicked link 5");
                Thread.sleep(3000); 
                String eText= driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/article/div/div/header/h1/i")).getText(); 
                System.out.println(eText);
                driver.navigate().back();
            	}catch (Exception e){ 	
            		System.out.println(e);
            		}
           try{ 
            	driver.findElement(By.xpath("//*[@id='number-6']")).click();
            	System.out.println("Clicked link 6");
                Thread.sleep(3000); 
                String fText= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/article/div/div/header/ul[2]")).getText(); 
                System.out.println(fText);
                driver.navigate().back();
            	}catch (Exception e){ 	
            		System.out.println(e);
            	}
            try{ 
            	driver.findElement(By.xpath("//*[@id='number-7']")).click();
            	System.out.println("Clicked link 7");
                Thread.sleep(6000); 
                String gText= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/article/div/div[2]/header/h1/i")).getText(); 
                System.out.println(gText);
                driver.navigate().back();
            		}catch (Exception e){ 	
            			System.out.println(e);
            	}
           try{ 
            	driver.findElement(By.xpath("//*[@id='number-8']")).click();
            	System.out.println("Clicked link 8");
                Thread.sleep(6000); 
                String hText= driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/article/div/div/header/h1")).getText(); 
                System.out.println(hText);
                driver.navigate().back();
            		}catch (Exception e){ 	
            		System.out.println(e);
            	}
           try{ 
            	driver.findElement(By.xpath("//*[@id='number-9']")).click();
            	System.out.println("Clicked link 9");
            	String iText= driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/article/div/div/header/h1")).getText(); 
                System.out.println(iText);
                Thread.sleep(3000); 
               driver.navigate().back();
            	}catch (Exception e){ 	
            		System.out.println(e);
            	}
           
             
}// driver.quit(); 
        }
}
