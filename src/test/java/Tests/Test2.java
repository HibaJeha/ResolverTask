package Tests;

import BasePackage.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test2 extends TestBase {

        @Test
        public void testListItems() {
            WebElement listGroup = driver.findElement(By.id("test-2-div"));
            List<WebElement> itemCount = listGroup.findElements(By.tagName("li"));
            Assert.assertEquals(itemCount.size(), 3, "Expected 2 list Count");
            WebElement listItem2 = itemCount.get(1);
            listItem2.getText();
            Assert.assertTrue(listItem2.getText().contains("List Item 2"), "Expected second list item text to be 'List Item 2'");
            WebElement listItem2Badge = listItem2.findElement(By.tagName("span"));
            String listItem2BadgeText = listItem2Badge.getText();
            Assert.assertEquals(listItem2BadgeText, "6", "Expected second list item badge text to be '6'");
        }
    }

