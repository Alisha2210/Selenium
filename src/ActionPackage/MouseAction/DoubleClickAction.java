package ActionPackage.MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        Thread.sleep(2000);
        WebElement doubleClickElement = driver.findElement(By.xpath("//button[text() ='Double-Click me to see Alert message']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickElement)
                .pause(Duration.ofSeconds(5))
                .perform();

        driver.close();
    }
}
