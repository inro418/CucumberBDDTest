Feature: iceland application regression test

          @tag1
 Scenario: Regression test
          Given User check SignInButton
          And User check the Email textbox
          And User check the Password textbox
          When User click the SignInButton
          Then User navigate to home page
          And User confirmed SignInButton is working
          Then User check My Account details
          And User check Add to Basket
          Then User check Order