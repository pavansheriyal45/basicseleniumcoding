package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("775793");
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destinationFile = new File(System.currentTimeMillis() + "_screenshot.png");

        // FileHandler.copyFile(sourceFile, destinationFile);

        try {
            FileHandler.copy(sourceFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(3000);
        driver.close();
    }
}
