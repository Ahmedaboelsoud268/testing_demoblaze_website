package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P06_about_us;
import org.testng.asserts.SoftAssert;

public class D06_about_us {
    P06_about_us about_us=new P06_about_us(); //object from class about us
   //the selenium is click on the about us
    @Given("selenium click on the about us")
    public void seleniumclickotheaboutus()
    {
        about_us.about_us().click();
    }
//selenium is click on the play video
    @When("selenium click on play video")
    public void seleniumClickOnPlayVideo()
    {
        about_us.play_video().click();
    }
//assert on the video is playing
    @Then("assert the video is playing")
    public void assertTheVideoIsPlaying()
    {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(about_us.assert_playing().isDisplayed());
        softAssert.assertAll();
    }

    @And("selenium is click on close")
    public void seleniumIsClickOnClose()
    {
        System.out.println(about_us.close_btn().getText());
        about_us.close_btn().click();
    }
}
