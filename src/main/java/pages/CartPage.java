package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        WebElement headerText = driver.findElement(Locators.CartPage.PAGE_HEADER);
        return headerText.getText();
    }

    public String getFirstItemName() {
        WebElement firstItemName = driver.findElement(Locators.CartPage.FIRST_ITEM_NAME);
        return firstItemName.getText();
    }
}
