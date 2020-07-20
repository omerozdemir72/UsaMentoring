package _16_07_Mentoring_1_Selenium_Giris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_LinkText {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://twitter.com/explore");


      //  driver.findElement(By.partialLinkText("Giriş")).click();
        driver.findElement(By.linkText("Giriş yap")).click();

        driver.findElement(By.linkText("Twitter'a kaydol")).click();
       // driver.findElement(By.partialLinkText("Twitter'a")).click();





    }
}
