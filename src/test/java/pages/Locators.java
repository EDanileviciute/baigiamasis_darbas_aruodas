package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Demoqa {
        public static class Home {
            public static By menuItemElements = By.xpath("//div[@class='card mt-4 top-card'][1]");
        }

        public class Elements {

            public static By menuItemButtons = By.xpath("//div[@class='element-group'][1]//li[@id='item-4']");
        }

        public static class TestBox {
            public static By inputUserName = By.xpath("//input[@id='userName']");
            public static By buttonSubmit = By.xpath("//button[@id='submit']");
            public static By paragraphName = By.xpath("//p[@id='name']");
            public static By inputUserEmail = By.xpath("//input[@id='userEmail']");
            public static By paragraphEmail = By.xpath("//p[@id='email']");
        }

        public static class CheckBox {
            //            public static By labelTreeNodeHome = By.xpath("//label[@for='tree-node-home']");
            public static By buttonExpandAll = By.xpath("//button[@title='Expand all']");
            public static By inputHomeMultipleCheckBox = By.xpath("//div[@id='tree-node']//input[@type='checkbox']");

            public static By labelTreeNode(String name) {
                return By.xpath(
                        "//label[@for='tree-node-%s']".formatted(name)
                );
            }

            public static By getGroupOfCheckBoxes(String name) {
                return By.xpath("//label[@for='tree-node-%s']/../..//input".formatted(name)
                );
            }
        }

        public static class BrokenLink {

            public static By linkValid = By.xpath(
                    "//div[@class='col-12 mt-4 col-md-6']//a[contains(text(),'Valid')]");
            public static By linkBroken = By.xpath("//div[@class='col-12 mt-4 col-md-6']//a[contains(text(),'Broken')]");
            public static By linkGroup = By.xpath("//div[@class='col-12 mt-4 col-md-6']//a");
            public static By imageValid = By.xpath("//div[@class='col-12 mt-4 col-md-6']//img[1]");
            public static By imageBroken = By.xpath("//div[@class='col-12 mt-4 col-md-6']//img[2]");
            public static By imageGroup = By.xpath("//div[@class='col-12 mt-4 col-md-6']//img");
        }

        public static class DynamicProperties {
            public static By buttonEnableAfter = By.xpath("//button[@id='enableAfter']");
            public static By buttonColorChange = By.xpath("//button[@id='colorChange']");
            public static By buttonVisibleAfter = By.xpath("//button[@id='visibleAfter']");
        }

        public class ModalDialogs {
            public static By buttonShowSmallModal = By.xpath("//button[@id='showSmallModal']");
            public static By buttonCloseSmallModal = By.xpath("//button[@id='closeSmallModal']");
            public static By buttonShowLargeModal = By.xpath("//button[@id='showLargeModal']");
            public static By buttonCloseLargeModal = By.xpath("//button[@id='closeLargeModal']");
        }

        public static class BrowserWindows {

            public static By buttonNewTab = By.xpath("//button[@id='tabButton']");
            public static By buttonNewWindow = By.xpath("//button[@id='windowButton']");
            public static By headerSampleHeading = By.xpath("//h1[@id='sampleHeading']");
        }

        public class Alerts {

            public static By buttonAlert = By.xpath("//button[@id='alertButton']");
            public static By buttonTimeAlert = By.xpath("//button[@id='timerAlertButton']");
            public static By buttonDisplayAlertPromptBox = By.xpath("//button[@id='promtButton']");
            public static By paragraphAlertPromptBoxDemoqa = By.xpath("//span[@id='promptResult']");
        }


        public class Buttons {
            public static By buttonDoubleClick = By.xpath("//button[@id='doubleClickBtn']");
            public static By paragraphDoubleClick = By.xpath("//p[@id='doubleClickMessage']");
            public static By buttonRightClick = By.xpath("//button[@id='rightClickBtn']");
            public static By paragraphRightClick = By.xpath("//p[@id='rightClickMessage']");
        }

        public static class DatePicker {
            public static By inputDatePicker = By.xpath("//input[@id='datePickerMonthYearInput']");
        }
    }

    public static class SeleniumEasy {

        public static class JavaScriptAlertBox {

            public static By buttonDisplayAlertBox = By.xpath("//button[@class='btn btn-default']");
            public static By buttonDisplayAlertConfirmBox = By.xpath("//button[@onclick='myConfirmFunction()']");
            public static By paragraphAlertConfirmBox = By.xpath("//p[@id='confirm-demo']");
            public static By buttonDisplayAlertPromptBox = By.xpath("//button[@onclick='myPromptFunction()']");
            public static By paragraphAlertPromptBox = By.xpath("//p[@id='prompt-demo']");
        }

        public static class BasicFirstForm {

            public static By inputUserMessage = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//button[@onclick='showInput();']");
            public static By spanDisplay = By.xpath("//span[@id='display']");
            public static By inputValueA = By.xpath("//input[@id='value1']");
            public static By inputValueB = By.xpath("//input[@id='value2']");
            public static By buttonGetTotal = By.xpath("//button[@onclick='return total()']");
            public static By spanDisplayTotal = By.xpath("//span[@id='displayvalue']");
        }

        public static class BasicCheckBox {
            public static By inputSingleCheckBox = By.xpath("//input[@id='isAgeSelected']");
            public static By divOutputMessage = By.xpath("//div[@id='txtAge']");
            public static By inputSelectedCheckboxEnabled = By.xpath("//label[@class='checkbox-inline'][2]/input");
            public static By inputSelectedCheckboxDisabled = By.xpath("//label[@class='checkbox-inline'][3]/input");
            public static By buttonCheckBpxGroup = By.xpath("//input[@id='check1']");
            public static By inputMultipleCheckBox = By.xpath("//input[@class='cb1-element']");
//
        }

        public static class BasicSelectDropDownList {
            public static By selectDayOfWeek = By.xpath("//select[@id='select-demo']");
            public static By paragraphSelectedValue = By.xpath("//p[@class='selected-value']");
            public static By selectCity = By.xpath("//select[@id='multi-select']");
            public static By buttonGetAllSelected = By.xpath("//button[@id='printAll']");
            public static By paragraphGetAllSelected = By.xpath("//p[@class='getall-selected']");

        }

        public static class BasicRadioButton {
            public static By buttonCheck = By.xpath("//button[@id='buttoncheck']");
            public static By paragraphRadioButtonChecked = By.xpath("//p[contains(text(),'Radio button')]");
            public static By buttonGetValues = By.xpath("//button[@onclick='getValues();']");
            public static By paragraphGroupRadioButtonGetValues = By.xpath("//p[@class='groupradiobutton']");

            public static By inputRadioByGender(String inputGender) {
                return By.xpath(
                        String.format(
                                "//input[@name='optradio' and @value='%s']",
                                inputGender)
                );
                //By.xpath(String.format("//input[@name='optradio' and @value='%s']"), gender));
                //By.xpath("//input[@name='optradio' and @value='" + gender + "']");
            }

            public static By inputGroupRadioByGender(String gender) {
                return By.xpath(
                        String.format("//input[@name='gender' and @value='%s']",
                                gender)
                );
            }

            public static By inputGroupRadioByAge(String age) {
                return By.xpath(
                        String.format("//input[@name='ageGroup' and @value='%s']",
                                age)
                );
            }
        }

        public class BootstrapAlertMessages {
            public static By buttonAutocloseableSuccessMessage = By.xpath("//button[@id='autoclosable-btn-success']");
            public static By divAlertAutocloseableSuccessMessage = By.xpath("//div[contains(@class, 'alert-autocloseable-success')]");
        }

        public class WindowPopupModal {

            public static By buttonFollowOnTwitter = By.xpath("//a[@title='Follow @seleniumeasy on Twitter']");
            public static By buttonLoginNoThanks = By.xpath("//span[contains(text(), 'No, thanks')]");
            public static By headerSeleniumEasy = By.xpath("(//h2[@role='heading']// span[contains(text(), 'Selenium Easy')])");
            public static By buttonCloseLogin = By.xpath("//div[@data-testid='app-bar-close']");
            public static By buttonCloseNotification = By.xpath("//div[@data-testid='app-bar-close']");
        }
    }

    public static class Mohito {
        public static By mohitoLinkGroup = By.xpath("//section[@id='categoryProducts']//a");
    }

    public class TV3 {
        public class Home {
            public static By buttonCoockiesSutinku = By.xpath("//div[@id='qc-cmp2-ui']//button[@mode='primary']");
        }
    }

    public class Novaturas {
        public static class Home {
            public static By calendarStartingDay = By.xpath("//h1[contains(text(),'Kelionių paieška')]/../div[1]/div[3]");
            public static By divButtonSearch = By.xpath(
                    "//div[@class='trip-search-form']//a[contains(@class,'btn')]");

            public static By getStartingDayInCurrentMonth(String tripStartDay) {
                return By.xpath(
                        "(//div[@class='date-slider']//div[contains(@class,'swiper-wrapper')]//" +
                                "header)[1]/..//span[text()='%s']".formatted(tripStartDay)
                );
            }

            public static By getStartingDayNextMonth(String tripStartDay) {
                return By.xpath(
                        "(//div[@class='date-slider']//div[contains(@class,'swiper-wrapper')]//" +
                                "header)[4]/..//span[text()='%s']".formatted(tripStartDay)
                );
            }

        }

        public static class Paieska {
            public static By paragraphTripPeriod = By.xpath(
                    "//div[contains(@class,'search-result-offer-list')]//" +
                            "div[contains(@class,'departures-block')]//p[2]"
            );
        }
    }
}
