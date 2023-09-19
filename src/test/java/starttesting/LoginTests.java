package starttesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    WebDriver driver;

    @BeforeClass
    public void precondition() {
        driver = new ChromeDriver();
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    @Test
    public void loginPositive() {
// find login
        // fill input email
        // fill input password
        // click yalla button
        // validate by text in the element
        WebElement btnLogin = driver.findElement(By.xpath(""));
        btnLogin.click();

        WebElement inputEmail = driver.findElement(By.xpath(""));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("");

        WebElement inputPassword = driver.findElement(By.xpath(""));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("");

        WebElement btnYalla = driver.findElement(By.xpath(""));
        btnYalla.click();

        WebElement textMessagePopUpH2 = driver.findElement(By.xpath(""));
        String textMessageH2 = textMessagePopUpH2.getText().trim().toUpperCase();
        String expecteResult = "Logged in success".toUpperCase();

        Assert.assertEquals(textMessageH2, expecteResult);


    }


    @AfterClass
    public void postCondition() {
        driver.quit();
    }


}
