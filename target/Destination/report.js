$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 3,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 21008603833,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user should be able to login successfully",
  "description": "",
  "id": "login-feature;user-should-be-able-to-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@positive"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be able to see welcome message successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 2120536257,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_enter_username()"
});
formatter.result({
  "duration": 10631332223,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_enter_password()"
});
formatter.result({
  "duration": 4708311239,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_click_on_login_button()"
});
formatter.result({
  "duration": 4006201309,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_should_be_able_to_see_welcome_message_successfully()"
});
formatter.result({
  "duration": 3869962139,
  "status": "passed"
});
formatter.after({
  "duration": 2167969501,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "user should not be able to logged in with invalid credentials",
  "description": "",
  "id": "login-feature;user-should-not-be-able-to-logged-in-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@negative"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enter invalid username \"\u003cUserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enter invalid password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should not be able to logged in successfully and \"\u003creceived message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "login-feature;user-should-not-be-able-to-logged-in-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "received message"
      ],
      "line": 20,
      "id": "login-feature;user-should-not-be-able-to-logged-in-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "Admin",
        "",
        "Password cannot be empty"
      ],
      "line": 21,
      "id": "login-feature;user-should-not-be-able-to-logged-in-with-invalid-credentials;;2"
    },
    {
      "cells": [
        "",
        "admin123",
        "Username cannot be empty"
      ],
      "line": 22,
      "id": "login-feature;user-should-not-be-able-to-logged-in-with-invalid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17975000256,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "user should not be able to logged in with invalid credentials",
  "description": "",
  "id": "login-feature;user-should-not-be-able-to-logged-in-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    },
    {
      "line": 12,
      "name": "@negative"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enter invalid username \"Admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enter invalid password \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should not be able to logged in successfully and \"Password cannot be empty\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 2627399532,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 29
    }
  ],
  "location": "MyStepDef.userEnterInvalidUsername(String)"
});
formatter.result({
  "duration": 4122310783,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "MyStepDef.userEnterInvalidPassword(String)"
});
formatter.result({
  "duration": 3569179364,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_click_on_login_button()"
});
formatter.result({
  "duration": 3580192563,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password cannot be empty",
      "offset": 55
    }
  ],
  "location": "MyStepDef.userShouldNotBeAbleToLoggedInSuccessfullyAnd(String)"
});
formatter.result({
  "duration": 3975585248,
  "status": "passed"
});
formatter.after({
  "duration": 2295040859,
  "status": "passed"
});
formatter.before({
  "duration": 66959067649,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "user should not be able to logged in with invalid credentials",
  "description": "",
  "id": "login-feature;user-should-not-be-able-to-logged-in-with-invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    },
    {
      "line": 12,
      "name": "@negative"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enter invalid username \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enter invalid password \"admin123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should not be able to logged in successfully and \"Username cannot be empty\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 730623537,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "MyStepDef.userEnterInvalidUsername(String)"
});
formatter.result({
  "duration": 1641233107,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 29
    }
  ],
  "location": "MyStepDef.userEnterInvalidPassword(String)"
});
formatter.result({
  "duration": 1709341451,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_click_on_login_button()"
});
formatter.result({
  "duration": 1926275828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username cannot be empty",
      "offset": 55
    }
  ],
  "location": "MyStepDef.userShouldNotBeAbleToLoggedInSuccessfullyAnd(String)"
});
formatter.result({
  "duration": 1380244465,
  "status": "passed"
});
formatter.after({
  "duration": 1860633541,
  "status": "passed"
});
});