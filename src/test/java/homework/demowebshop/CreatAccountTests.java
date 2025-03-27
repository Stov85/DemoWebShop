package homework.demowebshop;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatAccountTests extends TestBase {
    @Test
    public void registrationPositiveTest() {
        clickOnRigisterLink();
        fillRegistrationForm("Robert", "McPherson",
                "boom1234@gmail.com", "Boom321$", "Boom321$");
        clickRegisterButton();
        Assert.assertTrue(isLogOutButtonPresent());
    }

}
