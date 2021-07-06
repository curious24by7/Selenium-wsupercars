package com.webapp.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeWeb {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wsupercars.com/website-search/");
        driver.manage().window().maximize();

        WebElement CarName = driver.findElement(By.id("s"));
        CarName.sendKeys("Porsche");

        WebElement SearchBttn = driver.findElement(By.xpath("/html/body/div/main/section/div[2]/form/button"));
        SearchBttn.click();


        WebElement Image = driver.findElement(By.xpath("//a[contains(text(),'2013 PORSCHE 911 GT3 Cup')]"));
        /*Actions act = new Actions(driver);
        act.moveToElement(Image).click().build().perform();*/

        Image.click();
        System.out.println("Done");


    }
}
