package com.wizeline.stepDefinitions;

import com.wizeline.pages.LoginPage;
import com.wizeline.pages.MainPage;
import com.wizeline.pages.Util;
import gherkin.ast.Step;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinitions {

    private WebDriver webDriver;
    private MainPage mainPage;
    private LoginPage loginPage;
    private Util util;

    public StepDefinitions(MainPage mainPage, LoginPage loginPage, Util util) {
        this.mainPage = mainPage;
        this.loginPage = loginPage;
        this.util = util;
    }

    /// starts the driver with ChromeBrowser
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        this.webDriver = new ChromeDriver();
        this.webDriver.manage().window().maximize();
    }


    ///////Steps definitions linked to feature files
    @Given("I got to this page {string}")
    public void i_got_to_this_page(String url) {
        this.webDriver.get(url);
    }

    @Given("I click on login Button")
    public void i_click_on_login_Button() {
        this.mainPage.setUpDriver(this.webDriver);
        this.mainPage.clickOnLogin();
    }

    @Then("I use basic user to login")
    public void i_use_basic_user_to_login() {
        this.loginPage.setUpDriver(this.webDriver);
        this.loginPage.loginBasicAccount("testuser@example.com", "test123");
    }

}
