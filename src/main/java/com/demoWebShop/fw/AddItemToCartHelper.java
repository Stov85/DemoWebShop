package com.demoWebShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemToCartHelper extends BaseHelper {

    public AddItemToCartHelper(WebDriver driver) {
        super(driver);
    }

    public void addItemInCart() {
        click(By.cssSelector(".header-menu .top-menu [href='/computers']"));
        click(By.cssSelector("[alt='Picture for category Desktops']"));
        click(By.cssSelector(".product-grid .item-box:nth-child(2)"));
        click(By.cssSelector("#product_attribute_16_3_6_18"));
        click(By.cssSelector("#add-to-cart-button-16"));
    }
    public void isItemAdded(){
        click(By.cssSelector(".ico-cart .cart-label"));
        isElementPresent(By.cssSelector("#checkout"));
    }

}
