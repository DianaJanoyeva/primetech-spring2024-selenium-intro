package Day3_AdvancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivities {

    public static void main(String[] args) {
        testCase1();


       testCase2();
    }


    public static void testCase1() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("Automation");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("Automation");

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        driver.close();


    }

    public static void testCase2()  {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");


        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.name("firstname")).sendKeys("Automation");
        driver.findElement(By.name("lastname")).sendKeys("Automation");
        driver.findElement(By.name("reg_email__")).sendKeys("Automation");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Automation");
        driver.findElement(By.name("websubmit")).click();
    }

}
