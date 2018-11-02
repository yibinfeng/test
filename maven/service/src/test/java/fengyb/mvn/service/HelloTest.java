package fengyb.mvn.service;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest{

    @Test
    public void test01() {
        Hello hello = new Hello();
        String doJob = hello.doJob();
        System.out.println(doJob);
        Assert.assertEquals("test: ", "Hello World", doJob);
    }
}