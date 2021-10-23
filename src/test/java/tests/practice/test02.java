package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class test02 {

    WebDriver driver;
@BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void test(){
        // 1) "https://www.facebook.com/" SAYFASINA GiDiN
        driver.get("https://www.facebook.com/");
        //cookies gec
        driver.findElement(By.xpath("//button[@title='Alle Cookies gestatten']")).click();
        // 2) YENi HESAP OLUSTUR BUTONUNA TIKLAYIN
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        // 3) DOGUM TARiHi BOLUMUNDEKi GUNLERiN LiSTESiNi ALIN
        WebElement dropDownGun=driver.findElement(By.cssSelector("#day"));
        Select select1=new Select(dropDownGun);
        List<WebElement> daySecenekler=select1.getOptions();
        System.out.println("- - - - - Day - - - - -");

        for (WebElement each:daySecenekler) {
            System.out.println(each.getText());
        }
        // 4) DOGUM TARiHi BOLUMUNDEKi AYLARIN LiSTESiNi ALIN
        WebElement dropDownAy=driver.findElement(By.cssSelector("#month"));
        Select select2=new Select(dropDownAy);
        List<WebElement> monthSecenekler=select2.getOptions();
        System.out.println("- - - - - Monat - - - - -");
        for (WebElement each:monthSecenekler) {
            System.out.println(each.getText());
        }
        // 5) DOGUM TARiHi BOLUMUNDEKi YILLARIN LiSTESiNi ALIN
WebElement dropDownYear=driver.findElement(By.cssSelector("#year"));
        Select select3=new Select(dropDownYear);
        List<WebElement> yearSecenekleri=select3.getOptions();
        System.out.println("- - - - - Year - - - - -");
        for (WebElement each:yearSecenekleri
             ) {
            System.out.println(each.getText());
        }}
        @AfterClass
                public void tearDown(){
            driver.close();
        }
    }


