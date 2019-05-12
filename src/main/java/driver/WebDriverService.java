package driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

final public class WebDriverService {
    private WebDriver driver;

    static {
        setupChromeDriver();
    }

    public WebDriverService() {
        initializeDriver();
    }

    private void initializeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        driver = new ChromeDriver(options);
    }

    private static void setupChromeDriver() {
        ChromeDriverManager.chromedriver().setup();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
