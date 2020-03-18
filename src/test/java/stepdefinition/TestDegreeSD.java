package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.DarkSkyHomepage;
import org.testng.Assert;

public class TestDegreeSD {

   private DarkSkyHomepage darkSkyHomepage = new DarkSkyHomepage();


    @Given("^I am on darkSky home page$")
    public void iAmOnDarkSkyHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - Broadway, New York, NY", "Invalid Home Page");
    }

        @Then("^I verify current temp is not greater or less then temps from daily timeline$")
        public void testDegree(){


            String currTemp = darkSkyHomepage.getCurrentTemp().split("˚")[0];

            String timeLineTemp = darkSkyHomepage.getTempList().get(0).toString().split("°")[0];

            Assert.assertEquals(timeLineTemp,currTemp);

        }
    }





