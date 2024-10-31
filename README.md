# testing_demoblaze_website


## test ecommerce website demoblaze by using automation

This project is a test automation framework built using **Java 19.0.2**. It leverages the following technologies and libraries:

### Technologies Used
- **Java**: Version 19.0.2
- **Maven**: For project management and dependency management
- **Selenium**: Version 4.25.0 for browser automation
- **TestNG**: Version 7.7.1 for testing framework
- **Cucumber**: Version 7.20.1 for behavior-driven development (BDD)
- **Cucumber TestNG**: Version 7.20.1 to integrate Cucumber with TestNG

### Dependencies

The following dependencies have been included in the `pom.xml` file:

```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.25.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.7.1</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.20.1</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-testng</artifactId>
        <version>7.20.1</version>
    </dependency>
</dependencies>


## Features

This project includes the following key features:

1. **Sign Up Feature**
   - **Total Scenarios**: 5
     - **1 Valid Scenario**: tests sign up feature with valid username and password.
     - **4 Invalid Scenarios**: 
       - ttests sign up feature with exists username and it valid password
       - tests sign up feature with invalid username or invalid password or both
       - tests sign up feature with empty username once and password once and both empty once
       - tests the cancel icon and the close button in the page sign up

2. **Login Feature**
   - **Total Scenarios**: 4
     - **1 Valid Scenario**: Ttests login feature with valid username and password.
     - **3 Invalid Scenarios**: 
       - tests login feature with not registered username and password
       - tests login feature with invalid password for exits username
       - tests with empty username and password

3. **Categories Feature**
   - **Total Scenarios**: 1
     - the tests here selecting the random categories and select product and add product and add it to cart and assert by the alert.

4. **Add to Cart and place order Feature**
   - **Total Scenarios**: 5
     - **5 Valid Scenarios**: 
       - tests to check the product is added when i select product and add it to cart
       - tests for check delete order and check the order there not found
       -tests for place order with valid data
       -tests to check the close button is clickable in place order
      -tests to check the close icon in place order

     - **2 Invalid Scenarios**: 
       -tests for place order with invalid data
       - tests for place order with empty data
       - tests for check place order after delete the produt

This framework ensures comprehensive testing of essential user functionalities, providing a solid foundation for a robust application.
