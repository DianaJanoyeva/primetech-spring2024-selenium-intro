package Java_Hw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement forgotPassword = driver.findElement(By.linkText("Forgot password?"));
        forgotPassword.click();

        Thread.sleep(1000);
        driver.close();
    }
}
