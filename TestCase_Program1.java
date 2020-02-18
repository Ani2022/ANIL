package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_Program1 {
	public WebDriver driver;
	@BeforeClass
	public void launch(){
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Training\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}
	@Test 
	  public void clickLogin() {
		  driver.findElement(By.xpath("//a[@href='/login']")).click();
		  
	  }
	  @Test 
	  public void login(){
		    driver.findElement(By.id("Email")).sendKeys("abcdef@123.com");
		    driver.findElement(By.id("Password")).sendKeys("Abc@123");
		    driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  String expected="abcdef@123.com";
		  String actual=driver.findElement(By.linkText("abcdef@123.com")).getText();
		  Assert.assertEquals(expected,actual);
	  }
	  @Test 
	  public void logout(){
		  
		  driver.findElement(By.xpath("//a[@href='/logout']")).click();
		  driver.close();
	  }
}
