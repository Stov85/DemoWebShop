package homework.demowebshop;

import com.demoWebShop.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void positiveLoginTest(){
        app.getUser().login();
        Assert.assertTrue(app.getUser().isLogOutButtonPresent());

    }
}
