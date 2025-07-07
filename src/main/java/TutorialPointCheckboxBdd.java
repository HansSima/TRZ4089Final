import io.cucumber.java.Before;
import io.cucumber.java.After;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TutorialPointCheckboxBdd {

    private WebDriver driver;

    @Before
    public void setUp(){
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void cleanUp(){
        driver.quit();
    }


    @Given("Uzivatel se nachazi na strance TutorialPoint checkbox")
    public void uzivatelSeNachaziNaStranceTutorialPointCheckbox() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
    }

    @When("Uzivatel klikne na checkbox {string}")
    public void uzivatelKlikneNaCheckbox(String idCheckbox) {
        driver.findElement(By.id(idCheckbox)).click();
    }

    @Then("Checkbox {string} je zaskrtnut")
    public void checkboxJeZaskrtnut(String idCheckbox) {
        assertTrue(driver.findElement(By.id(idCheckbox)).isSelected());
    }



}
