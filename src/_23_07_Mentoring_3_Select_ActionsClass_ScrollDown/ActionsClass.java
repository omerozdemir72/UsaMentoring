package _23_07_Mentoring_3_Select_ActionsClass_ScrollDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ActionsClass {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");



        WebElement cookies =driver.findElement(By.cssSelector(".wt-btn.wt-btn--secondary.wt-width-full"));

        cookies.click();

        driver.findElement(By.xpath("//span[@class='wt-display-inline-block wt-vertical-align-middle']")).click();


WebElement sprache = driver.findElement(By.xpath("//select[@name='language_code']"));


Select slc = new Select(sprache);

slc.selectByValue("en-US");

driver.findElement(By.cssSelector("#locale-overlay-save")).click();


Actions actions = new Actions(driver);

List<WebElement> menubar = driver.findElements(By.xpath("//ul[@role='menubar']//li"));

for (WebElement menubars:menubar) {
    actions.moveToElement(menubars).perform();

    Thread.sleep(500);
        }

















    }
}
