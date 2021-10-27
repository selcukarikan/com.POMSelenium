package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class demoqa extends utilities.TestBase {
    WebDriver driver;
   @BeforeClass
    public void setup(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(3456, TimeUnit.SECONDS);


   }
   @Test
    public void test(){
       driver.get("https://demoqa.com/webtables");
     WebElement firstName= driver.findElement(By.xpath("//div[text()='First Name']"));
       Assert.assertTrue(firstName.isDisplayed(),"firstName gorulmedi");
       System.out.println(firstName.getText());



   }


}
