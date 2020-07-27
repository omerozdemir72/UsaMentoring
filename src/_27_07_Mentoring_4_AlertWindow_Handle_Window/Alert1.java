package _27_07_Mentoring_4_AlertWindow_Handle_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");
//
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/test/delete_customer.php");


        WebElement customer_ID = driver.findElement(By.xpath("//input[@name='cusid']"));

        customer_ID.sendKeys("omer123");

        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));

        submitButton.click();

        Thread.sleep(1500);

        driver.switchTo().alert().dismiss();

      // driver.switchTo().alert().accept();



    }
}
