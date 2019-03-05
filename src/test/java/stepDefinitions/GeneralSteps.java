package stepDefinitions;

import flowWorkers.WebDriverLib;

/**
 * @author maksims.gusakovs@accenture.com
 */
public class GeneralSteps {

    protected WebDriverLib driver;

    public GeneralSteps() {
        this.driver = new WebDriverLib();
    }
}
