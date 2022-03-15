package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US10 extends TestBase {
    @Test
    public void write_Description_SalesManager() {
        //Users are on the homepage
        loginPage.gotoLoginPage();
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("driver_password"));
        // BrowserUtils.sleep(2);
        //go to activities Module
        BrowserUtils.hover(homePage.activitiesModule);
        homePage.activitiesModule.click();
        // BrowserUtils.sleep(5);
        //Click the “Create Calendar Event” button
        BrowserUtils.hover(homePage.calendarEventSubmodule);
        homePage.calendarEventSubmodule.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        //click on create calendar button

    }
}