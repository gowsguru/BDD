$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Validate demo automation",
  "description": "",
  "id": "validate-demo-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Register page",
  "description": "",
  "id": "validate-demo-automation;register-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "launch the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on skip signin button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter first name as \u003cgowthami\u003e and last name as \u003cguru\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "java_class.launch()"
});
formatter.result({
  "duration": 29644931157,
  "status": "passed"
});
formatter.match({
  "location": "java_class.skipsingin()"
});
formatter.result({
  "duration": 11084695164,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});