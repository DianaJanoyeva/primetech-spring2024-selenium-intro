package Day3_AdvancedLocators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByName {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.bing.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Automation");
        Thread.sleep(2000);

        System.out.println(driver);

        driver.quit(); //this will change the state of the object driver to null

        System.out.println(driver);
        //partial link text
//        WebElement imageLink = driver.findElement(By.linkText("Images"));
//        imageLink.click();


        WebElement shoppingLink  = driver.findElement(By.partialLinkText("Shoppi"));
        shoppingLink.click();
        Thread.sleep(2000);
        //driver.quit();

    }
}
