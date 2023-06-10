package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TitlePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8109555221");
        Thread.sleep(3000);

        driver.findElement(By.name("pass")).sendKeys("Test12345");
        Thread.sleep(3000);


        String actualTitle = driver.getTitle();

        System.out.println("Title of the page: " + actualTitle);
        String expectedTitle = "Facebook";

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Home page is loaded...");
        } else {
            System.out.println("Home page is not loaded...");
        }
        driver.close();
    }
}
