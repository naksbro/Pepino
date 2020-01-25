@adminCoupon
  Feature: Testing admin coupon page
    Scenario: Verify coupon is created
      Given User opens admin home page
      When Logs in
      And Navigates to coupon page
      And Creates a new coupon
      Then Verifies new coupon is created