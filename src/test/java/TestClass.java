import org.junit.Assert;
import org.junit.Test;

public class TestClass extends BaseClass {
    @Test
    public void test1() {
        homePage = new SearchPage(driver);
        resultAllPage = homePage.search("сокиабле");
        Assert.assertTrue(resultAllPage.getTitleFromFirstLink().contains("Сокиабле"));
    }

    @Test
    public void test2() {
        homePage = new SearchPage(driver);
        resultAllPage = homePage.search("старичок, идем на пикничок!");
        videosPage = resultAllPage.navigationBlock().clickOnVideos();
        Assert.assertTrue(videosPage.getTitleFromFirstLink().contains("Старичок"));
    }
}