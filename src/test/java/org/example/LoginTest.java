package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void loginTest1() {
        loginPage.btn1In();
        loginPage.logoClick();
        loginPage.logoIn(ConfProperties.getProperty("login"));
        Assert.assertEquals("WWWWWWvvvvvvv7777777", ConfProperties.getProperty("login"));
        loginPage.passwdClick();
        loginPage.passwdIn(ConfProperties.getProperty("password"));
        Assert.assertEquals("9141505QQ", ConfProperties.getProperty("password"));
        loginPage.passwd2Click();
        loginPage.passwd2In(ConfProperties.getProperty("password2"));
        loginPage.emailClick();
        loginPage.emailIn(ConfProperties.getProperty("mail"));
        Assert.assertEquals("Jul.ettka@gmail.com", ConfProperties.getProperty("mail"));
        loginPage.capchaClick();
        loginPage.capchaIn(ConfProperties.getProperty("cap"));
        loginPage.creatAkk();
    }

    @Test
    public void loginTest2() {
        loginPage.btn2Click();
        String title1 = driver.getTitle();
        Assert.assertEquals("Википедия:Алфавитный указатель — Википедия", title1);
        loginPage.text1Click();
        loginPage.text2Click();
        loginPage.text2In(ConfProperties.getProperty("txt"));
        loginPage.btn3Click();
        loginPage.text3Click();
    }
}

