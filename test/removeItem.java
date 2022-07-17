import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class removeItem {
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
        //Check the number of items in cart before removing an item
        WebElement cart=driver.findElement(By.cssSelector(".cart-count.ng-binding"));
        String beforevalue= cart.getText();

        //Click on the Remove item button
        WebElement removebtn = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tbody/tr[1]/td[5]/ng-confirm/a"));
        removebtn.click();

        //click on yes
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/a[1]")).click();

        //check the number of items in cart after removing an item
        WebElement cart1=driver.findElement(By.cssSelector(".cart-count.ng-binding"));
        String aftervalue= cart1.getText();

        if(!beforevalue.equals(aftervalue))
        {
            System.out.print("Test case passed");
        }
        else
        {
            System.out.print("Test case failed");
        }

        // driver.quit();
    }


}
