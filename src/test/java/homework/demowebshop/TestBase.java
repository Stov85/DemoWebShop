package homework.demowebshop;

import com.demoWebShop.fw.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase
{

protected static ApplicationManager app = new ApplicationManager
        (System.getProperty("browser", Browser.CHROME.browserName()));



    @BeforeMethod
    public void setUp(){
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        app.stop();
    }

}
