package Stepall;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.primitives.Bytes;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import reuse.testbase;
import reuseweb.Loginwebpage;

public class baby1 {

	public WebDriver driver;

	@Before("@java")
	public void setup() {

		System.out.println("started");
	}

	@After("@java")
	public void teardown(Scenario secenario) {

		if (secenario.isFailed()) {

			byte[] a = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			secenario.embed(a, "image/png");

		}

		if (driver!= null) {

			System.out.println("driver is closed");
			
			driver.quit();
		}

	}

	@Given("^A$")
	public void a() throws Throwable {

	}

	@Given("^B$")
	public void b() throws Throwable {

	}

	@Given("^C$")
	public void c() throws Throwable {

	}

	@Given("^D$")
	public void d() throws Throwable {

	}

	@Given("^E$")
	public void e() throws Throwable {

	}

	@Then("^user F$")
	public void user_F() throws Throwable {

		Assert.assertTrue(false);
	}

}
