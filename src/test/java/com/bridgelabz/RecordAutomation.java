package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

public class RecordAutomation {
    WebDriver driver;

    @Test
    public void record() throws Exception {
        driver = new ChromeDriver();
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_R);
        Thread.sleep(2000);
    }

    @Test
    public void logIn() throws Exception {
        record();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("unique.swapnilpatil639@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Swapnil@987");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(6000);
    }

    @Test
    public void countPostLike() throws Exception {
        logIn();
        Thread.sleep(5000);
        WebElement homemenu = driver.findElement(By.xpath("//a[@aria-label='Home']"));
        homemenu.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a/div/div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]")).click();
        Thread.sleep(3000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            javascriptExecutor.executeScript("window.scrollBy(0, 300)");
            Thread.sleep(1000);
        }
        Thread.sleep(5000);
        for (int i = 0; i < 5; i++) {
            javascriptExecutor.executeScript("window.scrollBy(0, -300)");
            Thread.sleep(1000);
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='x1n2onr6']//div[@class='x6s0dn4 x78zum5 x1iyjqo2 x6ikm8r x10wlt62']//span[@class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j']//img")).click();
        Thread.sleep(2000);
        List<WebElement> likePost = driver.findElements(By.xpath("//div[@class='x78zum5 xdt5ytf x1iyjqo2 x7ywyr2']//div[@data-visualcompletion='ignore-dynamic']"));
        System.out.println("No. of like:" + likePost.size());

        driver.quit();

    }

}
