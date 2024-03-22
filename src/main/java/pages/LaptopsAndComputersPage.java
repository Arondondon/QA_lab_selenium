package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;
import utils.Sleeping;

import java.util.concurrent.TimeUnit;

public class LaptopsAndComputersPage {

    private WebDriver driver;

    public LaptopsAndComputersPage(WebDriver driver) {
        this.driver = driver;
    }

    public LaptopsPage clickLaptopsButton() {
        WebElement laptopsButton = driver.findElement(Locators.LaptopsAndComputersPage.LAPTOPS_BUTTON);
        laptopsButton.click();
        Sleeping.sleep(2);
        return new LaptopsPage(driver);
    }


}
