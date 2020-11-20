package HW10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegistrationFunctionality extends BaseNopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openMyBrowser(baseUrl);
    }

    @After
    public void closeBrowser() {
        closeMyBrowser();
    }

    @Test

    public void RegisterFunctionalityUsingMandatoryField() throws InterruptedException {

        Thread.sleep(2000);
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));

        clickOnElement(By.xpath("//label[contains(text(),'Male')]"));

        clickOnElement(By.xpath("//input[@id='gender-female']"));
        Thread.sleep(1000);
        clickOnElement(By.xpath("//input[@id='FirstName']"));

      sendTextToElement(By.xpath("//input[@id='FirstName']"),"amie");

      clickOnElement(By.xpath("//input[@id='LastName']"));
      sendTextToElement(By.xpath("//input[@id='LastName']"),"king");

      clickOnElement(By.xpath("//select[@name='DateOfBirthDay']//option[contains(text(),'11')]"));

      clickOnElement(By.xpath("//select[@name='DateOfBirthMonth']//option[contains(text(),'November')]"));

      clickOnElement(By.xpath("//select[@name='DateOfBirthYear']//option[contains(text(),'2011')]"));

      clickOnElement(By.xpath("//input[@id='Email']"));


        Random num = new Random();
        int n1 = num.nextInt(500);
        sendTextToElement(By.xpath("//input[@id='Email']"),+n1+"@gmail.com");

        clickOnElement(By.xpath("//input[@id='Company']"));

        sendTextToElement(By.xpath("//input[@id='Company']"),"Zulu Ltd");

        clickOnElement(By.xpath("//input[@id='Newsletter']"));

        clickOnElement(By.xpath("//input[@id='Password']"));
        sendTextToElement(By.xpath("//input[@id='Password']"),"123478");

        clickOnElement(By.xpath("//input[@id='ConfirmPassword']"));
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"123478");

        clickOnElement(By.xpath("//input[@id='register-button']"));
        String actualMessage = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));

        String expectedMessage = "Your registration completed";

        Assert.assertEquals(actualMessage,expectedMessage);


    }}


