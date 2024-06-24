package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchresult {
	
	 WebDriver driver;

	    @FindBy(css = "div.product-item") // example locator for first product
	    WebElement firstProduct;

	    public searchresult(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void selectFirstProduct() {
	        firstProduct.click();
	    }

}
