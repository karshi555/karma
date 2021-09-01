@Regression 
Feature: Validate search car fucntionality

  Scenario: Search for the car of any brand from carmenu
    
    Given Go to the app url "https://www.carsguide.com.au/buy-a-car/new-and-used-car-search"
    And Select any module from menu items
    | menu       |
    | buy + sells|
    | reviews    |
    And Click on the "Search Cars" link
    And Select car brand as "Kia"
    And Select model as "Niro"
    And Select location as "ACT - All"
    And Select price as "$1,000"
    And Click on the "Find My Next Car"
    Then I validate the outcome "Uh oh! There doesn't seem to be any cars that exactly match your criteria. Please try broadening your search by removing filters."

