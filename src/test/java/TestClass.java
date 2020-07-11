import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestClass extends BaseClass {
    @Test
    public void test1() {
        homePage = new SearchPage(driver);
        resultAllPage = homePage.search("сокиабле");
        assertTrue(resultAllPage.getTitleFromFirstLink().contains("Сокиабле"));
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