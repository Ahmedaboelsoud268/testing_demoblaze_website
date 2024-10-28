@asd
  Feature: sign up
    Scenario: the user create an account
      Given user click on the sign up button
      When user enter valid username
      And enter valid password
      And click on the sign up button
      Then pop message appear tell me the sign up is successfully

      Scenario: the user try to sign up by using exists username
        Given user click on the sign up button
        When user enter valid username
        And enter valid password
        And click on the sign up button
        Then pop message appear tell me this username is already exists

    Scenario Outline: the user try to sign up with invalid username or invalid password or both
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

    Scenario Outline: the user try to sign up with empty username and password once
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

            Scenario: check the cancel icon and the close button in the page sign up
              Given user click on the sign up button
              When user click on the cancel icon
              And user click on the close button