package pages.aruodas;

import pages.Common;
import pages.Locators;

public class UzsienioObjektaiPage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.aruodas.lt/uzsienio-objektai/");
    }

    public static void closeCookiesAcceptanceWindow() {
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Home.buttonAcceptCookiesSutinku)) {
            Common.clickOnElement(Locators.Aruodas.Home.buttonAcceptCookiesSutinku);
        }
    }

    public static void chooseObjectType() {
        Common.clickOnElement(Locators.Aruodas.UzsienioObjektai.spanDisplayObjectType);
        Common.clickOnElementByAction(Locators.Aruodas.UzsienioObjektai.labelObjectTypeSklypai);
    }

    public static void chooseCountry() {
        Common.clickOnElement(Locators.Aruodas.UzsienioObjektai.spanDisplayCountry);
        Common.clickOnElementByAction(Locators.Aruodas.UzsienioObjektai.labelCountryLatvia);
    }

    public static void addObjectToFavourites(String text, String message) {
        Common.clickOnElement(Locators.Aruodas.UzsienioObjektai.divObjectListItemLatvia);
        Common.clickDoubleOnElementWithActions(Locators.Aruodas.UzsienioObjektai.divSave);
        Common.sendKeysToElement(Locators.Aruodas.UzsienioObjektai.inputUsername,
                text);
        Common.sendKeysToElement(Locators.Aruodas.UzsienioObjektai.inputPassword,
                message);
        Common.clickOnElement(Locators.Aruodas.UzsienioObjektai.buttonLogIn);
    }

    public static void closePopupWindow() {
        Common.clickOnElement(Locators.Aruodas.UzsienioObjektai.buttonNesutinku);
    }

    public static void checkForObjectInFavourites() {
        Common.clickOnElement(Locators.Aruodas.UzsienioObjektai.spanManoAruodas);
        Common.clickOnElement(Locators.Aruodas.UzsienioObjektai.divIsimintiSkelbimai);
    }

    public static String readTextInFavourites() {
        return Common.getTextFromElement(Locators.Aruodas.UzsienioObjektai.spanObjectDescription);
    }
}
