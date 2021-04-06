package homepage;

public class HomePageWebElement {
    // WebElement class for Locators only and some other properties
//log in
    public static final String CapitalOneHomepage="";
    public static final String UserName="/html[1]/body[1]/content-wrapper[1]/enterprise-root[1]/homepage-entry-page[1]/div[1]/homepage-sign-in[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[2]/div[2]/div[1]/div[1]/div[1]/input[1]";
    public static final String password="/html[1]/body[1]/content-wrapper[1]/enterprise-root[1]/homepage-entry-page[1]/div[1]/homepage-sign-in[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[2]/div[2]/div[1]/div[2]/div[1]/input[1]";
    public static final String checkBox="//input[@id='rememberMe']";
    public static final String signIn="//input[@id='rememberMe']";

    //
//    public static final String WrongUserName ="/html[1]/body[1]/content-wrapper[1]/enterprise-root[1]/homepage-entry-page[1]/div[1]/homepage-sign-in[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[2]/div[2]/div[1]/div[1]/div[1]/input[1]";
//    public static final String WrongPassword ="/html[1]/body[1]/content-wrapper[1]/enterprise-root[1]/homepage-entry-page[1]/div[1]/homepage-sign-in[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[2]/div[2]/div[1]/div[2]/div[1]/input[1]";



    //Recent transaction
    public static final String transaction="//a[@id='viewMore']";
    public static final String pending="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/c1-ease-root[1]/c1-ease-hydrate[1]/c1-ease-bank-l2-container[1]/c1-ease-transactions-container[1]/c1-ease-transactions-content[1]/div[1]/c1-ease-txns[1]";

    // Send money with Zelle
    public static final String viewAccount="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/c1-ease-root[1]/c1-ease-core-features-account-summary[1]/div[1]/div[1]/div[1]/c1-ease-account-tile[1]/div[1]/div[1]/c1-ease-main-secondary-content[1]/button[1]";
    public static final String zelle="//span[contains(text(),'Send Money with Zelle')]";
    public static final String sendMoney="//span[contains(text(),'Send Money with Zelle')]";
    public static final String Email="//input[@id='to-email-or-phone-number-field']";
    public static final String Amount="//label[contains(text(),'Amount')]";
    public static final String continueButton="//button[contains(text(),'Continue')]";

    //Change address
    public static final String Account="div.global-navigation-container__main div.ui-view-container div.ng-star-inserted header.ng-star-inserted div.container.header__container div.options-nav.ng-star-inserted c1-ease-profile.c1-ease-menu__trigger.profile.ng-star-inserted c1-ease-icon.c1-ease-icon--medium-size.ng-star-inserted svg:nth-child(1) g:nth-child(1) > path:nth-child(1)";
    public static final String profile="/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/button[1]/p[1]";
    public static final String address="//body/div[@id='page-content']/div[1]/div[1]/div[1]/c1-ease-root[1]/c1-ease-core-features-profile[1]/c1-ease-core-features-profile-address-tile[1]/c1-ease-core-components-preferences-tile[1]/div[1]/div[1]/div[2]/div[1]/div[1]/c1-ease-address-row[1]/div[1]/div[1]/a[1]/c1-ease-icon[1]/*[1]";
    public static final String EditAddCSS="body.c1-ease-global--overflow:nth-child(2) div.cdk-overlay-container:nth-child(11) div.cdk-overlay-connected-position-bounding-box div.cdk-overlay-pane.c1-ease-dialog__overlay c1-ease-dialog-container.c1-ease-dialog-container.ng-tns-c107-9.ng-trigger.ng-trigger-slideDialog.ng-star-inserted:nth-child(2) div.dialog-container--resize.ng-tns-c107-9 c1-ease-bank-manage-address.ng-star-inserted div.ng-star-inserted c1-ease-bank-manage-address-select.ng-star-inserted div.c1-ease-dialog-content__wrapper c1-ease-dialog-content.c1-ease-dialog-content div.address-container.ng-star-inserted div.address-border.address-border-top.ng-star-inserted:nth-child(1) div.address-details div.address-edit a:nth-child(1) c1-ease-icon.c1-ease-icon__color-blue.c1-ease-icon--large-size svg:nth-child(1) > path:nth-child(1)";
    public static final String Street="//input[@id='addressLine1']";
    public static final String Apartment="//input[@id='addressLine1']";
    public static final String ZipCode="/html[1]/body[1]/div[5]/div[2]/div[1]/c1-ease-dialog-container[1]/div[1]/c1-ease-bank-manage-address[1]/div[1]/c1-ease-bank-manage-address-edit[1]/c1-ease-dialog[1]/div[2]/c1-ease-dialog-content[1]/div[1]/c1-ease-bank-manage-address-edit-residential-form[1]/form[1]/div[1]/c1-ease-form-field[1]/div[1]/c1-ease-select[1]/div[1]/div[1]/span[1]";
    public static final String state="/html[1]/body[1]/div[5]/div[2]/div[1]/c1-ease-dialog-container[1]/div[1]/c1-ease-bank-manage-address[1]/div[1]/c1-ease-bank-manage-address-edit[1]/c1-ease-dialog[1]/div[2]/c1-ease-dialog-content[1]/div[1]/c1-ease-bank-manage-address-edit-residential-form[1]/form[1]/div[1]/c1-ease-form-field[1]/div[1]/c1-ease-select[1]/div[1]/div[1]/span[1]";
    public static final String City="/html[1]/body[1]/div[5]/div[2]/div[1]/c1-ease-dialog-container[1]/div[1]/c1-ease-bank-manage-address[1]/div[1]/c1-ease-bank-manage-address-edit[1]/c1-ease-dialog[1]/div[2]/c1-ease-dialog-content[1]/div[1]/c1-ease-bank-manage-address-edit-residential-form[1]/form[1]/c1-ease-form-field[3]/div[1]/input[1]";
    public static final String Save="public static final String ZipCode";

