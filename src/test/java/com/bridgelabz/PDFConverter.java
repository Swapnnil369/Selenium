package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class PDFConverter {
    WebDriver driver;
    @Test
    public void pdfConvert() throws IOException, InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\shiva\\OneDrive\\Desktop\\File\\AutoIt.exe");
        Thread.sleep(25000);
        driver.findElement(By.xpath("//div[text()='.docx' or text()='(.docx)']")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[@id='app']/div/div[1]/header/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/button/div/span")).click();
        Thread.sleep(12000);
        driver.findElement(By.xpath("//span[text()='Continue' or text()='Convert']")).click();
        Thread.sleep(6000);
    }
}
