package com.factorypattern;

import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        String browser = "chrome"; 

        WebDriverFactory driverFactory = DriverFactory.getDriverFactory(browser);
        WebDriver driver = driverFactory.createWebDriver();

        driver.get("https://example.com");

        driver.quit();
    }
}
