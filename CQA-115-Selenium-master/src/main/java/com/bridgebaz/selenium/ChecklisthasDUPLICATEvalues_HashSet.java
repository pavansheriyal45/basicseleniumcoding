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

public class ChecklisthasDUPLICATEvalues_HashSet {
    public static void main(String[] args) throws InterruptedException {
        //Open the chrome browser
        //System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

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
        System.out.println("Number of elements in the list is :" + count1);
        HashSet<String> allElementText = new HashSet<String>();
        for (int i = 0; i < count1; i++) {
            String text = allOptions.get(i).getText();
            System.out.println(text);
            allElementText.add(text);
        }
        int count2 = allElementText.size();
        System.out.println("Number of elements in the hashset is :" + count2);
        if (count1 == count2) {
            System.out.println("list box has NO duplicate values");
        } else {
            System.out.println("list box has duplicate values");
        }
        System.out.println(allElementText);
        driver.close();
    }
}

