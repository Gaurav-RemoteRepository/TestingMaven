package com.ts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MTC {

    @Test
    public void verifyListOfProductsWhenMenFilterIsAppliedForLevis() {
        RemoteWebDriver driver = null;
        WebDriverWait wait = null;

        try {
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("dom.webnotifications.enabled", false);
            profile.setPreference("dom.push.enabled", false);

            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(profile);

            driver = new FirefoxDriver(options);
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.pollingEvery(Duration.ofMillis(500));
            wait.ignoring(NoSuchElementException.class);

            driver.get("https://www.myntra.com/");
            driver.manage().window().maximize();

            WebElement searchInput = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
            searchInput.sendKeys("Levis" + Keys.ENTER);

            By menFilter = By.xpath("(//label[contains(@class,'gender')]/parent::li)[1]/label");
            wait.until(ExpectedConditions.elementToBeClickable(menFilter)).click();

            List<WebElement> productDescriptions = driver.findElements(By.xpath("//h4[@class='product-product']"));
            for (WebElement productDescription : productDescriptions) {
                try {
                    WebElement refreshedElement = wait.until(ExpectedConditions.visibilityOf(productDescription));
                    if (refreshedElement.getText().contains("Men")) {
                        System.out.println("PASS");
                    } else {
                        System.out.println("FAIL");
                    }
                } catch (StaleElementReferenceException e) {
                    // Retry finding the element if StaleElementReferenceException occurs
                    WebElement refreshedElement = wait.until(ExpectedConditions.visibilityOf(productDescription));
                    if (refreshedElement.getText().contains("Men")) {
                        System.out.println("PASS");
                    } else {
                        System.out.println("FAIL");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up WebDriver resources
            // if (driver != null) {
            // driver.quit();
        }
    }
}
