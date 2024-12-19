package UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("D:\\Screenshot (1).png");
        driver.findElement(By.id("file-submit")).click();
        WebElement uploadMsg = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if (uploadMsg.getText().equalsIgnoreCase("File Uploaded!")){
            System.out.println("File uploaded successfully..");
        }else {
            System.out.println("File is not uploaded successfully");
        }
        driver.close();
    }
}
