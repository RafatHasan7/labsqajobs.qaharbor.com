package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginpage {
    WebDriver driver = new ChromeDriver();
    //try  {
    {

    driver.get("https://labsqajobs.qaharbor.com/login/");
        WebElement usernameFieldContains = driver.findElement(By.xpath("//input[contains(@id, 'email')]"));
        usernameFieldContains.clear();
        usernameFieldContains.sendKeys("rafat.editor1@gmail.com");

        WebElement passwordFieldContains = driver.findElement(By.xpath("//input[contains(@id, 'password')]"));
        passwordFieldContains.sendKeys("rafat123");

        public void clickLoginButton(){
            WebElement loginButton= driver.findElement(By.xpath("//input[contains(@class, 'Login')]"));


    }

    }//catch (Exception eexpected;)


    }



