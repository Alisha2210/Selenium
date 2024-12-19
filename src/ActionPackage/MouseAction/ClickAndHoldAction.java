package ActionPackage.MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ClickAndHoldAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        Thread.sleep(2000);
        WebElement elementA = driver.findElement(By.xpath("//li[text() = 'A']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(elementA)
                .pause(Duration.ofSeconds(5))
                .release(elementA)
                .build()
                .perform();
        Thread.sleep(2000);
        driver.close();
    }
}
