package HW10;

import HW10.BaseNopcommerce;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComputerClass extends BaseNopcommerce {

   String baseUrl = "https://demo.nopcommerce.com/";

   @Before
    public void setUp () {
       openMyBrowser(baseUrl);
   }
       @After
       public void closeBrowser(){

       closeMyBrowser();
       }

       @Test
       public void testingComputerLink () throws InterruptedException {

           clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
            Thread.sleep(2000);


           String actualMessage = "Computers";

           String expectedMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));


           Assert.assertEquals(expectedMessage, actualMessage);
       }
           @Test

           public void desktopMethod () throws InterruptedException {
               testingComputerLink();

               clickOnElement(By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]"));


               Thread.sleep(2000);
               String expectedText = "Desktops";
               String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Desktops')]"));

               Assert.assertEquals(actualText, expectedText);
           }



   }





