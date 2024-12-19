package LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
       // driver.manage().window().maximize();
        Thread.sleep(2000);
       //By the CSS Selector with ID attribute
        WebElement userName = driver.findElement(By.cssSelector("input[id='login1']"));
        userName.sendKeys("alisha.sk2706");

        //By the CSS selector with class attribute
        WebElement signIn = driver.findElement(By.cssSelector("input[class='signinbtn']"));
        signIn.click();
        Thread.sleep(2000);
        driver.close();
    }
}
