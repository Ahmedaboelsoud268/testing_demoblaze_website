package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_signup {
    //locate sign up in the home page
    public WebElement sign_up()
    {
        return Hooks.driver.findElement(By.xpath("//a[@id='signin2']"));
    }
    //locate the username filed
    public WebElement username()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='sign-username']"));
    }
    //locate password field
    public WebElement password()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='sign-password']"));
    }
    //locate the sign in inside the sign in page
    public WebElement signupof()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
    }
    //locate the the icon cancel
    public WebElement cance()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='signInModal']/div[1]/div[1]/div[3]/button[1]"));
    }
    //locate the the close in login in home page
    public WebElement close()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='signInModal']/div[1]/div[1]/div[3]/button[1]"));
    }

}
