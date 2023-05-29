package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class Common {

    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    private static WebElement getElemet(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String sendKeys) {
        getElemet(locator).sendKeys(sendKeys);
    }

    public static void clickOnElement(By locator) {
        getElemet(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElemet(locator).getText();
    }

    public static boolean waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return false;
    }

    public static boolean waitForElementToBeClickableCustomized(By locator) {
        int waitingSeconds = 5;
        for (int i = 0; i < (waitingSeconds * 2); i++) {
            if (getElemet(locator).isEnabled()) {
                return true;
            }
            sleep(500);
        }
        return false;
    }

    public static boolean waitForElementToBeVisibleCustomized(By locator) {
        int waitingSeconds = 5;
        for (int i = 0; i < (waitingSeconds * 2); i++) {
            try {
                getElemet(locator);
                return true;
            } catch (NoSuchElementException e) {
                sleep(500);
            }
        }
        return false;
    }

    public static void clickOnElementByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .moveToElement(getElemet(locator))
                .click()
                .build()
                .perform();
    }

    public static void switchToFrame(By locator) {
        Driver.getDriver().switchTo().frame(getElemet(locator));
    }

    public static void clickEnterByAction() {
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.ENTER);
        actions.build().perform();
    }
}