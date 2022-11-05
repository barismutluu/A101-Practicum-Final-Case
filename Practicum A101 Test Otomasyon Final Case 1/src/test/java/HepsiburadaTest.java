import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.SearchPage;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HepsiburadaTest extends BaseTest{
    HomePage homePage;
    LoginPage loginPage;
    SearchPage searchPage;
    ProductPage productPage;
    @Test
    @Order(1)

    public void CookiesAccept() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.cookiesAccept();
        homePage.selectMemberLoginPage();
    }
    @Test
    @Order(2)
    public void UserLogin() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.selectMailText();

    }
    @Test
    @Order(3)
    public void SelectProduct() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.productsearch();
        searchPage = new SearchPage(driver);
        searchPage.selectproduct(7);
        productPage = new ProductPage(driver);

    }
    @Test
    @Order(4)
    public void Product() throws InterruptedException {

        productPage.addbasket(1);


    }

}
