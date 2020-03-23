$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchResult.feature");
formatter.feature({
  "line": 2,
  "name": "Verify Search results for stars",
  "description": "",
  "id": "verify-search-results-for-stars",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 9611428762,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Hotels.com page",
  "keyword": "Given "
});
formatter.match({
  "location": "PropertyStarsSD.i_am_on_hotelscom_page()"
});
formatter.result({
  "duration": 1944119120,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify the presence of Hilton hote",
  "description": "",
  "id": "verify-search-results-for-stars;verify-the-presence-of-hilton-hote",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@HiltonHotel"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I verify Hilton Hotel is within radius",
  "keyword": "Then "
});
formatter.match({
  "location": "PropertyStarsSD.i_am_on_default_locations_search_result_screen()"
});
formatter.result({
  "duration": 4679193362,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultSD.i_verify_hilton_hotel_is_within_radius()"
});
formatter.result({
  "duration": 2095456636,
  "error_message": "java.lang.AssertionError: Hilton Hotel is not present in the hotel list expected [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:93)\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\n\tat org.testng.Assert.assertTrue(Assert.java:41)\n\tat stepdefinition.SearchResultSD.i_verify_hilton_hotel_is_within_radius(SearchResultSD.java:50)\n\tat ✽.Then I verify Hilton Hotel is within radius(SearchResult.feature:15)\n",
  "status": "failed"
});
formatter.after({
  "duration": 180993037,
  "status": "passed"
});
});