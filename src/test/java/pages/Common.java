package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Common {
    public static List<String> brokenLinks = new ArrayList<>();
    public static List<String> validLinks = new ArrayList<>();
    public static List<String> brokenImages = new ArrayList<>();

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

    public static Boolean getStatusesOfCheckbox(By locator) {
        return getElemet(locator).isSelected();
    }

    public static List<Boolean> getStatusesOfMultipleCheckBoxGroup(By locator) {
        List<WebElement> elements = getElements(locator);
        List<Boolean> statusList = new ArrayList<>();

        for (WebElement element : elements) {
            statusList.add(element.isSelected());
        }
        return statusList;
    }

    private static Select getSelectElement(By locator) {
        WebElement element = getElemet(locator);
        Select selectElement = new Select(element);
        return selectElement;
    }

    public static void selectOptionByValue(By locator, String value) {
        getSelectElement(locator).selectByValue(value);
    }

    public static void selectOptionGroupByValue(By locator, List<String> selectValues) {
        Select selectElement = getSelectElement(locator);

        for (String value : selectValues) {
            selectElement.selectByValue(value);
        }
    }

    public static List<Boolean> getStatusesOfSelectedOptionGroup(By locator, List<String> selectValues) {

        List<Boolean> selectedStatusList = new ArrayList<>();
        List<WebElement> elements = getSelectElement(locator).getAllSelectedOptions();

        for (WebElement element : elements) {
            selectedStatusList.add(element.isSelected());
        }

        return selectedStatusList;
    }

    public static List<Boolean> getStatusOfAllCheckBoxes(By locator) {
        List<WebElement> elements = getElements(locator);
        List<Boolean> statusList = new ArrayList<>();

        for (WebElement element : elements) {
            statusList.add(element.isSelected());
        }
        return statusList;
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElemet(locator).getAttribute(attributeName);
    }

    public static boolean verifyLink(By locator, String attributeName) {
        WebElement element = getElemet(locator);
        String link = element.getAttribute(attributeName);
        return checkHttpResponseCode(link, element);
    }

    public static boolean verifyAllLinks(By locator, String attributeName) {

        List<WebElement> elements = getElements(locator);
        boolean testStatus = true;

        for (WebElement element : elements) {
            String link = element.getAttribute(attributeName);

            if (!checkHttpResponseCode(link, element)) {
                testStatus = false;
            }
        }

        return testStatus;
    }

    private static boolean checkHttpResponseCode(String link, WebElement element) {
        try {
            URL url = new URL(link);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(8000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() >= 400) {
                brokenLinks.add(
                        "Response Code: %s, Response message: %s, Broken link: %s ".formatted(
                                httpURLConnection.getResponseCode(),
                                httpURLConnection.getResponseMessage(),
                                link
                        )
                );
                return false;
            } else {
                validLinks.add(
                        "Response Code: %s, Response message: %s, Valid link: %s ".formatted(
                                httpURLConnection.getResponseCode(),
                                httpURLConnection.getResponseMessage(),
                                link
                        )
                );

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (element.getTagName().equals("img")) {
            boolean isImageVisible = checkImageDisplayValidation(element);

            if (!isImageVisible) {
                brokenImages.add(
                        "Broken image, url: %s".formatted(
                                link
                        )

                );
            }

            return isImageVisible;
        }

        return true;
    }

    private static boolean checkImageDisplayValidation(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        boolean isImageDisplayed = (Boolean) javascriptExecutor.executeScript(
                "return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);",
                element
        );
        return isImageDisplayed;
    }

    public static boolean waitForElementToClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return false;
    }

    public static void waitForElementAttributeContains(String attributeName, String attributeValue, By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(locator, attributeName, attributeValue));

    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
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

    public static String getWindowHandleName() {
        return Driver.getDriver().getWindowHandle();
    }

    public static String getWindowHandleNames(String windowHandleName) {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String childWindowName : allWindowHandles) {
            if (!childWindowName.equals(windowHandleName)) {
                return childWindowName;
            }
        }
        return windowHandleName;
    }

    public static void switchToWindow(String name) {
        Driver.getDriver().switchTo().window(name);
    }

    public static void closeWindow() {
        Driver.getDriver().close();
    }

    public static void maximizeWindow() {
        Driver.getDriver().manage().window().maximize();
    }

    public static String getTextFromAlertBox() {
        return Driver.getDriver().switchTo().alert().getText();
    }

    public static void acceptAlert() {
        Driver.getDriver().switchTo().alert().accept();
    }

    public static boolean waitForAlertToBeVisibleCustom() {
        int waitingSeconds = 3;

        for (int i = 0; i < (waitingSeconds * 2); i++) {
            try {
                Driver.getDriver().switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                sleep(500);
            }
        }
        return false;

    }

    public static void dismissAlert() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    public static void sendKeysToAlertBox(String message) {
        Driver.getDriver().switchTo().alert().sendKeys(message);
    }

    public static void clickOnElementByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .moveToElement(getElemet(locator))
                .click()
                .build()
                .perform();
    }

    public static void clickDoubleOnElementWithActions(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .moveToElement(getElemet(locator))
                .doubleClick()
                .build()
                .perform();

    }

    public static void clickRightOnElementWithActions(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .moveToElement(getElemet(locator))
                .contextClick()
                .build()
                .perform();

    }

    public static void selectOptionGroupByValueWithActions(By locator, List<String> selectValues) {
        List<WebElement> options = getSelectElement(locator).getOptions();

        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.CONTROL);

        //List 01
        for (String value : selectValues) {

            //List 02
            for (WebElement option : options) {
                if (value.equals(option.getAttribute("value"))) {
                    actions.click(option);
                    break;
                }
            }
        }

        actions.build().perform();
    }

    public static void executeCtrlADeleteSendKeysWithActions(By locator, String message) {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .click(getElemet(locator))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.DELETE)
                .sendKeys(message)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
    }

    public static List<String> getTextFromElements(By locator) {

        List<String> listOfElementsText = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            element.getText();
            listOfElementsText.add(element.getText());
        }

        return listOfElementsText;
    }

    public static void switchToFrame(By locator) {
        Driver.getDriver().switchTo().frame(getElemet(locator));
    }
}
