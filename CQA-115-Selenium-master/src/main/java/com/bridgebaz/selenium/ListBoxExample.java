package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ListBoxExample {


    public static void main(String[] args) throws InterruptedException {
        //Open the chrome browser
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("C:\\Users\\motew\\IdeaProjects\\CQA115Selenium\\src\\main\\resources\\selectmenu.html");

        //Create an object of Select class and pass the address of list box as an argument

        WebElement list = driver.findElement(By.id("mtr"));
        Select s = new Select(list);
        //getOptions() method returns a list of all the elements of the list box
        List<WebElement> options = s.getOptions();
        int size = options.size();
        System.out.println("Number of elements present inside the listbox is : " + size);
         //Print all the elements present in the list box
        for (WebElement webElement : options) {
            String text = webElement.getText();
            System.out.println(text);
        }
//        selectByIndex() selects an element based on the Index, here index starts with 0
//        s.selectByIndex(1);
//        Thread.sleep(2000);
//         selectByValue() method selects an element based on its value attribute.
         s.selectByValue("i");

        s.selectByVisibleText("Poori");
        System.out.println("************Print all selected options***********");
        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        int size2 = allSelectedOptions.size();
        System.out.println("Number of items that is selected in the list box is : " + size2);
        System.out.println(" Selected items are printed below ");
        for (WebElement webElement : allSelectedOptions) {
            System.out.println(webElement.getText());
        }
        System.out.println("check whether it is a multiple select listbox or not");
        boolean multiple = s.isMultiple();
        System.out.println(multiple + " yes , it is multi select");
        if (multiple) {

            WebElement firstSelectedOption = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption.getText() + "is the first selected item in the list box");

            s.deselectByIndex(0);
            WebElement firstSelectedOption1 = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption1.getText() + " is the first selected item");

//            s.deselectByValue("i");
//            WebElement firstSelectedOption2 = s.getFirstSelectedOption();
//            System.out.println(firstSelectedOption2.getText() + " is the first selected item");
//            s.deselectByVisibleText("Poori");
        }
        Thread.sleep(4000);

        driver.quit();
    }
}
