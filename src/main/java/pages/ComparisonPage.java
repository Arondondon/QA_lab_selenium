package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class ComparisonPage {

    private final WebDriver driver;

    public ComparisonPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        WebElement headerText = driver.findElement(Locators.ComparisonPage.PAGE_HEADER);
        return headerText.getText();
    }

    public String getFirstItemName() {
        WebElement firstItemName = driver.findElement(Locators.ComparisonPage.FIRST_ITEM_NAME);
        return firstItemName.getText();
    }

    public String getSecondItemName() {
        WebElement secondItemName = driver.findElement(Locators.ComparisonPage.SECOND_ITEM_NAME);
        return secondItemName.getText();
    }
}
