@asd
Feature: login
  Scenario: the user can login with valid username and password
    Given the user click on login button
    When the user enter valid username
    And the user enter valid password
    And the user click on the login button
    Then the user login successfully

  Scenario: user try to login with not registered username and password
    Given the user click on login button
    When the user enter not exist username
    And the user enter not exist password
    And the user click on the login button
    Then the user cannot login successfully pop messag display

    Scenario: the user try to enter invalid password for exits username
      Given the user click on login button
      When the user enter exist username
      And the user enter invalid password
      And the user click on the login button
      Then the user cannot login successfully pop messag display wrong password

      Scenario: the user enter empty username and password
        Given the user click on login button
        When the user enter empty username
        And the user enter empty password
        And the user click on the login button
        Then the user cannot login successfully pop messag display please fill this fields