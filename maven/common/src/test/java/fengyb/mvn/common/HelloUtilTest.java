package fengyb.mvn.common;

import org.junit.Assert;
import org.junit.Test;

public class HelloUtilTest {
    @Test
    public void test01() {
        Assert.assertEquals("Hello World", HelloUtil.info());
        System.out.println(HelloUtil.info());
    }
}