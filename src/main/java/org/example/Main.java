package org.example;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Main {
    @Test(retryAnalyzer = Retry.class)
    public void test1(){
        System.out.println("test1 ");
        Assert.fail();
    }


}

