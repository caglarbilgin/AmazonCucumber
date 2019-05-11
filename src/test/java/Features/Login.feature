Feature: LoginFeature

  Scenario: Login with correct username and password
    Given Go to homepage
    And Enter the username and password
    And Click login button
    Then Check the login information is correct