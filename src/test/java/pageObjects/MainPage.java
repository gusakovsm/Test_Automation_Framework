package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author maksims.gusakovs@accenture.com
 */

public class MainPage extends Page {

    @FindBy(how = How.ID, using = "hplogo")
    public WebElement logo;
    @FindBy(how = How.CSS, using = ".a4bIc > input")
    public WebElement searchField;

    public MainPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search(String searchData) {
        driver.waitForElementPresent(searchField);
        searchField.clear();
        searchField.sendKeys(searchData);
        searchField.sendKeys(Keys.ENTER);;
    }
}
