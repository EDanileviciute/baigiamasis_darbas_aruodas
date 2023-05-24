package tests.aruodas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.aruodas.UzsienioObjektaiPage;
import tests.TestBase;

public class UzsienioObjektaiTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UzsienioObjektaiPage.open();
        UzsienioObjektaiPage.closeCookiesAcceptanceWindow();
    }

    @Test
    public void testObjectSelectionByCountryWithAddingToFavourites() {
        String userName = "egured@yahoo.com";
        String password = "Password1";
        String expectedResult = "Objektas užsienyje";
        String actualResult;

        UzsienioObjektaiPage.chooseObjectType();
        UzsienioObjektaiPage.chooseCountry();
        UzsienioObjektaiPage.addObjectToFavourites(userName, password);
        UzsienioObjektaiPage.closePopupWindow();
        UzsienioObjektaiPage.checkForObjectInFavourites();

        actualResult = UzsienioObjektaiPage.readTextInFavourites();

        Assert.assertEquals(actualResult, expectedResult);
    }

}
