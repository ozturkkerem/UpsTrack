package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class secondTime {
    @Test
    public void login_test() {

        //goto login page
        loginPage.gotoLoginPage();
        //enter username
        BrowserUtils.sleep(2);
        loginPage.userNameInput
                .sendKeys(ConfigurationReader.getProperty("driver_username"));
        //enter password
        BrowserUtils.sleep(2);
        loginPage.passwordInput
                .sendKeys(ConfigurationReader.getProperty("driver_password"));
        //click the login button
        BrowserUtils.sleep(2);
        loginPage.loginButton.click();
        //verify page header
        Boolean isDisplayedPageHeader = dashboardPage.pageHeader.isDisplayed();
        Assert.assertTrue(isDisplayedPageHeader);


    }
}
