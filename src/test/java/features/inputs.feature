Feature: Inputs field

Scenario: Enter a number
  Given I open the inputs page
  When I enter the number "10"
  Then the input value should be "10"