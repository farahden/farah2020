package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using =CNNHomepage ) public WebElement CNNHomePage;
    @FindBy (how = How.XPATH, using =edition ) public WebElement Edition ;
    @FindBy(how = How.XPATH, using =Arabic ) public WebElement ArabicLanguage;
    @FindBy (how = How.ID, using = Menu) public WebElement  MenuBar;
    @FindBy(how = How.ID, using =رياضة ) public WebElement رياضةTHe ;

        public void CNNHomepage() throws InterruptedException {
        sleepFor(2);
            CNNHomePage.click();
    }
    public void EditionMe() throws InterruptedException {
        sleepFor(2);
        Edition.click();

    }
    public void MethArabicLanguage() throws InterruptedException {
        sleepFor(2);
        ArabicLanguage.click();
    }
    public void MethMenuBar() throws InterruptedException {
        sleepFor(2);
        MenuBar.click();
    }

    public void MethرياضةTHe() throws InterruptedException {
        sleepFor(2);
        رياضةTHe.click();
    }

///*//////////////////////////******************************************/////////////////////////////////


   @FindBy(how = How.XPATH, using = logo) public WebElement logoPic ;
    public void ThelogoPic() throws InterruptedException {
        sleepFor(2);
        logoPic.isDisplayed();
    }
/////////////////////////////////////*************************************/////////////////////////////////
   @FindBy (how = How.XPATH, using =International ) public WebElement international ;
    public void international() throws InterruptedException {
        sleepFor(2);
        international.click();
    }
   //////////////////////////***********************/////////////////////////////////////
    @FindBy(how = How.XPATH, using =LiveTV ) public WebElement liveTV ;
    @FindBy (how = How.XPATH, using =shows ) public WebElement Shows;

    public void liveTVMe() throws InterruptedException {
        sleepFor(2);
        liveTV.click();
    }
    public void ShowsMe() throws InterruptedException {
        sleepFor(2);
        Shows.click();
    }
    ////////////////////////////**************************************///////////////////////////////

    @FindBy(how = How.XPATH, using =CNNLiveTVPage ) public WebElement CnnLiveTVPage;
    @FindBy (how = How.XPATH, using =BACKBUTTON ) public WebElement BackButton ;


    public void CnnLiveTVPageMe() throws InterruptedException {
        sleepFor(2);
        CnnLiveTVPage.click();
    }
    public void BackButtonMe() throws InterruptedException {
        sleepFor(2);
        BackButton.click();
    }




}
