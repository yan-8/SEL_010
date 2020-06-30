import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    public SearchPage() {
    }

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultAllPage search(String text) {
        driver.findElement(By.xpath(".//input[@name = 'q']")).sendKeys(text + Keys.ENTER);
        return new ResultAllPage(driver);
    }
}