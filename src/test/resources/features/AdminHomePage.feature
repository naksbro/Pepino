@adminHome
  Feature: Testing admin homepage
    Scenario: Verify admin homepage
      Given User opens admin home page
      And Logs in
      Then Verifies title is Dashboard