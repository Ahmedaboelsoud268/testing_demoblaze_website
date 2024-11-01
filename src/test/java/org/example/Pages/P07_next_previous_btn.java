package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_next_previous_btn {
    public WebElement next_btn()
    {
        return Hooks.driver.findElement(By.xpath("//button[@id='next2']"));
    }
    public WebElement previous_btn()
    {
        return Hooks.driver.findElement(By.cssSelector("#prev2"));
    }
//    public WebElement ()
//    {
//        return Hooks.driver.findElement(By.xpath(""));
//    }
//    public WebElement ()
//    {
//        return Hooks.driver.findElement(By.xpath(""));
//    }
}
