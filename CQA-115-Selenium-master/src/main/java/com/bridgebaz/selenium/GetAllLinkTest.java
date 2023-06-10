package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class GetAllLinkTest {
    public static void main(String[] args) throws InterruptedException {
        //Open the chrome browser
//        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
//
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
//
//        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("https://www.amazon.in/");

        List<WebElement> totalLinks = driver.findElements(By.tagName("a"));

        System.out.println("Total links present on the webpage: "+totalLinks.size());

        int visibleLinkCount = 0, hiddenLinkCount = 0;

        for (WebElement link : totalLinks) {
            if (link.isDisplayed()) {
                visibleLinkCount++;
                System.out.println("visible link: " + link.getText());
            } else {
                hiddenLinkCount++;
            }
        }
            System.out.println("Total visible link: "+visibleLinkCount);
            System.out.println("Total visible link: "+hiddenLinkCount);

            Thread.sleep(5000);

            driver.quit();

    }
}
