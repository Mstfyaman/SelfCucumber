
Feature: Negative Test Scenario

  Background:
    Given User should be on the login page

  @wip
  Scenario: Try to login with no email and password
    Given User should be on the login page
    When User should input "" and ""
    Then The user be able to see "Please enter your email." and "Please enter your password!"

  Scenario: Try to login with no email
    When User should input "" and "123456789"
    Then The user be able to see "Please enter your email." and "" and "" warning message

  Scenario: Try to login with no password
    When User should input "Mustafa@gmail.com" and ""
    Then The user be able to see "Please enter your password!" and "" warning message

  Scenario: Try to login with wrong email
    When User should input "Mustafa4@gmail.com" and "123456789"
    Then The user be able to see "" and "" and "" and "Email address or password is incorrect. Please check" warning message

  Scenario: Try to login with wrong password
    When User should input "Mustafa@gmail.com" and "12345678900"
    Then The user be able to see "" and "" and "" and "Email address or password is incorrect. Please check" warning message

  Scenario: Try to login with wrong email and password
    When User should input "Mustafa4@gmail.com" and "12345678900"
    Then The user be able to see "" and "" and "" and "Email address or password is incorrect. Please check" warning message