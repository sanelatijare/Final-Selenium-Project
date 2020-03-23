@web @regression
    Feature: Verify Search results for stars
    Background:
      Given I am on Hotels.com page

    @SearchResultWithinTenMiles
    Scenario: List of all of hotel within 10 miles radius of airport or downtown
      Given I am on default locations search result screen
      Then I verify system displays all hotels within 10 miles radius of airport


    @HiltonHotel
    Scenario: Verify the presence of Hilton hote
      Given I am on default locations search result screen
      Then I verify Hilton Hotel is within radius