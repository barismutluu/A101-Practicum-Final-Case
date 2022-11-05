package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage{
    By PageCurrentListsNameLocator=By.xpath("//li[@class='productListContent-zAP0Y5msy8OHn5z7T_K_']");
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void selectproduct(int i) throws InterruptedException {
        Thread.sleep(2000);
        scrolldown();
        getAllLists().get(i).click();

    }
    private List<WebElement> getAllLists(){
        return findAll(PageCurrentListsNameLocator);

    }

}
