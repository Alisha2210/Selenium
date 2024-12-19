package LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userNameTextBox = driver.findElement(By.name("login"));
        userNameTextBox.sendKeys("alisha.sk2706@rediffmail.com");
        Thread.sleep(2000);
        driver.close();
    }
}