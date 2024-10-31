@asd
  Feature: cart and place order
    Scenario: tests to check the product is added when i select product and add it to cart
      Given selenium select product
      When selenium add the product to cart
      Then assert with alert the product added successfully
      And selenium go to cart page
      Then assert the product added to cart

      Scenario: tests for check delete order and check the order there not found
        Given selenium select product
        When selenium add the product to cart
        Then assert with alert the product added successfully
        And selenium go to cart page
        And selenium click on delete the order
        Then selenium check the order not there found

        Scenario Outline: tests for place order with valid data
          Given selenium select product
          When selenium add the product to cart
          Then assert with alert the product added successfully
          And selenium go to cart page
          And click on the buttn og place order
          Then check the fields of palce order is displayed
          When selenium enter valid data "<name>" and "<country>" and "<city>" and "<credit_card>" "<month>" "<year>" in all fields
          And click on the purchase
          Then pop message display for successfull the opertion of purchase and click on ok
          Examples:
            |name |country|city|credit_card  | month |year |
            |ahmed|egypt  |qena|7653287652087245|08  |2027 |

    Scenario Outline: tests for place order with invalid data
      Given selenium select product
      When selenium add the product to cart
      Then assert with alert the product added successfully
      And selenium go to cart page
      And click on the buttn og place order
      Then check the fields of palce order is displayed
      When selenium enter invalid data "<name>" and "<country>" and "<city>" and "<credit_card>" "<month>" "<year>" in all fields
      And click on the purchase
      Then pop message display for unsuccessfull the opertion of purchase and click on ok
      Examples:
        |name |country|city|credit_card  | month |year |
        |#@123...|YT^%63|(76gfd21)|7653@#vs7652087245|0@|20%$c7 |

    Scenario Outline: tests for place order with empty data
      Given selenium select product
      When selenium add the product to cart
      Then assert with alert the product added successfully
      And selenium go to cart page
      And click on the buttn og place order
      Then check the fields of palce order is displayed
      When selenium enter empty data "<name>" and "<country>" and "<city>" and "<credit_card>" "<month>" "<year>" in all fields
      And click on the purchase
      Then pop message is displaying that is please fill the fields
      Examples:
        |name |country|city|credit_card| month|year|
        |     |       |    |           |      |    |

    Scenario: tests for check place order after delete the produt
      Given selenium select product
      When selenium add the product to cart
      Then assert with alert the product added successfully
      And selenium go to cart page
      And selenium click on delete the order
      Then selenium check the order not there found
      And click on the buttn og place order
      Then pop message is display that is please add product to cart to continue the purchase


    Scenario: tests to check the close button is clickable in place order
      Given selenium select product
      When selenium add the product to cart
      Then assert with alert the product added successfully
      And selenium go to cart page
      And click on the buttn og place order
      Then check the fields of palce order is displayed
      And selenium click on the close button

      Scenario: tests to check the close icon in place order
        Given selenium select product
        When selenium add the product to cart
        Then assert with alert the product added successfully
        And selenium go to cart page
        And click on the buttn og place order
        Then check the fields of palce order is displayed
        And selenium click on the close icon




