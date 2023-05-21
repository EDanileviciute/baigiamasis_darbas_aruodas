package pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Aruodas {
        public static class Home {

            public static By buttonAcceptCookiesSutinku = By.xpath(
                    "//button[@id='onetrust-accept-btn-handler']"
            );
            public static By buttonPrisijungti = By.xpath("//div[@class='reg-menu-div-4']");
            public static By divPrisijungti = By.xpath(
                    "//div[@data-id='popup__right__login__container']"
            );
            public static By inputUsername = By.xpath("//input[@id='userName']");
            public static By inputPassword = By.xpath("//input[@id='password']");
            public static By buttonLogIn = By.xpath("//button[@id='loginAruodas']");
            public static By spanManoAruodas = By.xpath("//a//span[contains(text(), 'Mano aruodas')]");
            public static By buttonAtsijungti = By.xpath("//div[@class='icon-u-on']");
            public static By divObjectType = By.xpath("//div[@id='display_obj']");
            public static By labelButaiPardavimui = By.xpath(
                    "//label[contains(text(), 'Butai pardavimui')]"
            );
            public static By divDisplayRegion = By.xpath("//div[@id='display_FRegion']");
            public static By labelVilnius = By.xpath("//label[contains(text(), 'Vilnius')]");
            public static By divDistrict = By.xpath("//div[@id='display_FDistrict']");
            public static By labelVilniausM = By.xpath("//label[contains(text(), 'Vilniaus m.')]");
            public static By spanMikrorajonas = By.xpath("//span[@id='display_text_FQuartal']");
            public static By inputInQuartalFilter = By.xpath("//input[@id='inQuartalFilter']");
            public static By labelZirmunai = By.xpath("//span[contains(text(), 'Žirmūnai')]");
            public static By divSaveSelected = By.xpath("//div[@id='btSaveSelected']");
            public static By spanDisplayStreet = By.xpath("//span[@id='display_text_FStreets']");
            public static By inputInStreetsFilter = By.xpath("//input[@id='inStreetsFilter']");
            public static By labelZirmunuStreet = By.xpath("//label[@title='Žirmūnų g.']");
            public static By inputAreaMinimum = By.xpath("//input[@id='input_FAreaOverAllMin']");
            public static By inputAreaMaximum = By.xpath("//input[@id='input_FAreaOverAllMax']");
            public static By divRoomNumber2 = By.xpath("//div[@id='quickValue_FRoomNum_2']");
            public static By spanHouseState = By.xpath("//span[@id='display_text_FHouseState']");
            public static By inputFullHouseState = By.xpath("//input[@value='full']");
            public static By inputPriceMinimum = By.xpath("//input[@id='input_FPriceMin']");
            public static By inputPriceMaximum = By.xpath("//input[@id='input_FPriceMax']");
            public static By inputSearchButton = By.xpath("//input[@id='buttonSearchForm']");
            public static By spanSearchDescription = By.xpath("//span[@class='search-description']");
        }

        public static class Prisijungti {
            public static By formRegistrationForm = By.xpath(
                    "//form[@id='loginForm']//div[@class='popup__right__login__form__error']"
            );
        }

        public static class NaujiProjektai {
            public static By buttonAcceptCookiesSutinku = By.xpath(
                    "//button[@id='onetrust-accept-btn-handler']"
            );
            public static By spanDisplayRegion = By.xpath("//span[@id='display_text_FPRegion']");
            public static By inputFilterRegion = By.xpath("//input[@id='filterInput_FPRegion']");
            public static By spanProjectObjectID = By.xpath("//span[@id='display_text_project_obj_ids']");
            public static By inputProjectObjectIDs = By.xpath(
                    "//label[contains(text(), 'Namai pardavimui')]"
            );
            public static By divProjectID = By.xpath("//div[@id='project631']");
            public static By headingProjectAddress = By.xpath("//h2[@class='project-address']");
        }
    }
}

