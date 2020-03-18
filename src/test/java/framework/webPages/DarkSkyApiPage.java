package framework.webPages;
import org.openqa.selenium.By;


    public class DarkSkyApiPage extends DarkSkyHomepage {


        private By signUP = By.xpath("//a[@class='button filled']");

        public void clickSignUp()
        {
            clickOn(signUP);
        }
    }

