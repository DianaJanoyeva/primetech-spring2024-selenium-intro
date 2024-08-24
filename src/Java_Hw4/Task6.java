package Java_Hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/select-menu");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//select[@id='language']/option[text()='English']")).click();
        driver.findElement(By.xpath("//option[text()='Chicago']")).click();
        //select[@class='form-select form-select-sm']
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
