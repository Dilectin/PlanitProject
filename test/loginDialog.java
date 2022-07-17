import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class loginDialog {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Dilectin/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://jupiter.cloud.planittesting.com/#/home");
        //can use tagname to find the element
       // WebElement lgnbtn= driver.findElement(By.tagName("ng-login"));
        WebElement lgnbtn= driver.findElement(By.linkText("Login"));
        lgnbtn.click();
        //lgnbtn.sendKeys("Dilectin");

        WebElement name= driver.findElement(By.id("loginUserName"));
        name.click();
        name.sendKeys("Dilectin");

        WebElement pwd= driver.findElement(By.id("loginPassword"));
        pwd.click();
        pwd.sendKeys("Dilectin");

        //Invalid login details message when clicking on the button
        WebElement button=driver.findElement(By.className("btn-primary"));
        button.click();

        //driver.quit();
    }
}
