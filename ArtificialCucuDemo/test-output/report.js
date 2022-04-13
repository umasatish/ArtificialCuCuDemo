$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Appointment Confirmation.feature");
formatter.feature({
  "line": 1,
  "name": "Appointment Confirmation",
  "description": "",
  "id": "appointment-confirmation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Successfully Booking an appointment",
  "description": "",
  "id": "appointment-confirmation;successfully-booking-an-appointment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launches chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters Url\"https://katalon-demo-cura.herokuapp.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clicks on Make Appointment",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \"John Doe\" and \"ThisIsNotAPassword\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clicks on login",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User selects\"HongKong CURA Healthcare Center\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "clicks \"Apply for hospital readmission\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "clicks on\"Medicaid\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters date\"29-04-1974\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters comments\"Thank you satish\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "clicks on BookAppointment",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User should validate the sucesssful ApointmentConformation page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks on Go to Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinition.user_launches_chrome_browser()"
});
formatter.result({
  "duration": 6172477500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://katalon-demo-cura.herokuapp.com/",
      "offset": 16
    }
  ],
  "location": "StepsDefinition.user_enters_urlsomething(String)"
});
formatter.result({
  "duration": 6327154800,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.clicks_on_Make_Appointment()"
});
formatter.result({
  "duration": 754859700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John Doe",
      "offset": 13
    },
    {
      "val": "ThisIsNotAPassword",
      "offset": 28
    }
  ],
  "location": "StepsDefinition.user_enters_something_and_something(String,String)"
});
formatter.result({
  "duration": 4262286200,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.clicks_on_login()"
});
formatter.result({
  "duration": 745432100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HongKong CURA Healthcare Center",
      "offset": 13
    }
  ],
  "location": "StepsDefinition.user_selects(String)"
});
formatter.result({
  "duration": 423548300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apply for hospital readmission",
      "offset": 8
    }
  ],
  "location": "StepsDefinition.clicks(String)"
});
formatter.result({
  "duration": 98389300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Medicaid",
      "offset": 10
    }
  ],
  "location": "StepsDefinition.clicks_on(String)"
});
formatter.result({
  "duration": 80929600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29-04-1974",
      "offset": 17
    }
  ],
  "location": "StepsDefinition.user_enters_date(String)"
});
formatter.result({
  "duration": 243604400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you satish",
      "offset": 21
    }
  ],
  "location": "StepsDefinition.user_enters_comments(String)"
});
formatter.result({
  "duration": 114756800,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.clicks_on_BookAppointment()"
});
formatter.result({
  "duration": 411953200,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_should_validate_the_sucesssful_ApointmentConformation_page()"
});
formatter.result({
  "duration": 72133200,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinition.user_clicks_on_Go_to_Homepage()"
});
formatter.result({
  "duration": 470661400,
  "status": "passed"
});
});