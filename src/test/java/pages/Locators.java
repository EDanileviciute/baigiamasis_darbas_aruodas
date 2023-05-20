package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Aruodas {

        public static class Home {

            public static By buttonAcceptCookiesSutinku = By.xpath(
                    "//button[@id='onetrust-accept-btn-handler']"
            );
            public static By buttonPrisijungti = By.xpath("//div[@class='reg-menu-div-4']");
            public static By divPrisijundti = By.xpath("//div[@data-id='popup__right__login__container']");
            public static By inputUsername = By.xpath("//input[@id='userName']");
            public static By inputPassword = By.xpath("//input[@id='password']");
            public static By buttonLogIn = By.xpath("//button[@id='loginAruodas']");
            public static By spanManoAruodas = By.xpath("//a//span[contains(text(), 'Mano aruodas')]");
            public static By buttonAtsijungti = By.xpath("//div[@class='icon-u-on']");
        }

        public static class Prisijungti {

            public static By formRegistrationForm = By.xpath(
                    "//form[@id='loginForm']//div[@class='popup__right__login__form__error']"
            );
        }
    }
}

////span[@id='display_text_obj']