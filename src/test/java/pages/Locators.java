package pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Aruodas {
        public static class Home {

            public static By buttonAcceptCookiesSutinku = By.xpath
                    ("//button[@id='onetrust-accept-btn-handler']");
            public static By buttonPrisijungti = By.xpath("//div[@class='reg-menu-div-4']");
            public static By formRegistrationForm = By.xpath
                    ("//form[@id='loginForm']//div[@class='popup__right__login__form__error']");
            public static By divPrisijungti = By.xpath
                    ("//div[@data-id='popup__right__login__container']");
            public static By inputUsername = By.xpath("//input[@id='userName']");
            public static By inputPassword = By.xpath("//input[@id='password']");
            public static By buttonLogIn = By.xpath("//button[@id='loginAruodas']");
            public static By spanManoAruodas = By.xpath("//a//span[contains(text(), 'Mano aruodas')]");
            public static By buttonAtsijungti = By.xpath("//div[@class='icon-u-on']");
            public static By divObjectType = By.xpath("//div[@id='display_obj']");
            public static By labelButaiPardavimui = By.xpath
                    ("//label[contains(text(), 'Butai pardavimui')]");
            public static By divDisplayRegion = By.xpath("//div[@id='display_FRegion']");
            public static By labelVilnius = By.xpath("//label[contains(text(), 'Vilnius')]");
            public static By divDistrict = By.xpath("//div[@id='display_FDistrict']");
            public static By labelVilniausM = By.xpath("//label[contains(text(), 'Vilniaus m.')]");
            public static By spanMikrorajonas = By.xpath("//span[@id='display_text_FQuartal']");
            public static By inputCheckAll = By.xpath
                    ("//div[@class='list-block']//label[@class='lb-select-all']//input[@id='cbCheckAll']");
            public static By divSaveSelected = By.xpath("//div[@id='btSaveSelected']");
            public static By inputAreaMinimum = By.xpath("//input[@id='input_FAreaOverAllMin']");
            public static By inputAreaMaximum = By.xpath("//input[@id='input_FAreaOverAllMax']");
            public static By divRoomNumber2 = By.xpath("//div[@id='quickValue_FRoomNum_2']");
            public static By spanHouseState = By.xpath("//span[@id='display_text_FHouseState']");
            public static By inputFullHouseState = By.xpath("//input[@value='full']");
            public static By inputPriceMinimum = By.xpath("//input[@id='input_FPriceMin']");
            public static By inputPriceMaximum = By.xpath("//input[@id='input_FPriceMax']");
            public static By inputSearchButton = By.xpath("//input[@id='buttonSearchForm']");
            public static By spanSearchDescription = By.xpath("//span[@class='search-description']");
            public static By spanAdvancedSearch = By.xpath("//span[@class='search-form__state-advanced']");
            public static By spanFloorNumber = By.xpath("//span[@id='display_text_FFloorNum']");
            public static By listFloorMinimumOption1 = By.xpath
                    ("//ul[@id='optionsMin_FFloorNum']//li[@data-value='1']");
            public static By listFloorMaximumOption5 = By.xpath
                    ("//ul[@id='optionsMax_FFloorNum']//li[@data-value='5']");
            public static By inputRadioButtonOption1 = By.xpath
                    ("//label[@class='search-form__field-checkbox']//input[@type='radio' and @value='1']");
            public static By inputSearchText = By.xpath("//input[@id='search_text']");
            public static By divSavedIcons = By.xpath("//a//div[@class='icon-u-save']");
            public static By iframeSelectNeighbourhoodsWindow = By.xpath("//iframe[@id='fancybox-frame']");
            public static By spanTitleWrapper = By.xpath("//span[@class='title-wrapper']");
        }

        public static class NaujiProjektai {
            public static By buttonAcceptCookiesSutinku = By.xpath
                    ("//button[@id='onetrust-accept-btn-handler']");
            public static By spanDisplayRegion = By.xpath("//span[@id='display_text_FPRegion']");
            public static By inputFilterRegion = By.xpath("//input[@id='filterInput_FPRegion']");
            public static By spanProjectObjectID = By.xpath("//span[@id='display_text_project_obj_ids']");
            public static By inputProjectObjectIDNamaiPardavimui = By.xpath
                    ("//label[contains(text(), 'Namai pardavimui')]");
            public static By divProjectID = By.xpath("//div[@id='project631']");
            public static By headingProjectAddress = By.xpath("//h2[@class='project-address']");
            public static By inputProjectObjectIDButaiNuomai = By.xpath
                    ("//label[contains(text(), 'Butai nuomai')]");
            public static By spanDisplayInMap = By.xpath
                    ("//span[contains(text(), 'Žiūrėti žemėlapyje')]");
            public static By slectSortSelectInput = By.xpath
                    ("//div[@class='edit-search-link']//select[@id='changeListOrder']");
            public static By headerSearchInformation = By.xpath("//h1[@class='search-info__title']");
            public static By iFrameSidelist = By.xpath("//iframe[@id='sideListIframe']");
            public static By selectCityInMapPalanga = By.xpath
                    ("//select//option[contains(text(), 'Palanga')]");
        }

        public static class UzsienioObjektai {
            public static By spanDisplayObjectType = By.xpath("//span[@id='display_text_object_type']");
            public static By labelObjectTypeSklypai = By.xpath("//label[contains(text(), 'Sklypai')]");
            public static By spanDisplayCountry = By.xpath("//span[@id='display_text_country']");
            public static By labelCountryLatvia = By.xpath("//label[contains(text(), 'Latvija')]");
            public static By divObjectListItemLatvia = By.xpath("//div[@id='project3674']//a");
            public static By divSave = By.xpath("//div[@data-action='save_obj']");
            public static By inputUsername = By.xpath("//input[@id='userName']");
            public static By inputPassword = By.xpath("//input[@id='password']");
            public static By buttonLogIn = By.xpath("//button[@id='loginAruodas']");
            public static By buttonNesutinku = By.xpath
                    ("//div[@class='push-popup-actions']//a[contains(text(), 'Nesutinku')]");
            public static By spanManoAruodas = By.xpath("//a//span[contains(text(), 'Mano aruodas')]");
            public static By divIsimintiSkelbimai = By.xpath
                    ("//div[@id='userPersonalMenuHolder']//a[@href='/isiminti-skelbimai/']");
            public static By spanObjectDescription = By.xpath
                    ("//span[contains(text(), 'Objektas užsienyje')]");
        }

        public static class ManoAruodas {
            public static By spanDelete = By.xpath("//span[@class='svg-delete']");
            public static By headerUser = By.xpath("//h2[@class='user-header']");
        }
    }
}

