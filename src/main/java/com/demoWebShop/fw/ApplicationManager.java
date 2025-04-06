package com.demoWebShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {
    String browser;
    WebDriver driver;

    UserHelper user;
    AddItemToCartHelper item;

    public ApplicationManager(String browser){
        this.browser=browser;
    }


    public void init() {

        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }

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
