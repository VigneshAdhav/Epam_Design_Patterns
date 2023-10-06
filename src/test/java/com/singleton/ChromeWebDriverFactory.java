package com.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver createWebDriver() {
        // Initialize and return the custom Chrome driver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        return new ChromeDriver();
    }
}
