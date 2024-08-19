package org.testing.framework.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testing.framework.driver.managment.Browser;
import org.testing.framework.driver.managment.DriverManager;
import org.testing.framework.models.Engine;
import org.testing.framework.pages.ComputeEnginePage;
import org.testing.framework.pages.CostEstimateSummaryPage;
import org.testing.framework.pages.StartPage;
import org.testing.framework.services.EngineCreator;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificationOfEstimateSummaryTest {
    private static WebDriver driver;
    private static String propertyFileName = "dev.properties";

//    @BeforeAll
    @BeforeClass
    public static void setUp() {
        driver = DriverManager.getDriver(Browser.CHROME);
        driver.get("https://cloud.google.com/products/calculator");
        driver.manage().window().maximize();
    }

    @Test
    public void testEqualityOfEngineParametersOnPages() {
        //random assert for fail
//        assertEquals("forFail", "costEstimateSummaryPageEngine");


        StartPage startPage = new StartPage(driver);
        ComputeEnginePage computeEnginePage = startPage.followToComputeEnginePage();

        Engine inputEngine = EngineCreator.withCredentialsFromProperty(propertyFileName);

        computeEnginePage.computeNewEngine(inputEngine);

        CostEstimateSummaryPage costEstimateSummaryPage =
                computeEnginePage.openEstimateSummary();

        Engine costEstimateSummaryPageEngine = costEstimateSummaryPage.getEngine();

        assertEquals(inputEngine, costEstimateSummaryPageEngine);
    }


//    @AfterAll
    @AfterClass
    public static void setDown() {
        DriverManager.quitDriver();
    }

}
