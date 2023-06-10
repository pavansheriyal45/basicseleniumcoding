package com.bridgebaz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard_mouse_Operations {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);
        Robot robot = new Robot();

        robot.mouseMove(3000, 400);

        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_I);

        robot.keyRelease(KeyEvent.VK_I);

        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_H);

        robot.keyRelease(KeyEvent.VK_H);

        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(3000);

        driver.close();

        driver.quit();
    }
}
