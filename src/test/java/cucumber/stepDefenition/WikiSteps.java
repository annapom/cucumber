package cucumber.stepDefenition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by annapo on 7/5/2019.
 */
public class WikiSteps {

    public void initialization() {
        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

    @Given("^user is on wikipedia$")
    public void user_is_on_wikipedia() throws Throwable {
        System.out.println("given!!!");
        //throw new PendingException();
    }

    @When("^user search for anna$")
    public void user_search_for_anna() throws Throwable {
        System.out.println("when!!!");
        //throw new PendingException();
    }

    @Then("^user can not find Reference$")
    public void user_can_not_find_Reference() throws Throwable {
        System.out.println("then!!!");
        //throw new PendingException();
    }
}
