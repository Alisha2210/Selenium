package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(2000);

        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        WebElement disableBtn = driver.findElement(By.id("disabled-button"));
        WebElement enableBtn = driver.findElement(By.id("enabled-button"));

        System.out.println(textBox.isEnabled());
        disableBtn.click();
        System.out.println(textBox.isEnabled());
        enableBtn.click();
        System.out.println(textBox.isEnabled());
        driver.close();
    }
}
