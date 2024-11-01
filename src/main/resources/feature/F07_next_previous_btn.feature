@asd
  Feature: next and previous button in home page
    Scenario: tests for next and previous button
      Given selenium click on next button
      Then the next button is clickable
      And selenium click on previous button
      Then the previous button is clickable