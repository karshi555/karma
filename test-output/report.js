$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Hey mark",
  "description": "",
  "id": "hey-mark",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@java"
    }
  ]
});
formatter.before({
  "duration": 120000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Hey Verify login",
  "description": "",
  "id": "hey-mark;hey-verify-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Hey User opens the browser and hit the url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Hey User is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Hey User enters username and passoword",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Hey user is login into facebook",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Hey Validate the title \"Facebook\" of facebook",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Facebooklogin.hey_User_opens_the_browser_and_hit_the_url()"
});
formatter.result({
  "duration": 22079252500,
  "status": "passed"
});
formatter.match({
  "location": "Facebooklogin.hey_User_is_on_login_page()"
});
formatter.result({
  "duration": 83199,
  "status": "passed"
});
formatter.match({
  "location": "Facebooklogin.hey_User_enters_username_and_passoword()"
});
formatter.result({
  "duration": 276021000,
  "status": "passed"
});
formatter.match({
  "location": "Facebooklogin.hey_user_is_login_into_facebook()"
});
formatter.result({
  "duration": 55399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 24
    }
  ],
  "location": "Facebooklogin.hey_Validate_the_title_of_facebook(String)"
});
formatter.result({
  "duration": 4576640400,
  "status": "passed"
});
formatter.match({
  "location": "Facebooklogin.close_the_browser()"
});
formatter.result({
  "duration": 16000,
  "status": "passed"
});
formatter.after({
  "duration": 98800,
  "status": "passed"
});
});