package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutors {
    WebDriver driver;
    @Test
    public void Text_DisableField() throws InterruptedException{
        driver=new ChromeDriver();
        driver.get("C:\\Users\\shiva\\OneDrive\\Desktop\\Selenium\\index.html");
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("document.getElementById('username').value='Swapnil'");
        Thread.sleep(1000);
        js.executeScript("document.getElementById('pass').value='Swapnil@369'");
        Thread.sleep(2000);
        driver.navigate().to("C:\\Users\\shiva\\OneDrive\\Desktop\\Selenium\\Page4.html");

    }

}
