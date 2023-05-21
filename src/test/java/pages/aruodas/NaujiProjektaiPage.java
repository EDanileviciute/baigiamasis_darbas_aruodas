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
        Common.clickOnElementByAction(Locators.Aruodas.NaujiProjektai.spanDisplayRegion);
        Common.sendKeysToElement(Locators.Aruodas.NaujiProjektai.inputFilterRegion, text);

        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.ENTER);
        actions.build().perform();
    }
    public static void chooseObjectType() {
        Common.clickOnElementByAction(Locators.Aruodas.NaujiProjektai.spanProjectObjectID);
        Common.clickOnElement(Locators.Aruodas.NaujiProjektai.inputProjectObjectIDs);

    }

    public static void openProjectWindow() {
        Common.clickOnElement(Locators.Aruodas.NaujiProjektai.divProjectID);
    }

    public static String readTextOfProjectWindow() {
        return Common.getTextFromElement(Locators.Aruodas.NaujiProjektai.headingProjectAddress);
    }
}
