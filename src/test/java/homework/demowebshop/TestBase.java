package homework.demowebshop;

import com.demoWebShop.fw.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase
{

protected ApplicationManager app = new ApplicationManager();
    @BeforeMethod
    public void setUp(){
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        app.stop();
    }

}
