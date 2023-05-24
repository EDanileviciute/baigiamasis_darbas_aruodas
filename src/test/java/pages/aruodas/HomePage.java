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
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Home.divPrisijungti)) {
            Common.clickOnElement(Locators.Aruodas.Home.divPrisijungti);
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
        return Common.getTextFromElement(Locators.Aruodas.Home.formRegistrationForm);
    }

    public static void waitForPopupWindowForRegistrationError() {
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Home.formRegistrationForm)) {
            Common.clickOnElement(Locators.Aruodas.Home.formRegistrationForm);
        }
    }

    public static void chooseObjectType() {
        Common.clickOnElement(Locators.Aruodas.Home.divObjectType);
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Home.labelButaiPardavimui)) {
            Common.clickOnElement(Locators.Aruodas.Home.labelButaiPardavimui);
        }
    }

    public static void chooseMunicipality() {
        Common.clickOnElement(Locators.Aruodas.Home.divDisplayRegion);
        Common.clickOnElement(Locators.Aruodas.Home.labelVilnius);
    }

    public static void chooseCity() {
        Common.waitForElementToBeClickable(Locators.Aruodas.Home.divDistrict);
        Common.clickOnElement(Locators.Aruodas.Home.divDistrict);
        Common.clickOnElement(Locators.Aruodas.Home.labelVilniausM);
    }

    public static void clickToChooseNeighbourhood() {
        Common.clickOnElement(Locators.Aruodas.Home.spanMikrorajonas);

    }

    public static void chooseAllNeighbourhoods() {
        Common.switchToFrame(Locators.Aruodas.Home.iframeSelectNeighbourhoodsWindow);
        Common.clickOnElementByAction(Locators.Aruodas.Home.inputCheckAll);
        Common.clickOnElement(Locators.Aruodas.Home.divSaveSelected);
        Common.clickOnElement(Locators.Aruodas.Home.inputSearchButton);
    }

    public static void chooseSizeRange(String min, String max) {
        Common.sendKeysToElement(Locators.Aruodas.Home.inputAreaMinimum, min);
        Common.sendKeysToElement(Locators.Aruodas.Home.inputAreaMaximum, max);
    }

    public static void chooseRoomNumber() {
        Common.clickOnElement(Locators.Aruodas.Home.divRoomNumber2);
    }

    public static void chooseInstallationState() {
        Common.clickOnElement(Locators.Aruodas.Home.spanHouseState);
        Common.clickOnElement(Locators.Aruodas.Home.inputFullHouseState);
    }

    public static void choosePriceRange(String min, String max) {
        Common.sendKeysToElement(Locators.Aruodas.Home.inputPriceMinimum, min);
        Common.sendKeysToElement(Locators.Aruodas.Home.inputPriceMaximum, max);
    }

    public static void searchForOptions() {
        Common.clickOnElement(Locators.Aruodas.Home.inputSearchButton);
    }

    public static String readTextOfSearchResults() {
        return Common.getTextFromElement(Locators.Aruodas.Home.spanSearchDescription);
    }

    public static void chooseAdvancedSearch() {
        Common.clickOnElement(Locators.Aruodas.Home.spanAdvancedSearch);
    }

    public static void chooseFloorSelection() {
        Common.clickOnElement(Locators.Aruodas.Home.spanFloorNumber);
        Common.clickOnElement(Locators.Aruodas.Home.listFloorMinimumOption1);
        Common.clickOnElement(Locators.Aruodas.Home.listFloorMaximumOption5);
        Common.clickOnElement(Locators.Aruodas.Home.inputRadioButtonOption1);
    }

    public static void enterSearchTextIntoSearchBar(String text) {
        Common.sendKeysToElement(Locators.Aruodas.Home.inputSearchText, text);
        Common.clickOnElement(Locators.Aruodas.Home.inputSearchButton);
    }

    public static String readTextOfNeighbourhoodSearchResults() {
        return Common.getTextFromElement(Locators.Aruodas.Home.spanTitleWrapper);
    }
}
