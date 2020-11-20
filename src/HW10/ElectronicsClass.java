package HW10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Watchable;

public class ElectronicsClass extends BaseNopcommerce {

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
    public void testingElectronicsLink () throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));

        Thread.sleep(2000);
        String actualMessage = "Electronics";
        String expectedMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void cameraTestMethod () throws InterruptedException {
        testingElectronicsLink();
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));



        Thread.sleep(2000);
        String expectedText = "Camera & photo";
        String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Camera & photo')]"));

        Assert.assertEquals(actualText,expectedText);

    }

}
