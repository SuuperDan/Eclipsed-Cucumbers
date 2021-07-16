package stepDefinition;

import cucumber.api.java.en.Then;
import utilities.BaseClass;

public class DashboardTest extends BaseClass {
	@Then("^I should see the Accounts Link$")
	public void I_should_see_the_Accounts_Link() {
	   System.out.println("^I should see the Accounts Link$");
	}

	@Then("^I should see the Home Link$")
	public void I_should_see_the_Home_Link()  {
	    System.out.println("^I should see the Home Link$");
	}

	@Then("^I should see the Opportunity Link$")
	public void I_should_see_the_Opportunity_Link()  {
	    System.out.println("^I should see the Opportunity Link$");
	}
	

}
