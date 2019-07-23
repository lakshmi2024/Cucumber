package case1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1StepDefn {
WebDriver driver;
	@Given("Open the application")
	public void open_the_application() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\Selium 3.0\\ChromeDriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("Click on signup")
	public void click_on_signup() {
	    driver.findElement(By.linkText("SignUp")).click();
	}

	@When("Enter username as {string}")
	public void enter_username_as(String uname) {
	    driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@When("enter first name as {string}")
	public void enter_first_name_as(String fname) {
	    driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@When("enter last name as {string}")
	public void enter_last_name_as(String lname) {
	    driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@When("enter password as {string}")
	public void enter_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("confirm password as {string}")
	public void confirm_password_as(String cpwd) {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
	}

	@When("choose gender")
	public void choose_gender() {
	    List<WebElement> gender=driver.findElements(By.name("gender"));
	    gender.get(1).click();
	}

	@When("enter email as {string}")
	public void enter_email_as(String mail) {
		driver.findElement(By.name("emailAddress")).sendKeys(mail);
	}

	@When("enter mobile number as {string}")
	public void enter_mobile_number_as(String mob) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mob);
	}

	@When("enter dob as {string}")
	public void enter_dob_as(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@When("enter address as {string}")
	public void enter_address_as(String add) {
		driver.findElement(By.name("address")).sendKeys(add);
	}

	@When("choose security question")
	public void choose_security_question() {
		WebElement security=driver.findElement(By.name("securityQuestion"));
		Select s=new Select(security);
		s.selectByIndex(1);
	}

	@When("enter answer")
	public void enter_answer() {
		driver.findElement(By.name("answer")).sendKeys("blue");
	}

	@Then("click register")
	public void click_register() {
		driver.findElement(By.name("Submit")).click();
		driver.close();
	}


}
