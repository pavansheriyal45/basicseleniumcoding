package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
        //Open the chrome browser
//        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("https://www.facebook.com/login.php/");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("775793");
        Thread.sleep(3000);

//        driver.findElement(By.id("email")).sendKeys("775793");
//
//        Thread.sleep(3000);

        driver.findElement(By.id("email")).clear();

        Thread.sleep(3000);

        driver.findElement(By.id("email")).sendKeys("8109555221");

        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Test12345");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();

    }
}
