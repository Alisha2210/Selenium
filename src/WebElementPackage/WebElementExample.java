package WebElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(2000);

        // getTagName & getAttribute Method
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='login1']"));
        userNameTextBox.sendKeys("alisha.sk2706@rediffmail.com");
        System.out.println(userNameTextBox.getTagName());
        System.out.println(userNameTextBox.getAttribute("id"));
        Thread.sleep(2000);

         //Clear Method
        userNameTextBox.clear();
        Thread.sleep(2000);

        //Submit() Method
        WebElement signInBtn = driver.findElement(By.xpath("//input[@class='signinbtn']"));
        Thread.sleep(1000);
        signInBtn.submit();
        Thread.sleep(2000);

        //Close the Browser
        driver.close();
    }
}
