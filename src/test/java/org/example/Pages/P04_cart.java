package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_cart {

        public WebElement product()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[6]/div[1]/a[1]/img[1]"));
    }
        public WebElement add_cart()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
    }
    public WebElement cart()
    {
        return Hooks.driver.findElement(By.xpath("//a[@id='cartur']"));
    }
        public WebElement assert_product_incart()
    {
        return Hooks.driver.findElement(By.xpath("//tbody/tr[1]/td[1]/img[1]"));
    }
        public WebElement delete()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Delete')]"));
    }
    public WebElement total_num()
    {
        return Hooks.driver.findElement(By.xpath("//h3[@id=\"totalp\"]"));
    }
    //locate place order button to enter data
    public WebElement place_order_button()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"));
    }
    //locate head of the frame of place order to assert with it
    public WebElement place_order_frame()
    {
        return Hooks.driver.findElement(By.xpath("//h5[@id='orderModalLabel']"));
    }
    //locate name fields of the place order
    public WebElement name()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='name']"));
    }
    //locate country fields of the place order
    public WebElement country()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='country']"));
    }
    //locate city fields of the place order
    public WebElement city()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='country']"));
    }
    //locate credit card fields of the place order
    public WebElement credit_card()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='card']"));
    }
    //locate month fields of the place order
    public WebElement month()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='month']"));
    }
    //locate year fields of the place order
    public WebElement year()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='year']"));
    }
    //locate purchase button of the place order
    public WebElement purchase_button()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Purchase')]"));
    }
    //locate close button of the place order
    public WebElement close_button()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='orderModal']/div[1]/div[1]/div[3]/button[1]"));
    }
    //locate close icon of the place order
    public WebElement close_icon()
    {
        return Hooks.driver.findElement(By.xpath("//body/div[@id='orderModal']/div[1]/div[1]/div[3]/button[1]"));
    }
    //locate pop_message of the og success the operation of the purchase
    public WebElement pop_message()
    {
        return Hooks.driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
    }
    //locate the th ok button when the pop message is displayed
    public WebElement ok_button()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
    }
}
