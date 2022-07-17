import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class priceComparison {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Dilectin/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jupiter.cloud.planittesting.com/#/");

        /*driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS); */

        WebElement button=driver.findElement(By.className("btn-success"));
        button.click();

        String itemprice= driver.findElement(By.cssSelector(".product-price")).getText();

        //System.out.print(itemprice);

        driver.findElement(By.className("btn-success")).click();

        driver.findElement(By.cssSelector(".cart-count")).click();

        String cartprice = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tbody/tr/td[2]")).getText();

        //System.out.print(cartprice);

        if(itemprice.equalsIgnoreCase(cartprice))
        {
            System.out.print("Test case passed");
        }
        else
        {
            System.out.print("Test case failed");
        }

    }

}