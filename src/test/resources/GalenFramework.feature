Feature: Galen Framework basic test

  Scenario: 1- Try to Login to with an already created user
    Given I got to this page "http://testapp.galenframework.com/"
    And I click on login Button
    Then I use basic user to login
