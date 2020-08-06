package b_06_08_Mentoring_6_TestNG_Giris;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class basit_test2 {


    @BeforeClass
    public void beforeClass(){

        System.out.println("-------------SİSTEM BAŞLATILIYOR.. ---------------------------");

    }


    @Test(priority = 5)
    public void Test1() {
        int a = new Random().nextInt(11);
        int b = new Random().nextInt(11);
        int c = a + b;
        System.out.println("c =  " + c);
        Assert.assertTrue(c < 12);

/*  Diğer yolu
 int a1 = (int) (Math.random()* 10+1);
 int a2 = (int) (Math.random()* 10+1);
        */


    }
    @Test(priority = 2)
    public void Test2(){

        String a = "Techno Study";
        String b = "Techno Study";

        Assert.assertEquals(b,a);
    }




    @AfterClass
    public void Afterclass(){

        System.out.println("----------------- SİSTEM KAPATILIYOR....... --------------------");
    }




}
