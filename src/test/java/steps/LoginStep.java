package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import mapping.MapMethodType;
import mapping.Mapper;
import org.junit.After;

import java.io.IOException;

public class LoginStep extends BaseTest {


    @Given("^Go to homepage$")
    public void goToHomepage() throws Throwable {
        setUp();
    }

    @And("^Click \"([^\"]*)\" button$")
    public void clickButton(String loginButton) throws Throwable {
        driver.findElement(Mapper.foundActivity(MapMethodType.CLICK_ELEMENT, loginButton)).click();
    }

    @And("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterTheAnd(String username, String password) throws Throwable {

    }

    @Then("^Check the \"([^\"]*)\" information is correct$")
    public void checkTheInformationIsCorrect(String loginButton) throws Throwable {

    }

    @After
    public void tearDownStep() throws IOException {
        driver.close();
    }
}
