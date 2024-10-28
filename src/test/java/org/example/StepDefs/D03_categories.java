package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.Pages.P03_categories;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;

public class D03_categories {
    //this compisation inhertince
    P03_categories categories=new P03_categories();
    WebElement random_categories; //this store the random categories that come from the method of random;;
    //here we can select one of three categories randomly;;;;
    @When("selenium click one of three categories randomly")
    public void selenium_click_one_of_three_categories_randomly() throws InterruptedException {
        ArrayList<WebElement> cate=categories.categoties(); //we can store the return categories in arraylist
        System.out.println(cate.size());//here we can check the numbers of the categories
        //this method select the category randomly;;
        Random random=new Random();
        int get_random=random.nextInt(cate.size());
        random_categories=cate.get(get_random);
        System.out.println(random_categories.getText()); //here we can check the selected category;;
        random_categories.click();
        //Thread.sleep(1000); //i use this static wait to check
        //here i can the explicit wait to wait until the the button is clickable;;
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.elementToBeClickable(random_categories));

    }
    @And("selenium click on one prouduct of one of random category and add to cart")
    public void selenium_click_on_one_prouduct_of_one_of_random_category() throws InterruptedException {
//here i used the if condition on the random category is phones and then select the product and add to cart
        if (random_categories.getText().contains("Phones"))
        {
                 categories.product_phones().click();
                 Thread.sleep(3000);
                 categories.addtocart().click();
                 Thread.sleep(3000);
        }
        else if (random_categories.getText().contains("Laptops"))
        {
            categories.product_labtops().click();
            Thread.sleep(3000);
            categories.addtocart().click();
            Thread.sleep(3000);
        }
        else if(random_categories.getText().contains("Monitors"))
        {
            categories.product_monitors().click();
            Thread.sleep(3000);
            categories.addtocart().click();
            Thread.sleep(3000);
        }
    }
    //here i assert on the alert wil diplay when i add to cart
    @Then("selenium assert on the product added successfully to cart")
    public void selenium_assert_on_the_product_added_successfully_to_cart()
    {
        Alert alert=Hooks.driver.switchTo().alert();
        String cond= alert.getText();
       SoftAssert softAssert=new SoftAssert();
       softAssert.assertTrue(cond.contains("Product added"),"error in the alert");
       softAssert.assertAll();
       alert.accept();
    }
}
