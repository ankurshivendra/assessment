package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchUrl {

	 WebDriver driver;

	    @FindBy(name = "q") // example locator for search box
	    WebElement searchBox;

	    @FindBy(css = "button[type='submit']") // example locator for search button
	    WebElement searchButton;

	    public LaunchUrl(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    public void searchProduct(String product) {
	        searchBox.sendKeys(product);
	        searchButton.click();
	    }
	   
}
