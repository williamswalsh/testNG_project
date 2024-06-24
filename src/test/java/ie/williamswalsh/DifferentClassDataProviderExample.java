package ie.williamswalsh;

import org.testng.annotations.Test;

public class DifferentClassDataProviderExample {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void test(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
