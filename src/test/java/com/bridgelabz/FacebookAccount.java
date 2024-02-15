package com.bridgelabz;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FacebookAccount {
    public WebDriver driver;

    @Test
    public void signUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String title = driver.getTitle();
        System.out.println(title);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Swapnil");
        driver.findElement(By.name("lastname")).sendKeys("Patil");
        driver.findElement(By.name("reg_email__")).sendKeys("9967891679");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Swapnil123");
        driver.findElement(By.name("birthday_day")).sendKeys("6");
        driver.findElement(By.name("birthday_month")).sendKeys("March");
        driver.findElement(By.name("birthday_year")).sendKeys("1997");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        driver.quit();
    }

    @Test
    public void logIn() throws InterruptedException, IOException, AWTException {

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
    public void post() throws InterruptedException, IOException, AWTException {
        logIn();
        Thread.sleep(2000);
        WebElement homemenu = driver.findElement(By.xpath("//a[@aria-label='Home']"));
        homemenu.click();
        Thread.sleep(3000);
        WebElement photoVideoUpload = driver.findElement(By.xpath("//span[text()='Photo/video']"));
        photoVideoUpload.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8']")).sendKeys("Knowledge is deeper than the ocean and wider than the sky. There is always so much to learn. So always keep your mind open to learn new things and you will find yourself everyday becoming wiser than yesterday");
        Thread.sleep(2000);
        WebElement photo1 = driver.findElement(By.xpath("//span[text()='Add photos/videos']"));
        photo1.click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\shiva\\OneDrive\\Desktop\\File\\Ocean.exe");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Post']")).click();
        Thread.sleep(2000);
    }

    @Test
    public void countPostLike() throws InterruptedException, IOException, AWTException {
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

    }

    @Test
    public void findFriendProfile() throws InterruptedException, IOException, AWTException {
        logIn();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@aria-label='Friends']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='All Friends']")).click();
        Thread.sleep(2000);

        List<WebElement> listofFriends = driver.findElements(By.xpath("//div[@class='x135pmgq']//div[@data-visualcompletion='ignore-dynamic']"));
        System.out.println(listofFriends.size());
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        for (int i = 1; i <= listofFriends.size(); i++) {

            WebElement clickele = driver.findElement(By.xpath("//div[@class='x135pmgq']//div[@data-visualcompletion='ignore-dynamic'][" + i + "]"));
            clickele.click();
            for (int j = 0; j < 4; j++) {

                javascriptExecutor.executeScript("window.scrollBy(0, 300)");
                Thread.sleep(1000);
            }
            WebElement like = driver.findElement(By.xpath("//div[@class='xq8finb x16n37ib']//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x2lah0s x193iq5w xeuugli x150jy0e x1e558r4 x10b6aqq x1yrsyyn']//span[text()='Like'][1]"));
            like.click();
            Thread.sleep(1000);

        }
    }

    @Test
    public void addCoverPhoto() throws InterruptedException, IOException, AWTException {
        logIn();
        Thread.sleep(2000);
        WebElement homemenu = driver.findElement(By.xpath("//a[@aria-label='Home']"));
        homemenu.click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a/div/div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[text()='Edit cover photo']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Upload photo']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\shiva\\OneDrive\\Desktop\\File\\Sun.exe");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xbxaen2 x1u72gb5 xtvsq51 x1r1pt67']")).click();
    }

    @Test
    public void logOut() throws InterruptedException, IOException, AWTException {
        logIn();
        Thread.sleep(2000);
        WebElement homemenu = driver.findElement(By.xpath("//a[@aria-label='Home']"));
        homemenu.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']")).click();
        Thread.sleep(5000);
        // Logout
        driver.findElement(By.xpath("//span[text()='Log out']")).click();
    }

    @Test
    public void take_ScreenShot() throws Exception {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File SFile = ts.getScreenshotAs(OutputType.FILE);
        File DFile = new File("D:\\CFP-251\\Automation\\facebook.png");
        FileHandler.copy(SFile, DFile);
        driver.close();


    }


}
