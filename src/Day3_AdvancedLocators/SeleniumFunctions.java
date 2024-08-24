package Day3_AdvancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFunctions {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        aboutLink.click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println("-------------------");
        System.out.println(driver.getCurrentUrl());

        driver.close();

        driver.quit();

    }
}
