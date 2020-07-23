package _20_07_Mentoring_2_CssSelector;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CssSelector_ProjeDevami {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");



        WebDriver driver = new FirefoxDriver();



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.manage().window().maximize();

        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common/home");


        driver.findElement(By.cssSelector(".list-inline>li:nth-of-type(2)>a")).click();


        driver.findElement(By.cssSelector("a[href*='account/login']")).click();

        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("omer3@gmail.com");

        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("7274");

        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();


        driver.findElement(By.cssSelector("input[name=search]")).sendKeys("Iphone");


        driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();


        driver.findElement(By.cssSelector(".fa.fa-th-list")).click();


        driver.findElement(By.cssSelector("button[data-original-title*='Add']")).click();



        WebElement successAlert = driver.findElement(By.cssSelector(".alert"));
        String actualAlert = successAlert.getText();


        String olmasiGereken = "Success: You have added iPhone to your wish list!\n" +
                "×";

        Assert.assertEquals(olmasiGereken,actualAlert);



        //System.out.println(actualAlert);

        WebElement wish = driver.findElement(By.cssSelector("a[title='Wish List (1)']"));

        wish.click();


                    //silme
       driver.findElement(By.cssSelector(".btn.btn-danger")).click();


        if (driver.findElements(By.cssSelector("div#content>p")).size()>0){

                Assert.assertTrue(true);
            System.out.println("Liste başarıyla boşaltılmıştır.");

        }else
            Assert.fail("Liste boşaltılmamıştır.");





        }
    }






