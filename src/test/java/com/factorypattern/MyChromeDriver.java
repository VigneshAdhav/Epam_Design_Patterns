package com.factorypattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriver implements WebDriverFactory {
    @Override
    public WebDriver createWebDriver() {
        ChromeOptions options = new ChromeOptions();
        return new ChromeDriver(options);
    }
}
