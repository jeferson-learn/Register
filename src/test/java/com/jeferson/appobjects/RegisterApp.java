package com.jeferson.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterApp {

    private final WebDriver driver;

    public RegisterApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement firstNameFieldText() {
        return driver.findElement(By.cssSelector("input[placeholder='First Name']"));
    }
    public WebElement lastNameFieldText() {
        return driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
    }
    public WebElement addressTextArea() {
        return driver.findElement(By.cssSelector("textarea[ng-model]"));
    }
    public WebElement emailFieldText() {
        return driver.findElement(By.cssSelector("input[type='email']"));
    }
    public WebElement phoneFieldText() {
        return driver.findElement(By.cssSelector("input[type='tel']"));
    }
    public WebElement sexoMasculinoRadio() { return driver.findElement(By.cssSelector("input[type='radio'][value='Male']")); }
    public WebElement sexoFemininoRadio() { return  driver.findElement(By.cssSelector("input[type='radio'][value='FeMale']")); }
    public WebElement hobbiesGriloCheckBox() { return driver.findElement(By.id("checkbox1")); }
    public WebElement hobbiesFilmesCheckBox() { return driver.findElement(By.id("checkbox2")); }
    public WebElement hobbiesHoqueiCheckBox() { return driver.findElement(By.id("checkbox3")); }
    public WebElement languages() { return driver.findElement(By.id("msdd")); }
    public WebElement languagesOption(String valor) {
        return driver.findElement(By.xpath("//div[@id='msdd']//..//div//a[text()='"+valor+"']"));
    }
    public Select skillsSelect() { return  new Select(driver.findElement(By.id("Skills"))); }
    public Select countrySelect() { return  new Select(driver.findElement(By.id("countries"))); }
    public Select selectCountrySelect() { return  new Select(driver.findElement(By.id("country"))); }
    public WebElement selectCountryCheckBox() {
        return driver.findElement(By.className("select2-selection__arrow"));
    }
    public WebElement selectCountryFieldText() {
        return driver.findElement(By.className("select2-search__field"));
    }
    public Select dateBirthYearSelect() { return  new Select(driver.findElement(By.id("yearbox"))); }
    public Select dateBirthMonthSelect() { return  new Select(driver.findElement(By.cssSelector("select[placeholder='Month']"))); }
    public Select dateBirthDaySelect() { return  new Select(driver.findElement(By.id("daybox"))); }
    public WebElement passwordFieldText() { return  driver.findElement(By.id("firstpassword")); }
    public WebElement confirmPasswordFieldText() { return  driver.findElement(By.id("secondpassword")); }
    public WebElement submitButton() { return  driver.findElement(By.id("submitbtn")); }
    public WebElement refreshButton() { return  driver.findElement(By.id("Button1")); }
}
