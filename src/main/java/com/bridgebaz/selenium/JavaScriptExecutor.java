package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\motew\\IdeaProjects\\CQA115Selenium\\src\\main\\resources\\test.html");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("Aditya");
        Thread.sleep(5000);

        driver.close();
    }
}
