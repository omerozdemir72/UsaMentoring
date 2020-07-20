package _16_07_Mentoring_1_Selenium_Giris;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _P1__Register {


    public static void main(String[] args) throws InterruptedException {




        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common/home");


                //XPATH


        WebElement textArea =driver.findElement(By.xpath("//input[@name='search']"));

        textArea.sendKeys("Iphone");


        WebElement searhButton =driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searhButton.click();


        driver.findElement(By.xpath("//button[@id='list-view']")).click();


                        //Contains
        WebElement wishlist = driver.findElement(By.xpath("//button[contains(@onclick,'wishlist')]"));

        wishlist.click();

Thread.sleep(3000);
      WebElement alert =   driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
      String alertText = alert.getText();
      String myAlert = "You must login or create an account to save iPhone to your wish list!\n" +
              "×";

        //ilk kısım: Olması gereken
        //ikinci kısım: gerçek hali (aslında olan)
        Assert.assertEquals("HATALI",myAlert,alert.getText());

        System.out.println("Olması gereken mesaj : " + myAlert);
        System.out.println("Gerçekleşen :  " + alertText);



        //starts-with
        driver.findElement(By.xpath("//span[starts-with(text(),'My')]")).click();

        //contains
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

//OR - AND

        String isim = "Ömer";
        driver.findElement(By.xpath("//input[@class='form-control' and @name='firstname']")).sendKeys(isim);

        String soyisim = "Özdemir";
        driver.findElement(By.xpath("//input[@name='lastname' or @id='input-lastn']")).sendKeys(soyisim);

                String mail = "omer@gail.com";
        driver.findElement(By.xpath("//input[@placeholder='E-Mail' and @class='form-control']")).sendKeys(mail);

        String tel = "223344";
        driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys(tel);

    /*
    TODO                EMAİL DEN SONRA BİR KEZ RUN YAP Kİ KAYIT BİR KEZ OLUŞSUN
     */

        String sifre = "7274";
        driver.findElement(By.name("password")).sendKeys(sifre);

        driver.findElement(By.name("confirm")).sendKeys(sifre);

        driver.findElement(By.name("agree")).click();

        driver.findElement(By.xpath("//input[@value='Continue']")).click();


        String mesaj ="Your Account Has Been Created!";         //Olması gereken, Beklenen, expected

     String generalTitle=   driver.getTitle(); //Actual, mevcut olan

        System.out.println("Olması gereken :  " + mesaj);
        System.out.println("Gerçekleşen:    " + generalTitle);


       Assert.assertEquals("Mesaj eksik veya hatalıdır.",mesaj, generalTitle);


    }
}
