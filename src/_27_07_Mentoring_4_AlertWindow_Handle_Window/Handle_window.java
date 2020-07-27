package _27_07_Mentoring_4_AlertWindow_Handle_Window;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class Handle_window {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("http://www.demo.guru99.com/popup.php");

//            ilk pencerem
        String firstWin =driver.getWindowHandle();

        String firstWinUrl =driver.getCurrentUrl();
        System.out.println("İlk pencerem :   " +  firstWinUrl);

       driver.findElement(By.xpath("//a[text()='Click Here']")).click();


        Set<String>windowAllWindows = driver.getWindowHandles();

        for (String window : windowAllWindows) {

            driver.switchTo().window(window);
        }

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("omer@gmail.com");

driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        System.out.println("2. pencerenin Url'i  =   " + driver.getCurrentUrl());


        driver.close();

        //    ilk pencereme dönüyorum
        driver.switchTo().window(firstWin);


        Assert.assertEquals(firstWinUrl,driver.getCurrentUrl());
        System.out.println("Şuanki penceremin Url ' i =  "   + driver.getCurrentUrl());

        Thread.sleep(2000);

        driver.quit();
    }
}
