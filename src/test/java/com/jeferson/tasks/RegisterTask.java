package com.jeferson.tasks;

import com.jeferson.appobjects.RegisterApp;
import com.jeferson.framework.supports.Fakers;
import com.jeferson.framework.tools.JsExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RegisterTask {

    private final WebDriver driver;
    private final RegisterApp registerApp;
    private final JsExecutor jsExecutor;
    private final Fakers fakers;

    public RegisterTask(WebDriver driver){
        this.driver = driver;
        registerApp = new RegisterApp(driver);
        jsExecutor = new JsExecutor();
        fakers = new Fakers();
    }

    public void cadastrarRegistar() throws InterruptedException {
        registerApp.firstNameFieldText().sendKeys(fakers.getFirstName());
        registerApp.lastNameFieldText().sendKeys(fakers.getLastName());
        registerApp.addressTextArea().sendKeys("Teste de mensagem");
        registerApp.emailFieldText().sendKeys(fakers.getEmail());
        registerApp.phoneFieldText().sendKeys("5554781123");
        registerApp.sexoMasculinoRadio().click();
        registerApp.hobbiesFilmesCheckBox().click();
        registerApp.hobbiesHoqueiCheckBox().click();
        registerApp.languages().click();
        registerApp.languagesOption("Dutch").click();
        registerApp.languagesOption("Czech").click();
        registerApp.skillsSelect().selectByValue("Android");
//        registerApp.selectCountrySelect().selectByVisibleText("Japan"); /*Opção 1*/
        registerApp.selectCountryCheckBox().click(); /*Opção 2*/
        registerApp.selectCountryFieldText().sendKeys("New"+ Keys.ENTER);
        registerApp.dateBirthYearSelect().selectByValue("1992");
        registerApp.dateBirthMonthSelect().selectByValue("May");
        registerApp.dateBirthDaySelect().selectByValue("3");
        registerApp.passwordFieldText().sendKeys("testes2023");
        registerApp.confirmPasswordFieldText().sendKeys("testes2023");
        registerApp.submitButton().click();
//        registerApp.refreshButton().click();
    }
}