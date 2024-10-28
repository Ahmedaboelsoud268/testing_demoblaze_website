package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static ChromeDriver driver;
    @Before
    public static void OpenBrowser()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        //navigate to url
        driver.get("https://www.demoblaze.com/");
    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}

