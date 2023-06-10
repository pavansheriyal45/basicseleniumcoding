package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebInterfaceMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8109555221");
        Thread.sleep(3000);

        driver.findElement(By.name("pass")).sendKeys("Test12345");
        Thread.sleep(3000);

        driver.findElement(By.linkText("Create new account")).submit();
        Thread.sleep(4000);

        Thread.sleep(3000);
        String tagName = driver.findElement(By.id("email")).getTagName();
        if (tagName.equals("e")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        driver.close();
    }
}
