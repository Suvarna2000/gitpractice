Feature: Whitebox Page Test

  Scenario: Logo present on whitebox page
    Given i launch chrome browser1
    When i am on the main page of whitebox1
    Then i got and verified the whitebox logo
    And i closed the browser1

    Scenario: Schedule link on the whitebox page
      Given i launch chrome browser2
      When i am on the main page of whitebox2
      And i saw and clicked on schedule tab
      Then i verified the schedule page
      And i closed the browser2

      Scenario: Login link on the whitebox page
        Given i launch chrome browser3
        When i am on the main page of whitebox3
        And i saw and clicked on login link
        Then i verified the login page
        And i closed the browser3