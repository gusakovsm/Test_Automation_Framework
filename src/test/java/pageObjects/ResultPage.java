package pageObjects;

import java.util.List;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author maksims.gusakovs@accenture.com
 */
public class ResultPage extends Page{

    @FindBy(how = How.CSS, using = "#ires .g")
    public List<WebElement> results;
    @FindBy(how = How.ID, using = "hdtb-msb-vis")
    public WebElement resultManu;

    private WebDriverLib driver;

    public ResultPage() {
        super();
    }

    public void setDriver(WebDriverLib driver) {
        this.driver = driver;
    }
}
