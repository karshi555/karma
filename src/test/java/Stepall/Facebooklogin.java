package Stepall;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import reuse.testbase;
import reuseweb.Loginwebpage;

public class Facebooklogin extends testbase {

	Loginwebpage l1;

	@Given("^Hey User opens the browser and hit the url$")
	public void hey_User_opens_the_browser_and_hit_the_url() throws Throwable {

		testbase.intilization();
	}

	@Then("^Hey User is on login page$")
	public void hey_User_is_on_login_page() throws Throwable {
		System.out.println("sucess");

	}

	@Then("^Hey User enters username and passoword$")
	public void hey_User_enters_username_and_passoword() throws Throwable {

		l1 = new Loginwebpage();
		l1.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^Hey Validate the title \"(.*?)\" of facebook$")
	public void hey_Validate_the_title_of_facebook(String arg1) throws Throwable {

		String actual = driver.getTitle();
		Assert.assertEquals(actual, arg1);
	}

	@Then("^Hey user is login into facebook$")
	public void hey_user_is_login_into_facebook() throws Throwable {
		System.out.println("he is on login page");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		
	}

}
