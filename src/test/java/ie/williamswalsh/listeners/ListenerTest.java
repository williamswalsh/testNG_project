package ie.williamswalsh.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ie.williamswalsh.listeners.CustomListener.class)
public class ListenerTest {

    @Test
    public void test1() {
        Assert.assertEquals("A", "A");
    }
    @Test
    public void test2() {
        Assert.assertEquals("A", "B");
    }

    @Test
    public void test3() {
        throw new SkipException("This is a skip exception??");
    }
}
