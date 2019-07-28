Feature: Login
  Description: This feature is to test the login functionality

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User closes banner
    When User enters Username and Password
    And Type ENTER button
    Then He can visit the practice page
    And A message is displayed