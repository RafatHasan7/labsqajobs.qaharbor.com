package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        driver.get("https://labsqajobs.qaharbor.com");
        driver.manage().window().maximize();
        Thread.sleep(6000);

        driver.close();


    }
}