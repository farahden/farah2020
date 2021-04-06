package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition1 extends WebAPI {
    static HomePage homePage;




        // Cucumber Hook
        @AfterStep
        public void tearDown(Scenario scenario) {
            if (scenario.isFailed()) {
                // Take a screenshot
                final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
            }
        }

        @BeforeStep
        public static void getInit() {
            homePage = PageFactory.initElements(driver, HomePage.class);
        }

        @After
        public void closeBrowser() {
            cleanUp();
        }

        @Given("I am logged in")
        public void i_am_logged_in() throws IOException, InterruptedException {
            openBrowser("https://www.capitalone.com/");
            homePage.enteruserName();
            homePage.enterPassword();
            homePage.clickOnCheckBox();
            homePage.signInButton();
        }
        @Given("I enter a valid UserName")
        public void i_enter_a_valid_user_name() throws InterruptedException {
            homePage.enteruserName();
        }
        @Given("I enter a valid password")
        public void i_enter_a_valid_password() throws InterruptedException {
            homePage.enterPassword();
        }
        @Given("I check the checkBox to keep me sign in")
        public void i_check_the_check_box_to_keep_me_sign_in() throws InterruptedException {
            homePage.clickOnCheckBox();
        }
        @When("I click on sign In")
        public void i_click_on_sign_in() throws InterruptedException {
            homePage.signInButton();
        }
        @Then("I should see my account opened")
        public void i_should_see_my_account_opened() {
        }
////////////////////////////******************************///////////////////////////////////
//      @Given("I enter invalid password")
//     public void I_enter_invalid_password() throws InterruptedException {
//           homePage.WrongPassword();
//       }
//       @Given("I enter invalid password")
//        public void i_enter_invalid_password() throws InterruptedException {
//           homePage.WrongPassword();
//
//          }
//
//       @Then("I should not to be able to sign in")
//       public void i_should_not_to_be_able_to_sign_in() {
//       }
///////////////////////////////////////////////////////****************************************/////////////////////////////////////////

        //Scenario: Recent transaction
        @Given("I am at Capital one homePage")
        public void i_am_at_capital_one_home_page() throws IOException, InterruptedException {
            openBrowser("https://myaccounts.capitalone.com/accountSummary");
            homePage.enteruserName();
            homePage.enterPassword();
            homePage.signInButton();
        }


        @And("I mouse hover to past transaction")
        public void i_mouse_hover_to_past_transaction() throws InterruptedException {
            homePage. viewTheAccountM();
        }
        @When("I click On pending")
        public void i_click_on_pending() throws InterruptedException {
            homePage.ZelleM();
        }
        @Then("I should see all the pending Transaction")
        public void i_should_see_all_the_pending_transaction() throws InterruptedException {
            homePage.sendMoneyMe();
        }
        @Given("I enter a valid Email and I enter Amount")
        public void i_enter_a_valid_email_and_i_enter_amount() throws InterruptedException{
            homePage.EmailFieldMe();
        }
        @Given("I check the checkBox and I click agree")
        public void i_check_the_check_box_and_i_click_agree() throws InterruptedException{
            homePage.AmountFieldMe();
        }
        @When("I click on continue")
        public void i_click_on_continue() throws InterruptedException{
            homePage.ContinueButtonMe();
        }
        @Then("I should see the transaction pending")
        public void i_should_see_the_transaction_pending() throws InterruptedException{
        }
        ///////////////////////////////////////////***************************************//////////////////////////////////////
        @Given("I mouse hover to Account and click")
        public void i_mouse_hover_to_account_and_click() throws InterruptedException{
            homePage.accountM();
        }
        @Given("I mouse hover to profile and click")
        public void i_mouse_hover_to_profile_and_click() throws InterruptedException{
            homePage.ProfileM();
        }
        @Given("I mouse hover to address and click")
        public void i_mouse_hover_to_address_and_click() throws InterruptedException{
            homePage.MAddress();
            homePage.EditAddMe();
        }
        @Given("I enter a valid address and a valid and a valid Zip code")
        public void i_enter_a_valid_address_and_a_valid_and_a_valid_zip_code()throws InterruptedException {
            homePage.streetM();
            homePage.zipCode();
        }
        @When("I click on save")
        public void i_click_on_save() throws InterruptedException{
        }

        @Then("I should see the new address saved on my account")
        public void i_should_see_the_new_address_saved_on_my_account()throws InterruptedException {
        }
        /////////////////////////************************************///////////////////////////////////////////
        @Given("I mouse hover to sign out")
        public void i_mouse_hover_to_sign_out() {
        }
        @When("I click on sign Out")
        public void i_click_on_sign_out() {
        }
        @Then("I should see the new the general Capital One homepage")
        public void i_should_see_the_new_the_general_capital_one_homepage() {
        }
        ////////////////\\\\\\\\\\\\\\\\\\\\\****************************//////////////////////////////\\\\\\\\\\\\\\\\
        @Given("I scroll all the way down to the footer")
        public void i_scroll_all_the_way_down_to_the_footer() {
        }
        @Given("I mouse hover to Instagram logo")
        public void i_mouse_hover_to_instagram_logo() {

        }
        @When("I click on the Instagram logo")
        public void i_click_on_the_instagram_logo() {

        }
        @Then("I should see a new tab landed properly")
        public void i_should_see_a_new_tab_landed_properly() {

        }
        @Then("I should see the  Capital One Instagram page landed properly")
        public void i_should_see_the_capital_one_instagram_page_landed_properly() {
        }
        //////\\\\\\\\\\\************************\\\\\\\\\\\\\\\\\////////////////////
        @Given("I mouse hover to Tweeter logo")
        public void i_mouse_hover_to_tweeter_logo() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @When("I click on the Tweeter  logo")
        public void i_click_on_the_tweeter_logo() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("I should see the  Capital One Tweeter page landed properly")
        public void i_should_see_the_capital_one_tweeter_page_landed_properly() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        ////////////////////////****************************////////////////////////////
        @Given("I mouse hover to FaceBook logo")
        public void i_mouse_hover_to_face_book_logo() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @When("I click on the FaceBook  logo")
        public void i_click_on_the_face_book_logo() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("I should see the  Capital One FaceBook page landed properly")
        public void i_should_see_the_capital_one_face_book_page_landed_properly() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        ////////////////////////////************************************////////////////////////////////////
//
        @Given("I am at Capital one homepage")
        public void I_am_at_Capital_one_homepage() throws IOException {
            openBrowser("https://www.capitalone.com/");
        }

        @Given("I double click on Credit Cards")
        public void i_double_click_on_credit_cards() throws InterruptedException {
            homePage.creditCardsMe();
        }

        @Given("I mouse hover to subMenu")
        public void i_mouse_hover_to_sub_menu() throws InterruptedException {
            homePage.CompareMe();
        }

        @Given("double click on compare Credit Cards")
        public void double_click_on_compare_credit_cards() throws InterruptedException {
            homePage.CompareMe();
        }

        @When("I check {string} {string} {string} {string}")
        public void i_check(String string, String string2, String string3, String string4) throws InterruptedException {
            homePage.MeKeyWord1();
            homePage.KeyWord2Me();
            homePage.KeyWord3Me();
        }

        @Then("I should see all options are landed automatically")
        public void i_should_see_all_options_are_landed_automatically() {

        }


        @Then("I should see Capital One Logo is displayed")
        public void i_should_see_capital_one_logo_is_displayed() {

        }
        ////////////////////////////////////**************************************************//////////////////////////////////////


        @Given("I scroll down to New COVID-{int} updates")
        public void i_scroll_down_to_new_covid_updates(Integer int1) {
        }

        @When("I click on view Up Dates")
        public void i_click_on_view_up_dates() {

        }

        @Then("I should see a new page landed properly")
        public void i_should_see_a_new_page_landed_properly() {

        }

        ///////////////////////////////**********************************************///////////////////////////////
        @Given("I mouse hover to left bottom of the screen")
        public void i_mouse_hover_to_left_bottom_of_the_screen() {

        }

        @Given("I click on feed Back")
        public void i_click_on_feed_back() {

        }

        @Given("I click om general feedBack")
        public void i_click_om_general_feed_back() {

        }

        @When("I select Emogy")
        public void i_select_emogy() {

        }

        @Then("I should see multiple feedBack options appear under it")
        public void i_should_see_multiple_feed_back_options_appear_under_it() {

        }
//////////////////////////////************************************************//////////////////////////////

        @Given("I connect to my account")
        public void I_connect_to_my_account() throws IOException, InterruptedException {
            openBrowser("https://www.capitalone.com/");
            homePage.enteruserName();
            homePage.enterPassword();
            homePage.clickOnCheckBox();
            homePage.signInButton();
            sleepFor(15);
        }

        //       @Given("I mouse hover to the up right of the page")
//       public void i_mouse_hover_to_the_up_right_of_the_page() {
//
//       }
        @Given("I click on Location")
        public void i_click_on_location() throws InterruptedException {
            homePage.LocationMe();
        }
        @Given("I enter a zip code")
        public void i_enter_a_zip_code() throws InterruptedException {
            homePage.TheZipCodeMe();
        }
        @When("I click on searchButton")
        public void i_click_on_search_button() throws InterruptedException {
            homePage.SearchButton();
        }
        @Then("I should see all Capital One ATM location")
        public void i_should_see_all_capital_one_atm_location() {

        }

    @Given("I am at the home page of Capital One")
    public void iAmAtTheHomePageOfCapitalOne() throws IOException {
        openBrowser("https://www.capitalone.com/");
    }
}

