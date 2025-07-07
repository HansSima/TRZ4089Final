import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TutorialPointTable {

    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void cleanUp(){
        driver.quit();
    }


    @Given("Uzivatel je na strance s tabulkou")
    public void uzivatelJeNaStranceSTabulkou() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php#");
    }

    @Then("V bunce tabulky {string} jsou data {string}")
    public void vBunceTabulkyJsouData(String dataXPath, String data) {
        assertEquals(data, driver.findElement(By.xpath(dataXPath)).getText());
    }


}
