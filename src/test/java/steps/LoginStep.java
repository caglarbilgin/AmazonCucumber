package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import mapping.MapMethodType;
import mapping.Mapper;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginStep extends BaseTest {
    protected static final Logger log = Logger.getLogger(LoginStep.class);


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

        try{
            Assert.assertNotEquals("            Bu e-posta adresiyle bir hesap bulamıyoruz\n",(driver.findElement(Mapper.foundActivity(MapMethodType.CHECK_ELEMENT, login))).getText());
            log.error("Login failed");
        }catch (Exception e){
            log.info("Login successfully!!");
        }

    }

    @After
    public void tearDownStep() throws IOException {
        driver.close();
    }


}
