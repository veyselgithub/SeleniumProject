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

public class test12 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");

        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String text = heading.getText();
        System.out.println(text);

        driver.switchTo().parentFrame();

        List<WebElement> elementList = driver.findElements(By.cssSelector("div[id='framesWrapper'] div"));
        String paragraph = elementList.get(0).getText();
        System.out.println(paragraph);


//        driver.switchTo().frame("frame2");
//        WebElement heading2 = driver.findElement(By.id("sampleHeading"));
//        String text2 = heading.getText();
//        System.out.println(text);

    }
}