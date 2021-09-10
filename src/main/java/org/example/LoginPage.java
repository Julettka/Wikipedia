package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(linkText = "Создать учётную запись")
    private WebElement btn1;

    @FindBy(id = "wpName2")
    private WebElement logo;

    @FindBy(id = "wpPassword2")
    private WebElement paswd;

    @FindBy(id = "wpRetype")
    private WebElement paswd2;

    @FindBy(id = "wpEmail")
    private WebElement email;

    @FindBy(id = "mw-input-captchaWord")
    private WebElement captca;

    @FindBy(id = "wpCreateaccount")
    private WebElement create;

    @FindBy(linkText = "Указатель А — Я")
    private WebElement btn2;

    @FindBy(linkText = "0")
    private WebElement text1;

    @FindBy(id = "ooui-php-2")
    private WebElement text2;

    @FindBy(css = ".oo-ui-inputWidget-input > .oo-ui-labelElement-label")
    private WebElement btn3;

    @FindBy(linkText = "007 Legends")
    private WebElement text3;


    public void btn1In() {
        btn1.click();
    }

    public void logoClick() {
        logo.click();
    }

    public void logoIn(String login) {
        logo.sendKeys(login);
    }

    public void passwdClick() {
        paswd.click();
    }

    public void passwdIn(String password) {
        paswd.sendKeys(password);
    }

    public void passwd2Click() {
        paswd2.click();
    }

    public void passwd2In(String password2) {
        paswd2.sendKeys(password2);
    }

    public void emailClick() {
        email.click();
    }

    public void emailIn(String mail) {
        email.sendKeys(mail);
    }

    public void capchaClick() {
        captca.click();
    }

    public void capchaIn(String cap) {
        captca.sendKeys(cap);
    }

    public void creatAkk() {
        create.click();
    }

    public void btn2Click() {
        btn2.click();
    }

    public void text1Click() {
        text1.click();
    }

    public void text2Click() {
        text2.click();
    }

    public void text2In(String txt) {
        text2.sendKeys(txt);
    }

    public void btn3Click() {
        btn3.click();
    }

    public void text3Click() {
        text3.click();
    }
}
