package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelsHomepage;
import framework.webPages.HotelsSearchPage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PropertyStarsSD {
    HotelsHomepage hotelsHomepage = new HotelsHomepage();
    HotelsSearchPage hotelsSearchPage = new HotelsSearchPage();



    @Given("^I am on Hotels.com page$")
    public void i_am_on_hotelscom_page(){
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations", "Invalid Home Page");
    }

    @When("^I am on default locations search result screen$")
    public void i_am_on_default_locations_search_result_screen() throws Throwable {

        hotelsHomepage.setTxtSearch();
        hotelsHomepage.clickOnSearchButton();


    }

    @Then("^I verify system displays only (.+) hotels on search result$")
    public void i_verify_system_displays_only_hotels_on_search_result(String stars) throws Throwable {


        String expected=stars.trim();

        ArrayList<String> starList = (ArrayList<String>) hotelsSearchPage.getStarTextList();

        String actual="";

        System.out.println(starList);
        System.out.println(stars);
        int frequency = Collections.frequency(starList, stars.split(" ")[0]+"-star");
        System.out.println(frequency);

        if(frequency == starList.size())
            actual = starList.get(0).split("-")[0]+" stars";

        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected);


    }

    @And("^I select property class (.+)$")
    public void i_select_property_class(String stars) throws Throwable {
        hotelsSearchPage.clickStarCheckbox(stars);
    }
}
