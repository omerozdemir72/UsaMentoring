package b_06_08_Mentoring_6_TestNG_Giris;

import org.testng.annotations.Test;

public class basit_test1 {

    @Test(priority = 3)
    public void a(){

        System.out.println("a");
    }

    @Test(priority = 2)
    public void b(){
        System.out.println("b");
    }

    @Test(priority = 1, enabled = false)
    public void c(){
        System.out.println("c");
    }
}
