package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class FetchSingleCookie {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        Cookie addCookie = new Cookie("Company","Edso sevices");
        driver.manage().addCookie(addCookie);
        System.out.println("-----Fetch Single Cookie-----");
        System.out.println(driver.manage().getCookieNamed("Company"));
        System.out.println("-----Fetch Single Cookie of company after delete cookie-----");
        driver.manage().deleteCookieNamed("Company");
        /*Set<Cookie> allCookies = driver.manage().getCookies();
        for(Cookie c :allCookies)
            System.out.println(c);*/
        driver.close();
    }
}
