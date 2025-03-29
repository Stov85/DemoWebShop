package homework.demowebshop;

import com.demoWebShop.models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User().setEmail("boom123456@gmail.com").setPassword("Boom321$"));
        app.getUser().clickOnLoginButton();

    }

    @Test
    public void addToCartItemsTest() {
        app.getItem().addItemInCart();
        app.getItem().isItemAdded();
    }

}
