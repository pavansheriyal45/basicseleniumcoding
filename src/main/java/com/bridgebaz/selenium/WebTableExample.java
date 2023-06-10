package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\motew\\IdeaProjects\\CQA115Selenium\\src\\main\\resources\\table.html");
        //Count Total number of rows present in the table
        List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
        int totalRows = allRows.size();
        System.out.println("total number of rows present in the table is :" + totalRows);
        //count total number of columns
        List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
        int totalColumns = allColumns.size();
        System.out.println("Total number of columns in the table is :" + totalColumns);
        //Count number of cells present in the table
        List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
        int totalCells = allCells.size();
        System.out.println("Total number of cells present in the table is :" + totalCells);
    }
}
