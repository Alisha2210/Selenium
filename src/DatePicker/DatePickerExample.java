package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("datepicker")).click();

        String date = "20";
        List<WebElement> allElement = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//following::td//a"));
        for (WebElement e : allElement) {
            if (e.getText().equals(date)) {
                e.click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.close();
    }
}
