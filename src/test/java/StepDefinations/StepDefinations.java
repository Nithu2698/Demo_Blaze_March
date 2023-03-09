package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.Laptops;
import PageObjectModel.Phones;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinations 
{

	WebDriver driver ;
	@Given("User must login to home page")
	public void user_must_login_to_home_page()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.demoblaze.com/"); 
		driver.manage().window().maximize();
	}

	@When("User must click on Phone tab")
	public void user_must_click_on_phone_tab() 
	{
	  Phones p = new Phones(driver);
	  p.ClickPhonesTab();
	}

	@When("User must click on selected phone {string}")
	public void user_must_click_on_selected_phone(String string) 
	{
		Phones p = new Phones(driver);
		p.ClickIphone(string);
	}

	@Then("User must verify the phone")
	public void user_must_verify_the_phone() 
	{
		
		Phones p = new Phones(driver);
		p.VerifyingMessagePhone();
	}

	@When("User must click on Laptop tab")
	public void user_must_click_on_laptop_tab() 
	{
	   Laptops l = new Laptops(driver);
	   l.ClickLaptops();
	}

	@When("User must click on selected Laptop {string}")
	public void user_must_click_on_selected_laptop(String string) 
	{
		Laptops l = new Laptops(driver);
		l.ClickLaptopName(string);
	}

	@Then("User must verify the laptop")
	public void user_must_verify_the_laptop() 
	{
		Laptops l = new Laptops(driver);
		l.VerifyLaptop();
	}
}
