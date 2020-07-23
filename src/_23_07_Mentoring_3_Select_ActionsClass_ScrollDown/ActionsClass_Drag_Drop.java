package _23_07_Mentoring_3_Select_ActionsClass_ScrollDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Drag_Drop {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


                            //Capitals
        WebElement Oslo = driver.findElement(By.id("box1"));
        WebElement Stockholm = driver.findElement(By.id("box2"));
        WebElement Washington = driver.findElement(By.id("box3"));
        WebElement Copenhagen = driver.findElement(By.id("box4"));
        WebElement Seoul = driver.findElement(By.id("box5"));
        WebElement Rome = driver.findElement(By.id("box6"));
        WebElement Madrid = driver.findElement(By.id("box7"));



        //countries

        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));
        WebElement  norway= driver.findElement(By.id("box101"));
        WebElement  denmark= driver.findElement(By.id("box104"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        WebElement  sweden= driver.findElement(By.id("box102"));
        WebElement  unitedStates= driver.findElement(By.id("box103"));


        Actions actions = new Actions(driver);

        actions.dragAndDrop(Oslo,norway).build().perform();
        actions.dragAndDrop(Stockholm,sweden).build().perform();
        actions.dragAndDrop(Washington,unitedStates).build().perform();
        actions.dragAndDrop(Copenhagen,denmark).build().perform();
        actions.dragAndDrop(Seoul,southKorea).build().perform();
        actions.dragAndDrop(Rome,italy).build().perform();
        actions.dragAndDrop(Madrid,spain).build().perform();



    }
}
