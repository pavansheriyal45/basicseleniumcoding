package com.bridgebaz.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebInterfaceMethod1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/");

        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("775793");
        Thread.sleep(3000);

        String value = driver.findElement(By.xpath("//input[@id='session_key']")).getAttribute("value");
        System.out.println("Value present inside the text box is : " + value);
        String type = driver.findElement(By.xpath("//input[@id='session_key']")).getAttribute("type");
        System.out.println("type present inside the text box is : " + type);



        driver.findElement(By.xpath("//input[@id='session_key']")).clear();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("8109555221");
        Thread.sleep(3000);

//        driver.findElement(By.name("pass")).sendKeys("Test12345");
//        Thread.sleep(3000);

        Point nextCoordinate = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).getLocation();

        System.out.println("X-Coordinate: " + nextCoordinate.getX());
        System.out.println("Y-Coordinate: " + nextCoordinate.getY());

        Dimension signInBtnSize = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).getSize();
        System.out.println("Height: " + signInBtnSize.getHeight());
        System.out.println("Width: " + signInBtnSize.getWidth());

        WebElement signinBtn = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        if (signinBtn.isDisplayed()) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Home page is NOT displayed");
        }

        WebElement signINButton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        if (signINButton.isSelected()) {
            System.out.println("Sign in Button is selected");
        } else {
            System.out.println("Sign in Button is not selected");
        }

        String xpathforVersion = "//button[contains(text(),'Sign in')]";
        String version = driver.findElement(By.xpath(xpathforVersion)).getText();
        System.out.println("Version of actitime on login page is : " + version);


        driver.close();
    }
}
