package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");

        WebElement yesRadioButton = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnabled = yesRadioButton.isEnabled();
        if (isEnabled){
            yesRadioButton.click();
            System.out.println("Clicked yes");
        }

        WebElement yesRadioButtonnotLabel = driver.findElement(By.id("yesRadio"));

        boolean isSelected = yesRadioButtonnotLabel.isSelected();
        if (isSelected){
            System.out.println("isSelected");
        }

        WebElement output = driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());

        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
        System.out.println(noRadioButton.isEnabled());

    }
}