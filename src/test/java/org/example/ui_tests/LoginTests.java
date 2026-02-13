package org.example.ui_tests;

import org.example.core.BaseTest;
import org.example.core.DriverFactory;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        DriverFactory.getDriver().get("https://automationexercise.com");

        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
        loginPage.openLogin();
        loginPage.login("testautomation@mail.com", "test123");
    }
}
