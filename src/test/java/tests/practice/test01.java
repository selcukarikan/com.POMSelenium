package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test01 {

    // 3 TEST METODU OLUSTURUN
    // https://www.n11.com/ SAYFASINA GiDİN.
    // https://www.gittigidiyor.com/ SAYFASINA GiDiN
    // https://getir.com/ SAYFASINA GiDiN

    WebDriver driver;
    @BeforeMethod
    public void setup(){
    WebDriverManager.chromiumdriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test(priority = 5)
    public void n11(){
        driver.get("https://www.n11.com");
        System.out.println(driver.getTitle());

    }
    @Test(priority = 3)
    public void gittigidiyor(){
        driver.get("https://www.gittigidiyor.com");
        System.out.println(driver.getTitle());
    }
    @Test(priority = 1)
    public void getir(){
        driver.get("https://getir.com");
        System.out.println(driver.getTitle());
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
