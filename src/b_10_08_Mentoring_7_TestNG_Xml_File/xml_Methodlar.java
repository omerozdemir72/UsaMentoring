package b_10_08_Mentoring_7_TestNG_Xml_File;

import org.testng.annotations.Test;

public class xml_Methodlar {


    @Test(groups = "grup 1")
    public void Test1(){

        System.out.println("TEST 1 ----------");

    }

    @Test(groups = "grup 1")
    public void Test2(){

        System.out.println("TEST 2 ----------");
    }


    @Test(groups = "grup 2")
    public void Test3(){

        System.out.println("TEST 3 -------");
    }

    @Test(groups = "grup 2")
    public void Test4(){

        System.out.println("TEST 4-------");
    }

    @Test
    public void Test5(){

        System.out.println("TEST 5 -------");
    }

}


