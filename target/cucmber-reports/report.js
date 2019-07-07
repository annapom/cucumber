$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testCases.feature");
formatter.feature({
  "line": 1,
  "name": "Wiki",
  "description": "",
  "id": "wiki",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "",
  "description": "",
  "id": "wiki;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on wikipedia",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user search for anna",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user can not find Reference",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSteps.user_is_on_wikipedia()"
});
formatter.result({
  "duration": 191796500,
  "status": "passed"
});
formatter.match({
  "location": "WikiSteps.user_search_for_anna()"
});
formatter.result({
  "duration": 108400,
  "status": "passed"
});
formatter.match({
  "location": "WikiSteps.user_can_not_find_Reference()"
});
formatter.result({
  "duration": 515200,
  "status": "passed"
});
});