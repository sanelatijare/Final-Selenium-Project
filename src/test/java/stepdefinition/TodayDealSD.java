package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelsHomepage;
import framework.webPages.HotelsSearchPage;
import org.testng.Assert;

public class TodayDealSD {


    HotelsHomepage hotelsHomepage = new HotelsHomepage();
    HotelsSearchPage hotelsSearchPage  =new HotelsSearchPage();



    @Then("^I verify todays deal is less than 200$")
    public void i_verify_todays_deal_is_less_than_200() throws Throwable {

        String priceString = hotelsSearchPage.getTodaysPrice();

    int price =200;
    boolean tdDeal = false;

    priceString = priceString.substring(1);

    int priceTdDeal =Integer.valueOf(priceString);

    if (priceTdDeal < price){
        tdDeal= true;
    }
Assert.assertTrue(tdDeal, "Todays deal is greater than $200");
}
}