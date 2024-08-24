package Java_Hw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgot"));
        forgotPassword.click();

        Thread.sleep(2000);
        driver.close();
    }
}
