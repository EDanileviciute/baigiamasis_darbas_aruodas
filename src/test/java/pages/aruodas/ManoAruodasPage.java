package pages.aruodas;

import org.openqa.selenium.WebElement;
import pages.Common;
import pages.Locators;

import java.util.List;
public class ManoAruodasPage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.aruodas.lt/");

    }
    public static void closeCookiesAcceptanceWindow() {
        if (Common.waitForElementToBeClickableCustomized(Locators.Aruodas.Home.buttonAcceptCookiesSutinku)) {
            Common.clickOnElement(Locators.Aruodas.Home.buttonAcceptCookiesSutinku);
        }
    }

    public static void logIn(String userName, String password) {
        HomePage.openRegistrationForm();
        HomePage.waitForPopupWindowForRegistration();
        HomePage.enterUsername(userName);
        HomePage.enterPassword(password);
        HomePage.logIn();
    }

    public static void defaultSearch() {
        Common.clickOnElement(Locators.Aruodas.Home.inputSearchButton);
    }

    public static void openSavedSearchPage() {
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
