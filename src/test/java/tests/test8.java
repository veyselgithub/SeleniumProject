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

public class test8 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();

        String path = "/Users/veyseldogan/Downloads";
        String fileName = "sampleFile.jpeg";
        boolean isDownloaded = isFileDownloaded(path , fileName);
        System.out.println(isDownloaded);
    }

    public static boolean isFileDownloaded(String downloadPath, String fileName){
        File file = new File(downloadPath);
        File[] files = file.listFiles();

        for (int i = 0 ; i < files.length ; i ++){
            if (files[i].getName().equals(fileName)){
                return true ;
            }
        }
        return false ;
    }
}