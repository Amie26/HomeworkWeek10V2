package HW10;

import HW10.BaseNopcommerce;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApparelClass extends BaseNopcommerce {

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
    public void testingApparelLink() throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        Thread.sleep(2000);
        String actualMessage = "Apparel";
        String expectedMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void shoeMethod() throws InterruptedException {
        testingApparelLink();
        clickOnElement(By.xpath("//div/h2[@class='title']//a[@href='/shoes']"));
        Thread.sleep(2000);

        String expectedResult = "Shoes";
        String actualResult = getTextFromElement(By.xpath("//h1[contains(text(),'Shoes')]"));


        Assert.assertEquals(expectedResult, actualResult);


    }

}
