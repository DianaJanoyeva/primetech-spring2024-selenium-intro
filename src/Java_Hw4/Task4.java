package Java_Hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/text-box");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Diana");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Janoyeva");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("12345@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ABC12345");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//button[text()='clear']")).click();
        driver.close();

    }
}
