package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

//import static homepage.HomePageWebElement.searchBoxLocator;
//import static homepage.HomePageWebElement.searchButtonLocator;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
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

    //Scenario:log in
    @FindBy(how = How.XPATH, using = CapitalOneHomepage) public WebElement capitalOneHomepage ;
    @FindBy(how = How.XPATH,using = UserName)public WebElement userName;
    @FindBy(how = How.XPATH, using = password) public WebElement Password  ;
    @FindBy(how = How.XPATH, using =checkBox ) public WebElement CheckBox  ;
    @FindBy(how = How.XPATH, using =signIn ) public WebElement SignIn ;

    public void enteruserName() throws InterruptedException {
        sleepFor(2);
        userName.sendKeys("farahden");
         sleepFor(2);
    }
    public void enterPassword() throws InterruptedException {
        Password.sendKeys("liloufarah1120");
        sleepFor(1);

    }
    public void clickOnCheckBox() throws InterruptedException {
        CheckBox.click();
        sleepFor(2);

    }
    public void signInButton() throws InterruptedException {
        SignIn.click();
        sleepFor(2);

    }

//Scenario:log in with wrong user name
    @FindBy(how = How.XPATH, using =UserName ) public WebElement WrongUserName  ;
    @FindBy(how = How.XPATH, using = password) public WebElement  WrongPassword;
    public void WrongUserNameMethod() throws InterruptedException {
        sleepFor(3);
        WrongUserName.sendKeys("farah");
    }
    public void WrongPassword() throws InterruptedException {
        sleepFor(2);
        WrongPassword.sendKeys("larbi");
    }



    @FindBy(how = How.XPATH, using =transaction ) public WebElement Transaction ;
    @FindBy(how = How.XPATH, using = pending) public WebElement  Pending;
    public void TransactionMeth() throws InterruptedException {
        sleepFor(2);
        Transaction.click();
    }
    public void PendingMeth() throws InterruptedException {
        sleepFor(3);
        Pending.click();
    }


    @FindBy(how = How.XPATH, using =viewAccount ) public WebElement viewTheAccount  ;
    @FindBy(how = How.XPATH, using =zelle ) public WebElement Zelle  ;
    @FindBy(how = How.XPATH, using = sendMoney) public WebElement SendMoney  ;
    @FindBy(how = How.XPATH, using = Email) public WebElement EmailField  ;
    @FindBy(how = How.XPATH, using = Amount) public WebElement AmountField  ;
    @FindBy(how = How.XPATH, using = continueButton) public WebElement ContinueButton  ;

    public void viewTheAccountM() throws InterruptedException {
        sleepFor(2);
        viewTheAccount.click();}
        public void ZelleM() throws InterruptedException {
        sleepFor(2);
        Zelle.click();
    }
    public void sendMoneyMe() throws InterruptedException {
        sleepFor(2);
        SendMoney.click();
    }
    public void EmailFieldMe() throws InterruptedException {
        sleepFor(2);
        EmailField.sendKeys("dendounefarha@gmail.com");
    }
   public void AmountFieldMe() throws InterruptedException {
        sleepFor(2);
       AmountField.sendKeys("1000");
   }
   public void ContinueButtonMe() throws InterruptedException {
        sleepFor(2);
       ContinueButton.click();
   }
   ///////////////////////////////////////////

    @FindBy(how = How.CSS, using =Account ) public WebElement account ;
    @FindBy(how = How.XPATH, using =profile ) public WebElement Profile  ;
    @FindBy(how = How.XPATH, using =address ) public WebElement Address ;
    @FindBy(how = How.CSS, using = EditAddCSS) public WebElement EditAdd ;
    @FindBy(how = How.XPATH, using = Street) public WebElement street ;
    @FindBy(how = How.XPATH, using =Apartment ) public WebElement Apartments ;
    @FindBy(how = How.XPATH, using =ZipCode ) public WebElement zipCode ;
    @FindBy(how = How.XPATH, using =state ) public WebElement State ;
    @FindBy(how = How.XPATH, using = City) public WebElement city ;
    @FindBy(how = How.XPATH, using =Save ) public WebElement save ;
    public void  accountM()throws InterruptedException{
        sleepFor(2);
        account.click();
    }
    public void ProfileM() throws InterruptedException {
        sleepFor(2);
        Profile.click();
    }
    public void MAddress() throws InterruptedException{
        sleepFor(2);
        Address.click();
    }
    public void EditAddMe() throws InterruptedException{
        sleepFor(2);
        EditAdd.click();
    }
    public void streetM()throws InterruptedException{
        sleepFor(2);
        street.sendKeys("934 Pavonia Ave Apt 06");
    }
    public void ApartmentsM()throws InterruptedException{
        sleepFor(2);
        Apartments.sendKeys("Ap 06");
    }
    public void zipCode()throws InterruptedException{
        sleepFor(2);
        zipCode.sendKeys("07306");
    }
    public void State()throws InterruptedException{
        sleepFor(2);
        State.sendKeys("New Jersey");
    }
    public void city()throws InterruptedException{
        sleepFor(2);
        city.sendKeys("Jersey City");
    }
    public void save()throws InterruptedException{
        sleepFor(2);
        save.click();
    }
    /////////////////////////////////

    @FindBy(how = How.XPATH, using =CreditCards ) public WebElement creditCards  ;
    @FindBy(how = How.XPATH, using = compare) public WebElement Compare ;
    @FindBy(how = How.XPATH, using = Keyword1) public WebElement  KeyWord1;
    @FindBy(how = How.XPATH, using = Keyword2 ) public WebElement KeyWord2  ;
    @FindBy(how = How.XPATH, using= Keyword3 ) public WebElement KeyWord3 ;
    @FindBy(how = How.XPATH, using = Keyword4) public WebElement KeyWord4  ;
    public void creditCardsMe()throws InterruptedException {
        sleepFor(2);
        creditCards.click();
    }
    public void  CompareMe() throws InterruptedException {
     sleepFor(2);
        Compare.click();
    }
    public void MeKeyWord1() throws InterruptedException{
        sleepFor(2);
        KeyWord1.click();
    }
    public void KeyWord2Me() throws InterruptedException{
        sleepFor(2);
        KeyWord2.click();
    }
    public void KeyWord3Me() throws InterruptedException{
        sleepFor(2);
        KeyWord3.click();
    }
    public void KeyWord4Me() throws InterruptedException{
        sleepFor(2);
        KeyWord4.click();
    }
    //////////////////////*****************************//////////////////////
    @FindBy(how = How.XPATH, using =Instagram ) public WebElement instagram ;
    @FindBy(how = How.XPATH, using = InstagramLogo) public WebElement instagramLogo  ;
    public void InstagramMe()throws InterruptedException{
        sleepFor(2);
        instagram.click();
        instagramLogo.isDisplayed();
    }
  ////////////////////******************************///////////////////////////////////
   @FindBy(how = How.XPATH, using =Tweeter ) public WebElement tweeter  ;
    @FindBy(how = How.XPATH, using =LogoTeeter ) public WebElement logoTeeter  ;

    public void Teeter()throws InterruptedException{
        sleepFor(2);
        tweeter.click();
        logoTeeter.isDisplayed();
    }
    /////////////////////////////*************************************************////////////////////////////////////////
    @FindBy(how = How.XPATH, using = FaceBook) public WebElement faceBook  ;
    @FindBy(how = How.XPATH, using =FaceBookLogo ) public WebElement faceBookLogo ;

    public void faceBookMe()throws InterruptedException{
        sleepFor(2);
        faceBook.click();
        faceBookLogo.isDisplayed();
    }
    /////////////////////////////*********************************////////////////////////////////
    @FindBy(how = How.XPATH, using =CapitalOneLogo ) public WebElement  capitalOneLogo;

    public void capitalOneLogoMe()throws InterruptedException{
        sleepFor(2);
        capitalOneLogo.isDisplayed();
    }
    /////////////////////////////////************************************************//////////////////////////////////
    @FindBy(how = How.XPATH, using = NewCOVID19Updates) public WebElement newCOVID19Updates ;
    @FindBy(how = How.XPATH, using = LearnMore) public WebElement learnMore  ;
    public void COVID19Updates()throws InterruptedException{
        sleepFor(2);
        newCOVID19Updates.click();
        learnMore.click();
    }
    /////////////////////////////******************************/////////////////////////////////////
    @FindBy(how = How.XPATH, using = FeedBack) public WebElement feedBack ;
    @FindBy(how = How.XPATH, using = generic) public WebElement Generic ;
    @FindBy(how = How.XPATH, using = Emogy) public WebElement emogy  ;
    @FindBy(how = How.XPATH, using =choose ) public WebElement Choose ;
    @FindBy(how = How.XPATH, using = compliment) public WebElement Compliment ;
    @FindBy(how = How.XPATH, using = comment) public WebElement Comment  ;
    @FindBy(how = How.XPATH, using =yes ) public WebElement Yes ;
    @FindBy(how = How.XPATH, using = submit) public WebElement Submit ;
    public void FeedBackMe ()throws InterruptedException{
        sleepFor(2);
        feedBack.click();
    }
    public void  GenericMe()throws InterruptedException{
        sleepFor(2);
        Generic.click();
    }
    public void emoMe()throws InterruptedException{
        sleepFor(2);
        emogy.click();
    }
    public void ChooseMe()throws InterruptedException{
        sleepFor(2);
        Choose.click();
    }
    public void compMet()throws InterruptedException{
        sleepFor(2);
        Compliment.click();
    }
    public void commentM()throws InterruptedException{
        sleepFor(2);
        Comment.sendKeys("good");
    }
    public void yesMe()throws InterruptedException{
        sleepFor(2);
        Yes.click();
    }
    public void subMe()throws InterruptedException{
        sleepFor(2);
        Submit.submit();
    }
   /////////////////////////////////*****************************************************///////////////////////////////////////////////
    @FindBy(how = How.XPATH, using =Location ) public WebElement location ;
    @FindBy(how = How.XPATH, using =TheZipCode ) public WebElement theZipCode ;
    @FindBy(how = How.XPATH, using =searchButton ) public WebElement SearchButton ;
    public void LocationMe()throws InterruptedException{
        sleepFor(2);
        location.click();
    }
    public void TheZipCodeMe()throws InterruptedException{
        sleepFor(2);
        theZipCode.sendKeys("07306");
    }
    public void SearchButton()throws InterruptedException{
        sleepFor(2);
        SearchButton.click();
    }









//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;
//    @FindBy(how = How.XPATH, using = ) public WebElement  ;


}
