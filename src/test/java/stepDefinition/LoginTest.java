package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.vtiger.genericUtils.FileUtility;
import com.crm.vtiger.genericUtils.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	FileUtility fLib;
	WebDriverUtility wLib;

	@Given("i will launch {string} browser")
	public void i_will_launch_browser(String BROWSER) throws Throwable {
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
	}
	@Given("enter the url {string}")
	public void enter_the_url(String string) throws Throwable {
		driver.get("http://localhost:8888/");
		
	}
	@When("login page is displayed enter the username {string} and password {string}")
	public void login_page_is_displayed_enter_the_username_and_password(String string, String string2) throws Throwable {
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	}
	@When("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("submitButton")).click();
		
	}
	@When("Home page is displayed click on organixaition link")
	public void home_page_is_displayed_click_on_organixaition_link() {
		driver.findElement(By.xpath("//td[.='Organizations']")).click();
	}
	@When("Click on create new oraganiation")
	public void click_on_create_new_oraganiation() {
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    
	}

	@Given("click on create new organization")
	public void click_on_create_new_organization() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("lick on create new organization")
	public void lick_on_create_new_organization() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@When("Enter organization name,phhone,websiet ad employees")
	public void enter_organization_name_phhone_websiet_ad_employees(String string) {
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("sohan");
	}
	@When("click on save button")
	public void click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("verify the organization name, phone, website and employees")
	public void verify_the_organization_name_phone_website_and_employees() {
		
	}
	@Then("verify organization {string} create or not")
	public void verify_organization_create_or_not(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}
	@When("enter the organization name {string} and click on save button")
	public void enter_the_organization_name_and_click_on_save_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("click on signout")
	public void click_on_signout() {
		driver.findElement(By.xpath("//a[@class='drop_down_usersettings' and text()='Sign Out']")).click();
		
	}
}
