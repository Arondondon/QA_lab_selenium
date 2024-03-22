package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;
import utils.Sleeping;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage clickCatalogButton() {
        WebElement catalogButton = driver.findElement(Locators.MainPage.CATALOG_BUTTON);
        catalogButton.click();
        Sleeping.sleep(2);
        return this;
    }

    public LaptopsAndComputersPage clickLaptopsAndComputersButton() {
        WebElement laptopsAndComputersButton = driver.findElement(Locators.CatalogButtons.LAPTOPS_AND_COMPUTERS_BUTTON);
        laptopsAndComputersButton.click();
        Sleeping.sleep(2);
        return new LaptopsAndComputersPage(driver);
    }

    public MainPage clickSearchInput() {
        WebElement searchInput = driver.findElement(Locators.MainPage.SEARCH_INPUT);
        searchInput.click();
        //Sleeping.sleep(1);
        return this;
    }

    public MainPage inputTextToSearchInput(String text) {
        WebElement searchInput = driver.findElement(Locators.MainPage.SEARCH_INPUT);
        searchInput.sendKeys(text);
        Sleeping.sleep(1);
        return this;
    }

    public LaptopsPage clickSearchButton() {
        WebElement searchInput = driver.findElement(Locators.MainPage.SEARCH_INPUT);
        searchInput.sendKeys(Keys.ENTER);
        Sleeping.sleep(3);
        return new LaptopsPage(driver);
    }
}
