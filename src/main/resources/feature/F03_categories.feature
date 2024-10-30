@asd
  Feature: the categories
    Scenario: the tests here selecting the random categories and select product and add product and add it to cart and assert by the alert
      When selenium click one of three categories randomly
      And selenium click on one prouduct of one of random category and add to cart
      Then selenium assert on the product added successfully to cart
