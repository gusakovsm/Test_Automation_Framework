Feature: Google Feature Example

  @INSERT_TAG_HERE
  Scenario: Search in google
    Given open Google webpage
    When search "Selenium WebDriver"
    Then result page was opened
    And first result is: "Selenium WebDriver"
    And close browser
