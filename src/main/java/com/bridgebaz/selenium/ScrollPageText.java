package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollPageText {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        //driver.get("https://www.flipkart.com/");
        driver.get("https://www.amazon.in/");

        Thread.sleep(3000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        for (int a = 0; a <= 5; a++) {
            javascriptExecutor.executeScript("window.scrollBy(0,300)");
            Thread.sleep(1000);
        }
        for (int a = 0; a <= 5; a++) {
            javascriptExecutor.executeScript("window.scrollBy(0,-300)");
            Thread.sleep(1000);
        }
        Thread.sleep(3000);
        driver.close();

    }
}
