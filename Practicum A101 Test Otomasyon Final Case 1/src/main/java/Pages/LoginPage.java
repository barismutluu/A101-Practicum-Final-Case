package Pages;

import dev.failsafe.internal.util.Assert;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    By loginbuttonlocation=By.xpath("//button[@id='btnEmailSelect']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void selectMailText() throws InterruptedException {

        WebElement email = driver.findElement(By.xpath("//input[@id='txtUserName']"));
        Thread.sleep(5000);
        email.sendKeys("barismtl1996@gmail.com", Keys.ENTER);
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Test123+");
        Thread.sleep(1000);
        click(loginbuttonlocation);
        Thread.sleep(5000);
        String URL = driver.getCurrentUrl();
        Assertions.assertEquals(URL, "https://www.hepsiburada.com/" );
    }
}
