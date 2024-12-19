package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(2000);

        WebElement radiobtn = driver.findElement(By.id("bmwradio"));
        System.out.println(radiobtn.isSelected());
        radiobtn.click();
        System.out.println(radiobtn.isSelected());

        driver.close();
    }
}
