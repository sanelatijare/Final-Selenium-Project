@web @regression
Feature: Verify property stars
Background:
Given I am on Hotels.com page

  @Stars
  Scenario Outline: Verify user can only view the result by selected property class
  When I am on default locations search result screen
  And I select property class <stars>
  Then I verify system displays only <stars> hotels on search result
  Examples:
  | stars   |
  | 5 stars |
  | 4 stars |
  | 3 stars |