package b_10_08_Mentoring_7_TestNG_Xml_File.TestClass;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactUs {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void driverClass(){


        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");

    }

    @Test
    @Parameters({"email","message","order"})
    public void contactUsTest(String email, String message,String order){

        driver.findElement(By.xpath("//a[@title='Contact Us']")).click();

        Select select=new Select(driver.findElement(By.id("id_contact")));
        select.selectByVisibleText("Customer service");



        driver.findElement(By.cssSelector("#email")).sendKeys(email);

        driver.findElement(By.cssSelector("#id_order")).sendKeys(order);

        driver.findElement(By.cssSelector("#message")).sendKeys(message);

        driver.findElement(By.cssSelector("#submitMessage")).click();

        WebElement contactUsMessage = driver.findElement(By.cssSelector(".alert.alert-success"));

        String mesaj = contactUsMessage.getText();

        System.out.println("mesaj = " + mesaj);

        Assert.assertEquals(mesaj,"Your message has been successfully sent to our team.");



    }

    @AfterClass
    public void quit() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }



}
