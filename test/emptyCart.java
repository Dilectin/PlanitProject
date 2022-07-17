import jdk.internal.cmm.SystemResourcePressureImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class emptyCart {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Dilectin/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://jupiter.cloud.planittesting.com/#/");
        driver.get("https://jupiter.cloud.planittesting.com/#/shop");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //Adding product No 2  to cart
        WebElement button=driver.findElement(By.xpath("//*[@id=\"product-2\"]/div/p/a"));
        button.click();
        //dding product No 4 to cart
        WebElement button1=driver.findElement(By.xpath("//*[@id=\"product-4\"]/div/p/a"));
        button1.click();
        //clicking on cart button
        WebElement cart_checkout=driver.findElement(By.id("nav-cart"));
        cart_checkout.click();

        WebDriverWait wait=new WebDriverWait(driver, 50);
        //Click on the Empty cart button
        WebElement emptycart = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tfoot/tr[2]/td/ng-confirm/a"));
        emptycart.click();
        WebDriverWait wait1=new WebDriverWait(driver, 50);
        //click on yes
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/a[2]")).click();

        driver.get("https://jupiter.cloud.planittesting.com/#/cart");

        System.out.println("Test successful");
        WebDriverWait wait2=new WebDriverWait(driver, 20);

        WebElement alert= wait2.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/strong"))));

        String alertText=alert.getText();
        assertEquals("Your cart is empty",alertText);

        // driver.quit();
    }


}
