package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	@Given("^User is on google search$")
    public void user_is_on_google_search() throws Throwable {
    }
	@Given("^Browser object is created$")
    public void browser_object_is_created() throws Throwable {
        System.out.println("Browser Object is created");
    }

    @When("^Browser is launched$")
    public void browser_is_launched() throws Throwable {
        System.out.println("Browser is launched");
    }

    @Then("^Selenium is ready to be used$")
    public void selenium_is_ready_to_be_used() throws Throwable {
        System.out.println("Selenium object is attachded");
    }
    
    @When("^User enters data to serach$")
    public void user_enters_data_to_serach() throws Throwable {
    }

    @Then("^Information relavent to search is reflected$")
    public void information_relavent_to_search_is_reflected() throws Throwable {
    }

    @And("^clicks on search$")
    public void clicks_on_search() throws Throwable {
    }
    
    @When("^User enters \"([^\"]*)\" to serach$")
    public void user_enters_something_to_serach(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }
    
    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {
         System.out.println();
    }

    @When("^User enters userName and password$")
    public void user_enters_username_and_password(DataTable dataTable) throws Throwable {
    	List<List<String>> data = dataTable.asLists();
         System.out.println(data.get(0).get(0));
         System.out.println(data.get(0).get(1));
    }

    @Then("^User is loged in successfully$")
    public void user_is_loged_in_successfully() throws Throwable {
         System.out.println();
    }

    @And("^clicks on login$")
    public void clicks_on_login() throws Throwable {
         System.out.println();
    }
    @When("^User enters userName as : (.+) and password as : (.+)$")
    public void user_enters_username_as_and_password_as_(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }
}
