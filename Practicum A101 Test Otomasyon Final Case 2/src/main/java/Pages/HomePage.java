package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{

    By acceptcookieslocation=By.xpath("//button[text()='Kabul Et']");
    WebElement searchtextboxlocation=driver.findElement(By.xpath("//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void cookiesAccept() {
        if (isDisplayed(acceptcookieslocation)) {
            click(acceptcookieslocation);
        }
        Actions actions=new Actions(driver);
        actions.click(searchtextboxlocation)
        .sendKeys("Bilgisayar")
        .sendKeys(Keys.ENTER)
        .perform();


    }


}
