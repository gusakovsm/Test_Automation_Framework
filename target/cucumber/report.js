$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Google.feature");
formatter.feature({
  "line": 1,
  "name": "Google Feature Example",
  "description": "",
  "id": "google-feature-example",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search in google",
  "description": "",
  "id": "google-feature-example;search-in-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@INSERT_TAG_HERE"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "open Google webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "search \"Selenium WebDriver\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "result page was opened",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "first result is: \"Selenium WebDriver\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSteps.pen_Google_webpage()"
});
formatter.result({
  "duration": 8466910383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium WebDriver",
      "offset": 8
    }
  ],
  "location": "GoogleSteps.search(String)"
});
formatter.result({
  "duration": 2059666732,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.result_page_was_opened()"
});
formatter.result({
  "duration": 59857788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium WebDriver",
      "offset": 18
    }
  ],
  "location": "GoogleSteps.first_result_is(String)"
});
formatter.result({
  "duration": 360066892,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.close_browser()"
});
formatter.result({
  "duration": 970458881,
  "status": "passed"
});
});