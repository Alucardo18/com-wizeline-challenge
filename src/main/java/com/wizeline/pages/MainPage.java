package com.wizeline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver webDriver;
    private By loginBtnLocator = By.tagName("button");


    public MainPage() {
    }

    public void setUpDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnLogin() {
        this.webDriver.findElement(loginBtnLocator).click();
    }

}
