package org.example.StepDefs;

import io.cucumber.java.cs.Ale;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.Pages.P04_cart;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D04_cart {
    P04_cart cart=new P04_cart();
    //here we can go to cart page to check the product add successfully
    @Given("selenium select product")
    public void selenium_add_product_ro_cart() throws InterruptedException {
        Actions action=new Actions(Hooks.driver);
        action.sendKeys(Keys.PAGE_DOWN);
        action.sendKeys(Keys.PAGE_DOWN);
        action.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);
        cart.product().click();
    }
    //selenium add product to cart
    @When("selenium add the product to cart")
    public void selenium_add_the_produc_to_cart() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOf(cart.add_cart()));
        cart.add_cart().click();
        Thread.sleep(2000);
    }
    //here we can assert that is displayed by the alert
    @Then("assert with alert the product added successfully")
    public void assert_with_alert_the_product_added_successfully()
    {
        Alert alert=Hooks.driver.switchTo().alert();
        System.out.println(alert.getText());
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(alert.getText().contains("Product added"),"there are problem here");
        softAssert.assertAll();
        alert.accept();
    }
    //the selenium go to the cart page to check the order is added successfully
    @And("selenium go to cart page")
    public void selemium_go_to_cart_page() throws InterruptedException {
        cart.cart().click();
        Thread.sleep(1000);
    }
    //assert the order in the cart
    @Then("assert the product added to cart")
    public void assert_the_product_added_to_cart()
    {
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOf(cart.assert_product_incart()));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(cart.assert_product_incart().isDisplayed(),"asssssddd");
        softAssert.assertAll();

    }
    //action for delete the order
    @And("selenium click on delete the order")
    public void selenium_click_on_delete_the_order() throws InterruptedException {
        cart.delete().click();
        Thread.sleep(3000);
    }
    //assert the order is deleted
    @Then("selenium check the order not there found")
    public void selenium_check_the_order_not_there_found()
    {
        WebDriverWait wait=new WebDriverWait(Hooks.driver,Duration.ofMillis(5000));
        wait.until(ExpectedConditions.invisibilityOf(cart.total_num()));
        System.out.println(cart.total_num().getText());
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(cart.total_num().isDisplayed(),"asd");
        softAssert.assertAll();
    }
    //after the product is added then click on the place order
    @And("click on the buttn og place order")
    public void click_on_the_buttn_og_place_order() throws InterruptedException {
        cart.place_order_button().click();
        Thread.sleep(2000);
    }
    @Then("check the fields of palce order is displayed")
    public void check_the_fields_of_palce_order_is_displayed()
    {
        WebDriverWait wait=new WebDriverWait(Hooks.driver,Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(cart.place_order_frame()));//wait even the place order frame is displayed
        SoftAssert softAssert=new SoftAssert(); //heere we can assert on the place order frame;;
        softAssert.assertTrue(cart.place_order_frame().isDisplayed(),"asd");

    }

//here the args on parameters of method is reference to string in the parameter on @When annotation
    @When("selenium enter valid data {string} and {string} and {string} and {string} {string} {string} in all fields")
    public void seleniumEnterValidDataAndAndAndInAllFields(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        cart.name().sendKeys(arg0); //this enter valid name
        cart.country().sendKeys(arg1); //this enter valid country
        cart.city().sendKeys(arg2); //this enter valid city
        cart.credit_card().sendKeys(arg3); //this enter valid credit_card
        cart.month().sendKeys(arg4); //this enter valid month
        Actions actions=new Actions(Hooks.driver);
        actions.sendKeys(Keys.PAGE_DOWN);
        cart.year().sendKeys(arg5); //this enter valid year
        Thread.sleep(2000);
    }
    @And("click on the purchase")
    public void click_on_the_purchase() throws InterruptedException {
        cart.purchase_button().click();
        Thread.sleep(1000);
    }
@Then("pop message display for successfull the opertion of purchase and click on ok")
    public void pop_message_display_for_successfull_the_opertion_and_click_on_ok_button()
{
    WebDriverWait wait=new WebDriverWait(Hooks.driver,Duration.ofMillis(3000));
    wait.until(ExpectedConditions.visibilityOf(cart.pop_message()));
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertTrue(cart.pop_message().isDisplayed(),"asd");
    softAssert.assertAll();
    cart.ok_button().click();
}
//here we can repeat the same steps of entering valid data with entering invalid data
    @When("selenium enter invalid data {string} and {string} and {string} and {string} {string} {string} in all fields")
    public void seleniumEnterInvalidDataAndAndAndInAllFields(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        cart.name().sendKeys(arg0); //this enter invalid name
        cart.country().sendKeys(arg1); //this enter invalid country
        cart.city().sendKeys(arg2); //this enter invalid city
        cart.credit_card().sendKeys(arg3); //this invalid valid credit_card
        cart.month().sendKeys(arg4); //this enter invalid month
        Actions actions=new Actions(Hooks.driver);
        actions.sendKeys(Keys.PAGE_DOWN);
        cart.year().sendKeys(arg5); //this enter invalid year
        Thread.sleep(2000);
    }

    @Then("pop message display for unsuccessfull the opertion of purchase and click on ok")
    public void popMessageDisplayForUnsuccessfullTheOpertionOfPurchaseAndClickOnOk()
    {
//        WebDriverWait wait=new WebDriverWait(Hooks.driver,Duration.ofMillis(3000));
//        wait.until(ExpectedConditions.invisibilityOf(cart.pop_message()));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(cart.pop_message().getText().contains("invalid data"),"asd");
        softAssert.assertAll();
        System.out.println(cart.pop_message().getText());
        cart.ok_button().click();

    }
    //here we can repeat the same steps of entering valid data with entering empty data
    @When("selenium enter empty data {string} and {string} and {string} and {string} {string} {string} in all fields")
    public void seleniumEnterEmptyDataAndAndAndInAllFields(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        cart.name().sendKeys(arg0); //this enter empty name
        cart.country().sendKeys(arg1); //this enter empty country
        cart.city().sendKeys(arg2); //this enter empty city
        cart.credit_card().sendKeys(arg3); //this empty credit_card
        cart.month().sendKeys(arg4); //this enter empty month
        Actions actions=new Actions(Hooks.driver);
        actions.sendKeys(Keys.PAGE_DOWN);
        cart.year().sendKeys(arg5); //this enter empty year
        Thread.sleep(2000);
    }
//assert by using alert text
    @Then("pop message is displaying that is please fill the fields")
    public void popMessageDisplayForPleaseFillTheFieldsTheOpertionOfPurchaseAndClickOnOk()
    {
        Alert alert=Hooks.driver.switchTo().alert();
        System.out.println(alert.getText());
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(alert.getText().contains("Please fill out Name and Creditcard."));
        alert.accept();
    }
//here click on the close button
    @And("selenium click on the close button")
    public void seleniumClickOnTheCloseButton()
    {
        cart.close_button().click();
    }
    //here click on the close icon
    @And("selenium click on the close icon")
    public void seleniumClickOnTheCloseIcon()
    {
        cart.close_icon().click();
    }

//here assert on place order after delete the product from cart and must display an pop message to add product to cart;;
    @Then("pop message is display that is please add product to cart to continue the purchase")
    public void popMessageIsDisplayThatIsPleaseAddProductToCartToContinueThePurchase()
    {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(cart.place_order_frame().isDisplayed());
        softAssert.assertAll();
    }
}
