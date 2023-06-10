package com.bridgebaz.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandling {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println("First Alert Text: "+alert.getText());
        Thread.sleep(5000);
        alert.sendKeys("smith");
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(8000);
        driver.close();
    }
}
