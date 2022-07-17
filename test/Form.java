import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Dilectin/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://jupiter.cloud.planittesting.com/#/home");
        WebElement contact= driver.findElement(By.id("nav-contact"));
        contact.click();
        driver.get("https://jupiter.cloud.planittesting.com/#/contact");

        driver.findElement(By.id("forename")).sendKeys("John");

        driver.findElement(By.id("surname")).sendKeys("Doe");

        driver.findElement(By.id("email")).sendKeys("john.doe@planit.com");

        driver.findElement(By.id("telephone")).sendKeys("001100110");

        driver.findElement(By.id("message")).sendKeys("001100110");

        WebElement button=driver.findElement(By.className("btn-contact"));
        button.click();

        WebDriverWait wait=new WebDriverWait(driver, 20);
        WebElement alert= wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert-success"))));

        String alertText=alert.getText();
        assertEquals("Thanks John, we appreciate your feedback.",alertText);

       // driver.quit();
    }
}
