package Tests;

import BasePackage.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test5 extends TestBase {

    @Test
    public void testWaitAndClick() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("test5-button")));
        WebElement test5Div = driver.findElement(By.id("test-5-div"));
        WebElement button = driver.findElement(By.id("test5-button"));
        button.click();
        WebElement successMessage = driver.findElement(By.id("test5-alert"));
        Assert.assertTrue(successMessage.isDisplayed());
        Assert.assertFalse(button.isEnabled(), "Button is still enabled");
    }
}

