Feature: Flipkart scenarios

  @AddTocart
  Scenario:  Add to cart scenarios
    Given : Lunch the flipkart url "https://www.flipkart.com/"
    Then : Close the login popup if its visible
    Then : Enter "I phone 15" in search box
    And : Click enter key from keyboard
    Then : Verify that we are on "search" page from url
    Then : Open the first phone which displayed
    Then : Verify that we are on ADD TO CART page from Buttons Visibility
    And : Click on "ADD TO CART" button
    Then : Verify that we are on "viewcart" page from url
    And : Close the chrome

