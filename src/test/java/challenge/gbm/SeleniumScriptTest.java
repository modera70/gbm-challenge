package challenge.gbm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumScriptTest {

    @Test
    public void designAScriptWithSeleniumCommands(){

        //Open browser
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chrome/chromedriver_for_Chrome_83.exe");
        WebDriver webDriver = new ChromeDriver();
        //I will use implicit wait for the test of 20 seconds
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        //Go to Amazon page

        webDriver.get("https://www.amazon.com.mx/");

        //Find  the word pantallas

        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Pantallas");
        webDriver.findElement(By.id("nav-search-submit-text")).click();

        //Extract the number of result on the first screen

        int items = webDriver.findElements(By.cssSelector(".a-section.aok-relative.s-image-square-aspect")).size();
        System.out.println("The number of items found in the first page is: " + items);

        webDriver.close();
        webDriver.quit();



    }
}
