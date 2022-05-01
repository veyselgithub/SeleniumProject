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

public class test11 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();

        WebDriverWait wait = new WebDriverWait(driver , 2);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept(); // acilan alert tabina gectik ve kabul ettik


        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait2 = new WebDriverWait(driver , 5);
        wait2.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();


        driver.findElement(By.id("confirmButton")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();  // cancel a tiklayacaktir



        driver.findElement(By.id("promtButton")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Veysel");
        driver.switchTo().alert().accept();



    }
}