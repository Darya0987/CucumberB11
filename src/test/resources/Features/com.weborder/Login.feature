Feature: Login Functionality For webOrder Page

  Background:
    Given the user navigates to the WebOrder website

  @smoke @regression @ahmet
  Scenario: Validation of WebOrder Login Positive Scenario
#   Given the user navigates to the WebOrder website
    When the user provides credentials
    Then the user is on the home page

  Scenario: Validation of WebOrder Login Negative Scenario 1
#      Given the user navigates to the WebOrder website
    When the user provides correct username and wrong password
    Then the user validates the "Sign in Failed" error message

  Scenario: Validation of WebOrder Login Negative Scenario 2
#    Given the user navigates to the WebOrder website
    When the user provides wrong "ahmet" and "baldir"
    Then the user validates the "Sign in Failed" error message
  @smoke @regression @ahmet  @tc1
  Scenario: Validation of WebOrder Login Negative Scenario 3
#    Given the user navigates to the WebOrder website
    When the user provides empty username and password
    Then the user validates the "Sign in Failed" error message