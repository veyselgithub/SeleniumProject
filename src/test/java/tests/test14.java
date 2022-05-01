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

public class test14 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/modal-dialogs");

        WebElement smallButton = driver.findElement(By.id("showSmallModal"));
        smallButton.click();

        WebElement modalText = driver.findElement(By.cssSelector("div.modal-body"));
        System.out.println(modalText.getText());

        WebElement smallCloseButton = driver.findElement(By.id("closeSmallModal"));
        smallCloseButton.click();

    }
}