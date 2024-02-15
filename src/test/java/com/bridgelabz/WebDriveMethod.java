package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriveMethod {
    WebDriver driver;
    @Test
    public void test() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

        String title= driver.getTitle();
        System.out.println(title);

        String pagesource= driver.getPageSource();
        System.out.println(pagesource);

        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://google.com");
        String windowHandle= driver.getWindowHandle();
        System.out.println(windowHandle);
        Thread.sleep(2000);
        driver.close();
    }

}
