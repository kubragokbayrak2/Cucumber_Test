Feature: Test register
  Scenario:
    Given I access web tables
    When I click on add user button
    When I fill the user inputs
    Then I click Submit Button
    And I click edit button
    When I update inputs
    Then I click Submit Button