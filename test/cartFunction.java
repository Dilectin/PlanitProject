import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class cartFunction {
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

        WebDriverWait wait=new WebDriverWait(driver, 50);

        WebElement checkout= driver.findElement(By.className("btn-success"));
        checkout.click();
        driver.get("https://jupiter.cloud.planittesting.com/#/checkout");
        // driver.quit();
    }
}
