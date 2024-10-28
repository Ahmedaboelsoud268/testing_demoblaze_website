package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    //locate login in home page;;
    public WebElement log_in()
    {
        return Hooks.driver.findElement(By.linkText("Log in"));
    }
    //locate usename in login in home page;;
    public WebElement username()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='loginusername']"));
    }
    //locate password in login in home page;;
    public WebElement password()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='loginpassword']"));
    }
    //locate  login_button in login page in home page;;
    public WebElement login_butt()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    }
    //this locate for assertion
    public WebElement ass_ert()
    {
        return Hooks.driver.findElement(By.xpath("//a[@id='nameofuser']"));
    }



}
