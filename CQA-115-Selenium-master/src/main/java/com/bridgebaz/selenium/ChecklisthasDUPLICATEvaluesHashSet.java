package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;

public class ChecklisthasDUPLICATEvaluesHashSet {
    public static void main(String[] args) throws InterruptedException {
        //Open the chrome browser
//        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
//
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
//
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("C:\\Users\\motew\\IdeaProjects\\CQA115Selenium\\src\\main\\resources\\selectmenu.html");

        WebElement listbox = driver.findElement(By.id("mtr"));
        Select s = new Select(listbox);
        List<WebElement> allOptions = s.getOptions();
        int count1 = allOptions.size();
        System.out.println("Number of elements in the list is :" +count1);
        HashSet<String> allElementText = new HashSet<String>();
        for (int i = 0; i < count1; i++) {
            String text = allOptions.get(i).getText();

            if (!allElementText.add(text)) {
                System.out.println(text +" is the duplicate item in the list box");
            }
        }
        System.out.println(allElementText.size());
        // it will print all the unique values in the HashSet object
        System.out.println(allElementText);
        driver.close();

    }
}
