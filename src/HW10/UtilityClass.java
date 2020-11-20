package HW10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UtilityClass {
    public WebDriver driver;

    /**
     * This method will click on element
     */
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }


    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will get text on element
     */
    public String getTextFromElement(By by){

        return driver.findElement(by).getText();
    }

}
