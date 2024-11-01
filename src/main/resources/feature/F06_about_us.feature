@asd
  Feature: about us
    Scenario: tests for about us
      Given selenium click on the about us
      When selenium click on play video
      Then assert the video is playing
      And selenium is click on close
