Feature: Fleet click
  Agile story:
  As a valid user i should able to click on fleet module
  and Vehicle Services Logs tab.

  @Fleet
  Scenario: Login as driver
    Given I am on the login page
    When I login as a driver
    Then I should be able to hover on fleet module
    Then I should be able to click on Vehicle Services Logs tab
    Then I should be able to see the Vehicle Services Logs page