import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VideosPage {
    private WebDriver driver;

    public VideosPage() {
    }

    public VideosPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleFromFirstLink() {
        return driver.findElement(By.xpath(".//div[@class = 'g'][1]//span[@class = 'st']/em")).getText();
    }
}