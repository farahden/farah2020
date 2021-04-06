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
//    @AfterStep
//    public void tearDown(Scenario scenario){
//        if (scenario.isFailed()){
//            // Take a screenshot
//            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
//        }
//    }
//
//    @BeforeStep
//    public static void getInit(){
//        homePage= PageFactory.initElements(driver,HomePage.class);
//    }
//
//    @After
    //public void closeBrowser(){
        //cleanUp();
    //}
    @Given("I am at Delta home page")
    public void i_am_at_delta_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I mouse hover to Search cheap flights")
    public void i_mouse_hover_to_search_cheap_flights() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("click on round trip")
    public void click_on_round_trip() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I click on departure place I enter {string}")
    public void i_click_on_departure_place_i_enter(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I mouse hover to Arrival place and I enter {string}")
    public void i_mouse_hover_to_arrival_place_and_i_enter(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I mouse hover to period and I select from calendar")
    public void i_mouse_hover_to_period_and_i_select_from_calendar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I mouse hover to passengers and I select {string}")
    public void i_mouse_hover_to_passengers_and_i_select(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on search")
    public void i_click_on_search() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see many options")
    public void i_should_see_many_options() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






//    @Given("I am at Delta home Page")
//    public void i_am_at_delta_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @Given("I scroll down to Sub menu")
    public void i_scroll_down_to_sub_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I mouse hover to hotels and double click it")
    public void i_mouse_hover_to_hotels_and_double_click_it() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I enter\"Cali\" and I drop down to {string} and hit enter")
    public void i_enter_cali_and_i_drop_down_to_and_hit_enter(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see a new page landed properly")
    public void i_should_see_a_new_page_landed_properly() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Given("I mouse hover to the advertisement")
    public void i_mouse_hover_to_the_advertisement() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I click on close advertisement")
    public void i_click_on_close_advertisement() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on not interested")
    public void i_click_on_not_interested() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see {string}")
    public void i_should_see(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





//    @Given("I am at Delta home page")
//    public void i_am_at_delta_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @Given("I mouse hover to rent a Cars and I click")
    public void i_mouse_hover_to_rent_a_cars_and_i_click() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I enter New York City")
    public void i_enter_new_york_city() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I choose PICK-UP DATE and from the  calendar and I hit enter")
    public void i_choose_pick_up_date_and_from_the_calendar_and_i_hit_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I choose DROP-OFF DATE from the  calendar and I hit enter")
    public void i_choose_drop_off_date_from_the_calendar_and_i_hit_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I choose PICK-UP time and from the  calendar and I hit enter")
    public void i_choose_pick_up_time_and_from_the_calendar_and_i_hit_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I choose DROP-OFF time from the  calendar and I hit enter")
    public void i_choose_drop_off_time_from_the_calendar_and_i_hit_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on Book a car")
    public void i_click_on_book_a_car() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see all cars available for that date")
    public void i_should_see_all_cars_available_for_that_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






    @Given("I am at Delta home Page")
//    public void i_am_at_delta_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @Given("I mouse hover to VacationDeals and  click")
    public void i_mouse_hover_to_vacation_deals_and_click() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I mouse hover to the menu")
    public void i_mouse_hover_to_the_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on shop this deal")
    public void i_click_on_shop_this_deal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("it should take me to all places with same deal")
    public void it_should_take_me_to_all_places_with_same_deal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





    @Given("I mouse hover to Updated bag and travel fees and I click")
    public void i_mouse_hover_to_updated_bag_and_travel_fees_and_i_click() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I click on Baggage info")
    public void i_click_on_baggage_info() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on Checked Baggage")
    public void i_click_on_checked_baggage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see a list under it")
    public void i_should_see_a_list_under_it() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }







    @Given("scroll down to the left bottom of the page")
    public void scroll_down_to_the_left_bottom_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I click on feedback")
    public void i_click_on_feedback() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I select five stars")
    public void i_select_five_stars() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I check other")
    public void i_check_other() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I enter {string}")
    public void i_enter(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on submit")
    public void i_click_on_submit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see pop up window post following message\"thank you we appreciate your feedback \"")
    public void i_should_see_pop_up_window_post_following_message_thank_you_we_appreciate_your_feedback() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
