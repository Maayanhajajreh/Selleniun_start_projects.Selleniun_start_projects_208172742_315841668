package Selleniun_start_projects.Selleniun_start_projects;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Password {
static WebDriver  browser;
	
	@Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		      browser.get(url);
		
	  }
	@Test
	public void CorrectPassword() {
		 browser.findElement(By.name("characters")).sendKeys("reem234");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Valid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();


}
	@Test
	public void LenghtPasswordMoreThan7() {
		 browser.findElement(By.name("characters")).sendKeys("reem2345");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();

		 



	}
	@Test
	public void LenghtPasswordLessThan7() {
		 browser.findElement(By.name("characters")).sendKeys("Mayan1");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();




	}
	
	@Test
	public void inappropriateLetters() {
		 browser.findElement(By.name("characters")).sendKeys("Mayan1@");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);



	}
	@Test
	public void inappropriateLetters2() {
		 browser.findElement(By.name("characters")).sendKeys("123Ree$");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();




	}
	@Test
	public void inappropriateLetters3() {
		 browser.findElement(By.name("characters")).sendKeys("Majd19^");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue="Invalid Value";
		 String result= browser.findElement(By.name("validation_message")).toString();
		 assertNotEquals(result,expectedValue);
		 browser.close();




	}



}

