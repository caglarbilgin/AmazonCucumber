Feature: LoginFeature

  Scenario: Login with correct username and password
    Given Go to homepage
    And Click "LOGIN_BUTTON" button
    And Enter the "USERNAME_INPUT" send key "sahabt321@gmail.com" and "PASSWORD_INPUT" send key "123456"
    And Click "SIGNIN_BUTTON" button
    Then Check the "CHECK_LOGIN" information is correct

  Scenario: Login with incorrect username and password
    Given Go to homepage
    And Click "LOGIN_BUTTON" button
    And Enter the "USERNAME_INPUT" send key "sahabt3211@gmail.com" and "PASSWORD_INPUT" send key "123456"
    And Click "SIGNIN_BUTTON" button
    Then Check the "CHECK_LOGIN" information is correct