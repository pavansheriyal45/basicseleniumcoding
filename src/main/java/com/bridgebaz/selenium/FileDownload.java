package com.bridgebaz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;

public class FileDownload {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-notifications");


        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);

        String downloadFilepath = System.getProperty("user.dir");
        chromePrefs.put("download.default_directory", downloadFilepath);
        chromeOptions.setExperimentalOption("prefs",chromePrefs);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("https://omayo.blogspot.com/p/page7.html");

        driver.findElement(By.linkText("ZIP file")).click();

        Thread.sleep(5000);

        File file = new File(downloadFilepath+"\\DownloadDemo-master.zip");

        if (file.exists()){
            System.out.println("File got successfully downloaded");
        }else {
            System.out.println("File is not downloaded");
        }

    }
}
