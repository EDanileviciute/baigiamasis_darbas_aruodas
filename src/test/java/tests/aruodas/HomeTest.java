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


    //    @Test
//    public void testSearchFormFieldForObjectTypeBySelect() {
//
//
//    }

//    @Test
//    public void testSearchFormFieldForObjectTypeByText(){
//        //TEKSTINĖ PAIEŠKA laukelis
//
//    }
}

