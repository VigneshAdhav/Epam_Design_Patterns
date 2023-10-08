package com.factorypattern;

public class DriverFactory {
    public static WebDriverFactory getDriverFactory(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            return new MyChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
           //return new MyFirefoxDriver();
       
    }
		return null;
    }}
