Feature: Verify links on the dashboard
  As a valid user, I should be able to see all the menu links on the dashboard

  @regression
  Scenario: Verify links on the dashboard
    Given I open my chrome browser
    And I visit my application
    And I enter "test.user@gmail.com.test" as username and "Welcome2" as password
    When I click login button
    Then I should see the dashboard
    And I should see the Accounts Link
    And I should see the Home Link
    And I should see the Opportunity Link
    Then I should close the browser
