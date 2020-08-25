package challenge.gbm.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver,this);
    }

    public void maximize(){
        webDriver.manage().window().maximize();
    }

    public void load(String url){
        webDriver.get(url);
    }
}
