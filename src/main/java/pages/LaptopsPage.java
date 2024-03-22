package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;
import utils.Sleeping;

public class LaptopsPage {

    private WebDriver driver;

    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        WebElement headerText = driver.findElement(Locators.LaptopsPage.PAGE_HEADER);
        return headerText.getText();
    }

    public String getFirstItemName() {
        WebElement firstItemName = driver.findElement(Locators.LaptopsPage.FIRST_ITEM_NAME);
        return firstItemName.getText();
    }

    public LaptopsPage clickToCartButton() {
        WebElement toCartButton = driver.findElement(Locators.LaptopsPage.FIRST_ITEM_TO_CART_BUTTON);
        toCartButton.click();
        Sleeping.sleep(2);
        return this;
    }

    public CartPage clickCartButton() {
        WebElement cartButton = driver.findElement(Locators.LaptopsPage.FIRST_ITEM_CART_BUTTON);
        cartButton.click();
        Sleeping.sleep(2);
        return new CartPage(driver);
    }
}
