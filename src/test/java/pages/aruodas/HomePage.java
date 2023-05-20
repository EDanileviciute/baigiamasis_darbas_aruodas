package pages.aruodas;

import pages.Common;

public class HomePage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.aruodas.lt/");
    }
}
