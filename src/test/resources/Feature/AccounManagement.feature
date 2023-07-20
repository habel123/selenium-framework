@AccountManagement
Feature: Account management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | FirstName | LastName | Email                  | Password   | ConfirmPassword |
      | john      | Banjo    | Patricknee97@gmail.com | Testing12@ | Testing12@      |


  @SignIn
  Scenario Outline: Registered Customer to Login with username and password
    Given I am on sign in page
    When I enter "<Email>" "<Password>"
    And I click on sign in button
    Then My account page is displayed




    Examples:
      | Email                  | Password   |
      | Patricknee97@gmail.com | Testing12@ |