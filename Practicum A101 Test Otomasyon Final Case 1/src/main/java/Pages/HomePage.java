package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By acceptcookieslocation=By.xpath("//button[text()='Kabul Et']");
    WebElement searchtextboxlocation=driver.findElement(By.xpath("//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));
    By loginorregisterbarlocation=By.xpath("//span[@title='veya üye ol']");
    By loginlocation=By.xpath("//a[contains(text(),'Giriş Yap')]");
    public void cookiesAccept() {
        if (isDisplayed(acceptcookieslocation)) {
            click(acceptcookieslocation);
        }

    }
    public void selectMemberLoginPage() throws InterruptedException {
        move(loginorregisterbarlocation);
        Thread.sleep(1000);
        click(loginlocation);
        Thread.sleep(2000);
    }

    public void productsearch() {
        Actions actions=new Actions(driver);
        actions.click(searchtextboxlocation)
                .sendKeys("Bilgisayar")
                .sendKeys(Keys.ENTER)
                .perform();

    }
}
