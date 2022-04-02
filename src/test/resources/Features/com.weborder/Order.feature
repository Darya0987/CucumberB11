@smoke
Feature: WebOrder Page Food Order

  Background: testing first 5 steps here
    Given the user is on weborder homepage
    When the user selects "Office" options
    And the user is on the groupOrderPage
    And the user sends invitees note "Test"
    And the user sends invite list "ahmet@gmail.com" and "eric@gmail.com"
  @Office @special @regression
  Scenario: Validation of Food order For Office
#    Given the user is on weborder homepage
#    When the user selects "Office" options
#    And the user is on the groupOrderPage
#    And the user sends invitees note "Test"
#    And the user sends invite list "ahmet@gmail.com" and "eric@gmail.com"
    Then the user validates the "2012 EMPIRE BLVD" adress
    * the user validates "View Group Order" text
    * the user validates total participants is 1

  @MyHouse @regression @smoke
  Scenario: Validation of Food order For My House
#   Given the user is on weborder homepage
#    When the user selects "Office" options
#    And the user is on the groupOrderPage
#    And the user sends invitees note "Test"
#    And the user sends invite list "ahmet@gmail.com" and "eric@gmail.com"
    And the user selects "My House" options
    Then the user validates the "2112 EMPIRE BLVD" adress
    * the user validates "View Group Order" text
    * the user validates total participants is 1