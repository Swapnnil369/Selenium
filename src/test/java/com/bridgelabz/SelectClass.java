package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClass {
    WebDriver driver;
    @Test
    public void selectDropDawn() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);


        WebElement element = driver.findElement(By.id("day"));
        Select select = new Select(element);
        select.selectByIndex(5);
        Thread.sleep(2000);
//        select.selectByVisibleText("6");
//        Thread.sleep(2000);

        WebElement element1 = driver.findElement(By.id("month"));
        Select select1 = new Select(element1);
        select1.selectByValue("3");
        Thread.sleep(2000);

        WebElement element2 = driver.findElement(By.id("year"));
        Select select2 = new Select(element2);
        select2.selectByValue("1997");
        Thread.sleep(2000);
    }
}
