@web @regression @login
Feature:Verify Time Feature

Background:
Given I am on darkSky home page


@VerifyTime
Scenario: Verify timeline is displayed in correct format
Then I verify timeline is displayed with two hours incremented
