package Login;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ecoomercetestjava {
	 WebDriver driver;
	   LaunchUrl homePage;
	    searchresult searchResultsPage;
	    pageproduct productPage;
	    Checkoutpage checkoutPage;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        homePage = new LaunchUrl(driver);
	        searchResultsPage = new searchresult(driver);
	        productPage = new pageproduct(driver);
	        checkoutPage = new Checkoutpage(driver);
	    }

	    @Test(dataProvider ="productData", dataProviderClass = TestDataProvider.class)
	    public void searchAndAddProductToCart(String product) {
	        driver.get("http://example-ecommerce-website.com");
	        homePage.searchProduct(product);
	        searchResultsPage.selectFirstProduct();
	        productPage.addToCart();
	    }

	    @Test(dependsOnMethods = "searchAndAddProductToCart", dataProvider = "checkoutData", dataProviderClass = TestDataProvider.class)
	    public void proceedToCheckout(String name, String address, String phone) {
	        driver.get("http://example-ecommerce-website.com/cart");
	        checkoutPage.fillCheckoutDetails(name, address, phone);
	        checkoutPage.confirmOrder();
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }

}
