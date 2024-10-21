package stepDefinitions;

import com.a23.automation.BaseTest;
import io.cucumber.java.en.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSteps extends BaseTest {

    @Given("The A23 Rummy app is launched")
    public void the_app_is_launched() throws Exception {
        setUp();  // Launch the app and initialize the Appium driver
    }

    @When("User enters a valid mobile number {string}")
    public void user_enters_a_valid_mobile_number(String mobileNumber) {
        WebElement mobileNumberField = driver.findElement(By.id("air.com.ace2three.mobile.cash:id/etLoginID"));
        mobileNumberField.sendKeys(mobileNumber);  // Enter the mobile number
    }
    @When("Use Password to login")
    public void user_click_on_login_using_password() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement usepassword = driver.findElement(By.id("air.com.ace2three.mobile.cash:id/useOTPTV"));
    	if (usepassword.getAttribute("text")== "Use Password") {
    		usepassword.click();
    	}
    	
    }
    @When("User clicks on the Get OTP button")
    public void user_clicks_on_the_get_otp_button() {
        WebElement getOtpButton = driver.findElement(By.id("com.a23rummy:id/get_otp_button"));
        getOtpButton.click();  // Click the Get OTP button
    }

    @When("User enters the OTP {string}")
    public void user_enters_the_otp(String otp) {
        WebElement otpField = driver.findElement(By.id("com.a23rummy:id/otp_input"));
        otpField.sendKeys(otp);  // Enter the OTP received
    }
    @Then("Enter Password for user as {string}")
    public void user_enter_user_password(String password) {
    	WebElement passwordElement = driver.findElement(By.id("air.com.ace2three.mobile.cash:id/pwdTv"));
    	passwordElement.sendKeys(password);
    }
    @And("User clicks on the Login button")
    public void clickonlogin() {
    	WebElement loginbutton = driver.findElement(By.id("air.com.ace2three.mobile.cash:id/loginButton"));
    	loginbutton.click();
    }
    @Then("User is logged into the A23 Rummy app successfully")
    public void user_is_logged_into_the_app_successfully() {
        WebElement homeElement = driver.findElement(By.id("air.com.ace2three.mobile.cash:id/webview"));
        assert homeElement.isDisplayed();  // Ensure the home screen is displayed
        tearDown();  // Close the Appium session
    }
}
