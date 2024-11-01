package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_about_us {
    public WebElement about_us()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'About us')]"));
    }
    public WebElement play_video()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='videoModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]"));
    }
    public WebElement assert_playing()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='videoModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[5]"));
    }
    public WebElement close_btn()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='videoModal']/div[1]/div[1]/div[3]/button[1]"));
    }
}
