package SeleniumTestforCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class seleniumTest2 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\L E N O V O\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		System.out.print("LogIn Successfully");
		Select products = new Select(driver.findElement(By.className("product_sort_container")));
		products.selectByVisibleText("Price (low to high)");
		Thread.sleep(4000);
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Sauce Labs Onesie']")).click();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		Thread.sleep(4000);
		System.out.print("User is at Sauce Lab Onesie details page");
		driver.quit();

	}
}
