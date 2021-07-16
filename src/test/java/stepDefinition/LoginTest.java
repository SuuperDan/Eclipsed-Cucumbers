package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest {
	@Given("^I open the Browser$")
	public void i_open_the_Browser()  {
	    System.out.println("I open the browser");
	}

	@Given("^I visit the application$")
	public void i_visit_the_application() {
		 System.out.println("I visit the application");
	}

	@Given("^I enter valid username$")
	public void i_enter_valid_username() {
		 System.out.println("I enter valid username");
	}

	@Given("^I enter valid password$")
	public void i_enter_valid_password() {
		 System.out.println("I enter valid password");
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() {
		 System.out.println("I click the login button");
	}

	@Then("^I should see the dashboard$")
	public void i_should_see_the_dashboard()  {
		 System.out.println("I should see the dashboard");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes()  {
		 System.out.println("I check more outcomes");
	}

@Given("^I enter invalid username$")
public void i_enter_invalid_username()  {
   System.out.println("I enter invalid username");

}

@Given("^I enter invalid password$")
public void i_enter_invalid_password() {
Assert.assertTrue(true);

}

@When("^I should see the error$")
public void i_should_see_the_error()  {
  System.out.println("I should see the error");
}


}
