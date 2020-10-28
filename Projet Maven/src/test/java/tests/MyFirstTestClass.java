package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

/**
 * First class of tests
 * 
 * @author jaramend
 *
 */
public class MyFirstTestClass extends BaseTest {

	/**
	 * First test
	 */
	@Test(description = "Test description", groups = { "group1" })
	public void testOne() {
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//img[@alt=\"logo du ministère de l\'intérieur\"])[2]")));
		}
		driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("adminNational");
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("MDPadminNational123!");
		driver.findElement(By.xpath("//button[contains(.,\'Connexion\')]")).click();
	}

	/**
	 * Second test
	 */
	@Test(description = "Test description", groups = { "group1" })
	public void testTwo() {
		/**
		 * Test code
		 */
	}

}