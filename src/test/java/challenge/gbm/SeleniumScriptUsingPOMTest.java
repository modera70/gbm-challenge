package challenge.gbm;

import challenge.gbm.common.BaseTest;
import challenge.gbm.page.AmazonHomePage;
import challenge.gbm.page.AmazonResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumScriptUsingPOMTest extends BaseTest {

    private AmazonHomePage amazonHomePage;
    private AmazonResultPage amazonResultPage;

    @BeforeMethod
    public void setUp(){
       amazonHomePage = new AmazonHomePage(webDriver);
       amazonResultPage = new AmazonResultPage(webDriver);
    }


    @Test
    public void designAScriptWithSeleniumCommands(){

        //Open browser and go to Amazon Page
        amazonHomePage.load("https://www.amazon.com.mx/");
        amazonHomePage.maximize();

        //Find  the word pantallas

       amazonHomePage.searchForItem("carros");

        //Extract the number of result on the first screen

        int items = amazonResultPage.getNumberOfItemsFound();
        System.out.println("The number of items found in the first page is: " + items);




    }


}
