package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VWODashboard {

	@Test(threadPoolSize = 3, invocationCount =3, priority = 1)
	public void Testing() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id1);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(3000);
	
		WebElement ddown = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[2]/button"));
		ddown.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[2]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test(threadPoolSize = 3, invocationCount =3, priority = 2)
	public void Insights() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id1);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(3000);
	
		WebElement ddown = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/button"));
		ddown.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/vwo-modal-component/div/div[3]/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/ul/li[7]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/ul/li[8]/a")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(threadPoolSize = 3, invocationCount =3, priority = 3)
	public void FullStack() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id1);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(3000);
	
		WebElement ddown = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]/button"));
		ddown.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test(threadPoolSize = 3, invocationCount =3, priority = 4)
	public void Personaliize() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id1);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(3000);
		WebElement Pbtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[5]/a"));
		Pbtn.click();
		driver.close();
		
	}
	@Test(threadPoolSize = 3, invocationCount =3, priority = 5)
	public void WebRollout() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id1);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(3000);
		WebElement Pbtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[6]/a"));
		Pbtn.click();
		driver.close();
		
	}
	
	//
	@Test(threadPoolSize = 3, invocationCount =3, priority = 6)
	public void Data360() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id1);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(3000);
	
		WebElement ddown = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[7]/button"));
		ddown.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[7]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[7]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[7]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[7]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[7]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[7]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[7]/ul/li[7]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[7]/ul/li[8]/a")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	
	@Test(threadPoolSize = 3, invocationCount =3, priority = 7)
	public void Plan() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id1);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(3000);
	
		WebElement ddown = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[8]/button"));
		ddown.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[8]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[8]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[8]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
	@Test(threadPoolSize = 3, invocationCount =3, priority = 8)
	public void Services() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id1);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(3000);
		WebElement sbtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[11]/a[1]"));
		sbtn.click();
		driver.close();
		
	}
	
	@Test(threadPoolSize = 3, invocationCount =3, priority = 9)
	public void Updates() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get(Util.Base_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Util.Email_Id1);
		driver.findElement(By.id("login-password")).sendKeys(Util.PASSWORD);
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(3000);
		WebElement ubtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[11]/a[2]"));
		ubtn.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
