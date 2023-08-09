package com.jeferson.framework.supports;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.webdrivers.DriverFactory;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.framework.webdrivers.Drivers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest extends DriverFactory {

    @BeforeAll
    public static void setUp(){
        Report.configurarExtentReport();
        driver = getBrowser(Drivers.CHROME);
        DriverManager.setDriver(driver);
        DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown(){
        Report.extentTest.log(Status.INFO,"Finalmente de teste", Screenshot.screenshotBase64(driver));
        Report.closeReport();
        DriverManager.quit();
    }
}