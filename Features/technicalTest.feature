Feature: Techinal test from Capgemini
  As a user, I would like to register and ensure that the purchased item is in Cart

  Scenario: Register successfully as New user
    Given I am on Home page
    Then I Register an account as new user with emailId as "kundantest9911@gmail.com" and "p@ssword"

  Scenario: I should see the added item in the cart after I login back
    Given I login into application
    When I add the expensive dress to Cart
    And I logout
    And I login into application
    Then I should see the expensive dress in the cart
