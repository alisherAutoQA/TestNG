package org.example;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Main {

    @DataProvider(name="db")
    public static Object[][] dbData (){
        return new Object[][] {
                {"SQL", new Integer(1)},
                {"NoSQL", new Integer(2)}
        };
    }



    @Parameters({"db"})
    @Test(dataProvider = "db")
    public void test1(String e1, int e2){
        System.out.println("test1 " + e1 + " "+ e2);
    }

    public static void main(String[] args) {






    }
}