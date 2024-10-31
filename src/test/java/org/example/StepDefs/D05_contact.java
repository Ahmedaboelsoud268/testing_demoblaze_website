package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P05_contact;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D05_contact {
    P05_contact contact=new P05_contact(); //object from class
    @Given("selenium click on the contact in home page")
    public void seleniumlickonthecontactinhomepage() throws InterruptedException
    {
        contact.contact_btn().click();
        Thread.sleep(1000);
    }


    @Then("assert an inputs fileds form is displayed")
    public void assertAnInputsFiledsFormIsDisplayed()
    {
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(contact.new_message()));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(contact.new_message().isDisplayed(),"asd");
        softAssert.assertAll();
        System.out.println(contact.new_message().getText());
    }

    @When("selenium enter valid email {string}")
    public void seleniumEnterValid(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        contact.contact_email().sendKeys(arg0);
    }

    @And("selenium enter vaild name {string}")
    public void seleniumEnterVaild(String arg1) throws InterruptedException {
        Thread.sleep(1000);
        contact.contact_name().sendKeys(arg1);
    }

    @And("selenium enter valid message {string}")
    public void seleniumEnterValidMessage(String arg2) throws InterruptedException {
        Thread.sleep(1000);
        contact.mesage_input().sendKeys(arg2);
    }

    @And("click on send message")
    public void clickOnSendMessage() throws InterruptedException {
        contact.send_message_btn().click();
    }

    @Then("assert with alert message _Thanks for the message!!_ and click ok")
    public void assertWithAlertMessage_ThanksForTheMessage_AndClickOk() throws InterruptedException {
        Thread.sleep(2000);
        Alert alert=Hooks.driver.switchTo().alert();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(alert.getText().contains("Thanks for the message!!"),"asd");
        softAssert.assertAll();
        System.out.println(alert.getText());
        alert.accept();
    }
//this scenario of invalid data
@When("selenium enter invalid email {string}")
public void seleniumEnterInvalidEmail(String arg0)
{
    contact.contact_email().sendKeys(arg0);
}

    @And("selenium enter invaild name {string}")
    public void seleniumEnterInvaildName(String arg0)
    {
        contact.contact_name().sendKeys(arg0);
    }

    @And("selenium enter invalid message {string}")
    public void seleniumEnterInvalidMessage(String arg0)
    {
        contact.mesage_input().sendKeys(arg0);
    }

    @Then("assert with alert message _please enter valid email!!_ and click ok")
    public void assertWithAlertMessage_pleaseEnterValidEmail_AndClickOk() throws InterruptedException {
        Thread.sleep(2000);
        Alert alert=Hooks.driver.switchTo().alert();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(alert.getText().contains("please fill the inputs fields with valid data"),"asd");
        softAssert.assertAll();
        System.out.println(alert.getText());
        alert.accept();
    }

//this scenario of empty data
    @When("selenium enter empty_email {string}")
    public void seleniumEnterEmpty(String arg0)
    {
        contact.contact_email().sendKeys(arg0);
    }

    @And("selenium enter empty_name {string}")
    public void seleniumEnterEmpty_name(String arg0)
    {
        contact.contact_name().sendKeys(arg0);
    }

    @And("selenium enter emptymessage {string}")
    public void seleniumEnterEmptymessage(String arg0)
    {
        contact.mesage_input().sendKeys(arg0);
    }

    @Then("assert with alert message _please fill this inputs with empty data_ and click ok")
    public void assertWithAlertMessage_pleaseFillThisInputsWithEmptyData_AndClickOk() throws InterruptedException {
        Thread.sleep(2000);
        Alert alert=Hooks.driver.switchTo().alert();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(alert.getText().contains("please fill the inputs fields"),"asd");
        softAssert.assertAll();
        System.out.println(alert.getText());
        alert.accept();
    }


}
