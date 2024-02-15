package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleExample {

    @Test
    public void search() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement searchInput = driver.findElement(By.name("q"));
        Thread.sleep(2000);

        searchInput.sendKeys("Selenium WebDriver");
        Thread.sleep(2000);


        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        Thread.sleep(2000);


        WebElement firstResultLink = driver.findElement(By.cssSelector("h3"));
        firstResultLink.click();
        Thread.sleep(2000);

        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        driver.quit();

    }
}

