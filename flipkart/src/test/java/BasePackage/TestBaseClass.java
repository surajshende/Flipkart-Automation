package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBaseClass {
    public static WebDriver driver;

    public WebDriver setup(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        return driver;
    }

    public void tearDown() {
        driver.quit();
    }

    public String searchNameInURL(String ExpectedName) {
        if (driver.getCurrentUrl().contains(ExpectedName)) {
            return "Present";
        } else {
            return "Not Present";
        }
    }
}
