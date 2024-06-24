package ie.williamswalsh;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail.com", "abc"}, {"cde@gmail.com", "cde"}};
        return data;
    }

    @Test(dataProvider = "LoginDataProvider")
    public void test(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
