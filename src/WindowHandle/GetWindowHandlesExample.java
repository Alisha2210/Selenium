package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHandlesExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(2000);
        String windowID = driver.getWindowHandle();
        System.out.println(windowID);
        driver.findElement(By.id("openwindow")).click();
        Set<String> allwindow = driver.getWindowHandles();
        System.out.println(allwindow);
        driver.quit();

    }
}
