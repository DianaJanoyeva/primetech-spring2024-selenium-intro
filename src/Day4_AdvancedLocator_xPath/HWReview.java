package Day4_AdvancedLocator_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWReview {

   public static void testCase2() {

       WebDriver driver = new ChromeDriver();
       driver.get("https://www.indeed.com/");

       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           System.out.println("Something happened here");
       }

       //get current url and assign it to the variable
       String homeURL = driver.getCurrentUrl();
       System.out.println("Original Home URL: " + homeURL);
       String homeTitle = driver.getTitle();
       System.out.println("Original Home title: " + homeTitle);

       WebElement searchInputField = driver.findElement(By.id("text-input-what"));
       searchInputField.sendKeys("SDET");
       WebElement searchButton = driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton"));
       searchButton.click();

       //get the current URL and store it in a variable called searchURL
       String searchURL = driver.getCurrentUrl();
       System.out.println("New current url is: " + searchURL);
       //get the website title and store it in a variable searchTitle
       String searchTitle = driver.getTitle();
       System.out.println("New title is: " + searchTitle);


       if (!homeURL.equals(searchURL) && searchURL.contains("SDET"))  {
           System.out.println("Pass: searchURL is different from homeURL. SearchURL contains the search criteria" +
                   "SDET");
       } else {
           System.out.println("Fail: searchURL is the same as homeURL. searchURL does not contain the search criteria 'SDET' ");
       }

       //Verify that searchTitle does not equal to homeTitle and has the search criteria.
       if(!searchTitle.equals(homeTitle) && searchTitle.toLowerCase().contains("SDET".toLowerCase())) {
           System.out.println("Pass: searchTitle is different from homeTitle. SearchTitle contains the search criteria 'Sdet' ");
       }else {
           System.out.println("Fail: searchTitle is the same as homeTitle. searchTitle does not contain the search criteria 'SDET' ");
       }



   }

   public static void main (String[] args)  {

       testCase2();

    }
}
