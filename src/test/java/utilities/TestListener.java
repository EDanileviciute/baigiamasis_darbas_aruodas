package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pages.Common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        if(!Common.brokenLinks.isEmpty() && !Common.validLinks.isEmpty()){
        takeScreenshot();
        }

        saveDataIntoFile();

    }

    @Override
    public void onTestSuccess(ITestResult result) {
            saveDataIntoFile();

    }

    private void takeScreenshot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File screeshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String dir = "./screenshots/";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_SSS");
        String date = LocalDateTime.now().format(formatter);

        String fileName = "screenshot_" + date + ".png";

        File copyToFile = new File("%s%s".formatted(dir, fileName));
        //./screenshots/new_screenshot.png


        try {
            FileUtils.copyFile(screeshotFile, copyToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void saveDataIntoFile() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_SSS");
        String date = LocalDateTime.now().format(formatter);

        String fileBrokenLinks = "fileBrokenLinks" + date + ".txt";
        String fileValidLinks = "fileValidLinks" + date + ".txt";
        String fileBrokenImages = "fileBrokenImages" + date + ".txt";
        String dir = "C:\\JAVA paskaitos\\baigiamasis_darbas_aruodas\\linkReports";


        Path pathFileBrokenLinks = Paths.get(dir.concat(fileBrokenLinks));
        Path pathFileValidLinks = Paths.get(dir.concat(fileValidLinks));
        Path pathFileBrokenImages = Paths.get(dir.concat(fileBrokenImages));

        try {
            if (!Common.brokenLinks.isEmpty()){
            Files.write(pathFileBrokenLinks, Common.brokenLinks);
            }
            if (!Common.validLinks.isEmpty()){
            Files.write(pathFileValidLinks, Common.validLinks);
            }
            if (!Common.brokenImages.isEmpty()){
            Files.write(pathFileBrokenImages, Common.brokenImages);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
