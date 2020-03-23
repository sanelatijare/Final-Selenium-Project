@web @regression
  Feature: Verify today's deal

Background:
Given I am on Hotels.com page

@TodayDeal
Scenario: Verify todays deal price value
When I am on default locations search result screen
Then I verify todays deal is less than 200
