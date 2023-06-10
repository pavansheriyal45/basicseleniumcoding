package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DragAndDropTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Wait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        //WebElement source = driver.findElement(By.id("draggable"));
        WebElement source = (WebElement) fluentWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("draggable"))));
        WebElement destination = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("droppable"))));

        Actions actions = new Actions(driver);

        Thread.sleep(3000);

        actions.dragAndDrop(source, destination).perform();

        Thread.sleep(8000);
        driver.quit();
    }
}
