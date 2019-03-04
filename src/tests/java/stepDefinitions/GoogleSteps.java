package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flowWorkers.WebDriverLib;
import org.openqa.selenium.support.PageFactory;
import pageObjects.MainPage;
import pageObjects.ResultPage;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author maksims.gusakovs@accenture.com
 */

public class GoogleSteps {
    private WebDriverLib driver;
    private MainPage mainPage;
    private ResultPage resultPage;

    public GoogleSteps(WebDriverLib driver) {
        this.driver = driver;
        mainPage = PageFactory.initElements(driver, MainPage.class);
        resultPage = PageFactory.initElements(driver, ResultPage.class);
        mainPage.setDriver(driver);
        resultPage.setDriver(driver);
    }

    @Given("^open Google webpage$")
    public void pen_Google_webpage() {
        driver.openBrowser("");
        driver.waitForElementPresent(mainPage.logo);
    }

    @When("^search \"(.+)\"$")
    public void search(String searchText) {
        mainPage.search(searchText);
    }

    @Then("^result page was opened$")
    public void result_page_was_opened() {
        driver.waitForElementPresent(resultPage.resultManu);
    }

    @Then("^first result is: \"(.+)\"$")
    public void first_result_is(String searchResultText) {
        assertThat(resultPage.results.get(0).getText()).contains(searchResultText);
    }

    @Then("^close browser$")
    public void close_browser() {
        driver.quit();
    }

}
