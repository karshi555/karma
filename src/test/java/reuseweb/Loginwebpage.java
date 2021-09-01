package reuseweb;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reuse.testbase;

public class Loginwebpage extends testbase {

	@FindBy(name = "email")
	WebElement u1;

	@FindBy(name = "pass")
	WebElement p1;

	@FindBy(xpath = "//*[@class='_6ltg']//button")
	WebElement login;

	public Loginwebpage() {

		PageFactory.initElements(driver, this);

	}

	public String validatetitle() {

		return driver.getTitle();
	}

	public Homepage login(String username, String password) {

		u1.sendKeys(username);
		p1.sendKeys(password);

		JavascriptExecutor s1 = (JavascriptExecutor) driver;

		s1.executeScript("arguments[0].click();", login);

		return new Homepage();

	}

}
