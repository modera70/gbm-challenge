package challenge.gbm.page;

import challenge.gbm.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonHomePage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-text")
    private WebElement searchButton;

    public AmazonHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void searchForItem(String item){
        searchTextBox.sendKeys(item);
        searchButton.click();
    }
}
