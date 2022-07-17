import com.gargoylesoftware.htmlunit.javascript.host.Console;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class shoppingCart {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Dilectin/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://jupiter.cloud.planittesting.com/#/home");
        WebElement shop= driver.findElement(By.id("nav-shop"));
        shop.click();
        driver.get("https://jupiter.cloud.planittesting.com/#/shop");


        WebElement button=driver.findElement(By.className("btn-success"));
        button.click();

        WebElement cart=driver.findElement(By.cssSelector(".cart-count.ng-binding"));
        assert (cart.getText().equals("1"));

        button=driver.findElement(By.className("btn-success"));
        button.click();

        cart=driver.findElement(By.cssSelector(".cart-count.ng-binding"));
        assert (cart.getText().equals("2"));


        // driver.quit();
    }
}
