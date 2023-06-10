package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.istqb.in/");

        WebElement foundationLink = driver.findElement(By.xpath("//span[text()=\"FOUNDATION\"]"));

        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(foundationLink).perform();

        Thread.sleep(6000);

        driver.quit();
    }
}
