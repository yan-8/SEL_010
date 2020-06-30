import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected WebDriver driver;
    protected SearchPage homePage;
    protected ResultAllPage resultAllPage;
    protected VideosPage videosPage;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/mac/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

    @After
    public void finish() {
        driver.quit();
    }
}