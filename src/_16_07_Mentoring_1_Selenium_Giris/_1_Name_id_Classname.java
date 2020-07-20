package _16_07_Mentoring_1_Selenium_Giris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_Name_id_Classname {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


            driver.get("https://opensource-demo.orangehrmlive.com/");

            //todo NAME ---
       driver.findElement(By.name("txtUsername")).sendKeys("Admin");
Thread.sleep(1000);
            //todo  id
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(1000);


        //todo ClassName
driver.findElement(By.className("button")).click();



//driver.findElement(By.id("MP_link")).click();






        
        }
    }

