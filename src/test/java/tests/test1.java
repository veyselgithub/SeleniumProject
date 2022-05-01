package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");



        driver.manage().window().maximize();

        WebElement fullname = driver.findElement(By.id("userName"));
        fullname.click();
        fullname.sendKeys("Veysel");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[placeholder='name@example.com']"));
        email.click();
        email.sendKeys("vysel.dgan@gmail.com");

        WebElement address = driver.findElement(By.id("currentAddress"));
        address.click();
        address.sendKeys("my adress");

        WebElement permanent = driver.findElement(By.id("permanentAddress"));
        permanent.click();
        permanent.sendKeys("permanent address");

        WebElement button = driver.findElement(new By.ByCssSelector("button.btn"));
        button.click();



        WebElement nameText = driver.findElement(By.xpath("//div//p[@id='name']"));
        String name = nameText.getText();
        System.out.println(name);




    }
}
