package pages.aruodas;

import org.openqa.selenium.WebElement;
import pages.Common;
import pages.Locators;

import java.util.List;

public class ManoAruodasPage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.aruodas.lt/mano-aruodas/");

    }

    public static void closeCookiesAcceptanceWindow() {
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Home.buttonAcceptCookiesSutinku)) {
            Common.clickOnElement(Locators.Aruodas.Home.buttonAcceptCookiesSutinku);
        }
    }

    public static void logIn(String userName, String password) {
        Common.clickOnElement(Locators.Aruodas.Home.buttonPrisijungti);
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Home.divPrisijungti)) {
            Common.clickOnElement(Locators.Aruodas.Home.divPrisijungti);
        }
        Common.sendKeysToElement(Locators.Aruodas.Home.inputUsername, userName);
        Common.sendKeysToElement(Locators.Aruodas.Home.inputPassword, password);
        Common.clickOnElement(Locators.Aruodas.Home.buttonLogIn);
    }

    public static void defaultSearch() {
        Common.waitForElementToBeClickable(Locators.Aruodas.Home.inputSearchButton);
        Common.clickOnElement(Locators.Aruodas.Home.inputSearchButton);
    }

    public static void openSavedSearchPage() {
        Common.waitForElementToBeClickable(Locators.Aruodas.Home.spanManoAruodas);
        Common.clickOnElement(Locators.Aruodas.Home.spanManoAruodas);
        Common.clickOnElement(Locators.Aruodas.Home.divSavedIcons);
    }

    public static void deleteSearchResults() {
        List<WebElement> elements = Common.getElements(Locators.Aruodas.ManoAruodas.spanDelete);
        for (WebElement element : elements) {
            Common.clickOnElement(Locators.Aruodas.ManoAruodas.spanDelete);
        }
    }

    public static String readTextOfUserMessage() {
        return Common.getTextFromElement(Locators.Aruodas.ManoAruodas.headerUser);
    }
}
