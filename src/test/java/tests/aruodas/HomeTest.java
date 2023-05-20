package tests.aruodas;

import org.testng.annotations.BeforeMethod;
import pages.aruodas.HomePage;
import tests.TestBase;

public class HomeTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
    }
}
