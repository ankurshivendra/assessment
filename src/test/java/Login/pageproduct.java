package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageproduct {
	WebDriver driver;

    @FindBy(id = "add-to-cart-button") // example locator for add to cart button
    WebElement addToCartButton;

    public pageproduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {
        addToCartButton.click();
    }

}
