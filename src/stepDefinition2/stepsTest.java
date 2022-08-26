package stepDefinition2;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;

public class stepsTest {
	
	WebDriver driver = null;
	
	@Given("User is in new tab of Google Chrome")
	public void user_is_in_new_tab_of_google_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\L E N O V O\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
	}

	@When("User navigate to LogIn Page")
	public void user_navigate_to_log_in_page() throws Throwable {
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
	}

	@And("User enters UserName and Password")
	public void user_enters_user_name_and_password() throws Throwable {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() throws Throwable {
		System.out.print("LogIn Successfully");
	}

	@When("User navigate in homepage")
	public void user_navigate_in_homepage() throws InterruptedException {
		Select products = new Select(driver.findElement(By.className("product_sort_container")));
		products.selectByVisibleText("Price (low to high)");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
	}

	@And("User clicks on product")
	public void user_clicks_on_product() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Sauce Labs Onesie']")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.quit();
	}

	@Then("User should be in product details page")
	public void user_should_be_in_product_details_page() {
		System.out.print("User is at Sauce Lab Onesie details page");
	}

}
