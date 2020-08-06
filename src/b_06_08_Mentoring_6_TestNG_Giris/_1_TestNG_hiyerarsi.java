package b_06_08_Mentoring_6_TestNG_Giris;

import org.junit.After;
import org.testng.annotations.*;

public class _1_TestNG_hiyerarsi {


    @BeforeSuite
    public void BeforeSuit(){

        System.out.println("BEFORE SUİTE----------------");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
@BeforeClass
    public void BeforeClass(){

    System.out.println("BEFORE CLASS -------------- \n  Before Methoddan önce, yani ilk çalışan method.");
}
@BeforeMethod
    public void BeforeMethod(){

    System.out.println("BEFORE METHOD ------------------ \n  Her test methodundan önce, BEFORE classtan sonra çalışır.");
}

@Test
    public void Test1(){

    System.out.println("----------------------TEST   1  ------------------------");
}

@Test
public void Test2(){

    System.out.println( " ---------------- TEST   2 ----------------------");
}

@AfterMethod
    public void AfterMethod(){

    System.out.println("AFTER METHOD -------------------------------\n Her test methodundan sonra çalışır.");
}


@AfterClass
    public void AfterClass(){

    System.out.println("AFTER CLASS -------------------------   \n En son çalışır..");
}


@AfterTest
public void AfterTest(){
    System.out.println("---------------------------- AFTER TEST -----------------------------");
}
@AfterSuite
    public void AfterSuite(){

    System.out.println("-------------------AFTER SUİTE ------------------");
}
}

