package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.AbstractList;
import java.util.ArrayList;

public class P03_categories {
    //locate the three category in array list
    public ArrayList<WebElement> categoties()
    {
        ArrayList<WebElement> category=new ArrayList<>();
        WebElement phones=Hooks.driver.findElement(By.xpath("//a[contains(text(),'Phones')]"));
        WebElement labtops=Hooks.driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
        WebElement monitors=Hooks.driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));
        category.add(phones);
        category.add(labtops);
        category.add(monitors);
        return category;
    }
    public WebElement product_phones()
    {
        WebElement product1=Hooks.driver.findElement(By.xpath("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        return  product1;
    }
    public WebElement product_labtops()
    {
        WebElement product2=Hooks.driver.findElement(By.xpath("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h4[1]"));
        return product2;
    }
    public WebElement product_monitors()
    {
        WebElement product3=Hooks.driver.findElement(By.xpath("//a[contains(text(),'Apple monitor 24')]"));
         return product3;
    }
    public WebElement addtocart()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
    }
}
