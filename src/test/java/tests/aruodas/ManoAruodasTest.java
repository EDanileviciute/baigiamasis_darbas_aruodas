package tests.aruodas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.aruodas.ManoAruodasPage;
import tests.TestBase;

public class ManoAruodasTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        String userName = "egured@yahoo.com";
        String password = "Password1";

        ManoAruodasPage.open();
        ManoAruodasPage.closeCookiesAcceptanceWindow();
        ManoAruodasPage.logIn(userName, password);
    }
    @Test
    public void testSearchAndDeleteSearchResults(){
        String expectedResult = "Neturite išsaugotų paieškų.";
        String actualResult;

        ManoAruodasPage.defaultSearch();
        ManoAruodasPage.openSavedSearchPage();
        ManoAruodasPage.deleteSearchResults();

        actualResult = ManoAruodasPage.readTextOfUserMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
