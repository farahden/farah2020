Feature: Capital one home page tests

@Test1
Scenario:log in
  Given I am at the home page of Capital One
  And I enter a valid UserName
  And I enter a valid password
  And I check the checkBox to keep me sign in
  When I click on sign In
  Then I should see my account opened

#@invalidTesting
#  Scenario:log in with wrong user name
#    Given I am on Capital one homepage
#    And I enter a valid UserName
#    And I enter invalid password
#    And I check the checkBox to keep me sign in
#    When I click on sign In
#    Then I should not to be able to sign in

@Test
  Given I am logged in
  And I mouse hover to past transaction
  When I click On pending
  Then I should see all the pending Transaction

@Test
Scenario: Send money with Zelle
  Given I am at Capital one homePage
  And I check the checkBox and I click agree
  And I enter a valid Email and I enter Amount
  When I click on continue
  Then I should see the transaction pending

@Test
Scenario: Change address
  Given I am at Capital one homePage
  And I mouse hover to Account and click
  And I mouse hover to profile and click
  And I mouse hover to address and click
  And I enter a valid address and a valid and a valid Zip code
  When I click on save
  Then I should see the new address saved on my account

@Test
Scenario: LogOut
  Given I am at Capital one homePage
  And I mouse hover to Account and click
  And I mouse hover to sign out
  When I click on sign Out
  Then I should see the new the general Capital One homepage

@Test
Scenario: Instagram
  Given I am at Capital one homePage
  And I scroll all the way down to the footer
  And I mouse hover to Instagram logo
  When I click on the Instagram logo
  Then I should see a new tab landed properly
  And I should see the  Capital One Instagram page landed properly

@Test
Scenario: Tweeter
  Given I am at Capital one homePage
  And I scroll all the way down to the footer
  And I mouse hover to Tweeter logo
  When I click on the Tweeter  logo
  Then I should see a new tab landed properly
  And I should see the  Capital One Tweeter page landed properly

@Test
Scenario: FaceBook
  Given I am at Capital one homePage
  And I scroll all the way down to the footer
  And I mouse hover to FaceBook logo
  When I click on the FaceBook  logo
  Then I should see a new tab landed properly
  And I should see the  Capital One FaceBook page landed properly

@Test
Scenario: CreditCards
  Given I am at Capital one homePage
  And I double click on Credit Cards
  And I mouse hover to subMenu
  And double click on compare Credit Cards
  When I check "travel" "Popular" "No fee" "All"
  Then I should see all options are landed automatically

@Test
Scenario: Capital One Logo
  Given I am at Capital one homePage
  When I mouse hover to Menu bar
  Then I should see Capital One Logo is displayed

@Test
Scenario: Covid 19 Updates
  Given I am at Capital one homePage
  And I scroll down to New COVID-19 updates
  When I click on view Up Dates
  Then I should see a new page landed properly

@Test
Scenario: FeedBack
  Given I am at Capital one homePage
  And I mouse hover to left bottom of the screen
  And I click on feed Back
  And I click on general feedBack
  When I select Emogy
  Then I should see multiple feedBack options appear under it

@Test
Scenario: location
  Given I am at Capital one homePage
  And I click on Location
  And I enter a zip code
  When I click on searchButton
  Then I should see all Capital One ATM location








