Feature: LoginFeature

  Scenario: Login with correct username and password
    Given Go to homepage
    And Click "LOGIN_BUTTON" button
    And Enter the "USERNAME" and "PASSWORD"
    Then Check the "LOGIN" information is correct