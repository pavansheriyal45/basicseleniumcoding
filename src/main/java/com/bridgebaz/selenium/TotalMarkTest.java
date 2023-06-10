package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TotalMarkTest {
    public static void main(String[] args) throws InterruptedException {
        //Open the chrome browser
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("C:\\Users\\motew\\IdeaProjects\\CQA115Selenium\\src\\main\\resources\\table.html");

        int total = Integer.parseInt(driver.findElement(By.xpath("//tbody/tr[5]/td[3]")).getText());

        int actualTotal = 0;

        //tbody/tr[4]/td[3]
        for (int i=2; i <= 4; i++){

            String xpath = "//tbody/tr["+ i +"]/td[3]";
            actualTotal = actualTotal + Integer.parseInt(driver.findElement(By.xpath(xpath)).getText());
        }

        System.out.println("Total sum coming as: "+actualTotal);
        if (total == actualTotal){
            System.out.println("Total sum is correct");
        }else {
            System.out.println("Total sum is incorrect... It is not matching with total row value...");
        }

        Thread.sleep(5000);

        driver.quit();
    }
}
