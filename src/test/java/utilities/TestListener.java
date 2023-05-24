package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot();
        }
    }
    private void takeScreenshot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
                File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

                String destinationPath = "C:\\JAVA paskaitos\\baigiamasis_darbas_aruodas\\screenshots";

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_ss_SS");
                String date = LocalDateTime.now().format(formatter);
                String fileName = "screenshot_" + date + ".png";

                File copyToFile = new File(destinationPath + File.separator + fileName);
                try {
                    FileUtils.copyFile(screenshotFile, copyToFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
}



