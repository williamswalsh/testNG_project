package ie.williamswalsh;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void testStartCar() {
        System.out.println("Start car");
        Assert.fail("Demo failure to show ignoring of dependent test methods.");
    }

    @Test(dependsOnMethods = {"testStartCar"})
    public void testDriveCar() {
        System.out.println("Drive car");
    }

    @Test(dependsOnMethods = {"testDriveCar"})
    public void testStopCar() {
        System.out.println("Stop car");
    }

//    testStopCar - not the clearest example
//    Just wants to demo the multiple dependent tests
    @Test(dependsOnMethods = {"testStopCar","testStartCar"})
    public void testParkCar() {
        System.out.println("Park Car");
    }
}
