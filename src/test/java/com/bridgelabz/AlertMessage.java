package com.bridgelabz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertMessage {
    WebDriver driver=new ChromeDriver();
    @Test
    public void simple_alert() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void simple_alert2() throws InterruptedException {
        Thread.sleep(6000);
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        Alert alert=driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
    }
    @Test
    public void simple_alert3() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(4000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void simple_alert4() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.id("promtButton")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(5000);
        alert.sendKeys("Swapnil");
        Thread.sleep(5000);
        alert.accept();
        Thread.sleep(2000);
        driver.quit();

    }
}
