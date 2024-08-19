package org.testing.framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    private static final String SCREENSHOTS_DIR = "screenshots";

    public static void takeScreenshot(WebDriver driver, String testName) {

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotName = testName + "_" + timestamp + ".png";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            Files.createDirectories(Paths.get(SCREENSHOTS_DIR));
            Files.copy(screenshot.toPath(), Paths.get(SCREENSHOTS_DIR, screenshotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
