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

import java.io.IOException;

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





    @Given("I am at CNN homepage")
    public void i_am_at_cnn_homepage() throws IOException {
        openBrowser("https://www.cnn.com/");

    }
    @Given("I mouse hover to edition and I click")
    public void i_mouse_hover_to_edition_and_i_click() throws InterruptedException {
     homePage.EditionMe();
    }
    @Given("I drop down to Arabic And I click")
    public void i_drop_down_to_arabic_and_i_click() throws InterruptedException {
     homePage.MethArabicLanguage();
    }
    @When("I click on {string}")
    public void i_click_on(String string) throws InterruptedException {
        homePage.MethMenuBar();
        homePage.MethرياضةTHe();
    }
    @Then("I should see all  sport news displayed on Arabic")
    public void i_should_see_all_sport_news_displayed_on_arabic() {

    }
    //////////////////////********************************//////////////////////////////////////////////
    @When("I mouse hover to CNN logo  and I double click")
    public void i_mouse_hover_to_cnn_logo_and_i_double_click() throws InterruptedException {
        homePage.ThelogoPic();
    }

    @Then("I should see the trending news are Updated")
    public void i_should_see_the_trending_news_are_updated() {

    }
    ////////////////////////////***************************/////////////////////////////
    @When("I drop down to International And I click")
    public void i_drop_down_to_international_and_i_click() throws InterruptedException {
        homePage.international();
    }

    @Then("I should see the page refreshed and posts international news")
    public void i_should_see_the_page_refreshed_and_posts_international_news() {

    }
///////////////////////////**************************///////////////////////////

    @Given("I am at CNN LiveTV page")
    public void i_am_at_cnn_live_tv_page() throws IOException {
    openBrowser("https://go.cnn.com/?stream=cnn");
    }
    @Given("I mouse hover {string}")
    public void i_mouse_hover(String string) throws InterruptedException {
        homePage.liveTVMe();
    }
    @When("I click on the red frame")
    public void i_click_on_the_red_frame() throws InterruptedException {
        homePage.ShowsMe();
    }
    @Then("the CNN home page should be landed properly")
    public void the_cnn_home_page_should_be_landed_properly() {

    }


////////////////////////////////**********************************************///////////////////////////////////////////////

    @Given("I hover over to {string} and I click")
    public void i_hover_over_to_and_i_click(String string) throws InterruptedException {
             homePage.CnnLiveTVPageMe();
    }

    @When("I mouse hover to {string} and I click")
    public void i_mouse_hover_to_and_i_click(String string) throws InterruptedException {
              homePage.BackButtonMe();
    }

    @Then("I should be able to see all TV shows and movies")
    public void i_should_be_able_to_see_all_tv_shows_and_movies() {
    }
}
