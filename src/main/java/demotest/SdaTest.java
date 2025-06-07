package demotest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zolta\\IdeaProjects\\Z4086\\SDAFinalTest\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @After
    public void provedPoUkonceniTestu(){
        driver.close();
        driver.quit();

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
        // Toto nam overi, zda je spravny text
        Assert.assertEquals("Student Registration Form", driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/h1")).getText());


    }



}
