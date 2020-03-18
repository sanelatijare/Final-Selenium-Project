package framework.webPages;


    import org.openqa.selenium.By;

    public class RegisterPage extends DarkSkyApiPage {

        private By btnRegister = By.xpath("//button[contains(text(),'Register')]");
        private By headerRegister = By.xpath("//h1[@class='stand-alone title']");

        public void clickRegister()
        {
            clickOn(btnRegister);
        }
        public String getHeaderText() {
            return getValueFromElement(headerRegister);
        }
    }

