package stepdefinition;

import cucumber.api.java.en.Then;
import framework.webPages.HotelsSearchPage;
import org.testng.Assert;

import java.util.ArrayList;

public class SearchResultSD {

    HotelsSearchPage hotelsSearchPage = new HotelsSearchPage();

    @Then("^I verify system displays all hotels within 10 miles radius of airport$")
    public void i_verify_system_displays_all_hotels_within_10_miles_radius_of_airport() {
        ArrayList<Double> distList =  hotelsSearchPage.getDistanceList();
        System.out.println(distList);


        ArrayList<Double> falseList = new   ArrayList<Double>();
        boolean actual = true;

        for (Double d: distList)
        {
            if(d>10) {
                actual = false;
                falseList.add(d);
            }
        }

        Assert.assertTrue(actual,"The greater distances :"+falseList);


    }


    @Then("^I verify Hilton Hotel is within radius$")
    public void i_verify_hilton_hotel_is_within_radius() {

        ArrayList<String> myHotelList = hotelsSearchPage.getHotelNames();
        System.out.println(myHotelList);

        boolean actual = false;

        for (String s: myHotelList)
        {
            if(s.contains("Hilton")) {
                actual = true;
            }
        }

        Assert.assertTrue(actual,"Hilton Hotel is not present in the hotel list");

    }

}

