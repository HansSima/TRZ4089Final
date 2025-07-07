package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.jupiter.api.Assertions.*;

public class TutorialPointCheckBoxTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void cleanUp(){
        driver.quit();
    }


    @Test
    public void test(){
        //Zaškrtnutie oboch boxov a potvrdiť, ze je hlavný zaškrtnutý
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        driver.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]")).click();
        driver.findElement(By.id("c_bf_1")).click();
        driver.findElement(By.id("c_bf_2")).click();
        assertTrue(driver.findElement(By.id("c_bs_1")).isSelected());

        // odškrtnútie jedného, potvrdiť, ze hlavný nie je zaškrtnutý...zaškrtnúť prvný a odškrtnúť druhý a potvrdiť, že hlavný, nie je zaškrtnutý
        driver.findElement(By.id("c_bf_1")).click();
        assertFalse(driver.findElement(By.id("c_bs_1")).isSelected());
        driver.findElement(By.id("c_bf_1")).click();
        driver.findElement(By.id("c_bf_2")).click();
        assertFalse(driver.findElement(By.id("c_bs_1")).isSelected());

        //oba checkboxy sú odškrtnuté a hlavný nie je zaškrtuný
        driver.findElement(By.id("c_bf_1")).click();
        assertFalse(driver.findElement(By.id("c_bs_1")).isSelected());
    }

}
