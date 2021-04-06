Feature: HomePage functionality
    @smokeTesting
Scenario:change language and country
    Given I am at CNN homepage
    And I mouse hover to edition and I click
    And I drop down to Arabic And I click
    When I click on "رياضة"
    Then I should see all  sport news displayed on Arabic

        @RegressionTesting
    Scenario: The CNN logo
    Given I am at CNN homepage
    When I mouse hover to CNN logo  and I double click
    Then I should see the trending news are Updated

     @SecurityTesting
        Scenario: The CNN International news
    Given I am at CNN homepage
    And I mouse hover to edition and I click
    When I drop down to International And I click
    Then I should see the page refreshed and posts international news

    @UnitTesting
    Scenario: The CNN TV
    Given I am at CNN homepage
    And I hover over to "Live TV" and I click
    When I mouse hover to "shows" and I click
    Then I should be able to see all TV shows and movies

    @Resting
    Scenario: The homePage button options
      Given I am at CNN LiveTV page
      And I mouse hover "Go Back To CNN.com"
      When I click on the red frame
      Then the CNN home page should be landed properly


