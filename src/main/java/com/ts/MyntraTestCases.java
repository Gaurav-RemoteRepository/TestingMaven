package com.ts;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyntraTestCases {

	@Test
	public void verifyListOfProductsWhenMenFilterIsAppliedForLevis() {
		RemoteWebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);

		driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("input[@class=\"desktop-searchBar\"]")).sendKeys("Levis" + Keys.ENTER);
		By menFilter = By.xpath("(//label[contains(@class,'gender')]/parent::li)[1]/label");
		wait.until(ExpectedConditions.presenceOfElementLocated(menFilter)).click();
		List<WebElement> productDescriptions = driver.findElements(By.xpath("//h4[@class=\"product-product\"]"));
		for (WebElement productDescription : productDescriptions) {
			if (productDescription.getText().contains("Men")) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		}
	}

}
