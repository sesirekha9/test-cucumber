package definition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definitiont {
		
	String url="https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	
	
	@Given("I should be in the login page")
	public void i_should_be_in_the_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get(url);
	}
	@When("Enter username {string}")
	public void enter_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
		
	}
	@When("Enter password {string}")
	public void enter_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}
	@Then("click on the submitbutton")
	public void click_on_the_submitbutton() {
		driver.findElement(By.name("submit")).click();
		driver.close();
	}
}
