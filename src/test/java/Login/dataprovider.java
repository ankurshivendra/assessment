package Login;

import org.testng.annotations.DataProvider;

public class dataprovider {
	
	@DataProvider(name = "productSearchData")
    public Object[][] getProductSearchData() {
        return new Object[][] {
            {"Laptop"}, {"Smartphone"}, {"Headphones"}
        };
    }

    @DataProvider(name = "checkoutData")
    public Object[][] getCheckoutData() {
        return new Object[][] {
            {"John Doe", "123 Elm Street", "555-1234"},
            {"Jane Smith", "456 Oak Avenue", "555-5678"}
        };
    }

}
