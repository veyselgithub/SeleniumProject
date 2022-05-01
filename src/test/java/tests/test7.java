package tests;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class test7 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/broken");

//        CloseableHttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet("https://demoqa.com");
//        CloseableHttpResponse response = client.execute(request);
//        int statusCode = response.getStatusLine().getStatusCode();
//        System.out.println(statusCode);


        WebElement brokenImage = driver.findElement(By.xpath("//div/img[2]"));
        String brokenImageUrl = brokenImage.getAttribute("src");

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(brokenImageUrl);
        CloseableHttpResponse response = client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);

    }
}