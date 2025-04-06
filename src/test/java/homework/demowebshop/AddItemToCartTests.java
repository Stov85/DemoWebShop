package homework.demowebshop;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {

    @BeforeMethod
    public void preconditionLogin() {
        app.getUser().login();
    }

    @Test
    public void addToCartItemsPositiveTest() {
        app.getItem().addItemInCart();
        app.getItem().isFirstItemAdded();
        app.getItem().clickOnContinueShopping();
        app.getItem().addSecondItemInCart();
        app.getItem().isSecondItemAdded("Blue and green Sneaker");
    }

    //    @Test
//    public void addToCartSecondItemPositiveTest(){
//        app.getItem().clickOnApparelAndShoes();
//        app.getItem().clickOnBlueAndGreenShoes();
//    }

}
