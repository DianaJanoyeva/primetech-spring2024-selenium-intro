package Java_Hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/practice-forms");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Diana");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Janoyeva");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("12345 Collins Ave");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chicago");
        driver.findElement(By.xpath("//select[@class='form-select']/option[@value='Illinois']")).click();
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("10005");
        driver.findElement(By.xpath("//input[@id='female']")).click();
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
