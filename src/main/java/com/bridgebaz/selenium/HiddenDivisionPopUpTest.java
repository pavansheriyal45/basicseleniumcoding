package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopUpTest {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--disable-notifications");
//
//        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("8109555221");
        driver.findElement(By.name("pass")).sendKeys("Test12345");

        Thread.sleep(3000);

        driver.findElement(By.name("login")).click();

        Thread.sleep(8000);

        driver.findElement(By.xpath("//span[contains(text(),'John Smith')]")).click();

        Thread.sleep(10000);
        driver.close();

    }
}
