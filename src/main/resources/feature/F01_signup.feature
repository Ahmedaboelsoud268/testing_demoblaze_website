@asd
  Feature: sign up
    Scenario: tests sign up feature with valid username and password
      Given user click on the sign up button
      When user enter valid username
      And enter valid password
      And click on the sign up button
      Then pop message appear tell me the sign up is successfully

      Scenario: tests sign up feature with exists username and it valid password
        Given user click on the sign up button
        When user enter valid username
        And enter valid password
        And click on the sign up button
        Then pop message appear tell me this username is already exists

    Scenario Outline: tests sign up feature with invalid username or invalid password or both
      Given user click on the sign up button
      When user enter invalid "<username>"
      And enter invalid "<password>"
      And click on the sign up button
      Then pop message appear tell me invalid username or password
      Examples:
        | username | password |
        | SAW#@!)*765fdsajh    | Asd@1234%    |
        | Malak    | 9)))!!eee4    |
        | REWQasdf653(*^@!%}{    | 0923323235    |

    Scenario Outline: tests sign up feature with empty username once and password once and both empty once
      Given user click on the sign up button
      When user enter valid "<username>" once and empty noce
      And enter valid "<password>" once and empty once
      And click on the sign up button
      Then pop message appear tell me please full username and password
      Examples:
        | username | password   |
        | mohammed |            |
        |          | asd123/33# |
        |          |            |

            Scenario: tests the cancel icon and the close button in the page sign up
              Given user click on the sign up button
              When user click on the cancel icon
              And user click on the close button