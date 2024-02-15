package com.bridgelabz;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;
import java.util.Random;


public class Youtube {
    WebDriver driver;

    @Test
    public void searchScrollDownAndPlayVideo() throws InterruptedException, AWTException {
        driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("search_query")).sendKeys("Java");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(2000);


        List<WebElement> lidtOfJavaVideo = driver.findElements(By.xpath("//div[@id='title-wrapper']"));
        for (WebElement elem : lidtOfJavaVideo) {
            System.out.println(elem.getText());
        }
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,1800)");
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        List<WebElement> listings = driver.findElements(By.xpath("//a/yt-formatted-string[@class='style-scope ytd-video-renderer']"));
        Thread.sleep(5000);
        Random r1 = new Random();
        int randomValue = r1.nextInt(listings.size());
        listings.get(randomValue).click();
    }

}
