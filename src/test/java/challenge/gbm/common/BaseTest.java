package challenge.gbm.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver webDriver;

    @BeforeMethod
    public void mainSetUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chrome/chromedriver_for_Chrome_83.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void cleanUp(){
        webDriver.close();
        webDriver.quit();
    }

}
