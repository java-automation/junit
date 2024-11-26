import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.out.println("setup()");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown()");
        driver.quit();
    }

    @DisplayName("Smoke Test")
    @Test
    public void smokeTest() {
        driver.get("https://skryabin.com/market/quote.html");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("john_doe");
        driver.findElement(By.xpath("//input[@id='name']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Doe");
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john.doe@example.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Password123");
        driver.findElement(By.xpath("//input[@name='agreedToPrivacyPolicy']")).click();
        driver.findElement(By.xpath("//button[@id='formSubmit']")).click();
    }

    @Test
    public void newWindowTest() {
        driver.get("https://skryabin.com/market/quote.html");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("john_doe");
        driver.findElement(By.xpath("//input[@id='name']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Doe");
    }
}
