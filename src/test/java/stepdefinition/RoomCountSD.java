package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import framework.webPages.HotelsHomepage;
import org.testng.Assert;

public class RoomCountSD {


        HotelsHomepage hotelsHomepage = new HotelsHomepage();

        @Then("^I select (.+) from room dropdown$")
        public void i_select_from_room_dropdown(String selectrooms)  {
            hotelsHomepage.setRoomsDropdown(selectrooms);
        }

        @And("^I verify (.+) is displayed$")
        public void i_verify_is_displayed(String numberofroomdropdown) {

            int expected = Integer.parseInt(numberofroomdropdown);

            int actual = hotelsHomepage.getListRoomDropdown();

            System.out.println("expected="+expected);
            System.out.println("Actual="+actual);

            Assert.assertEquals(actual,expected);
        }
    }





