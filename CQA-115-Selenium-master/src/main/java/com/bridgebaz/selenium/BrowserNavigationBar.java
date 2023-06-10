package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNavigationBar {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("775793");
        Thread.sleep(2000);

        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        driver.close();
    }
}
