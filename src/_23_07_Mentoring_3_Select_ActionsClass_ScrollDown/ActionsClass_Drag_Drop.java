package _23_07_Mentoring_3_Select_ActionsClass_ScrollDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionsClass_Drag_Drop {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");




    }
}
