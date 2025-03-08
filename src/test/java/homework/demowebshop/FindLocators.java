package homework.demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindLocators {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.body.style.zoom='70%'");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findSimpleLocatrs() {
        List<WebElement> a = driver.findElements(By.tagName("a"));
        // for (int i = 0; i < a.size(); i++)
        System.out.println(a.get(2).getText());
        System.out.println("***********************");

        WebElement element1 = driver.findElement(By.className("ico-register"));
        System.out.println(element1.getText());
        System.out.println("***********************");

        WebElement element2 = driver.findElement(By.className("search-box"));
        //System.out.println(element2.getText());

        WebElement element3 = driver.findElement(By.id("topcartlink"));
        System.out.println(element3.getText());
        System.out.println("***********************");

        WebElement element4 = driver.findElement(By.id("small-searchterms"));
        System.out.println(element4.getText());


        WebElement element5 = driver.findElement(By.className("leftside-3"));
        System.out.println(element5.getText());
        System.out.println("***********************");

        WebElement element6 = driver.findElement(By.className("topic-html-content-body"));
        System.out.println(element6.getText());
        System.out.println("***********************");

        WebElement element7 = driver.findElement(By.id("newsletter-subscribe-block"));
        System.out.println(element7.getText());
        System.out.println("***********************");

        WebElement element8 = driver.findElement(By.id("nivo-slider"));
        System.out.println(element8.getText());
        System.out.println("***********************");

        WebElement element9 = driver.findElement(By.className("buttons"));
        System.out.println(element9);
    }

    @Test
    public void findLocatorsXPathAndCss() {
        WebElement element = driver.findElement(By.cssSelector("#topcartlink"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.cssSelector("#newsletter-subscribe-block"));
        System.out.println(element1.getText());
        WebElement element2 = driver.findElement(By.cssSelector("#small-searchterms"));
        System.out.println(element2.getText());
        WebElement element3 = driver.findElement(By.cssSelector(".ico-register"));
        System.out.println(element3.getText());
        WebElement element4 = driver.findElement(By.cssSelector(".search-box"));
        System.out.println(element4.getText());
        WebElement element5 = driver.findElement(By.cssSelector(".leftside-3"));
        System.out.println(element5.getText());
        WebElement element6 = driver.findElement(By.cssSelector("[value='Subscribe']"));
        System.out.println(element6.getText());
        WebElement element7 = driver.findElement(By.cssSelector("[onsubmit='return check_small_search_form()']"));
        System.out.println(element7.getText());
        WebElement element8 = driver.findElement(By.cssSelector("[href='/tricentis']"));
        System.out.println(element8.getText());
        WebElement element9 = driver.findElement(By.cssSelector("[value='Vote']"));
        System.out.println(element9.getText());
        WebElement element10 = driver.findElement(By.cssSelector("[alt='Picture of $25 Virtual Gift Card'r]"));
        System.out.println(element10.getText());

    }

}
