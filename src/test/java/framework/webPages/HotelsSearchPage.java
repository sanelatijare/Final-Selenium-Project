package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HotelsSearchPage extends BasePage{

    private By todayDeal = By.xpath("//li[contains(@class,'deal-of-the-day')]//ins");
    private By listStars = By.xpath("//div[contains(@class,'additional-details')]/span");
    private By distanceToAirport = By.xpath("//ul[@class='property-landmarks']/li[2]");
    private By hotelNamesPath = By.xpath("//h3[@class='p-name']/a");




    public ArrayList<String> getHotelNames()
    {
        ArrayList<String> hotelNames = new ArrayList<String>();

        List<WebElement> hotelNamesWebElementList = SharedSD.getDriver().findElements(hotelNamesPath);

        for(int i=0;i<hotelNamesWebElementList.size();i++) {
            hotelNames.add(hotelNamesWebElementList.get(i).getText().trim());
        }


        return  hotelNames;
    }


    public ArrayList<Double> getDistanceList()
    {
        ArrayList<Double> distanceList = new ArrayList<Double>();

        List<WebElement> distanceWebElementList = SharedSD.getDriver().findElements(distanceToAirport);


        for(int i=0;i<distanceWebElementList.size();i++)
        {
            Double distance = Double.parseDouble(distanceWebElementList.get(i).getText().split(" ")[0]);
            distanceList.add(distance);
        }


        return  distanceList;


    }


    public List<String> getStarTextList() {
        List<WebElement> starTextWebElementList = SharedSD.getDriver().findElements(listStars);
        List<String> starTextList = new ArrayList<>();

        for (int i = 0; i < starTextWebElementList.size(); i++)
            starTextList.add(starTextWebElementList.get(i).getText());

        return starTextList;
    }

    public void clickStarCheckbox(String starRating) {
        SharedSD.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SharedSD.getDriver().findElement(By.xpath("//input[@id='f-star-rating-" + starRating.split(" ")[0] + "']")).click();


    }

    public String getTodaysPrice() {
        return getTextFromElement(todayDeal);

}}
