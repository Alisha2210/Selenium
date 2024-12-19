package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Scenario1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(2000);
        String windowID = driver.getWindowHandle();
        driver.findElement(By.id("openwindow")).click();
        Set<String> allwindow = driver.getWindowHandles();
        for (String s : allwindow)
        {
            if (!s.equals(windowID)){
                driver.switchTo().window(s);
                driver.findElement(By.linkText("INTERVIEW")).click();
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(windowID);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
