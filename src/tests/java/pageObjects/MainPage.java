package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author maksims.gusakovs@accenture.com
 */
public class MainPage extends Page{

    @FindBy(how = How.ID, using = "hplogo")
    public WebElement logo;
    @FindBy(how = How.CSS, using = ".a4bIc > input")
    public WebElement searchField;

    private WebDriverLib driver;

    public MainPage() {
        super();
    }

    public void setDriver(WebDriverLib driver) {
        this.driver = driver;
    }

    public void search(String searchData) {
        driver.waitForElementPresent(searchField);
        searchField.clear();
        searchField.sendKeys(searchData);
        searchField.sendKeys(Keys.ENTER);;
    }
}
