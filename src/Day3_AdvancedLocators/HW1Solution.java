package Day3_AdvancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Solution {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bing.com");

        WebElement searchBox = driver.findElement(By.className("sb_form_ta"));

        searchBox.sendKeys("Selenium WebDriver");

        Thread.sleep(5000);

        driver.quit();
    }
}
