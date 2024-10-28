@asd
  Feature: the categories
    Scenario: the selenium select the random categories and select product and add product
      When selenium click one of three categories randomly
      And selenium click on one prouduct of one of random category and add to cart
      Then selenium assert on the product added successfully to cart
