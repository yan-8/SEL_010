import org.junit.After;
import org.junit.Before;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
//import io.qameta.allure.Attachment;

public class BaseClass {
    protected WebDriver driver;
    protected SearchPage homePage;
    protected ResultAllPage resultAllPage;
    protected VideosPage videosPage;

    @Before
    public void start() {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/mac/chromedriver");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/linux/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("window-size=1440,900");

//        chromeOptions.addArguments("--disable-extensions");
//        chromeOptions.addArguments("--disable-gpu");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

    @After
    public void finish() {
        driver.quit();
    }
}