package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;
//import static homepage.HomePageWebElement.searchButtonLocator;

public class HomePage extends WebAPI {

// Action Method class
//
//    // Find By Annotation: First Approach
//    @FindBy(how = How.ID, using =searchBoxLocator ) public WebElement searchBox;
//    @FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;
//
//
//    public void enterProductName( String productName){
//        searchBox.sendKeys(productName);
//    }
//
//    public void clickOnSearchButton(){
//        searchButton.click();
//    }

    @FindBy(how = How.XPATH, using =DeltaHomePage ) public WebElement deltaHomePage;
    @FindBy(how = How.XPATH, using =cheapFlights ) public WebElement CheapFlights ;
    @FindBy(how = How.XPATH, using = roundTrip) public WebElement RoundTrip;
    @FindBy(how = How.XPATH, using = departurePlace) public WebElement DeparturePlace;
    @FindBy(how = How.XPATH, using = ArrivalPlace) public WebElement arrivalPlace ;
    @FindBy(how = How.XPATH, using = depatureDate) public WebElement DepatureDate ;
    @FindBy(how = How.XPATH, using = ReturnDate) public WebElement returnDate ;
    @FindBy(how = How.XPATH, using =passengers ) public WebElement Passengers ;
    @FindBy(how = How.XPATH, using = search) public WebElement Search ;
    //////////////////////////////**********************************//////////////////
    public void deltaHomePageMe() throws InterruptedException {
        sleepFor(2);
        deltaHomePage.click();
    }
    public void CheapFlightsMe() throws InterruptedException {
        sleepFor(2);
        CheapFlights.click();
    }
    public void RoundTripMe() throws InterruptedException {
        sleepFor(2);
        RoundTrip.click();
    }
    public void DeparturePlaceMe() throws InterruptedException {
        sleepFor(2);
        DeparturePlace.click();
    }
    public void arrivalPlaceMe() throws InterruptedException {
        sleepFor(2);
        arrivalPlace.click();
    }
    public void DepatureDate() throws InterruptedException {
        sleepFor(2);
        DepatureDate.click();
    }
    public void returnDateMe() throws InterruptedException {
        sleepFor(2);
        returnDate.click();
    }
    public void PassengersMe() throws InterruptedException {
        sleepFor(2);
        Passengers.click();

    }
    public void SearchMe() throws InterruptedException {
        sleepFor(2);
        Search.click();
    }
    //////////////////////////////////**********************************//////////////////////////////////
    @FindBy(how = How.XPATH, using =subMenu ) public WebElement SubMenu;
    @FindBy(how = How.XPATH, using =hotels ) public WebElement Hotels ;
    @FindBy(how = How.XPATH, using = California) public WebElement california;
    @FindBy(how = How.XPATH, using = searchButton) public WebElement SearchButton ;
    public void  SubMenuNe() throws InterruptedException {
        sleepFor(2);
        SubMenu.click();
    }
    public void  HotelsMe() throws InterruptedException {
        sleepFor(2);
        Hotels.click();
    }
    public void  californiaMe() throws InterruptedException {
        sleepFor(2);
        california.click();
    }
    public void  SearchButtonMe() throws InterruptedException {
        sleepFor(2);
        SearchButton.click();
    }
////////////////////////////////////////*****************************************//////////////////////////////////////////////
    @FindBy(how = How.XPATH, using = RentACar) public WebElement rentACar;
    @FindBy(how = How.XPATH, using = ENTERNewYorkCity) public WebElement eNTERNewYorkCity ;
    @FindBy(how = How.XPATH, using =PICKUPDATE ) public WebElement pICKUPDATE;
    @FindBy(how = How.XPATH, using =DROPOFFDATE ) public WebElement dROPOFFDATE ;
    @FindBy(how = How.XPATH, using = PICKUPTime) public WebElement pICKUPTime;
    @FindBy(how = How.XPATH, using = DROPOFFTIME) public WebElement DROPOFFTIMe ;
    @FindBy(how = How.XPATH, using =age ) public WebElement Age;
    @FindBy(how = How.XPATH, using =Agree ) public WebElement agree ;

    public void rentACarMe() throws InterruptedException {
        sleepFor(2);
        rentACar.click();
    }
    public void ENTERNewYorkCityMe() throws InterruptedException {
        sleepFor(2);
        eNTERNewYorkCity.click();
    }
    public void pICKUPDATEMe() throws InterruptedException {
        sleepFor(2);
        pICKUPDATE.click();
    }
    public void dROPOFFDATE() throws InterruptedException {
        sleepFor(2);
        dROPOFFDATE.click();
    }
    public void pICKUPTimeMe() throws InterruptedException {
        sleepFor(2);
        pICKUPTime.click();
    }
    public void DROPOFFTIMe() throws InterruptedException {
        sleepFor(2);
        DROPOFFTIMe.click();
    }
    public void Age() throws InterruptedException {
        sleepFor(2);
        Age.click();
    }
    public void agreeMe() throws InterruptedException {
        sleepFor(2);
        agree.click();
    }
    ////////////////////////////***************************************//////////////////////////////////
    @FindBy(how = How.XPATH, using =VacationDeals ) public WebElement vacationDeals;

    public void vacationDealsMe() throws InterruptedException {
       sleepFor(2);
        vacationDeals.click();
   }
   ///////////////////////////*******************************/////////////////////////////////
     @FindBy(how = How.XPATH, using =UpdatedBagNTravelFees ) public WebElement updatedBagNTravelFees ;
     @FindBy(how = How.XPATH, using = Baggage) public WebElement baggage ;
     @FindBy(how = How.XPATH, using = CheckedBaggage ) public WebElement checkedBaggage;


        public void updatedBagNTravelFeesMe() throws InterruptedException {
        sleepFor(2);
            updatedBagNTravelFees.click();
    }
    public void baggageMe() throws InterruptedException {
        sleepFor(2);
        baggage.click();
    }
    public void checkedBaggageMe() throws InterruptedException {
        sleepFor(2);
        checkedBaggage.click();
    }
   ///////////////////////////////////**********************************////////////////////////////
     @FindBy(how = How.XPATH, using =feedback ) public WebElement Feedback;
    @FindBy(how = How.XPATH, using = fiveStars) public WebElement FiveStars ;
    @FindBy(how = How.XPATH, using =other ) public WebElement Other;
    @FindBy(how = How.XPATH, using =EnterGood ) public WebElement enterGood ;
    @FindBy(how = How.XPATH, using = SubmitButton) public WebElement submitButton;

        public void FeedbackMe() throws InterruptedException {
        sleepFor(2);
            Feedback.click();
    }
    public void FiveStarsMe() throws InterruptedException {
        sleepFor(2);
        FiveStars.click();
    }
    public void OtherMe() throws InterruptedException {
        sleepFor(2);
        Other.click();
    }
    public void enterGoodMe() throws InterruptedException {
        sleepFor(2);
        enterGood.click();
    }
        public void submitButtonMe() throws InterruptedException {
        sleepFor(2);
            submitButton.click();
    }


//    @FindBy(how = How., using = ) public WebElement ;
//    @FindBy(how = How., using = ) public WebElement ;
//    @FindBy(how = How., using = ) public WebElement ;



//    public void () throws InterruptedException {
//        sleepFor(2);
//    }
//    public void () throws InterruptedException {
//        sleepFor(2);
//    }
//    public void () throws InterruptedException {
//        sleepFor(2);
//    }
//    public void () throws InterruptedException {
//        sleepFor(2);
//    }
//////////////////////////*********************************///////////////////////////////////////////
































}
