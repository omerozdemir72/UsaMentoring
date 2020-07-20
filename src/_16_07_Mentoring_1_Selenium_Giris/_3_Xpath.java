package _16_07_Mentoring_1_Selenium_Giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_Xpath {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");


        /*

                Xpath, daha spesifik olup dinamik ögeleri rahatlıkla bulmamızı sağlar.
                    .xpath = //tagname[@attribute=’value’] ---             //etiketadı[@nitelik = 'değer']


                   1.Absolute Xpath
            /html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]

                   2.Relative Xpath
                   //input[@name='q']

                   //input[@class='gLFyf gsfi']

                   ////a[text()='Görseller']

                                                                                                                            /html/body/div/child::div[2]
                                                                                                                                    //div[@class='jhp big']



                      // --->Relative xpath kullanırken bunu kullanırız. Kodların herhangi bir yerinden başlamak için

                      /  ---> Absolute Xpath oluşturmak için kullanılır. Düğümün kökünden başlar. başlangıç düğümü





                                                            todo    Contains


    //input[@maxlength='2048']

//input[contains(@maxlength,'20')]


//*[contains(@maxlength,'20')]                  * tüm html kodlarında


               todo     GÖSTERME --------------------------------  Following     --    bir sonraki tagname

                  //*[contains(@maxlength,'20')]/following::div[1]



                todo GÖSTERME---------------------------------- Following-sibling-- belirtilen düğümün child i seçilir.


                 //center//following-sibling::input







         todo             Starts-with -- Başlangıç metni ile eşleştirmeye yarar
        google arama text area
           //input[starts-with(@class,'gL')]



// todo                           Child
         //div[@class='FPdoLc tfB0Bf']//child::input



//todo                           Parent
//input[@class='gLFyf gsfi']//parent::div//parent::div

todo                        AND - OR


         OR     text area
//input[@class='gLFyf gsfi' or @name='q']

And
//input[@class='gLFyf gsfi' and @name='q']


    todo                   Karışık örnek

                  //input[starts-with(@class,'gL') or contains(@maxlength,'20')]
         */














    }
}
