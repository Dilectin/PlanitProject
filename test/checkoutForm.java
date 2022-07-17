import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class checkoutForm {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Dilectin/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://jupiter.cloud.planittesting.com/#/home");
        WebElement shop= driver.findElement(By.id("nav-shop"));
        shop.click();
        driver.get("https://jupiter.cloud.planittesting.com/#/shop");


        WebElement button=driver.findElement(By.className("btn-success"));
        button.click();

        button=driver.findElement(By.className("btn-success"));
        button.click();

        WebElement cart_checkout=driver.findElement(By.id("nav-cart"));
        cart_checkout.click();

        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-checkout.btn.btn-success.ng-scope")));

        WebElement checkout= driver.findElement(By.cssSelector(".btn-checkout.btn.btn-success.ng-scope"));
        checkout.click();
        wait=new WebDriverWait(driver, 50);

        String url = driver.getCurrentUrl();
        //driver.get("https://jupiter.cloud.planittesting.com/#/checkout");

        /*WebElement fname= driver.findElement(By.xpath("//*[@id=\"forename\"]"));
        fname.click();
        fname.sendKeys("John"); */
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("forename")));

        driver.findElement(By.id("forename")).sendKeys("John");

        driver.findElement(By.id("surname")).sendKeys("Dew");

        driver.findElement(By.id("email")).sendKeys("john.dew@planit.com");

        driver.findElement(By.id("telephone")).sendKeys("0212345678");

        driver.findElement(By.id("address")).sendKeys("101 Example Road");

        driver.findElement(By.id("cardType")).sendKeys("Visa");
        driver.findElement(By.id("card")).sendKeys("1234 1234 1234 1234");

        WebElement submitbutton=driver.findElement(By.id("checkout-submit-btn"));
        submitbutton.click();

        // driver.quit();
    }
}
