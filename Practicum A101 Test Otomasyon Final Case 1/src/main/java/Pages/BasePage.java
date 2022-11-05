package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class BasePage {
    public static WebDriver driver ;

    public BasePage(WebDriver driver){
        this.driver = driver ;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }
    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }
    public void click(By locator){
        find(locator).click();
    }
    public void move (By locator){

        Actions builder=new Actions(driver);
        Action mouseOverHome=builder
                .moveToElement(find(locator))
                .build();
        mouseOverHome.perform();

    }
    public void scrolldown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
    }
    public void handles(){
        Set<String> windowsAllWindows=driver.getWindowHandles();
        for (String window:windowsAllWindows){
            driver.switchTo().window(window);

        }
    }
}