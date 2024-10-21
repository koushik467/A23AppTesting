package com.a23.automation;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

	public static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> setUp() throws MalformedURLException {
//        if (driver == null) {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability("deviceName", "sdk_gphone64_x86_64");
//            capabilities.setCapability("automationName", "UiAutomator2");
//            capabilities.setCapability("appPackage", "air.com.ace2three.mobile.cash");
//            capabilities.setCapability("appActivity", "com.rummy.activity.SplashActivity");;
//            capabilities.setCapability("noReset", true);
//
//            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		// Check if the driver is not already initialized
		if (driver == null) {
			// Create a new instance of DesiredCapabilities to set the desired
			// configurations
			DesiredCapabilities capabilities = new DesiredCapabilities();

			// Specify the platform name as Android
			capabilities.setCapability("platformName", "Android");

			// Set the device name; here we are using an Android emulator
			capabilities.setCapability("deviceName", "sdk_gphone64_x86_64");

			// Specify the automation framework to use (UiAutomator2 for Android)
			capabilities.setCapability("automationName", "UiAutomator2");

			// Define the app package name for the application to be tested
			capabilities.setCapability("appPackage", "air.com.ace2three.mobile.cash");

			// Define the main activity of the application to start
			capabilities.setCapability("appActivity", "com.rummy.activity.SplashActivity");

			// Set 'noReset' to true to keep app data and state between sessions
			capabilities.setCapability("noReset", true);

			// Initialize the AndroidDriver with the Appium server URL and the desired
			// capabilities
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		}
		// Return the initialized driver instance
		return driver;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
