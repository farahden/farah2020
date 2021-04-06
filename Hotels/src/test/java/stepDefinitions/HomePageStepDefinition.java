package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class HomePageStepDefinition  extends WebAPI {
    static HomePage homePage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }





    @Given("I open browser")
    public void i_open_browser() {

    }


    @Given("I enter Hotels.com Official site")
    public void i_enter_hotels_com_official_site() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I open the home page")
    public void i_open_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see the message {string} followed with the following link\"https:\\/\\/www.hotels.com\\/page\\/coronavirus-booking-information\\/?pos=HCOM_US&locale=en_US\"")
    public void i_should_see_the_message_followed_with_the_following_link_https_www_hotels_com_page_coronavirus_booking_information_pos_hcom_us_locale_en_us(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Given("I am at hotels home page")
    public void i_am_at_hotels_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I mouse hover to under of menu")
    public void i_mouse_hover_to_under_of_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see the picture is displayed")
    public void i_should_see_the_picture_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

}



    @Given("I scroll down to TOP DESTINATION and I click")
    public void i_scroll_down_to_top_destination_and_i_click() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I mouse hover to Hotels in  paris and I click")
    public void i_mouse_hover_to_hotels_in_paris_and_i_click() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I mouse hover to back button and click two times")
    public void i_mouse_hover_to_back_button_and_click_two_times() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the hotels.com homepage should be landed properly")
    public void the_hotels_com_homepage_should_be_landed_properly() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






    @Given("I mouse hover to menu bar and I click on deals")
    public void i_mouse_hover_to_menu_bar_and_i_click_on_deals() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I enter\"Key West, Florida, United States of America\"")
    public void i_enter_key_west_florida_united_states_of_america() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I enter Check-in date and Check-out date")
    public void i_enter_check_in_date_and_check_out_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I select room and number of persons and I enter age")
    public void i_select_room_and_number_of_persons_and_i_enter_age() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on show deals")
    public void i_click_on_show_deals() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see all deals are posted")
    public void i_should_see_all_deals_are_posted() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Given("I mouse hover to menu bar")
    public void i_mouse_hover_to_menu_bar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I click on things to do")
    public void i_click_on_things_to_do() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("mouse hover to top {int} cities")
    public void mouse_hover_to_top_cities(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see the top 50cities hotels ordered by alphabetic order")
    public void i_should_see_the_top_50cities_hotels_ordered_by_alphabetic_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






    @Given("I scroll down to the footer")
    public void i_scroll_down_to_the_footer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I mouse hover to all countries")
    public void i_mouse_hover_to_all_countries() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I click on algeria")
    public void i_click_on_algeria() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on sofitel algiers Hamma")
    public void i_click_on_sofitel_algiers_hamma() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("a pop up widow open")
    public void a_pop_up_widow_open() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click continue")
    public void i_click_continue() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be able to see all old customers reviews and shared pictures")
    public void i_should_be_able_to_see_all_old_customers_reviews_and_shared_pictures() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
