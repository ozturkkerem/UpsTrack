package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPOM {

    public VehicleOdometerPOM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // vehicle Odometer sub module
    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement vehicle_odometer_submodule;

    //error message
    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement error_message;

    // default page 1
    @FindBy(xpath = "//input[@value='1']")
    public WebElement default_page_1;

    // View Per Page is 25 by default.
    @FindBy(xpath = "//button[normalize-space()='25']")
    public WebElement page_25_by_default;


}
