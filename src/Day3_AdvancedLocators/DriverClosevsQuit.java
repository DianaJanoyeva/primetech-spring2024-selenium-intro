package Day3_AdvancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClosevsQuit {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.bing.com");

        Thread.sleep(1000);
        WebElement imageLink = driver.findElement(By.linkText("Images"));
        //Thread.sleep(1000);
        imageLink.click();//is going to open a new tab

        Thread.sleep(3000);
        driver.close();


    }
}
