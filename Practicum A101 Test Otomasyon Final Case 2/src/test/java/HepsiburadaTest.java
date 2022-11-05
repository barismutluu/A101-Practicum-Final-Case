import Pages.HomePage;
import Pages.ProductPage;
import Pages.SearchPage;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HepsiburadaTest extends BaseTest{
    HomePage homePage;
    SearchPage searchPage;
    ProductPage productPage;

    @Test
    @Order(1)

    public void CookiesAccept() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.cookiesAccept();
}
@Test
    @Order(2)
    public void SelectProduct() throws InterruptedException {
        searchPage = new SearchPage(driver);
        searchPage.selectproduct(7);
        productPage = new ProductPage(driver);
}
    @Test
    @Order(3)
    public void Product() throws InterruptedException {

        productPage.addbasket(1);


    }
}