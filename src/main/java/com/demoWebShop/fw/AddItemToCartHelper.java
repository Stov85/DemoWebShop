package com.demoWebShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class AddItemToCartHelper extends BaseHelper {
    public AddItemToCartHelper(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }


    @FindBy(css = ".header-menu .top-menu li:nth-child(4)")
    WebElement apparelAndShoesLink;
    @FindBy(css = ".product-grid .item-box:nth-child(2) .product-item .picture [href='/blue-and-green-sneaker']")
    WebElement blueAndGreenShoes;
    @FindBy(css = "#add-to-cart-button-16")
    WebElement addBtn;
    @FindBy(css = ".button-2.continue-shopping-button")
    WebElement continueShoppingBtn;
    @FindBy(css = "#add-to-cart-button-28")
    WebElement addBtnSecondItem;

    public boolean isTextPresent(String text) {
        List<WebElement> list = driver.findElements(By.cssSelector(".product-name"));
        for (WebElement element : list)
            if (element.getText().equalsIgnoreCase(text)){
                System.out.println("Second Element : " + element.getText() + " is added to the cart");
    }
            return true;
}


    public void clickOnApparelAndShoes(){
        apparelAndShoesLink.click();
    }
    public void clickOnBlueAndGreenShoes(){
        blueAndGreenShoes.click();
    }
    public void clickOnContinueShopping(){
        continueShoppingBtn.click();
    }
    public void clickOnAddBtn(){
        addBtn.click();
    }
    public void clickOnAddBtn2(){
        addBtnSecondItem.click();
    }

    public void addItemInCart() {
        click(By.cssSelector(".header-menu .top-menu [href='/computers']"));
        click(By.cssSelector("[alt='Picture for category Desktops']"));
        click(By.cssSelector(".product-grid .item-box:nth-child(2)"));
        click(By.cssSelector("#product_attribute_16_3_6_18"));
        clickOnAddBtn();
    }

    public void isFirstItemAdded() {
        click(By.cssSelector(".ico-cart .cart-label"));
        isElementPresent(By.cssSelector("#checkout"));
    }
    public void addSecondItemInCart() {
        clickOnApparelAndShoes();
        clickOnBlueAndGreenShoes();
        scrollDown();
        clickOnAddBtn2();
    }
    public void isSecondItemAdded(String text) {
        click(By.cssSelector(".ico-cart .cart-label"));
        isTextPresent(text);
    }
    public void scrollDown()  {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 150).perform();
        pause();
    }
}
