package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseClass;

public class LoginTest extends BaseClass{

		@Before(value="@accounts",order=0)                   //({"@accounts"}) hook with accounts tag means this scenario only applies to accounts
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dania\\\\OneDrive\\\\Desktop\\\\Selenium files\\\\chromedriver\\\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	
		@After(value="@accounts",order=0) 
		public void closeBrowser() {
			driver.close();
		}
		@Before(value="@accounts",order=1)                   //({"@accounts"}) hook with accounts tag means this scenario only applies to accounts
		public void validateopenBrowser() {
			System.out.println("Openbrowser method executed");
		}
		@After(value="@accounts",order=1) 
		public void verifycloseBrowser() {
			System.out.println("closeBrowser method executed");
		}
		
	@Given("^I open my chrome browser$")
	public void I_open_my_chrome_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dania\\\\OneDrive\\\\Desktop\\\\Selenium files\\\\chromedriver\\\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^I visit my application$")
	public void I_visit_my_application()  {
		driver.get("https://login.salesforce.com");
	}

@Given("^I enter \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
public void I_enter_as_username_and_as_password(String arg1, String arg2) {
    driver.findElement(By.id("username")).sendKeys(arg1);
    driver.findElement(By.id("password")).sendKeys(arg2);
}
	

	@When("^I click login button$")
	public void I_click_login_button()  {
		driver.findElement(By.id("Login")).click();
	}

	@Then("^I should see the dashboard$")
	public void I_should_see_the_dashboard() {
		boolean homePage = driver.findElement(By.xpath("//a[@title='Home Tab - Selected']")).isDisplayed();
	Assert.assertTrue(homePage);
	}
	@Given("^I enter \"([^\"]*)\" as username$")
	public void I_enter_as_username(String arg1) {
		  driver.findElement(By.id("username")).sendKeys(arg1);
	}

	@Given("^I enter \"([^\"]*)\" as password$")
	public void I_enter_as_password(String arg1) {
		driver.findElement(By.id("password")).sendKeys(arg1);
	}

	@Then("^I should see an error message$")
	public void I_should_see_an_error_message()  {
		String expectedMessage="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";   
		String actualmessage = driver.findElement(By.id("error")).getText();
		Assert.assertEquals(expectedMessage, actualmessage);
	}

	@Then("^I should close the browser$")
	public void I_should_close_the_browser() {
		driver.close();
	}
}
