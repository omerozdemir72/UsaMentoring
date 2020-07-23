package _23_07_Mentoring_3_Select_ActionsClass_ScrollDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionsClass {
    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");

    }
}
