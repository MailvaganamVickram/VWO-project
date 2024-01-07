package testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class VWO {
	
	
	
	
	@Test(threadPoolSize = 3,invocationCount = 3, description = "Login" )
	public void Login() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		
		String title = driver.getTitle();
		System.out.println("Title is :" +title );
		
		Assert.assertEquals(Util.Title, title, "This is wrong tile");
		Thread.sleep(4000);
		driver.navigate().to(Util.Base_URL);
		System.out.println("This is Login Page");	
		
		driver.close();
	}
	
	@Test (threadPoolSize = 3,invocationCount = 3, description = "Login2")
	public void Login2() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Wrong_Email_Id);
		
		driver.findElement(By.id("login-password")).sendKeys(Util.Wrong_PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(4000);
        driver.close();
		
	}
	@Test (threadPoolSize = 3,invocationCount = 3, description = "Login3")
	public void Login3() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Wrong_Email_Id);
		
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(4000);
        driver.close();
		
	}
	@Test (threadPoolSize = 3,invocationCount = 3, description = "Login4")
	public void Login4() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id);
		
		driver.findElement(By.id("login-password")).sendKeys(Util.Wrong_PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(4000);
        driver.close();
	}
}
	
	
	


