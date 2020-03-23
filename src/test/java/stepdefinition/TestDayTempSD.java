package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyHomepage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;

public class TestDayTempSD {

    DarkSkyHomepage darkSkyHomepage = new DarkSkyHomepage();



     @When("^I expand todays timeline$")
     public void expandTimeLine() {

         darkSkyHomepage.clickOnExpand();
     }


    @Then("^I verify temperature is not greater or less than timeline temperature$")
    public void testTemp() {

      String maxTemp = darkSkyHomepage.getMaxTempToday().split("˚")[0];
      String lowerMaxTemp =darkSkyHomepage.getLowerMaxTemp().split("˚")[0];

      String minTemp = darkSkyHomepage.getMinTempToday().split("˚")[0];
      String lowerMinTemp = darkSkyHomepage.getLowerMinTemp().split("˚")[0];

        ArrayList<String> top = new ArrayList<String>();
        top.add(maxTemp);
        top.add(minTemp);

        ArrayList<String> lower= new ArrayList<String>();
        lower.add(lowerMaxTemp);
        lower.add(lowerMinTemp);

        Assert.assertEquals(top,lower);

    }

}