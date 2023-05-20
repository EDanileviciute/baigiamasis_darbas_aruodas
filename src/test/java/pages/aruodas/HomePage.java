package pages.aruodas;

import pages.Common;
import pages.Locators;

public class HomePage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.aruodas.lt/");
    }

    public static void closeCookiesAcceptanceWindow() {

        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Home.buttonAcceptCookiesSutinku)) {
            Common.clickOnElement(Locators.Aruodas.Home.buttonAcceptCookiesSutinku);
        }
    }

    public static void openRegistrationForm() {
        Common.clickOnElement(Locators.Aruodas.Home.buttonPrisijungti);
    }

    public static void waitForPopupWindowForRegistration() {
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Home.divPrisijundti)) {
            Common.clickOnElement(Locators.Aruodas.Home.divPrisijundti);
        }
    }

    public static void enterUsername(String text) {
        Common.sendKeysToElement(Locators.Aruodas.Home.inputUsername,
                text);
    }

    public static void enterPassword(String text) {
        Common.sendKeysToElement(Locators.Aruodas.Home.inputPassword,
                text);
    }

    public static void logIn() {
        Common.clickOnElement(Locators.Aruodas.Home.buttonLogIn);
    }

    public static String readTextOfLogInButton() {
        return Common.getTextFromElement(Locators.Aruodas.Home.spanManoAruodas);
    }

    public static void logOut() {
        Common.clickOnElement(Locators.Aruodas.Home.spanManoAruodas);
        Common.waitForElementToBeVisibleCustomized(Locators.Aruodas.Home.buttonAtsijungti);
        Common.clickOnElement(Locators.Aruodas.Home.buttonAtsijungti);
    }

    public static String readTextOfErrorMessage() {
        return Common.getTextFromElement(Locators.Aruodas.Prisijungti.formRegistrationForm);
    }

    public static void waitForPopupWindowForRegistrationError() {
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Prisijungti.formRegistrationForm)) {
            Common.clickOnElement(Locators.Aruodas.Prisijungti.formRegistrationForm);
        }
    }
}
