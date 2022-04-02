@smokeLoginTest
Feature: Login Functionality For WebOrder Page

  Background:
    Given the user navigates to the WebOrder website

  Scenario: Validation of WebOrder Login Positive Scenario
    When the user provides credentials
    Then the user is on the home page

  Scenario Outline: Validation of WebOrder Login Negative Scenarios
    When the user provides wrong "<username>" and "<password>"
    Then the user validates the "<errorMessage>" error message
    Examples:
      | username              | password     | errorMessage   |
      | guest1@microworks.com | ahmet123     | Sign in Failed |
      | ahmet@gmail.com       | Guest1!      | Sign in Failed |
      | ahmet@gmail.com       | ahmet123     | Sign in Failed |
      |                       |              | Sign in Failed |
      |                       | Guest1!      | Sign in Failed |
      | guest1@microworks.com |              | Sign in Failed |
      | ahmet                 | @#!@$%#%@%   | Sign in Failed |
      | $#&$^#&^%&#^%         | eric         | Sign in Failed |
      | AHMETSDFAFDF          | SFDSGSFDGSDG | Sign in Failed |



    #Do not touch the positive scenario
   #Create as many as negative scenario with Scenario Outline