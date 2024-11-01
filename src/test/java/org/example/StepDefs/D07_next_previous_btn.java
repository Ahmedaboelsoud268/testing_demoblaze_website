package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P07_next_previous_btn;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class D07_next_previous_btn {
    P07_next_previous_btn nextPreviousBtn=new P07_next_previous_btn();
    @Given("selenium click on next button")
    public void seleniumclickonnextbutton() throws InterruptedException {
        Thread.sleep(2000);
        Actions actions=new Actions(Hooks.driver);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        nextPreviousBtn.next_btn().click();
    }

    @Then("the next button is clickable")
    public void theNextButtonIsClickable()
    {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(nextPreviousBtn.next_btn().isEnabled());
        softAssert.assertAll();
    }

    @And("selenium click on previous button")
    public void seleniumClickOnPreviousButton() throws InterruptedException {
        Thread.sleep(2000);
        nextPreviousBtn.previous_btn().click();
    }

    @Then("the previous button is clickable")
    public void thePreviousButtonIsClickable()
    {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(nextPreviousBtn.previous_btn().isEnabled());
        softAssert.assertTrue(nextPreviousBtn.next_btn().isDisplayed());

    }
}
