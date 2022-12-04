Feature: Add product to add to kart


  Scenario: Login with Valid Credentials
    Given Open the Browser
    Given Launch the Flipkart URL
    When U  ser Search for "Oppo" Product
    And User Click on the First Product
    And Click on Go to Cart 
    Then Get the Product Price
      
