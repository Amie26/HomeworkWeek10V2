package HW10;

import HW10.UtilityClass;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseNopcommerce extends UtilityClass {
    //public WebDriver driver;

public void openMyBrowser (String baseUrl){
    System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.setPageLoadStrategy(PageLoadStrategy.NONE);
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get(baseUrl);

}

public void closeMyBrowser() {

  //  driver.quit();
    }

}
