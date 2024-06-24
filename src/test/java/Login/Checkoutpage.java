package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	
	WebDriver driver;

    @FindBy(id = "checkout-button") // example locator for checkout button
    WebElement checkoutButton;

    @FindBy(id = "name") // example locator for name input field
    WebElement nameField;

    @FindBy(id = "address") // example locator for address input field
    WebElement addressField;

    @FindBy(id = "phone") // example locator for phone input field
    WebElement phoneField;

    @FindBy(id = "confirm-order-button") // example locator for confirm order button
    WebElement confirmOrderButton;

    public Checkoutpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillCheckoutDetails(String name, String address, String phone) {
        nameField.sendKeys(name);
        addressField.sendKeys(address);
        phoneField.sendKeys(phone);
        checkoutButton.click();
    }

    public void confirmOrder() {
        confirmOrderButton.click();
    }

}
