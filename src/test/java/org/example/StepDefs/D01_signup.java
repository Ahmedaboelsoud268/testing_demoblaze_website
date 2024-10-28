package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_signup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.v128.page.model.Screenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.security.PublicKey;

public class D01_signup {
    P01_signup s=new P01_signup(); //this an opject from class P01_signup
    //click on the sign up button
    @Given("user click on the sign up button")
    public void user_click_on_the_sign_up_button()
    {
       s.sign_up().click();
    }
    //the selenium enter valid username in the field
    @When("user enter valid username")
    public void user_enter_valid_username()
    {
s.username().sendKeys("maghraby505");
    }
    //the selenium enter valid password in the field
    @And("enter valid password")
    public void enter_valid_password()
    {
       s.password().sendKeys("asd1023@");
    }
    //the selenium click on the signup
    @And("click on the sign up button")
    public void click_on_the_sign_up_button()
    {
       s.signupof().click();
    }
    //the selenium check the success message in alert
    @Then("pop message appear tell me the sign up is successfully")
    public void pop_message_appear_tell_me_the_sign_up_is_successfully() throws InterruptedException {
        Thread.sleep(1000);
        Alert alert=Hooks.driver.switchTo().alert();
        String al=alert.getText();
        System.out.println(al);
        SoftAssert soft=new SoftAssert();
        soft.assertFalse(al.contains("This user already exist."),"try to enter not registered username");
        soft.assertAll();
         if(al.contains("Sign up successful"))
         {alert.accept();}
    }
    //the selenium check the exists username message in alert
    @Then("pop message appear tell me this username is already exists")
    public void pop_message_appear_tell_me_this_username_is_already_existse() throws InterruptedException {
        Thread.sleep(1000);
        Alert alert=Hooks.driver.switchTo().alert();
        String al=alert.getText();
        if(al.contains("This user already exist."))
        {alert.accept();}
    }
//the selenium use scenario outmine instead of data provider to enter more one username
    @When("user enter invalid {string}")
    public void user_enter_invalid_username(String string) throws InterruptedException {
        Thread.sleep(1000);
        s.username().sendKeys(string);
    }
    //the selenium use scenario outmine instead of data provider to enter more one password
    @And("enter invalid {string}")
    public void enter_invalid_password(String string) throws InterruptedException {

        Thread.sleep(1000);
        s.password().sendKeys(string);
    }
    ////the testNG assert about alert message and this id failed test case
    @Then("pop message appear tell me invalid username or password")
    public void pop_message_appear_tell_me_invalid_username_or_password() throws InterruptedException {
        Thread.sleep(2000);
        Alert alert=Hooks.driver.switchTo().alert();
        String as=alert.getText();
//        if (!as.contains("invalid username or password")){
//            try {
//                Screenshot.(as, "testExample");
//            }
//        }
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(as.contains("invalid username or password"),"this is not");
        softAssert.assertAll();
        if(!as.contains("invalid username or password"))
        {alert.accept();}
    }
    //the selenium use scenario outline instead of data provider to enter more one valid username or empty username
    @When("user enter valid {string} once and empty noce")
    public void user_enter_valid_username_once_and_empty_noce(String string) throws InterruptedException {
        Thread.sleep(1000);
        s.username().sendKeys(string);
    }
    //the selenium use scenario outline instead of data provider to enter more one valid password or empty password
    @And("enter valid {string} once and empty once")
    public void enter_valid_password_once_and_empty_once(String string) throws InterruptedException {
        Thread.sleep(1000);
        s.password().sendKeys(string);
    }
    ////the testNG assert about alert message and this is success test case
    @Then("pop message appear tell me please full username and password")
    public void pop_message_appear_tell_me_please_full_username_and_password() throws InterruptedException {
        Thread.sleep(2000);
        Alert alert=Hooks.driver.switchTo().alert();
        String as=alert.getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(as.contains("Please fill out Username and Password."),"this is not");
        softAssert.assertAll();
        if(as.contains("Please fill out Username and Password."))
        {alert.accept();}
    }
    @When("user click on the cancel icon")
    public void user_click_on_the_cancel_icon()
    {
        s.cance().click();
    }
    @And("user click on the close button")
    public void user_click_on_the_close_button()
    {
        s.close().click();
    }
}
