@asd
  Feature: contact
    Scenario Outline: tests for check the the contact feature with valid inputs
      Given selenium click on the contact in home page
      Then assert an inputs fileds form is displayed
      When selenium enter valid email "<contact_email>"
      And selenium enter vaild name "<contact_name>"
      And selenium enter valid message "<message>"
      And click on send message
      Then assert with alert message _Thanks for the message!!_ and click ok
      Examples:
      |contact_email|contact_name|message|
      |ahmedmagh23@gmail.com|ahmed maghraby|my order is very bad thang i want to back it|


    Scenario Outline: tests for check the the contact feature with invalid inputs
      Given selenium click on the contact in home page
      Then assert an inputs fileds form is displayed
      When selenium enter invalid email "<contact_email>"
      And selenium enter invaild name "<contact_name>"
      And selenium enter invalid message "<message>"
      And click on send message
      Then assert with alert message _please enter valid email!!_ and click ok
      Examples:
        |contact_email|contact_name|message|
        |ahmedmagh23@.com|ahmsdf! )@!ghraby|~~~~~~~~____----??!.,,,.S>?|

    Scenario Outline: tests for check the the contact feature with empty inputs
      Given selenium click on the contact in home page
      Then assert an inputs fileds form is displayed
      When selenium enter empty_email "<contact_email>"
      And selenium enter empty_name "<contact_name>"
      And selenium enter emptymessage "<message>"
      And click on send message
      Then assert with alert message _please fill this inputs with empty data_ and click ok
      Examples:
        |contact_email|contact_name|message|
        |             |            |       |


