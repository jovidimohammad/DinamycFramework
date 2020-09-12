package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
    public GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
