package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HotelsHomepage extends BasePage {

    private By searchButton = By.xpath("//button[text()='Search']");
    //destination textbox
    private By txtSearch = By.xpath("//input[@id='qf-0q-destination']");
    private By closeBtn = By.xpath("//button[@class='cta cta-link']");
    private By roomsDropdown = By.xpath("//select[@id='qf-0q-rooms']");
    private By listRoomDropdwons = By.xpath("//div[@class='widget-query-group widget-query-room-options']");
    private By recomended = By.xpath("//tbody[@class='autosuggest-recommended']//span[text()='Recommendations']");

    public void setRoomsDropdown(String rooms) {
        selectFromDropdown(roomsDropdown, rooms);
    }

    public int getListRoomDropdown() {
        return SharedSD.getDriver().findElements(listRoomDropdwons).size();
    }


    public void setSearch(String value) {
        setValue(txtSearch, value);
        SharedSD.getDriver().findElement(txtSearch).sendKeys(Keys.ENTER);


    }

    public void setTxtSearch() {
        clickOn(txtSearch);
        clickOn(recomended);
    }


    public void clickOnSearchButton(){
        SharedSD.getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        clickOn(searchButton);

    }

}


