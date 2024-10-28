package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_login;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.asserts.SoftAssert;

import javax.swing.plaf.PanelUI;

public class D02_login {
    private static final Logger log = LoggerFactory.getLogger(D02_login.class);
      P02_login login=new P02_login();  //this obkect from class page of P02_login
    //this go to login page direct
          @Given("the user click on login button")
                  public void the_user_click_on_login_button()
                 {
                      login.log_in().click();
                 }
           //this enter valid username in field username
         @When("the user enter valid username")
                public void the_user_enter_valid_username()
                  {
                      login.username().sendKeys("maghraby505");

                  }
    //this enter valid password in field password
        @And("the user enter valid password")
               public void the_user_enter_valid_password()
                 {
                     login.password().sendKeys("asd1023@");
                 }
         //this clcik on the login button
         @And("the user click on the login button")
              public void the_user_click_on_the_login_button() throws InterruptedException {
                     login.login_butt().click();
                     Thread.sleep(2000);
                 }
        //this is assertion to the login successfully
        @Then("the user login successfully")
             public void the_user_login_successfully() throws InterruptedException {
            SoftAssert soft=new SoftAssert();
            soft.assertTrue(login.ass_ert().getText().contains("Welcome "),"not #####");
            System.out.println(login.ass_ert().getText());
                }

    //this methods try to entr not exist username and password
        @When("the user enter not exist username")
        //this methods try to entr not exist username and password
             public void the_user_enter_not_exist_username()
               {
                   login.username().sendKeys("Usershad");
               }
        @And("the user enter not exist password")
             public void the_user_enter_not_exist_password()
             {
                            login.password().sendKeys("asd123");
             }
             //this is assert for pop message is appear when user enter not registered username "username not exists"
        @Then("the user cannot login successfully pop messag display")
             public void the_use_cannot_login_successfully()
             {
                 Alert alert=Hooks.driver.switchTo().alert();
                 String cond=alert.getText();
                 System.out.println(cond);
                 SoftAssert soft=new SoftAssert();
                 soft.assertTrue(cond.contains("User does not exist."),"asdfg");
                 soft.assertAll();
                 alert.accept();
             }

             //user enter exist username
        @When("the user enter exist username")
           public void the_user_enter_exist_username()
        {
            login.username().sendKeys("maghraby505");
        }
        //user enter wrong password
        @And("the user enter invalid password")
    public void the_user_enter_invalid_password()
        {
            login.password().sendKeys("asffg£");
        }
    //this is assertion for pop message is displaying "Wrong password"
        @Then("the user cannot login successfully pop messag display wrong password")
    public void the_user_cannot_login_successfully_pop_messa()
        {
            Alert alert=Hooks.driver.switchTo().alert();
            String cond=alert.getText();
            SoftAssert soft=new SoftAssert();
            soft.assertTrue(cond.contains("Wrong password."));
            soft.assertAll();
            System.out.println(cond);
            alert.accept();
        }
        //user enter empty username
        @When("the user enter empty username")
                public void the_user_enter_empty_username()
        {
            login.username().sendKeys("");
        }
        //user enter empty password
       @And("the user enter empty password")
    public void the_user_enter_empty_password()
    {
        login.password().sendKeys("");
    }
    //this is assertion for pop message is displaying "please fill this fields"
    @Then("the user cannot login successfully pop messag display please fill this fields")
    public void the_user_cannot_login_successfully_pop_messa_please_fill_this_fields()
    {
        Alert alert=Hooks.driver.switchTo().alert();
        String cond=alert.getText();
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(cond.contains("Please fill out Username and Password."));
        soft.assertAll();
        System.out.println(cond);
        alert.accept();
    }
}
