package homework.demowebshop;

import com.demoWebShop.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatAccountTests extends TestBase {
    @Test
    public void registrationPositiveTest() {
        app.getUser().clickOnRigisterLink();
        app.getUser().fillRegistrationForm(new User().setFirstName("Robert").setLastName( "McPherson").setEmail(
                 "boom123456@gmail.com").setPassword( "Boom321$").setConfirmPassword( "Boom321$"));
        app.getUser().clickRegisterButton();
        app.getUser().clickOnContinueButton();
        Assert.assertTrue(app.getUser().isLogOutButtonPresent());
    }

}
