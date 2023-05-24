package tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.Common;
import utilities.TestListener;

@Listeners(TestListener.class)

public abstract class TestBase {
    private WebDriver driver;

    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown(ITestResult result) {
        Common.closeDriver();
    }

}

