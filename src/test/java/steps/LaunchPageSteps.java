package steps;

import PageObjects.CreateTaskPage;
import PageObjects.LaunchPage;
import PageObjects.TasksListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

import java.net.MalformedURLException;

public class LaunchPageSteps extends TestBase {

    LaunchPage launchPage;

    @Given("Appium server and simulator with application type iOS started")
    public void setUpIosTask() throws MalformedURLException {
        iOS_setUp();
        launchPage = new LaunchPage (driver);
    }

    @When("I print login button name")
    public void printLoginButtonName() {
        System.out.println("IOS BUTTON NAME: " + launchPage.getLogInButtonName());
    }

    @Then("I click login button")
    public void clickSave() {
        launchPage.clickLogInButton();
    }

    @Then("^I confirm tests completed with result (.+)$")
    public void confitmTests(String result) {
        System.out.println("CUCUMBER TESTS PASSED WITH RESULT: " + result);

    }
}
