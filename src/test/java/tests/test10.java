package tests;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class test10 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());

        driver.switchTo().window(tabs.get(1));  // tablar arasi gecis yapma
        System.out.println(driver.getCurrentUrl());

        driver.close(); // bu sadece tabi kapatir quit dersen driver kapanir


        WebElement windowButton = driver.findElement(By.id("windowButton"));
        windowButton.click();


    }
}