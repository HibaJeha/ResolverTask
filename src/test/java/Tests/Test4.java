package Tests;

import BasePackage.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 extends TestBase {

    @Test
    public void TestButton(){

        WebElement test4 = driver.findElement(By.id("test-4-div"));
        WebElement firstButton = driver.findElement(By.xpath("//button[@type='button']"));
        WebElement secondButton = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-secondary']"));
        Assert.assertTrue(firstButton.isEnabled());
        Assert.assertFalse(secondButton.isEnabled());
    }
}
