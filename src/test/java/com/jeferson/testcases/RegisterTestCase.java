package com.jeferson.testcases;

import com.aventstack.extentreports.Status;
import com.jeferson.framework.supports.BaseTest;
import com.jeferson.framework.tools.Report;
import com.jeferson.framework.tools.Screenshot;
import com.jeferson.framework.utils.FileOperationsAndProperties;
import com.jeferson.framework.webdrivers.DriverManager;
import com.jeferson.tasks.RegisterTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.jeferson.framework.tools.Report.extentTest;

public class RegisterTestCase extends BaseTest {

    private final WebDriver driver = DriverManager.getDriver();
    private final RegisterTask registerTask = new RegisterTask(driver);

    @Test
    public void RegisterTest() throws InterruptedException {
        Report.createTest("Teste registar");
        DriverManager.getDriver().get(FileOperationsAndProperties.getPropertiesData("url", "automationtesting"));
        extentTest.log(Status.INFO, "Abriu a navegador no 'Register'", Screenshot.screenshotBase64(driver));
        registerTask.cadastrarRegistar();
    }
}
