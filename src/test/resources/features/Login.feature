
Feature: Login
  Agile story:
  As a user,
  when I enter valid login credentials
  I should be able to see the dashboard page
 @Login
  Scenario: Login as driver
    Given I am on the login page
    When I login as a driver
    Then I should be able to see the dashboard page


