package Tests;

import BasePackage.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test6 extends TestBase {

    @Test
    public void TableTest() {
        String cellValue = getCellValue(2, 2);
        Assert.assertEquals(cellValue, "Ventosanzap");
    }

    public String getCellValue(int row, int col) {
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-dark']/tbody/tr"));
        WebElement targetRow = rows.get(row);
        List<WebElement> cells = targetRow.findElements(By.tagName("td"));
        WebElement targetCell = cells.get(col);
        return targetCell.getText();
    }
}