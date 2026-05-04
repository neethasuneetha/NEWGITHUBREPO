package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
	  Thread.sleep(2000);
	  driver.findElement(By.name("userName")).sendKeys("izin");
	  driver.findElement(By.name("password")).sendKeys("izin");
	  driver.findElement(By.name("submit")).click();


  }
}
