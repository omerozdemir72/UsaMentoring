package _30_07_Mentoring_5_iframe_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class table {
    public static void main(String[] args) {



        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://en.wikipedia.org/wiki/Dell");

        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement tablo = driver.findElement(By.cssSelector("table.wikitable.sortable "));

        js.executeScript("arguments[0].scrollIntoView();",tablo);

        List<WebElement> satir = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr"));
//
//        for (int i = 0; i <satir.size() ; i++) {
//            System.out.println(satir.get(i).getText());
//
//            System.out.println(" ");
//
//        }
//
//        System.out.println(satir.size());


WebElement satir5 = driver.findElement(By.cssSelector("table.wikitable.sortable>tbody>tr:nth-child(5)>td:nth-child(3)"));

        System.out.println("Satır 5 not kısmı :   " + satir5.getText());


List<WebElement> elements = driver.findElements(By.cssSelector(".jquery-tablesorter>tbody>tr:nth-child(10)>td:nth-child(-n+3)"));

//.jquery-tablesorter>tbody>tr:nth-child(10)>td:nth-child(-n+3)


        for (int i = 0; i <elements.size() ; i++) {

            System.out.print(elements.get(i).getText() + "  ");

        }

    }
}
