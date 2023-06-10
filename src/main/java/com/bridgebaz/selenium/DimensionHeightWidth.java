package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DimensionHeightWidth {
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

        Dimension loginBtnSize = driver.findElement(By.name("login")).getSize();
        System.out.println("Height: " + loginBtnSize.getHeight());
        System.out.println("Width: " + loginBtnSize.getWidth());

        Thread.sleep(2000);

        driver.quit();
    }
}
