package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

import utilities.BaseClass;

public class AccountTest extends BaseClass {
	@Then("^I click the \"([^\"]*)\" tab$")
	public void I_click_the_tab(String menu) {
		driver.findElement(By.xpath("//a[@title='" + menu + " Tab']")).click();
	}

	@Then("^I click the \"([^\"]*)\" button$")
	public void I_click_the_button(String buttonName) {
		driver.findElement(By.xpath("//*[@title='" + buttonName + "']")).click();
	}

	@Then("^I enter \"([^\"]*)\" in the account name field$")
	public void I_enter_in_the_account_name_field(String accName) {
		driver.findElement(By.id("acc2")).sendKeys(accName);
	}

	@Then("^I create and save an Account$")
	public void I_create_and_save_an_Account(DataTable accountDetails) throws InterruptedException {
		List<Map<String, String>> data = accountDetails.asMaps(String.class,String.class); // first string is your key second is value
		for (Map<String, String> value : data) {
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.xpath("//input[@title='New']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("acc2")).sendKeys(value.get("Account Name"));
			driver.findElement(By.id("acc5")).sendKeys(value.get("Account Number"));
			driver.findElement(By.id("acc23")).sendKeys(value.get("Account Site"));

			WebElement activeDropdown = driver.findElement(By.id("00N2E00000D7LOy"));
			Select selActive = new Select(activeDropdown);
			selActive.selectByVisibleText(value.get("Active"));

			driver.findElement(By.id("acc8")).sendKeys(value.get("Annual Revenue"));

			WebElement accountSourceDropdown = driver.findElement(By.id("AccountSource"));
			Select selSource = new Select(accountSourceDropdown);
			selSource.selectByVisibleText(value.get("Account Source"));

			driver.findElement(By.xpath("//input[@name='save']")).click();

		}
	}

	@Then("^I should see the following values for the \"([^\"]*)\" field$")
	public void I_should_see_the_following_values_for_the_field(String field, DataTable values) {
		WebElement dropdown = driver.findElement(By.id(field));
		Select sel = new Select(dropdown);
		List<WebElement> opt = sel.getOptions();

		List<String> value = values.asList(String.class); // ask teach to explain athis whole method

		for (int i = 0; i < value.size(); i++) {
			Assert.assertEquals(value.get(i), opt.get(i).getText());
		}

	}
}
