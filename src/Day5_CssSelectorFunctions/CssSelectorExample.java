package Day5_CssSelectorFunctions;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

    public static void main(String[] args) {
        //exampleOne();
        exampleTwo();

    }

    public static void exampleOne(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");

        WebElement usingShortId = driver.findElement(By.cssSelector("#para1"));
        System.out.println(usingShortId.getText());

        WebElement usingLogId = driver.findElement(By.cssSelector("p[id='para1']"));
        System.out.println(usingShortId.getText());

        System.out.println("------------------------------------");

        WebElement usingLongClass = driver.findElement(By.cssSelector("p[class='main']"));
        System.out.println(usingLongClass.getText());

        WebElement usingShortClass = driver.findElement(By.cssSelector(".main"));
        System.out.println(usingShortClass.getText());
        driver.quit();

    }

    public static void exampleTwo(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        WebElement userNameField = driver.findElement(By.cssSelector("input[name='username']"));
        userNameField.sendKeys("primetechuser");


    }

}
