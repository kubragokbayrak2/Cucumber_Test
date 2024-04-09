package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSelect2Products {

  private WebDriver driver;

  private ElementsPage elementsPage;
  private RegisterPage registerPage;





    public TestSelect2Products(Base base) {
        this.driver = base.driver;

        elementsPage = new ElementsPage(driver);
        registerPage = new RegisterPage(driver);

    }



    @Given("I access the elements page")
    public void i_access_the_elements_page () {

        driver.get("https://demoqa.com/elements");
    }

    @Given("I access web tables")
    public void i_access_the_web_tables_page () {

        driver.get("https://demoqa.com/webtables");
    }

    @When("I click on the butons and click on click me button")
    public void i_click_on_the_product_category_T () {
        elementsPage.clickButtonsTab();
        elementsPage.clickClickMeBtn();
    }


    @Then("I read the text")
    public void i_select_the_product1_T ()  {

        elementsPage.read_click_btn_msg(); }

    @And("I click on add user button")
    public void clickAddUserBtn(){
        registerPage.clickAddUserBtn();
    }

    @When("I fill the user inputs")
    public void fillIntus(){
        registerPage.registerAUser();
    }

    @Then("I click Submit Button")
    public void clickSubit(){
        registerPage.clickSubmitBtn();
    }
    @And("I click edit button")
    public void clickEdit(){
        registerPage.clickEditBtn();
    }

    @When("I update inputs")
    public void fillInputs(){
        registerPage.UpdateUser();
    }










}
