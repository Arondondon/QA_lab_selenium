package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {

        By CATALOG_BUTTON = By.xpath("/html/body/div/div/div/div/div/div/div/div[1]/div/button");

        By SEARCH_INPUT = By.id("searchInput");

        By SEARCH_BUTTON = By.xpath("/html/body/div/div/div/div/div/div/div/div[1]/div/div[1]/div/svg[2]");
    }

    public interface CatalogButtons {

        By LAPTOPS_AND_COMPUTERS_BUTTON = By.xpath("/html/body/div/div/div/div/div/div/div/div[2]/div/div/div/div/ul/li[4]/a");
    }

    public interface LaptopsAndComputersPage {

        By LAPTOPS_BUTTON = By.xpath("/html/body/div/div/div/main/div/div[3]/div[2]/div/div[5]/div/a");
    }

    public interface LaptopsPage {

        By PAGE_HEADER = By.xpath("/html/body/div/div/div/main/div/div[1]/div[1]/div[1]/div/h1");

        By FIRST_ITEM_NAME = By.xpath("/html/body/div[1]/div/div/main/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[1]/div[2]/a/div");

        By FIRST_ITEM_TO_CART_BUTTON = By.xpath("/html/body/div/div/div/main/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/button");

        By FIRST_ITEM_CART_BUTTON = By.xpath("/html/body/div/div/div/main/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/button");
    }

    public interface CartPage {

        By PAGE_HEADER = By.xpath("/html/body/div/div/div/main/div/div[1]/div/div[1]/div/h1");

        By FIRST_ITEM_NAME = By.xpath("/html/body/div/div/div/main/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/a/span");
    }
}
