@web @regression @login
Feature: Register Feature

  Background:
    Given I am on darkSky home page

  @register
  Scenario: Verify invalid signup error message
    When I am on darkSky register page
    And I click on register button on register page
    Then I verify I am on register page by asserting register header
