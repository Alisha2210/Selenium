package NavigationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToCommand {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(2000);
        WebElement createAccount = driver.findElement(By.xpath("//u[text() ='Create a new account']"));
        createAccount.click();
        driver.close();
    }
}
