Feature:

  Scenario:
    Scenario: firstTest
    Given I open browser
    And I enter Hotels.com Official site
    When I open the home page
    Then I should see the message "Your safety is our top priority" followed with the following link"https://www.hotels.com/page/coronavirus-booking-information/?pos=HCOM_US&locale=en_US"

  Scenario: second Test
    Given I am at hotels home page
    When I mouse hover to under of menu
    Then I should see the picture is displayed

Scenario: third test
    Given I am at hotels home page
    And I scroll down to TOP DESTINATION and I click
    And I mouse hover to Hotels in  paris and I click
    When I mouse hover to back button and click two times
    Then the hotels.com homepage should be landed properly

Scenario: test
    Given I am at hotels home page
    And I mouse hover to menu bar and I click on deals
    And I enter"Key West, Florida, United States of America"
    And I enter Check-in date and Check-out date
    And I select room and number of persons and I enter age
    When I click on show deals
    Then I should see all deals are posted

    Scenario: the best cities
    Given I am at hotels home page
    And I mouse hover to menu bar
    And I click on things to do
    When mouse hover to top 50 cities
    Then I should see the top 50cities hotels ordered by alphabetic order

    Scenario: Algerian Hotel
    Given I am at hotels home page
    And I scroll down to the footer
    And I mouse hover to all countries
    And I click on algeria
    When I click on sofitel algiers Hamma
    And a pop up widow open
     When I click continue
    Then I should be able to see all old customers reviews and shared pictures




