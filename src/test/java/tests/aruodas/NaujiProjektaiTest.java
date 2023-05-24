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
        String expectedResult = "Nauji projektai";
        String actualResult;

        NaujiProjektaiPage.chooseObjectByType();
        NaujiProjektaiPage.openResultsInMap();
        NaujiProjektaiPage.chooseCityInMap();

        actualResult = NaujiProjektaiPage.readTextOfProjectWindowInMap();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
