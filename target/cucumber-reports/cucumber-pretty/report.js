$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HomePage.feature");
formatter.feature({
  "name": "Home page Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homePage"
    }
  ]
});
formatter.scenario({
  "name": "Verify title of Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homePage"
    },
    {
      "name": "@titleTest"
    }
  ]
});
formatter.step({
  "name": "User opens home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_home_page()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat step_definitions.HomePage_STEPS.user_opens_home_page(HomePage_STEPS.java:11)\n\tat ✽.User opens home page(file:src/test/resources/features/HomePage.feature:5)\n",
  "status": "pending"
});
formatter.step({
  "name": "User sees My Account button",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage_STEPS.user_sees_My_Account_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verifies title is PHPTRAVELS | Travel Technology Partner",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_STEPS.verifies_title_is_PHPTRAVELS_Travel_Technology_Partner()"
});
formatter.result({
  "status": "skipped"
});
});