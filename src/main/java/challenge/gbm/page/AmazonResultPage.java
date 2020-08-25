package challenge.gbm.page;

import challenge.gbm.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonResultPage extends BasePage {

    @FindBy(css = ".a-section.aok-relative.s-image-square-aspect")
    private List<WebElement> items;

    public AmazonResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public int getNumberOfItemsFound(){
        return items.size();
    }
}
