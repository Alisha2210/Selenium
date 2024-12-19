package DropDownPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSingleDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(2000);
        WebElement dropDown = driver.findElement(By.id("carselect"));
        Select select = new Select(dropDown);

        //Select by index
        select.selectByIndex(2);
        Thread.sleep(2000);

        //Select by value
        select.selectByValue("benz");
        Thread.sleep(2000);

        //Select by visible text value
        select.selectByVisibleText("BMW");
        Thread.sleep(2000);

        driver.close();
    }
}
