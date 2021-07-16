

Feature: Test the login functionality
 As an authenticated user I should be able to login to the application

  
  Scenario: Using valid credenitals I should be able to login
    Given I open the Browser
    And I visit the application
    And I enter valid username
    And I enter valid password
    When I click the login button
    Then I should see the dashboard
    And check more outcomes


  Scenario: Using in-valid credenitals I should be able to login
    Given I open the Browser
    And I visit the application
    And I enter invalid username
    And I enter invalid password
    When I click the login button
    And I should see the error
    
    Scenario: Using in-valid credenitals I should be able to login two
    Given I open the Browser
    And I visit the application
    And I enter invalid username
    And I enter invalid password
    When I click the login button
    And I should see the error
    
    Scenario: Using in-valid credenitals I should be able to login three
    Given I open the Browser
    And I visit the application
    And I enter invalid username
    And I enter invalid password
    When I click the login button
    And I should see the error
