package BasePackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = DriverUtil.getDriver("chrome");
        driver.get("file:///Users/hibajeha/Downloads/QE-index.html");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
       // driver.close();
    }
}
