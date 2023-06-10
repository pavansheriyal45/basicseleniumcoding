package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectByVlue {
    public static void main(String[] args) throws InterruptedException {
        //Open the chrome browser
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("http://omayo.blogspot.com/");

        Thread.sleep(3000);

        WebElement dropdownField = driver.findElement(By.id("drop1"));
        Select select = new Select(dropdownField);

        select.selectByValue("ghi");

        Thread.sleep(3000);
        driver.quit();
    }
}
