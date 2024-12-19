package ActionPackage.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrivePageTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        /*String text = (String) js.executeScript("return document.title;");
        System.out.println("Page Title: " + text);*/
        String userAgent = (String) js.executeScript("return navigator.userAgent;");
        System.out.println("User Agent: " + userAgent);

        driver.close();
    }
}
