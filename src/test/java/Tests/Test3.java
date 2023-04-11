package Tests;

import BasePackage.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends TestBase {

        @Test
        public void testSelectList() {
            WebElement test3= driver.findElement(By.id("test-3-div"));
            WebElement List = test3.findElement(By.id("dropdownMenuButton"));
            Assert.assertEquals(List.getText(), "Option 1", "Expected 'Option 1' to be the default selected value");
            List.click();
            WebElement option3 = List.findElement(By.xpath("//a[@class='dropdown-item'][3]"));
            option3.click();
        }
    }



