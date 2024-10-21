Feature: Login functionality for A23 Rummy app

  Scenario: User logs into the A23 Rummy app using valid mobile number and OTP
    Given The A23 Rummy app is launched
    When Use Password to login
    When User enters a valid mobile number "sage239802"
    Then Enter Password for user as "Kingsman@467"
    And User clicks on the Login button
    And Wait until loading
    Then User is logged into the A23 Rummy app successfully