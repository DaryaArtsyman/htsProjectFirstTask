@regression
Feature: Sign-in functionality

  Scenario: TC_1 NHS Positive Login testing
    Given the user navigate to the NHS website
    And user validates the url of the page
    When the user enters the valid username  and valid password
    And the user clicks the SignIn button
    Then Then the user validates the title

  Scenario: TC_02 NHS Negative Login test with an invalid password
    Given the user navigates to the nhs website
    Given user validatess the url of the page
    When the user enter the valid username  and invalid password
    Then the user clickss the SignIn button

  Scenario: TC_03 NHS Negative Login test with a blank password
    Given the user navigates to the NHS website
    And user validate the url of the page
    When the user enters the valid username  and a blank password
    And the user click the SignIn button
    #Then user validates the error message