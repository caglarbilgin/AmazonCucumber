package steps;

import base.BaseTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import mapping.MapMethodType;
import mapping.Mapper;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Map;

public class LoginStep extends BaseTest {


    @Given("^Go to homepage$")
    public void goToHomepage() throws Throwable {
        setUp();
    }

    @And("^Click \"([^\"]*)\" button$")
    public void clickButton(String button){
        driver.findElement(Mapper.foundActivity(MapMethodType.CLICK_ELEMENT,button)).click();
    }

    @And("^Enter the \"([^\"]*)\" send key \"([^\"]*)\" and \"([^\"]*)\" send key \"([^\"]*)\"$")
    public void enterTheSendKeyAndSendKey(String usernameInput, String username, String passwordInput, String password) {
        WebElement user = driver.findElement(Mapper.foundActivity(MapMethodType.INPUT_ELEMENT, usernameInput));
        user.sendKeys(username);
        WebElement pass = driver.findElement(Mapper.foundActivity(MapMethodType.INPUT_ELEMENT, passwordInput));
        pass.sendKeys(password);


    }

    @Then("^Check the \"([^\"]*)\" information is correct$")
    public void checkTheInformationIsCorrect(String login) {
        Assert.assertEquals("Önemli Mesaj!",(driver.findElement(Mapper.foundActivity(MapMethodType.CHECK_ELEMENT, login)).getText()));
    }

    @After
    public void tearDownStep() throws IOException {
        driver.close();
    }


}
