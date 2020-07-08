package com.wizeline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

    public Util() {
    }

    // sets the explicit timeout of given instance for desired amount of seconds based on locator
    public void WaitFor(WebDriver webDriver, Long sec, By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, sec);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
