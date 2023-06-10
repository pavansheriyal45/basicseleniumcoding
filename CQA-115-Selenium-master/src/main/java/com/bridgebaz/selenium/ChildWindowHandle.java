package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;

public class ChildWindowHandle {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");

        Thread.sleep(6000);

        String parentWindowHandleId = driver.getWindowHandle();
        System.out.println("parent window handle id: " + parentWindowHandleId);
        System.out.println("parent window Title: " + driver.getTitle());

        driver.findElement(By.xpath("//span[contains(text(),'Remote')]")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        String firstChildWindow = null;
        for (String windowHandle : windowHandles) {
            System.out.println("window handle Id: " + windowHandle);

            if (!windowHandle.equals(parentWindowHandleId)) {
                firstChildWindow = windowHandle;
                driver.switchTo().window(windowHandle);
                Thread.sleep(8000);
                driver.findElement(By.xpath("//a[contains(text(),'Immediate requirement For Data Engineer @Infogain')]")).click();
                Thread.sleep(4000);
                System.out.println("child window Title: " + driver.getTitle());
                 //driver.close();
            }
        }

        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String allWindowHandle : allWindowHandles) {

            /* to close all window accept parent window */
            if (!allWindowHandle.equals(parentWindowHandleId)) {
                if (allWindowHandle.equals(firstChildWindow)) {
                    driver.close();
                } else if (!allWindowHandle.equals(firstChildWindow)) {
                    driver.switchTo().window(allWindowHandle);
                    Thread.sleep(2000);
                    driver.close();
                }
            }
            /* to close parent window */
            else if (allWindowHandle.equals(parentWindowHandleId)) {
                //driver.close();
            }
        }
        Thread.sleep(2000);
        //driver.close();
        driver.quit();
    }
}
