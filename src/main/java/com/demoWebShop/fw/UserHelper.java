package com.demoWebShop.fw;

import com.demoWebShop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    public UserHelper(WebDriver driver) {
        super(driver);
    }

//    public void fillRegistrationForm(String firstName, String lastName, String email, String password, String confirmPassword){
//        type(By.xpath("//*[@id='FirstName']"),  firstName);
//        type(By.xpath("//*[@id='LastName']"), lastName);
//        type(By.xpath("//*[@id='Email']"),email);
//        type(By.xpath("//*[@id='Password']"),password);
//        type(By.xpath("//*[@id='ConfirmPassword']"), confirmPassword);
//    }
public void clickOnLoginLink() {
    click(By.xpath("//*[@href='/login']"));
}

    public void clickRegisterButton(){
        click(By.xpath("//*[@class='button-1 register-next-step-button']"));
    }

    public void clickOnRigisterLink() {
        click(By.xpath("//*[@href='/register']"));
    }
public void clickOnContinueButton(){
        click(By.xpath("//*[@class='button-1 register-continue-button']"));
}
    public void isLoginRegistrationFormDisplayed() {
        driver.findElement(By.xpath("//*[@class='button-1 register-button']")).isDisplayed();

    }

    public boolean isLogOutButtonPresent(){
            return isElementPresent(By.xpath("//*[@href='/logout']"));
    }

    public void fillRegistrationForm(User user) {
        type(By.xpath("//*[@id='FirstName']"),  user.getFirstName());
        type(By.xpath("//*[@id='LastName']"), user.getLastName());
        type(By.xpath("//*[@id='Email']"),user.getEmail());
        type(By.xpath("//*[@id='Password']"),user.getPassword());
        type(By.xpath("//*[@id='ConfirmPassword']"), user.getConfirmPassword());
    }

    public void fillLoginForm(User user) {
        type(By.xpath("//*[@id='Email']"),user.getEmail());
        type(By.xpath("//*[@id='Password']"),user.getPassword());
    }

    public void clickOnLoginButton() {
        click(By.xpath("//*[@class='button-1 login-button']"));
    }
}
