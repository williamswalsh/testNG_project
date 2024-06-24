package ie.williamswalsh;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail.com", "abc"}, {"cde@gmail.com", "cde"}};
        return data;
    }
}
