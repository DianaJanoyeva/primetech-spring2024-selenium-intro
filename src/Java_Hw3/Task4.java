package Java_Hw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/buttons");

        Thread.sleep(2000);

        WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
        String buttonLabel = doubleClickMe.getText();
        System.out.println(buttonLabel);

        driver.close();
    }
}
