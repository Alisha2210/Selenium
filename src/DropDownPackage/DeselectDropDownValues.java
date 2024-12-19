package DropDownPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDropDownValues {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(2000);
        WebElement dropDown = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(dropDown);

        //Select by index
        select.selectByIndex(2);
        Thread.sleep(2000);

        //Select by value
        select.selectByValue("orange");
        Thread.sleep(2000);

        //Select by visible text value
        select.selectByVisibleText("Apple");
        Thread.sleep(2000);

        /*//Deselect by index
        select.deselectByIndex(2);
        Thread.sleep(2000);

        //deselect by value
        select.deselectByValue("orange");
        Thread.sleep(2000);

        //deselect by visible text value
        select.deselectByVisibleText("Apple");
        Thread.sleep(2000);*/
        select.deselectAll();
        Thread.sleep(2000);

        driver.close();
    }
}