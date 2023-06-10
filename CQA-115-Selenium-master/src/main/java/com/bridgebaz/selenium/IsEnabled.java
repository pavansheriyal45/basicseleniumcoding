package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        boolean e = driver.findElement(By.id("pass")).isEnabled();
        System.out.println("isEnabled: "+e);

        Thread.sleep(2000);
        driver.close();
    }
}
