package _20_07_Mentoring_2_CssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");



        WebDriver driver = new FirefoxDriver();



        driver.manage().window().maximize();

        driver.get("http://www.google.com");






    //todo   CHİLD BULARAK  ve basit hali

        //          html > body > div> style
                         //html>body>div>div

        /*todo      #id

    Başına # koyarız.
    Ya da    div[id=footer]

*/



/*    todo  CLASS


        .RNmpXc
        input[class=RNmpXc]

Birden fazla class var ise aralarına nokta koyuyoruz.



todo   CONTAİNS

input[id*='user']
input[id*='name']



input[class*=gLFyf]


maxlength text kısmı
input[maxlength*='4']


todo Starting the text ve Child mantıgı

div[class^='R']


div[id^=gb]

div#searchform.jhp.big>nth-child(1)

div.sfbg>:first-child

div#tophf>:nth-child(2)


todo     ending with
 $

input[id$='name']


id = Search form
div[id$='form']

todo nth-of-type , first-of-type


Arama kısmına bişeyler yaz
ul.erkvQe>li:first-of-type

ul.erkvQe>li:last-of-type
ul.erkvQe>li:nth-of-type(2)



         */



    }
}
