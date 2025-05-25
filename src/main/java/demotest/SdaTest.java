package demotest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTest {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zolta\\IdeaProjects\\Z4086\\SDAFinalTest\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void sdaTest(){
        // toto mi spusti stranku tutorialspoint
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        // zvacsi obrazovku
        driver.manage().window().setSize(new Dimension(1936, 1048));
        // toto mi najde na stranke prvok a vypise meno
        driver.findElement(By.id("name")).sendKeys("Zoltan");
        driver.findElement(By.id("email")).sendKeys("email@email.com");

    }



}
