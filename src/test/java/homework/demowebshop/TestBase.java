package homework.demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase
{
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver =new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        }
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
    public boolean   isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void type(By locator, String text){
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void fillRegistrationForm(String firstName, String lastName, String email, String password,  String confirmPassword){
        type(By.xpath("//*[@id='FirstName']"),  firstName);
        type(By.xpath("//*[@id='LastName']"), lastName);
        type(By.xpath("//*[@id='Email']"),email);
        type(By.xpath("//*[@id='Password']"),password);
        type(By.xpath("//*[@id='ConfirmPassword']"), confirmPassword);
    }

    public void clickRegisterButton(){
        click(By.xpath("//*[@class='button-1 register-next-step-button']"));
    }

    public void clickOnRigisterLink() {
        click(By.xpath("//*[@href='/register']"));
    }

    public void clickOnLoginLink() {
        click(By.xpath("//*[@href='/login']"));
    }

    public void isLoginRegistrationFormDisplayed() {
        driver.findElement(By.xpath("//*[@class='button-1 register-button']")).isDisplayed();

    }

    public boolean isLogOutButtonPresent(){
            return isElementPresent(By.xpath("//*[@href='/logout']"));
    }
}
