$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google.feature");
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
  "name": "first result is: \"tesst\"",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSteps.pen_Google_webpage()"
});
formatter.result({
  "duration": 8968060491,
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
  "duration": 1322967750,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.result_page_was_opened()"
});
formatter.result({
  "duration": 43411527,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tesst",
      "offset": 18
    }
  ],
  "location": "GoogleSteps.first_result_is(String)"
});
formatter.result({
  "duration": 137467509,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[\"Frodo\"]\u003e but was:\u003c[[[ChromeDriver: chrome on XP (46a476d2f8d0e8bc8fe6cdcce2166dea)] -\u003e css selector: #ires .g]]\u003e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat stepDefinitions.GoogleSteps.first_result_is(GoogleSteps.java:48)\r\n\tat ✽.And first result is: \"tesst\"(google.feature:8)\r\n",
  "status": "failed"
});
});