package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Locators;
import utils.Sleeping;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.regard.ru/");
        Sleeping.sleep(2);
        WebElement searchInput = driver.findElement(Locators.MainPage.SEARCH_INPUT);
        searchInput.sendKeys("Ноутбуки");
        Sleeping.sleep(2);
        driver.quit();
    }
}