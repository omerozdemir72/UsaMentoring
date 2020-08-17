package b_17_08_Mentoring_9_tekrar;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class hotels {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
@BeforeClass
@Parameters({"browser"})
    public void driver(String browser) {
if (browser.equals("chrome")){

    System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");
    driver = new ChromeDriver();
}else if (browser.equals("firefox")){

    System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
    driver = new FirefoxDriver();
}


        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.hotels.com/");
        js = (JavascriptExecutor) driver;

    }
    @Test
    @Parameters({"sehir","minfiyat","maxfiyat","fiyatim","fiyatim2"})
    public void Test1(String sehir,String minfiyat,String maxfiyat,String fiyatim,String fiyatim2) throws InterruptedException {
Actions actions = new Actions(driver);


        driver.findElement(By.cssSelector(".sprite-flags ")).click();

        driver.findElement(By.cssSelector(".widget-overlay-bd>:nth-child(2)>:nth-of-type(86)")).click();


WebElement myCity= driver.findElement(By.cssSelector("#qf-0q-destination"));


myCity.sendKeys(sehir);
myCity.sendKeys(Keys.ENTER);



wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@aria-labelledby='f-price-min-label']")));

//minimum fiyatı belirleyen kaydırıcı simge
WebElement solKaydirici = driver.findElement(By.xpath("//div[@aria-controls='f-price-min']"));


//maximum fiyatı belirleyen kaydırıcı simge
WebElement sagKaydirici = driver.findElement(By.xpath("//div[@aria-controls='f-price-max']"));


WebElement kaydiriciCubugu = driver.findElement(By.xpath("(//div[@class='widget-slider-cont'])[1]"));

int genisligi = kaydiriciCubugu.getSize().getWidth();

        System.out.println("Çubuk genişliği = " + genisligi);




/*
max fiyat - min fiyat   durumunda, kaydırıcı cubugumuz 153 ise,
kendi oluşturdugum fiyatta kaç olur ?
    500 de   çubuk genişliğim 153 ise, 100 de kaçtır?
max-min         genişliğim 153 ise

fiyatım               ?
 */

/*
        Parametrelerim String olduğu için, ve benim işlem yapmam
        gerektigi için integer ' a dönüştürüldü.
 */
        int genelMinFiyat =Integer.parseInt(minfiyat);
        int genelMaxFiyat = Integer.parseInt(maxfiyat);

        int kendiAltFiyatim = Integer.parseInt(fiyatim);
        int kendiYusekFiyatim = Integer.parseInt(fiyatim2);
            //                                                                                                    500 - 0
        int kaydirmaOrani =(kendiAltFiyatim*genisligi/ (genelMaxFiyat-genelMinFiyat));
        int kaydirmaOrani2 =(kendiYusekFiyatim*genisligi/ (genelMaxFiyat-genelMinFiyat));

//                         kaydırdıgım buton, ne kadar kaydıracagım(x ekseni)?, y ekseni:0
        actions.dragAndDropBy(solKaydirici,kaydirmaOrani,0).perform();

        // eksi olma sebebi, X ekseninde  sol tarafa ilerliyoruz.
        actions.dragAndDropBy(sagKaydirici,-kaydirmaOrani2,0).perform();



        Thread.sleep(3000);

        //indirim vs gibi işlemlere uğramayan fiyatlar için : strong
        List<WebElement> oteller =driver.findElements(By.cssSelector("ol.listings>li>article>section>aside>div>a>strong"));

        //indirime uğrayan, fiyatı değişen otellerin fiyat kısmı: ins
    List<WebElement>oteller2 =driver.findElements(By.cssSelector("ol.listings>li>article>section>aside>div>a>ins"));


try {

    for (int i = 0; i < oteller2.size(); i++) {

        String o = oteller2.get(i).getText().replace("$", "");       //$80 iken artık 80 oldu. Ama hala String
        int f = Integer.parseInt(o);
        System.out.println(f);

        if (f > genelMaxFiyat - kendiYusekFiyatim) {
            Assert.fail("Fiyatlar istenilen seviyeye gelmemiştir.");
        } else if (f < genelMaxFiyat - kendiYusekFiyatim) {

            Assert.assertTrue(true);
        }
    }
    System.out.println("Fiyatlar  " + fiyatim + " ile " + (genelMaxFiyat - kendiYusekFiyatim) + " aralığına çekilmiştir.");

    for (int i = 0; i < oteller.size(); i++) {

        String o = oteller.get(i).getText().replace("$", "");       //$80 iken artık 80 oldu. Ama hala String
        int f = Integer.parseInt(o);
        System.out.println(f);

        if (f > genelMaxFiyat - kendiYusekFiyatim) {
            Assert.fail("Fiyatlar istenilen seviyeye gelmemiştir.");
        } else if (f < genelMaxFiyat - kendiYusekFiyatim) {

            Assert.assertTrue(true);
        }
    }
    System.out.println("Fiyatlar  " + fiyatim + " ile " + (genelMaxFiyat - kendiYusekFiyatim) + " aralığına çekilmiştir.");
}catch (Exception e){

    System.out.println(e);
}

    }
//
//    @AfterClass
//    public void AfterClass() throws InterruptedException {
//
//    Thread.sleep(2000);
//    driver.quit();
//    }
}


