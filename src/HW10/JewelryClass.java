package HW10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JewelryClass extends BaseNopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp (){
        openMyBrowser(baseUrl);
    }

    public void closeBrowser (){
        closeMyBrowser();
    }
    @Test
    public void testingJewelryLink () throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));

        Thread.sleep(2000);

        String actualMessage = "Jewelry";
        String expectedMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));


        Assert.assertEquals(expectedMessage,actualMessage);

    }

}
