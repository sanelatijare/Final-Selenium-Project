@web @regression @login
Feature: TestDayTemp


Background:
    Given I am on darkSky home page

  @TestDayTemp
  Scenario:Verify individual day temp timeline
    When I expand todays timeline
    Then I verify temperature is not greater or less than timeline temperature