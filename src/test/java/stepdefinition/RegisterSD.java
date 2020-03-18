package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyApiPage;
import framework.webPages.DarkSkyHomepage;
import framework.webPages.RegisterPage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RegisterSD {

   private DarkSkyApiPage darkSkyApi = new DarkSkyApiPage();
   private RegisterPage registerPage = new RegisterPage();
   private DarkSkyHomepage darkSkyHomepage = new DarkSkyHomepage();




   @When("^I am on darkSky register page$")
   public void setRegisterPage() {
      darkSkyHomepage.clickLnkDarkSkyAPI();
      SharedSD.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      darkSkyApi.clickSignUp();
   }

   @And("^I click on register button on register page$")
   public void clickOnRegisterButton() {
      registerPage.clickRegister();
      SharedSD.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

   @Then("^I verify I am on register page by asserting register header$")
      public void verifyRegisterPage() {
      Assert.assertEquals(registerPage.getHeaderText(),"Register");

      }

   }









