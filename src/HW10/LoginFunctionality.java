package HW10;

import HW10.BaseNopcommerce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginFunctionality extends BaseNopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openMyBrowser(baseUrl);

    }

    @After
    public void setUpClose() {
        closeMyBrowser();
    }

    @Test
    public void VerifyLoginLink() {
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));
        // To check the login functionality
    }

    @Test
    public void verifyInvalidCredentials() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(By.linkText("Log in"));
        clickOnElement(By.cssSelector("#Email"));
        Thread.sleep(2000);

        sendTextToElement(By.cssSelector("#Email"), "amie.johns@gmail.com.com");
        clickOnElement(By.cssSelector("#Password"));
        sendTextToElement(By.cssSelector("#Password"), "david123");

        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]"));

        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'message-error validation-summary-errors"));
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";

        Assert.assertEquals(actualMessage, expectedMessage);

    }


    @Test
    public void loginUsingValidCredentials() throws InterruptedException {
        Thread.sleep(2000);

        clickOnElement(By.linkText("Log in"));
        clickOnElement(By.cssSelector("#Email"));
        Thread.sleep(2000);

        sendTextToElement(By.cssSelector("#Email"), "harilal@gmail.com");
        clickOnElement(By.cssSelector("#Password"));
        sendTextToElement(By.cssSelector("#Password"), "prabhulal");
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]"));
        String actualMessage = getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        String expectedMessage = "Welcome to our store";
        Assert.assertEquals(actualMessage, expectedMessage);

    }

}