package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        String messageText = message.getText();
        System.out.println(messageText);

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));

        Actions action2 = new Actions(driver);
        action.contextClick(rightClickButton).perform();


        WebElement message2 = driver.findElement(By.id("rightClickMessage"));
        String messageText2 = message2.getText();
        System.out.println(messageText2);

        ////div/button[starts-with(text() , 'Click Me')]
        ////div[last]/button ->>> div icindeki son butonu getirir


        WebElement dynamicClickButton = driver.findElement(By.xpath("//div/button[starts-with(text() , 'Click Me')]"));
        dynamicClickButton.click();
        

    }
}