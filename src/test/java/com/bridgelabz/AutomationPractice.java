package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class AutomationPractice {
    public WebDriver driver;
    @Test
    public void ronMethod() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement ele = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        int xCoordinate = ele.getLocation().getX();
        int newPosition = xCoordinate+10;
        int yCoordiante = ele.getLocation().getY();

        System.out.println(xCoordinate);

        System.out.println(newPosition);
        System.out.println(yCoordiante);

        Robot robot = new Robot();
        robot.mouseMove(newPosition,yCoordiante);
        Thread.sleep(3000);
        robot.mousePress(newPosition);
        ele.click();


    }
}
