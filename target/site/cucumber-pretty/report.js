$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TimeLine.feature");
formatter.feature({
  "line": 2,
  "name": "Verify Time Feature",
  "description": "",
  "id": "verify-time-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 4500529951,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on darkSky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestDegreeSD.iAmOnDarkSkyHomePage()"
});
formatter.result({
  "duration": 381848101,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "verify-time-feature;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@VerifyTime"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "TimeLineSD.verifyTime()"
});
formatter.result({
  "duration": 261422168,
  "status": "passed"
});
formatter.after({
  "duration": 138121147,
  "status": "passed"
});
});