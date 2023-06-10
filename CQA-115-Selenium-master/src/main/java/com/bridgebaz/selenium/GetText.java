package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetText {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement email = driver.findElement(By.id("email"));

        driver.findElement(By.id("email")).sendKeys("8109555221");

        Thread.sleep(2000);


        String str = driver.findElement(By.linkText("Create new account")).getText();
        System.out.println("Link Text is: "+str);

        Thread.sleep(2000);
        driver.close();

    }
}
