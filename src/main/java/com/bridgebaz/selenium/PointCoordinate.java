package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointCoordinate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Point loginCoordinate = driver.findElement(By.name("login")).getLocation();
        System.out.println("X-Coordinate: " + loginCoordinate.getX());
        System.out.println("Y-Coordinate: " + loginCoordinate.getY());

        Thread.sleep(2000);

        driver.close();
    }
}
