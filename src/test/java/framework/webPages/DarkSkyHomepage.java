package framework.webPages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepdefinition.SharedSD;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class DarkSkyHomepage extends BasePage{


        private By currentTemp = By.xpath("//span[@class='summary swap']");
        private By timelineTemp = By.xpath("//div[@class='temps']/span/span");
        private By timeList = By.xpath("//span[@class='hour']/span"); //hours
        private By lnkDarkSkyAPI =By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
        private By maxTempTdayTmLne =By.xpath("//a[@class='day revealed']//span[@class='maxTemp']");
        private By minTempTdayTmLne = By.xpath("//a[@class='day revealed']//span[@class='minTemp']");
        private By expandTdayTmLne = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[3]");
        private By lowerMinTemp = By.xpath("//div[@class='dayDetails revealed']//span[@class='highTemp swip']//span[@class='temp']");
        private By lowerMaxTemp = By.xpath("//div[@class='dayDetails revealed']//span[@class='lowTemp swap']//span[@class='temp']");




        public String getCurrentTemp(){
            return getValueFromElement(currentTemp);
        }

        public void clickLnkDarkSkyAPI()
        {
            clickOn(lnkDarkSkyAPI);
        }

        public String getMaxTempToday(){
            return getValueFromElement(maxTempTdayTmLne);
        }

        public String getMinTempToday(){
            return getValueFromElement(minTempTdayTmLne);
        }

        public void clickOnExpand(){
            clickOn(expandTdayTmLne);
        }

        public String getLowerMinTemp (){
            return getValueFromElement(lowerMinTemp);
        }
        public String getLowerMaxTemp(){
            return getValueFromElement(lowerMaxTemp);
        }



        public List getTimeList(){

                List<String> myList = new ArrayList<>();
                List<WebElement> webElementList = SharedSD.getDriver().findElements(timeList);

                for (int i=0;i<webElementList.size();i++)
                {
                    String temp = webElementList.get(i).getText().toString();
                    myList.add(temp.substring(0,temp.length()-2));
                }


                return myList;


        }


        public List getTempList(){

            List<String> myList = new ArrayList<>(); // string


            List<WebElement> webElementList = SharedSD.getDriver().findElements(timelineTemp); // webelements with degree

            for (int i=0;i<webElementList.size();i++)
            {
                myList.add(webElementList.get(i).getText().toString());
            }


            return myList;
        }

        }



