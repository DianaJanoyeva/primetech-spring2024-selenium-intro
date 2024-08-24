package Day3_AdvancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2Solution {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://www.wikipedia.org");
        try {
            WebElement wikiSearchBox = driver.findElement(By.id("searchInpu"));
            wikiSearchBox.sendKeys("Selenium (software)");
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();//prints the exception that happened
            System.out.println(e.getMessage());//will return a String. Which means it should go in the print statement
            //System.out.println("something happen");
        }finally {//finally block always gets executed
            driver.quit();
        }

    }
}
