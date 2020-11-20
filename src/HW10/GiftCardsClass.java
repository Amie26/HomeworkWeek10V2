package HW10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCardsClass extends BaseNopcommerce{

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp (){
        openMyBrowser(baseUrl);
    }

    @After
    public void closeBrowser (){
        closeMyBrowser();
    }

    @Test
    public void testingGiftCardsLink () throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));

        Thread.sleep(2000);
        String actualMessage = "Gift Cards";
        String expectedMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));

        Assert.assertEquals(expectedMessage,actualMessage);

    }

}
