package pages.aruodas;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Common;
import pages.Locators;
import utilities.Driver;

public class NaujiProjektaiPage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.aruodas.lt/nauji-projektai/");
    }

    public static void closeCookiesAcceptanceWindow() {
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.NaujiProjektai.buttonAcceptCookiesSutinku)) {
            Common.clickOnElement(Locators.Aruodas.NaujiProjektai.buttonAcceptCookiesSutinku);
        }
    }

    public static void chooseCity(String text) {
        Common.waitForElementToBeClickable(Locators.Aruodas.NaujiProjektai.spanDisplayRegion);
        Common.clickOnElementByAction(Locators.Aruodas.NaujiProjektai.spanDisplayRegion);
        Common.sendKeysToElement(Locators.Aruodas.NaujiProjektai.inputFilterRegion, text);

        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.ENTER);
        actions.build().perform();
    }

    public static void chooseObjectType() {
        Common.waitForElementToBeClickable(Locators.Aruodas.NaujiProjektai.spanProjectObjectID);
        Common.clickOnElementByAction(Locators.Aruodas.NaujiProjektai.spanProjectObjectID);
        Common.clickOnElement(Locators.Aruodas.NaujiProjektai.inputProjectObjectIDNamaiPardavimui);
    }

    public static void openProjectWindow() {
        Common.waitForElementToBeClickable(Locators.Aruodas.NaujiProjektai.divProjectID);
        Common.clickOnElement(Locators.Aruodas.NaujiProjektai.divProjectID);
    }

    public static String readTextOfProjectWindow() {
        return Common.getTextFromElement(Locators.Aruodas.NaujiProjektai.headingProjectAddress);
    }

    public static void chooseObjectByType() {
        Common.waitForElementToBeClickable(Locators.Aruodas.NaujiProjektai.spanProjectObjectID);
        Common.clickOnElementByAction(Locators.Aruodas.NaujiProjektai.spanProjectObjectID);
        Common.clickOnElement(Locators.Aruodas.NaujiProjektai.inputProjectObjectIDButaiNuomai);
    }

    public static void openResultsInMap() {
        Common.clickOnElement(Locators.Aruodas.NaujiProjektai.spanDisplayInMap);
    }

    public static void chooseCityInMap() {
        Common.switchToFrame(
                Locators.Aruodas.NaujiProjektai.iFrameSidelist
        );
        Common.waitForElementToBeVisibleCustomized(Locators.Aruodas.NaujiProjektai.slectSortSelectInput);
        Common.clickOnElement(Locators.Aruodas.NaujiProjektai.slectSortSelectInput);
        Common.clickOnElement(Locators.Aruodas.NaujiProjektai.selectCityInMapPalanga);
    }

    public static String readTextOfProjectWindowInMap() {
        return Common.getTextFromElement(Locators.Aruodas.NaujiProjektai.headerSearchInformation);
    }

}
