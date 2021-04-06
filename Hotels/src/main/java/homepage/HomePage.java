package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
//    @FindBy(how = How.ID, using =searchBoxLocator ) public WebElement searchBox;
//    @FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;
//    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;
//    @FindBy (how = How.XPATH, using =helloSignInLocator ) public WebElement helloSignIn;
//    @FindBy (how = How.XPATH, using =emailPhoneForSignInLocator ) public WebElement emailPhoneForSignIn;
//    @FindBy (how = How.XPATH, using =passwordForSignInLocator ) public WebElement passwordForSignIn;
//    @FindBy (how = How.XPATH, using =continueForSignInLocator ) public WebElement continueForSignIn;
//    @FindBy (how = How.XPATH, using =signInSubmitLocator ) public WebElement signInSubmit;
//    @FindBy (how = How.XPATH, using =helloUserLocator ) public WebElement helloUser;
//    @FindBy (how = How.XPATH, using =errorMessageLocator ) public WebElement errorMessage;
//    @FindBy (how = How.XPATH, using =customerNameLocator ) public WebElement customerName;
//    @FindBy (how = How.XPATH, using =createYourAmazonAccountLocator ) public WebElement createYourAmazonAccount;
//
//
//
//
//    public void enterProductName( String productName){
//        searchBox.sendKeys(productName);
//    }
//
//    public void clickOnSearchButton(){
//        searchButton.click();
//    }
//
//    public void verifySearchResult(String expectedText){
//        String actualText=searchText.getText();
//        Assert.assertEquals("Product does not match",expectedText,actualText);
//    }
//
//    public void verifySearchResultNotMatch(String expectedText){
//        String actualText=searchText.getText();
//        Assert.assertNotEquals("Product does not match",expectedText,actualText);
//    }
//
//    public void verifyPageTitle(String expectedText){
//        String actualText=driver.getTitle();
//        Assert.assertEquals("Page Title not match",expectedText,actualText);
//    }
//
//    public void clickOnHelloSignIn(){
//        helloSignIn.click();
//    }
//    public void enterEmailPhone( String emailPhone){
//        emailPhoneForSignIn.sendKeys(emailPhone);
//    }
//
//    public void clickOnContinueForSignIn(){
//        continueForSignIn.click();
//    }
//    public void enterPasswordForSignIn( String password){
//        passwordForSignIn.sendKeys(password);
//    }
//    public void clickOnSignInSubmit(){
//        signInSubmit.click();
//    }
//
//    public void verifyUserLoggedIn(String expectedText){
//        String actualText=helloUser.getText();
//        Assert.assertEquals("Product does not match",expectedText,actualText);
//    }
//    public void verifyErrorMessage(String expectedText){
//        String actualText=errorMessage.getText();
//        Assert.assertEquals("Product does not match",expectedText,actualText);
//    }
//
//    public void enterCustomerName( String name){
//        customerName.sendKeys(name);
//    }
//
//    public void clickOnCreateYourAmazonAccount(){
//        createYourAmazonAccount.click();
//    }
//

    @FindBy (how = How.XPATH, using = hotelsURL) public WebElement HotelsURL;
    @FindBy (how = How.XPATH, using = TheMSG) public WebElement TheMessage ;
    @FindBy (how = How.XPATH, using = linkBellow) public WebElement link;
    public void HotelsURL() throws InterruptedException {
        sleepFor(2);HotelsURL.click();
    }
    public void TheMessage () throws InterruptedException {
        sleepFor(2);TheMessage.isDisplayed();
    }
    public void link() throws InterruptedException {
        sleepFor(2);link.isEnabled();
    }
  //////////////////////***********************************//////////////////////////////////////
    @FindBy (how = How.XPATH, using = homePagePic) public WebElement homePagePicture ;
    public void homePagePicture() throws InterruptedException {
        sleepFor(2);
        homePagePicture.isDisplayed();
    }
    ///////////////////***************************************//////////////////////////
    @FindBy (how = How.XPATH, using =TopDestination ) public WebElement topDestination ;
    @FindBy (how = How.XPATH, using = HotelsInParis) public WebElement hotelsInParis ;
    @FindBy (how = How.XPATH, using = BackButton) public WebElement backButton;
    public void topDestination() throws InterruptedException {
        sleepFor(2);
        topDestination.click();
    }
    public void hotelsInParis() throws InterruptedException {
        sleepFor(2);
        hotelsInParis.click();
    }
    public void backButton() throws InterruptedException {
        sleepFor(2);
        backButton.click();
    }
    //////////////////////////////////////////*************************************////////////////////////////
    @FindBy (how = How.XPATH, using = menuBar) public WebElement MenuBar ;
    @FindBy (how = How.XPATH, using = place) public WebElement places;
    @FindBy (how = How.XPATH, using = keyWord) public WebElement KeyWord;
    @FindBy (how = How.XPATH, using = CheckInDate) public WebElement checkInDate ;
    @FindBy (how = How.XPATH, using = CheckOutDate) public WebElement checkOutDate ;
    @FindBy (how = How.XPATH, using = RoomNum) public WebElement roomNum ;
    @FindBy (how = How.XPATH, using = Persons) public WebElement persons ;
    @FindBy (how = How.XPATH, using = showDeals ) public WebElement ShowDeals;
    public void MenuBarMe() throws InterruptedException {
        sleepFor(2);
        MenuBar.isDisplayed();
    }
    public void placesMe() throws InterruptedException {
        sleepFor(2);
        places.click();
    }
    public void KeyWordMe() throws InterruptedException {
        sleepFor(2);
        KeyWord.sendKeys("California");
    }
    public void checkInDateMe() throws InterruptedException {
        sleepFor(2);
        checkInDate.sendKeys();
    }
    public void checkOutDate() throws InterruptedException {
        sleepFor(2);
        checkOutDate.sendKeys();
    }
    public void roomNum() throws InterruptedException {
        sleepFor(2);
        roomNum.sendKeys();
    }
    public void persons() throws InterruptedException {
        sleepFor(2);
        persons.sendKeys();
    }
    public void ShowDeals() throws InterruptedException {
        sleepFor(2);
        ShowDeals.sendKeys();
    }
    /////////////////////////*********************************////////////////////////////
    @FindBy (how = How.XPATH, using =thingsToDo ) public WebElement ThingsToDo ;
    @FindBy (how = How.XPATH, using = top50Cities) public WebElement Top50Cities;
    public void ThingsToDoMe () throws InterruptedException {
        sleepFor(2);
        ThingsToDo.click();
    }
    public void Top50CitiesMe() throws InterruptedException {
        sleepFor(2);
        Top50Cities.click();
    }
    ///////////////////////*************************///////////////////////
    @FindBy (how = How.XPATH, using =allCountries ) public WebElement AllCountries ;
    @FindBy (how = How.XPATH, using =Algeria ) public WebElement dz ;
    @FindBy (how = How.XPATH, using = sofitel) public WebElement Sofitel;
    @FindBy (how = How.XPATH, using = ToContinue) public WebElement toContinue;
    @FindBy (how = How.XPATH, using = Picture) public WebElement picture ;
    @FindBy (how = How.XPATH, using =Picture2 ) public WebElement secondPicture ;
    public void AllCountriesMe() throws InterruptedException {
        sleepFor(2);
        AllCountries.click();
    }
    public void algeria () throws InterruptedException {
        sleepFor(2);
        dz.click();
    }
    public void SofitelMe() throws InterruptedException {
        sleepFor(2);
        Sofitel.click();
    }
    public void toContinueMe() throws InterruptedException {
        sleepFor(2);
        toContinue.click();
    }
    public void picture () throws InterruptedException {
        sleepFor(2);
        picture.click();
    }
    public void secondPicture() throws InterruptedException {
        sleepFor(2);
        secondPicture.click();
    }
//////////////*****************************//////////////////////
}
