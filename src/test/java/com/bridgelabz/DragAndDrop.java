package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
    WebDriver driver;
    @Test
    public void DragAndDrop() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop= driver.findElement(By.xpath("//p[text()='Drop here']"));
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.moveToElement(drag).clickAndHold().perform();
        actions.release(drop).perform();

    }
}
