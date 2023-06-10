package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class AutosuggestionEx_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //Open the chrome browser

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://www.google.in");
        //Enter Selenium in google search text box
        driver.findElement(By.name("q")).sendKeys("java");
        Thread.sleep(2000);
        List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(text(),'java')]"));
        int count = allOptions.size();
        System.out.println("Number of values present in the dropdown is : " + count);
        String expectedValue = "java interview questions";
       //Print all the auto suggestion values
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(" " + text);
            //Click on Java Interview Questions
            if (text.equalsIgnoreCase(expectedValue)) {
                option.click();
                break;
            }
        }
        driver.close();
    }
}