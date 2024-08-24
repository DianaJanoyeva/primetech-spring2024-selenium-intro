package Java_Hw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed {

    public static void testCase1(){
        //Navigate to indeed.com
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.indeed.com/");
        //get the current URL and store in a variable called homeURL
        String homeURL = driver.getCurrentUrl();
        //get the website title and store it in a variable homeTitle
        String homeTitle = driver.getTitle();
        //finding the input field for "Job title, Keywords" and typing 'SDET'.
        WebElement searchInputField = driver.findElement(By.id("text-input-what"));
        searchInputField.sendKeys("SDET");
        //Finding the search button and clicking on it
        WebElement searchButton = driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton"));
            searchButton.click();

        //get the current URL and store it in a variable called searchURL
        String searchURL = driver.getCurrentUrl();
        //get the website title and store it in a variable searchTitle
        String searchTitle = driver.getTitle();

        driver.close();


        // Verify that searchURL does not equal to homeURL and contains the search criteria.
        if (!searchURL.equals(homeURL) && (searchURL.contains("SDET"))) {
            System.out.println("Pass: searchURL is different from homeURL. SearchURL contains the search criteria" +
                    "SDET");
        } else {
            System.out.println("Fail: searchURL is the same as homeURL. searchURL does not contain the search criteria 'SDET' ");
        }

        //Verify that searchTitle does not equal to homeTitle and has the search criteria.
        if(!searchTitle.equals(homeTitle) && (searchTitle.contains("Sdet"))) {
            System.out.println("Pass: searchTitle is different from homeTitle. SearchTitle contains the search criteria 'Sdet' ");
        }else {
            System.out.println("Fail: searchTitle is the same as homeTitle. searchTitle does not contain the search criteria 'SDET' ");
        }
    }


    public static void main(String[] args) {
        testCase1();

    }


}

