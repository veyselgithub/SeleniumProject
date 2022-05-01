package tests;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

public class test13 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/nestedframes");

//        WebElement adframe = driver.findElement(By.cssSelector("iframe[title='3rd party ad content']"));
//        driver.switchTo().frame(adframe);
//
//        WebElement closeButton = driver.findElement(By.id("cbb"));
//        closeButton.click(); //cikan reklami kapattik



        driver.switchTo().frame("frame1");

        WebElement parentBody = driver.findElement(By.tagName("body"));
        System.out.println(parentBody.getText());


        driver.switchTo().frame(0);
        WebElement childBody = driver.findElement(By.tagName("p"));
        System.out.println(childBody.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
}