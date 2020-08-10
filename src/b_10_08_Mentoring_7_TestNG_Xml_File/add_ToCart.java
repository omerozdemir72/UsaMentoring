package b_10_08_Mentoring_7_TestNG_Xml_File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class add_ToCart {
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
    public void RandomUrunSec(){

        Random r = new Random();

        List<WebElement> elements = driver.findElements(By.cssSelector("ul#homefeatured>li"));

        int a = r.nextInt(elements.size());

        elements.get(a).click();


        driver.findElement(By.xpath("//span[text()='Add to cart']")).click();

        driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

        WebElement cart = driver.findElement(By.xpath("(//span[@class='ajax_cart_quantity'])[1]"));

        Assert.assertEquals(cart.getText(),"1");


    }



}
