package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckBox.isEnabled();
        System.out.println(isEnabled);

        WebElement sportCheckBoxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
        try {
            sportCheckBox.click();
        }catch (ElementClickInterceptedException e){
            sportCheckBoxLabel.click();
            System.out.println("Catch'e girdi");
        }

        boolean isSelected = sportCheckBox.isSelected();
        System.out.println(isSelected);
    }
}