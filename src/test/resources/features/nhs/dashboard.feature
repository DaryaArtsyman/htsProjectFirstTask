Feature: Dashboard validation

  Background:
    Given the user navigate to the NHS website
    When the user enter the credentials 'admin' and 'admin' and click the Sign In button

  Scenario: Validation of Patients with Rooms
    Then User validates if the Patients with rooms box is visible
    And User validates the header of blue panel 'Patients with rooms'

  Scenario: Validation of Patients waiting
    Then User validates if the patients waiting box is visible
    And User validates the header of red panel 'Patients waiting'

  Scenario: Validation of Free rooms
    Then User validates if the number of free rooms box is visible
    And User validates the header of orange panel 'Free rooms'

    Scenario: Validation of the headers for table "Patients with Rooms"
      Then user can see the headers: "no.", "Patients with rooms", "Room", "Score".