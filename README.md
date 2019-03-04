#End to end acceptance test framework for back-end
**Author**: Māris salenieks (maris.salenieks@accenture.com).
**Editors**: Maksims Gusakovs (maksims.gusakovs@accenutre.com); Laura Junga (laura.junga@accenture.com)

##Features and stuff
* REST call handling (with configurable retry capabilities);
* Possibility to configure different environments (to test) and endpoint versions;
* Possibility to define actions before test, for example, perform VPN check;
* Code and whole test step reuse benefit from Cucumber;
* Global (static) state and object reference transfer mechanism;
* Different properties (yaml, csv) readers to set up default project configurations;
* Logging (to text file);
* Classes for manipulations with JSON objects;
* Date utilities and builder for date and time conversions / handling;
* Polling and operation retrying functionality;
* Text templating and parameter injection utility (FreeMarker);
* Separate module for unit tests simply to test some core functionality;

##### Running tests locally
Several ways to run test from IDE:
* Running service specific gradle task by double clicking them from Gradle menu (Gradle Menu > Tasks > acceptance tests) or running it from console using `gradlew specificTaskName`
* Running set of service specific test by running FeatureRunner from `\src\acceptance-tests\java\testRunners\...`
* Running some specific test by tag using UniversalRunner `\src\acceptance-tests\java\testRunners\UniversalRunner.java`. Put needed tag in tags block in runner.
* Running specific test case from feature file by right-clicking and selecting "Run scenario" or pressing CTRL + SHIFT + F10
    * if there is issue with too long command line, do following:
        In Cucumber java Run/Debug configuration "Shorten command line" set to JAR manifest

##### Configurations
* Testing environment configuration:
    * Available environments: **DEV**, **TEST**, **local**
    * Properties file `\endpoints.yml`
    * Switching environment for all services:
        * Change `defaultEnv`  property to desired value
    * Switching specific service environment:
        * Add `env: <selectedEnv>` to selected service endpoint configuration in properties file
        * Example:
        
              example:
                local: http://localhost:8080
                dev: https://reqres.in
                test: https://reqres.in
                
* Web-browser type configuration:
    * Configuration file `\config.yml`
    * For local testing available browsers are: chrome, firefox, ie, phantomjs, safari, opera
    * To switch browser type set browser.name to desired browser name
    * Note: for local testing selected browser should be installed on local machine
    * Chrome and Firefox browsers could be run in two modes: visible and invisible
    * To switch browser running mode set browser.headless to true for invisible mode and opposite
    * Example:

          browser:
            name: firefox
            startMaximized: false
            headless: false
            
* Console output printing configuration:
    * In configuration file `\config.yml` there is possibility to enable or disable pretty json printing by setting console.prettyPrintJson property to true or false


##### Allure reporting
* To generate allure report json files add 'io.qameta.allure.cucumberjvm.AllureCucumberJvm' plugin to Cucumber runner and run tests
* From json files Allure can generate html report
* On Jenkins it's done by using special Allure Jenkins plugin
* To generate html Allure report on local machine Allure commandline should be installed:
    * with npm: `npm install -g allure-commandline`
    * manual installation guide: https://docs.qameta.io/allure/#_installing_a_commandline
    * add to windows path
    * run `allure --version` to check version
* run `allure generate allure-results -o allure-report` to generate html report in 'allure-report/' folder
* allure configuration file `\src\acceptance-tests\resources\allure.properties`


##### Allure reporting limitations in Jenkins
* "/" symbol is prohibited
* "'" symbol is prohibited
* Scenario name length should be less than 190 characters
