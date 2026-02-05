package Santander;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Tc2 {
    @Test
    public void account1() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.santander.pl/klient-indywidualny");
        String currentWindow = driver.getWindowHandle();
        Set<String> windowsNames = driver.getWindowHandles();
        for(String window : windowsNames){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }

        driver.findElement(By.id("privacy-prompt-controls-button-accept")).click();
        driver.switchTo().window(currentWindow);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/button/span")).click();
   driver.findElement(By.xpath("/html/body/div[4]/div/div/div/ul/li[1]/div/a")).click();
        String currentWindow1 = driver.getWindowHandle();
        Set<String> windowsNames1 = driver.getWindowHandles();
        for(String window1 : windowsNames1){
            if(!window1.equals(currentWindow1)){
                driver.switchTo().window(window1);
            }
        }
        driver.findElement(By.id("privacy-prompt-controls-button-accept")).click();
     driver.findElement(By.id("input_nik")).sendKeys("12345678");
       // driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(1500);
     driver.findElement(By.id("okBtn2")).click();
     Thread.sleep(1500);
       driver.findElement(By.id("ordinarypin")).sendKeys("123456");
       driver.findElement(By.id("okBtn2")).click();
       driver.findElement(By.id("input_number_1")).sendKeys("1");
        driver.findElement(By.id("input_number_2")).sendKeys("2");
        driver.findElement(By.id("input_number_3")).sendKeys("3");
        driver.findElement(By.id("input_number_4")).sendKeys("4");
        driver.findElement(By.id("input_number_5")).sendKeys("5");
        driver.findElement(By.id("input_number_6")).sendKeys("6");
        driver.findElement(By.id("okBtn2")).click();
        Thread.sleep(1500);
      driver.quit();

    }



}
