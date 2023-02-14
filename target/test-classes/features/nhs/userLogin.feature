
Feature: Sign-in functionality

  Scenario: TC_1 NHS Positive Login testing
    Given the user navigate to the NHS website
    And user validates the url of the page
    When the user enters the valid username  and valid password
    And the user clicks the SignIn button
    Then Then the user validates the title