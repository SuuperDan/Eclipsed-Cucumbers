

Feature: Test the login functionality
 As an authenticated user I should be able to login to the application

  
  Scenario: Using valid credenitals I should be able to login
     Given I open my chrome browser
     And I visit my application
    And I enter "test.user@gmail.com.test" as username and "Welcome2" as password
    When I click login button
    Then I should see the dashboard
    Then i should close the browser


  Scenario: Using in-valid credenitals I should be able to login
     Given I open my chrome browser
     And I visit my application
    And I enter "test.user@gmail.com.test" as username and "Welcome2" as password
    When I click login button
    Then I should see an error message
    
    Scenario: Using in-valid credenitals I should be able to login two
     Given I open my chrome browser
     And I visit my application
   And I enter "test.user@gmail.com.test" as username and "Welcome2" as password
    When I click login button
    Then I should see an error message
    
    Scenario: Using in-valid credenitals I should be able to login three
     Given I open my chrome browser
     And I visit my application
 And I enter "test.user@gmail.com.test" as username and "Welcome2" as password
    When I click login button
    Then I should see an error message
