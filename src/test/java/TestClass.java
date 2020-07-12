import org.apache.commons.io.FileUtils;
import org.apache.tika.io.FilenameUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static utils.Utils.getTimestamp;
import static io.qameta.allure.Allure.addAttachment;
//import static io.qameta.allure.Attachment.*;

public class TestClass extends BaseClass {
    @Test
    public void test1() throws IOException {
        homePage = new SearchPage(driver);
        resultAllPage = homePage.search("сокиабле");
        assertTrue(resultAllPage.getTitleFromFirstLink().contains("Сокиабле"));

//        makeScreenshotOnFailure(driver);

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("src/test/resources/screenshots/Screenshot - " + getTimestamp("yyyy.MM.dd - HH.mm.ss") + ".png"));
        addAttachment("Scrrr", FileUtils.openInputStream(screenshotFile));
    }

    @Test
    public void test2() {
        homePage = new SearchPage(driver);
        resultAllPage = homePage.search("старичок, идем на пикничок!");
        videosPage = resultAllPage.navigationBlock().clickOnVideos();
        assertTrue(videosPage.getTitleFromFirstLink().contains("Старичок"));
    }

    @Test
    public void test3() {
        int result = (int) (Math.random() * 100 + 1) * 2;
        System.out.println("Value - " + result);

        if (result > 100) {
            assertFalse("MORE THAN 100 VALUE", result >= 101);
        }
        assertTrue("LESS THEN 101", result <=100);
    }

    @Test
    public void test4() {

    }
}