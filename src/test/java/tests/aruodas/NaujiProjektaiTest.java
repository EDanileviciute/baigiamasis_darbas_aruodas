package tests.aruodas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.aruodas.NaujiProjektaiPage;
import tests.TestBase;

public class NaujiProjektaiTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        NaujiProjektaiPage.open();
        NaujiProjektaiPage.closeCookiesAcceptanceWindow();
    }
    @Test
    public void testNewProjectSearchByCity(){
        String chosenCity = "Kaunas";
        String expectedResult = "Kaunas";
        String actualResult;

        NaujiProjektaiPage.chooseCity(chosenCity);
        NaujiProjektaiPage.chooseObjectType();
        NaujiProjektaiPage.openProjectWindow();

        actualResult = NaujiProjektaiPage.readTextOfProjectWindow();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Test
    public void testNewProjectSearchByProjectWithMap(){
        String expectedResult = "Butai nuomai";
        String actualResult;

        NaujiProjektaiPage.chooseObjectByType();
        NaujiProjektaiPage.openResultsInMap();

        actualResult = NaujiProjektaiPage.readTextOfProjectWindowInMap(); //neranda Xpath'u zemelapyje

        Assert.assertTrue(actualResult.equals(expectedResult));
    }

    ////div[@class='project-list-content']//a - visi paieskos rezultatai
}