    //LogOut
    public static final String signOut="";

    //
    public static final String Instagram="//body/universal-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]";
    public static final String InstagramLogo="//body/universal-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]";

    //Tweeter
    public static final String Tweeter="//body/universal-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]";
    public static final String LogoTeeter="//body/universal-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]";

    //FaceBook
    public static final String FaceBook="//body/universal-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[3]";
    public static final String FaceBookLogo="//body/universal-footer[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[3]";

    //CreditCards
    public static final String CreditCards="//span[contains(text(),'Credit Cards')]";
    public static final String compare="//span[contains(text(),'Compare All Cards')]";
    public static final String Keyword1="//body/content-wrapper[1]/enterprise-root[1]/card-page[1]/bre-render-cms-component[1]/bre-cms-component[1]/bre-container[1]/bre-base-component[4]/ng-component[1]/card-compare[1]/section[1]/card-filter[1]/section[1]/div[1]/div[2]/div[1]/card-filter-group[1]/div[1]/div[2]/div[1]/div[1]/label[1]";
    public static final String Keyword2="/html[1]/body[1]/content-wrapper[1]/enterprise-root[1]/card-page[1]/bre-render-cms-component[1]/bre-cms-component[1]/bre-container[1]/bre-base-component[4]/ng-component[1]/card-compare[1]/section[1]/card-filter[1]/section[1]/div[1]/div[2]/div[1]/card-filter-group[2]/div[1]/div[2]/div[1]/div[1]/label[1]";
    public static final String Keyword3="//body/content-wrapper[1]/enterprise-root[1]/card-page[1]/bre-render-cms-component[1]/bre-cms-component[1]/bre-container[1]/bre-base-component[4]/ng-component[1]/card-compare[1]/section[1]/card-filter[1]/section[1]/div[1]/div[2]/div[1]/card-filter-group[3]/div[1]/div[2]/div[1]/div[1]/label[1]";
    public static final String Keyword4="//body/content-wrapper[1]/enterprise-root[1]/card-page[1]/bre-render-cms-component[1]/bre-cms-component[1]/bre-container[1]/bre-base-component[4]/ng-component[1]/card-compare[1]/section[1]/card-filter[1]/section[1]/div[1]/div[2]/div[1]/card-filter-group[3]/div[1]/div[2]/div[1]/div[1]/label[1]";

    //Capital One Logo
    public static final String CapitalOneLogo="//header/div[@id='siteHeaderContainer']/a[@id='unav-l1-logo']/*[1]";

    //Covid 19 Updates
    public static final String NewCOVID19Updates="//a[contains(text(),'View Updates')]";
    public static final String LearnMore="//a[contains(text(),'Learn More')]";

    //FeedBack
    public static final String FeedBack="//a[contains(text(),'Learn More')]";
    public static final String generic="//span[contains(text(),'I’d like to give general feedback on the entire we')]";
    public static final String Emogy="//label[contains(text(),'5')]";
    public static final String choose="//body[1]/div[1]/form[1]/span[1]/div[1]/select[1]";
    public static final String compliment="//body/div[6]/div[1]/iframe[1]";
    public static final String comment="//body[1]/div[1]/form[1]/span[1]/span[3]/div[1]/textarea[1]";
    public static final String yes="//body[1]/div[1]/form[1]/span[1]/span[3]/div[1]/textarea[1]";
    public static final String submit="//button[contains(text(),'Submit')]";



    //location
    public static final String Location="//a[@id='unav-l1-locations']";
    public static final String TheZipCode="/html[1]/body[1]/div[1]/lf-root[1]/div[1]/div[1]/div[1]/lf-home-sidebar[1]/div[1]/div[2]/lf-search[1]/div[1]/div[1]/lf-autocomplete[1]/div[1]/input[1]";
    public static final String searchButton="//body/div[6]/div[1]/iframe[1]";












}
