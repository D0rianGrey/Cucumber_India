package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumLoginTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://www.letskodeit.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);

        Thread.sleep(5000);

        WebElement banner = driver.findElement(By.xpath("//*[@id=\"comp-jgmoxws4\"]"));
        banner.click();

        WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
        signupLink.click();

        WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
        emailField.sendKeys("test@email.com");

        WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
        passwordField.sendKeys("abcabc");

        WebElement goButton = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
        goButton.click();
        goButton.sendKeys(Keys.ENTER);

        // With recent webdriver and FF update, there might be issues in clicking the goButton.
        // If you also encouter the issues, please comment the above code for goButton and un-comment the below code

        //WebElement goButton =driver.findElement(By.xpath("//button[@id='memberLoginDialogsubmitButton']"));
        //Actions action = new Actions(driver);
        //action.moveToElement(goButton).click().perform();

        Thread.sleep(3000);

        WebElement practicePage = driver.findElement(By.xpath("//*[@id=\"DrpDwnMn04label\"]"));
        practicePage.click();
        System.out.println("Login Successful");

        driver.close();
    }
}