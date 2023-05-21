package tests.aruodas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.aruodas.HomePage;
import tests.TestBase;

public class HomeTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.closeCookiesAcceptanceWindow();
    }
    @Test
    public void testLogInWithValidCredentials() {
        String userName = "egured@yahoo.com";
        String password = "Password1";
        String expectedResult = "Mano aruodas";
        String actualResult;

        HomePage.openRegistrationForm();
        HomePage.waitForPopupWindowForRegistration();
        HomePage.enterUsername(userName);
        HomePage.enterPassword(password);
        HomePage.logIn();

        actualResult = HomePage.readTextOfLogInButton();

        HomePage.logOut();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testLogInWithInvalidCredentials() {
        String userName = "egured@yahoo.com";
        String password = "WrongPassword";
        String expectedResult = "Blogas el. pašto adresas arba slaptažodis";
        String actualResult;

        HomePage.openRegistrationForm();
        HomePage.waitForPopupWindowForRegistration();
        HomePage.enterUsername(userName);
        HomePage.enterPassword(password);
        HomePage.logIn();
        HomePage.waitForPopupWindowForRegistrationError();

        actualResult = HomePage.readTextOfErrorMessage();

        Assert.assertTrue(actualResult.equals(expectedResult));
    }
    @Test
    public void testSearchFormFieldForObjectTypeBySelect(){
        String sizeMinimum = "40";
        String sizeMaximum = "100";
        String priceMinimum = "0";
        String priceMaximum = "1000000";
        String expectedResult = "2-2 kamb., 40-100 m², iki 1000000 €, įrengtas";
        String actualResult;

        HomePage.chooseObjectType();
        HomePage.chooseMunicipality();
        HomePage.chooseCity();
        HomePage.chooseSizeRange(sizeMinimum, sizeMaximum);
        HomePage.chooseRoomNumber();
        HomePage.chooseInstallationState();
        HomePage.choosePriceRange(priceMinimum, priceMaximum);
        HomePage.searchForOptions();

        actualResult = HomePage.readTextOfSearchResults();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "Actual: %s, Expected: %s".formatted(actualResult, expectedResult));
    }
    @Test
    public void testSearchByManualInputWithAdvancedSearch(){
        String searchText = "butai vilnius";
        String expectedResult = "1-5 aukštas, ne pirmas, butai vilnius";
        String actualResult;

        HomePage.chooseAdvancedSearch();
        HomePage.chooseFloorSelection();
        HomePage.enterSearchTextIntoSearchBar(searchText);

        actualResult = HomePage.readTextOfSearchResults();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}

