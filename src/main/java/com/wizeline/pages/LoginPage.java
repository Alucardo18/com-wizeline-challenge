package com.wizeline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;
    private By userLocator = By.name("login.username");
    private By passwordLocator = By.name("login.password");
    private By loginBtnLocator = By.cssSelector("div.middle-wrapper:nth-child(2) div:nth-child(1) div.dialog-panel p:nth-child(5) > button.btn.btn-lg.btn-primary.button-login:nth-child(1)");

    public LoginPage() {
    }

    public void setUpDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void loginBasicAccount(String user, String password) {
        Util util = new Util();
        util.WaitFor(this.webDriver, (long) 15, userLocator);
        this.webDriver.findElement(userLocator).sendKeys(user);
        this.webDriver.findElement(passwordLocator).sendKeys(password);
        this.webDriver.findElement(loginBtnLocator).click();
    }

}
