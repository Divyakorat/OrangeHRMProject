
@login
Feature: login feature
  @positive
  Scenario: user should be able to login successfully
    Given user is on homepage
    When user enter username
    And user enter password
    And user click on login button
    Then user should be able to see welcome message successfully

    @negative
    Scenario Outline: user should not be able to logged in with invalid credentials
      Given user is on homepage
      When user enter invalid username "<UserName>"
      And user enter invalid password "<Password>"
      And user click on login button
      Then user should not be able to logged in successfully and "<received message>"
      Examples:
      |UserName|Password|received message        |
      |Admin   |        |Password cannot be empty|
      |        |admin123|Username cannot be empty|
      |john    |123     |Invalid credentials     |
      |        |        |UserName and PassWord cannot be empty|