import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class changeinTotalprice {
//check the total price based on the quantity of items
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Dilectin/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jupiter.cloud.planittesting.com/#/");


        WebElement button=driver.findElement(By.className("btn-success"));
        button.click();

        String itemprice= driver.findElement(By.cssSelector(".product-price")).getText();

        itemprice=itemprice.replace("$","");

        driver.findElement(By.className("btn-success")).click();
        driver.findElement(By.cssSelector(".cart-count")).click();

       //updating the quantity of the product

        driver.findElement(By.name(("quantity"))).clear();

        driver.findElement(By.name("quantity")).sendKeys("2");

        //Get the total amount
        String subtotal = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tfoot/tr[1]/td/strong")).getText();

        //Calculating the price based on the quantity
        float price=Float.parseFloat(itemprice);
        float totalprice = price * 2;

        String noofitemsdisplayed = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tbody/tr/td[4]")).getText();

        //Checking if total price has changed based on quantity of items and checking if no of quantity displayed on top has changed to 2.
        if(subtotal.contains(String.valueOf(totalprice))&& (noofitemsdisplayed.contains("2")))
        {
            System.out.print("Test case to check if the total amount is calculated correctly is successful");
        }
        else
        {
            System.out.print("Test case failed");
        }

    }

}