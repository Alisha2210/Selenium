package ActionPackage.MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ContextClickAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html\n");
        Thread.sleep(2000);
        WebElement rightClick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClick)
                .pause(Duration.ofSeconds(5))
                .perform();
        Thread.sleep(1000);
        driver.close();
    }
}
