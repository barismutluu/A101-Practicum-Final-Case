package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{
    By addtocartbuttonlocation=By.xpath("//button[@class='add-to-basket button']");
    By Xlocation=By.xpath("//a[@class='checkoutui-Modal-iHhyy79iR28NvF33vKJb']");
    By seeallsellerlocation=By.xpath("//a[@class='optionsLength']");
    By gotobasketbuttonlocation=By.xpath("//button[text()='Sepete git']");
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addbasket(int i) throws InterruptedException {
        handles();
        scrolldown();
        click(seeallsellerlocation);
        Thread.sleep(1000);
        getAllLists().get(i).click();
        click(Xlocation);
        Thread.sleep(1000);
        getAllLists().get(i+1).click();
        click(gotobasketbuttonlocation);
        WebElement totalproduct=driver.findElement(By.id("basket-item-count"));
        String myAddTotal="2";
        Assertions.assertEquals(myAddTotal,totalproduct.getText());

    }
    private List<WebElement> getAllLists(){
        return findAll(addtocartbuttonlocation);

    }
}
