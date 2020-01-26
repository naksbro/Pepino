@bookingPage
  Feature: Booking Page Test
    @couponTest
    Scenario: Verify coupon code
      Given User opens admin home page
      When Logs in
      And Navigates to coupon page
      And Creates a new coupon
      Then Verifies new coupon is created
      Given User opens home page
      When User opens "first tour" featured tour
      And Clicks on "Book Now" button
      And applies existing coupon code
      Then Verifies positive message is displayed