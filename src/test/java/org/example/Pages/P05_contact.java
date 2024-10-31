package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_contact {
    //locate the contact button
    public WebElement contact_btn()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
    }
    //locate the new message that is displayed in the contact form when i click on contact
    public WebElement new_message ()
    {
        return Hooks.driver.findElement(By.xpath("//h5[@id='exampleModalLabel']"));
    }
    //locate inputs of the contact_email in the contact form
    public WebElement contact_email ()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='recipient-email']"));
    }
    //locate input of contact name in the contact form
    public WebElement contact_name()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='recipient-name']"));
    }
    //locate input message in the contact form
    public WebElement mesage_input()
    {
        return Hooks.driver.findElement(By.xpath("//textarea[@id='message-text']"));
    }
    //locate the send message button in the contact form
    public WebElement send_message_btn()
    {
        return Hooks.driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(1) div.modal-dialog div.modal-content div.modal-footer > button.btn.btn-primary:nth-child(2)"));
    }
    //locate the close button in the contact form
    public WebElement close_btn()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[3]/button[1]"));
    }
    //locate the close icon in the contact form
    public WebElement close_icon()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[3]/button[1]"));
    }
}
