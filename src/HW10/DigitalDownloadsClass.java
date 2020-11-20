package HW10;

import HW10.BaseNopcommerce;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DigitalDownloadsClass extends BaseNopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp (){
        openMyBrowser (baseUrl);
    }
    @After
    public void closeBrowser(){
        closeMyBrowser();
    }
    @Test
    public void testingDigitalDownloadsLink () throws InterruptedException {

        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));

        Thread.sleep(2000);
        String actualMessage = "Digital downloads";

        String expectedMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));

        Assert.assertEquals(expectedMessage,actualMessage);








    }




}
