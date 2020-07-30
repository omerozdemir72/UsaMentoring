package _30_07_Mentoring_5_iframe_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class iframe {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();



        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;


driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Hello Ohio Students");


driver.switchTo().frame("frm1");

WebElement element = driver.findElement(By.cssSelector("#course"));


Select slc = new Select(element);

slc.selectByVisibleText("Java");

element = driver.findElement(By.cssSelector("#ide"));

slc = new Select(element);

slc.selectByValue("ij");

//ana frame dönüş

        driver.switchTo().defaultContent();

js.executeScript("window.scrollBy(0,1000)");


driver.switchTo().frame("frm2");


driver.findElement(By.id("firstName")).sendKeys("Ömer");
driver.findElement(By.id("lastName")).sendKeys("Özdemir");
driver.findElement(By.id("malerb")).click();
driver.findElement(By.id("englishchbx")).click();
driver.findElement(By.id("email")).sendKeys("omer@gmail.com");
driver.findElement(By.id("password")).sendKeys("123123");

driver.switchTo().defaultContent();


driver.switchTo().frame("frm3");


driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Hello Frame 3 ");

driver.switchTo().frame("frm1");

WebElement course3 = driver.findElement(By.id("course"));

Select selectFrame3 = new Select(course3);

selectFrame3.selectByValue("python");

//Ebeveyni olan frame'e döner     --> frame 3 ' e dönecektir..
//driver.switchTo().parentFrame();

//Ana pencereye, ana frame e gelir.
driver.switchTo().defaultContent();


    }
}
