package com.webapp.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeWeb {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.wsupercars.com/website-search/");
        driver.manage().window().maximize();
        WebElement CarName = driver.findElement(By.id("s"));
        CarName.sendKeys("Porsche");
        WebElement SearchBttn = driver.findElement(By.xpath("/html/body/div/main/section/div[2]/form/button"));
        SearchBttn.click();
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(3000);
        //driver.findElement(By.cssSelector("div.wrapper:nth-child(1) main:nth-child(2) section.content div.search-box-holder:nth-child(5) > a.home-box:nth-child(5)")).click();
        driver.findElement(By.cssSelector("div.wrapper:nth-child(1) section.content div.search-box-holder:nth-child(5) a.home-box:nth-child(5) div.thumb:nth-child(1) > img.attachment-post-thumbnail.size-post-thumbnail.wp-post-image")).click();
        //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/section[1]/div[4]/a[2]/div[1]/img[1]")).click();
        //Thread.sleep(3000);
        System.out.println("Done");
    }
}
