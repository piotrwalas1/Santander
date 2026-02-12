package Santander;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TcAsercjaTest {
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

driver.quit();


    }



}
