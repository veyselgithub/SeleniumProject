package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test6 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/dynamic-properties");

        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text = textElement.getText();
        System.out.println(text);


        WebElement firstButton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
        firstButton.click();


        WebElement colorChangeButton = driver.findElement(By.id("colorChange"));
        String className = colorChangeButton.getAttribute("class");
        System.out.println( "Before change :" + className);

        WebDriverWait wait2 = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton, "class", "mt-4 text-danger btn btn-primary"));
        className = colorChangeButton.getAttribute("class");
        System.out.println("After change :" + className);


        WebDriverWait wait3 = new WebDriverWait(driver,5);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();

    }
}