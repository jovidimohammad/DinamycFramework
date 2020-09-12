@smoke
Feature: User should verify title after search


  @Librarian @staff
    Scenario: Open google home page
    Given User in "http://www.google.com" home page
    When User searches an item
    Then Item should see item name in title