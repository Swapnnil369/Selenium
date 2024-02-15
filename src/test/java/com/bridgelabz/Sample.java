package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Sample {

    WebDriver driver;

     @Test
    public void login() throws InterruptedException {
         ChromeOptions chromeOptions=new ChromeOptions();
         chromeOptions.addArguments("--disable-notifications");
         driver=new ChromeDriver(chromeOptions);

         driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id='email']")).sendKeys("unique.swapnilpatil639@gmail.com");
         driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Swapnil@987");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
         Thread.sleep(8000);
         driver.findElement(By.xpath("//a[@aria-label='Home']")).click();
     }
}
