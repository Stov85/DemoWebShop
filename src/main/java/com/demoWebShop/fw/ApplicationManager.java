package com.demoWebShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {

    WebDriver driver;

    UserHelper user;
    AddItemToCartHelper item;

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        user = new UserHelper(driver);
        item = new AddItemToCartHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public AddItemToCartHelper getItem() {
        return item;
    }

    public UserHelper getUser() {
        return user;
    }


}
