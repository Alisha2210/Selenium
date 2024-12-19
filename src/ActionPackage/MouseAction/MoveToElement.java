package ActionPackage.MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MoveToElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043580!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=CjwKCAiA0rW6BhAcEiwAQH28IjXyD_960aqXFyzXG2nm7y_cy97xDVp8dop41YOgKZUQCvGZrhaviRoCC6MQAvD_BwE");
        Thread.sleep(2000);
        WebElement loginElement = driver.findElement(By.xpath("//span[text()='Login']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(loginElement)
                .pause(Duration.ofSeconds(5))
                .perform();

        driver.close();
    }
}
