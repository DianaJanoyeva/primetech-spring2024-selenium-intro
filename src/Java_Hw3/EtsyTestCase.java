package Java_Hw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTestCase {

   public static void testCase1(){

       WebDriver driver = new ChromeDriver();
       driver.get("https://www.etsy.com/");



       WebElement signInButton = driver.findElement(By.className("select-signin"));
       signInButton.click();
   }


   public static void main(String[] args) {
            testCase1();
    }
}
