Feature:
Scenario: Flights
    Given I am at Delta home page
    And I mouse hover to Search cheap flights
    And click on round trip
    And I click on departure place I enter "New York"
    And I mouse hover to Arrival place and I enter "Algeria"
    And I mouse hover to period and I select from calendar
    And I mouse hover to passengers and I select "two persons"
    When I click on search
    Then I should see many options

Scenario: Shop Hotels
  Given I am at Delta home Page
  And I scroll down to Sub menu
  And I mouse hover to hotels and double click it
  And I enter"Cali" and I drop down to "California" and hit enter
  When I click on search
  Then I should see a new page landed properly

Scenario: Advertisement
  Given I am at Delta home page
  And I mouse hover to the advertisement
  And I click on close advertisement
  When I click on not interested
  Then I should see "Sorry we are not going to show this ad again"

Scenario: Rent A Cars
  Given I am at Delta home page
  And I scroll down to Sub menu
  And I mouse hover to rent a Cars and I click
  And I enter New York City
  And I choose PICK-UP DATE and from the  calendar and I hit enter
  And I choose DROP-OFF DATE from the  calendar and I hit enter
  And I choose PICK-UP time and from the  calendar and I hit enter
  And I choose DROP-OFF time from the  calendar and I hit enter
  When I click on Book a car
  Then I should see all cars available for that date

Scenario: Vacation Deals
  Given I am at Delta home Page
  And I scroll down to Sub menu
  And I mouse hover to VacationDeals and  click
  And I mouse hover to the menu
  When I click on shop this deal
  Then it should take me to all places with same deal

  Scenario: Updated Bag
  Given I am at Delta home Page
  And I scroll down to Sub menu
  And I mouse hover to Updated bag and travel fees and I click
  And I mouse hover to the menu
  And I click on Baggage info
  When I click on Checked Baggage
  Then I should see a list under it

Scenario: FeedBack
  Given I am at Delta home Page
  And scroll down to the left bottom of the page
  And I click on feedback
  And I select five stars
  And I check other
  And I enter "good "
  When I click on submit
  Then I should see pop up window post following message"thank you we appreciate your feedback "





