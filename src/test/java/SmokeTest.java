import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CartPage;
import pages.ComparisonPage;
import pages.LaptopsPage;
import pages.MainPage;
import utils.Sleeping;


public class SmokeTest {

    private WebDriver driver;

    @Before
    public void preparation(){
        String url = "https://www.regard.ru/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        Sleeping.sleep(2);
    }

    /**
     * 1) Тыкнуть по кнопке Каталог.
     * <p>2) Тыкнуть по кнопке Ноутбуки и компьютеры (открывается новая страница)
     * <p>3) Тыкнуть по кнопке Ноутбуки (открывается новая страница)
     * <p>4) Проверить, что заголовок страницы - Ноутбуки
     */
    @Test
    public void testNavigation(){

        MainPage mainPage = new MainPage(driver);

        String headerText = mainPage
                .clickCatalogButton()
                .clickLaptopsAndComputersButton()
                .clickLaptopsButton()
                .getHeaderText();

        Assert.assertEquals(headerText, "Ноутбуки");
    }

    /**
     * 1) Тыкнуть по строке поиска
     * <p>2) Ввести "Ноутбуки"
     * <p>3) Тыкнуть по кнопке поиска (открывается новая страница)
     * <p>4) Проверить, что заголовок страницы - Ноутбуки
     */
    @Test
    public void testSearch() {

        MainPage mainPage = new MainPage(driver);
        String searchText = "Ноутбуки";

        String headerText = mainPage
                .clickSearchInput()
                .inputTextToSearchInput(searchText)
                .clickSearchButton()
                .getHeaderText();

        Assert.assertEquals(searchText, headerText);
    }

    /**
     * 1) Тыкнуть по строке поиска
     * <p>2) Ввести "Ноутбуки"
     * <p>3) Тыкнуть по кнопке поиска (открывается новая страница)
     * <p>4) Тыкнуть на кнопку "В корзину" у первого товара и запомнить название товара
     * <p>5) Тыкнуть на кнопку "В корзине" у первого товара (открывается новая страница)
     * <p>6) Проверить, что заголовок страницы - Корзина
     * <p>7) Проверить, что в корзине лежит тот товар, который мы добавили туда
     */
    @Test
    public void testAddingItemToCart() {
        MainPage mainPage = new MainPage(driver);
        String searchText = "Ноутбуки";

        LaptopsPage laptopsPage = mainPage
                .clickSearchInput()
                .inputTextToSearchInput(searchText)
                .clickSearchButton();

        String firstItemName = laptopsPage.getFirstItemName();
        CartPage cartPage = laptopsPage.clickToCartButton().clickCartButton();

        Assert.assertEquals(firstItemName, cartPage.getFirstItemName());
        Assert.assertEquals(cartPage.getHeaderText(), "Корзина");
    }

    /**
     * 1) Тыкнуть по строке поиска
     * <p>2) Ввести "Ноутбуки"
     * <p>3) Тыкнуть по кнопке поиска (открывается новая страница)
     * <p>4) Тыкнуть на кнопку сравнения у первого товара
     * <p>5) Тыкнуть на кнопку сравнения у второго товара
     * <p>6) Запомнить названия первого и второго товаров
     * <p>7) Тыкнуть на кнопку "Сравнение" (открывается новая страница)
     * <p>8) Проверить, что заголовок страницы - Сравнение
     * <p>9) Проверить, что в разделе сравнения лежат те товары, которые мы добавили туда
     */
    @Test
    public void testComparison() {
        MainPage mainPage = new MainPage(driver);
        String searchText = "Ноутбуки";

        LaptopsPage laptopsPage = mainPage
                .clickSearchInput()
                .inputTextToSearchInput(searchText)
                .clickSearchButton()
                .clickFirstItemCompareButton()
                .clickSecondItemCompareButton();

        String firstItemName = laptopsPage.getFirstItemName();
        String secondItemName = laptopsPage.getSecondItemName();

        ComparisonPage comparisonPage = laptopsPage.clickComparisonButton();

        Assert.assertEquals(comparisonPage.getHeaderText(), "Сравнение");
        Assert.assertEquals("Ноутбук " + comparisonPage.getFirstItemName(), secondItemName);
        Assert.assertEquals("Ноутбук " + comparisonPage.getSecondItemName(), firstItemName);
    }

    @After
    public void ending(){
        driver.quit();
    }
}
