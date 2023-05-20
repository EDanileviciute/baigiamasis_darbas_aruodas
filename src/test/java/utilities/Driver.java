package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Driver {
    //    private static WebDriver driver;
    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.http.factory", "jdk-http-client");
//        options.addArguments("--remote-allow-origins=*");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--force-device-scale-factor=0.75");
        options.addArguments("--disable-notifications");
//        options.addArguments("--headless=new");

//        driver = new ChromeDriver(options);
        drivers.set(new ChromeDriver(options));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public static void setDriverWithEdge() {
        WebDriverManager.edgedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--force-device-scale-factor=0.7");
        options.addArguments("--disable-notifications");

        drivers.set(new EdgeDriver(options));
        drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public static WebDriver getDriver() {
        return drivers.get();
    }

    public static void closeDriver() {

        drivers.get().quit();
        drivers.remove();
    }
}
