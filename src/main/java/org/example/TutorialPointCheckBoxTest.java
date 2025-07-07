package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
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

    @Test
    public void test(){
        //Prepne se na pozadovanou stranku
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        //Najde prvkek a klikne na nej
        driver.findElement(By.id("c_bs_1")).click();
        //assertEquals();
        //Kontroluje zda je prvek zaskrtnut
        assertTrue(driver.findElement(By.id("c_bs_1")).isSelected());
    }

}
