package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.DarkSkyHomepage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class TimeLineSD {

    DarkSkyHomepage darkSkyHomepage = new DarkSkyHomepage();


    @Then("^I verify timeline is displayed with two hours incremented")
    public void verifyTime() {

        List<String> timelist = darkSkyHomepage.getTimeList();

        List<Integer> expected = new ArrayList<Integer>();

       for (int i = 0; i < 10; i++) {
           expected.add(2);

       }
        List<Integer> actual = new ArrayList<Integer>();

        for (int i = 0; i < timelist.size() - 1; i++) {
            int time1 = Integer.parseInt(timelist.get(i));
            int time2 = Integer.parseInt(timelist.get(i + 1));

            if (time2 > time1)
                actual.add(time2 - time1);

            if (time1 > time2) {
                actual.add((time2 + 12) - time1);

            }
        }
            Assert.assertEquals(actual, expected);

        }
    }


