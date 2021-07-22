package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UiSearchStepDefination {
	
	WebDriver driver;
	
	 	@Given("^User is on GreenCart page$")
	    public void user_is_on_greencart_page() throws Throwable {
	 		System.setProperty("webdriver.chrome.driver", "D:\\Install_Station\\ChromeDriver\\chromedriver.exe");
	 		driver = new ChromeDriver();
	 		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	        //throw new PendingException();
	    }

	    @When("^User search for (.+)$")
	    public void user_search_for_veggie(String vegName) throws Throwable {
	        WebElement ele = driver.findElement(By.xpath("//input[@type='search']"));
	        ele.sendKeys(vegName);
	        System.out.println("Succesfully Entered the search value");
	        ele = driver.findElement(By.xpath("//button[@type='submit']"));
	        ele.click();
	        System.out.println("Succesfully clicked on Search");
	    }

	    @Then("^Result of search is displayed (.+)$")
	    public void result_of_search_is_displayed(String vegName) throws Throwable {
	    	Thread.sleep(10000);
	    	 WebElement ele = driver.findElement(By.cssSelector("h4.product-name"));
	    	 if (ele.getText().contains(vegName)) {
				System.out.println("Verified product Cucumber");
			} else {
				throw new Exception("Cucumber product not found");
			}
	    	 driver.quit();
	    }
}