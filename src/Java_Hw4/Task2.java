package Java_Hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/text-box");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement lastNameField = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameField.sendKeys("Dzhanoyeva");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();

    }
}
