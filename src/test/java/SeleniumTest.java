import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Set the path to the Chrome driver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Google website
        driver.get("https://www.google.com/");

        // Verify that the title of the page is "Google"
        if (driver.getTitle().equals("Google")) {
            System.out.println("Selenium test passed!");
        } else {
            System.out.println("Selenium test failed.");
        }

        // Close the browser
        driver.quit();
    }
}
