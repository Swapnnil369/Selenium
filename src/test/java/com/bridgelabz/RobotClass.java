package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {
    WebDriver driver;
    @Test
    public void Using_RobotClass() throws AWTException, InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Robot robot=new Robot();
        robot.mouseMove(300,300);
//        robot.mouseWheel(2);

        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);

    }

}
