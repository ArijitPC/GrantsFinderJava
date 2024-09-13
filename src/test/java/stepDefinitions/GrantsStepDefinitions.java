package stepDefinitions;

import pages.GrantsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class GrantsStepDefinitions {

    WebDriver driver;
    GrantsPage grantsPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        grantsPage = new GrantsPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Given("I am on the grants page")
    public void i_am_on_the_grants_page() {
    driver.get("https://www.nsw.gov.au/grants-and-funding");
    }
    @When("the user selects the business checkbox")
    public void the_user_selects_the_business_checkboxes() throws InterruptedException {
        Thread.sleep(5000);
    grantsPage.selectBusinessCheckbox();
    }

    @Given("I am on the grants pages")
    public void iAmOnTheGrantsPages() {
        
    }

    @When("the user selects the business checkboxes")
    public void theUserSelectsTheBusinessCheckboxes() throws InterruptedException {
        grantsPage.selectBusinessCheckbox();
    }


//    @When("the user applies the filters")
//    public void theUserAppliesTheFilters() {
//        grantsPage.clickApplyFilters();
//    }
//
//    @Then("the user selects the fourth grant result")
//    public void theUserSelectsTheFourthGrantResult() {
//        grantsPage.selectGrantResult(4);
//    }
}
