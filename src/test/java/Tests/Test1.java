package Tests;

import BasePackage.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    @Test
    public void LoginPage(){

        WebElement username = driver.findElement(By.id("inputEmail"));
        Assert.assertTrue(username.isDisplayed());

        WebElement password = driver.findElement(By.id("inputPassword"));
        Assert.assertTrue(username.isDisplayed());

        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        Assert.assertTrue(signInButton.isDisplayed());

        Faker faker = new Faker();
        username.sendKeys(faker.internet().emailAddress());
        password.sendKeys(faker.internet().password());
        signInButton.click();


    }
}
