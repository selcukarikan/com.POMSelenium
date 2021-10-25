package tests.practice;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HrsHotelTest {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void HrsHotel(){
        Faker faker=new Faker();
        //1-Hotel Reservierung Sitesine gidiniz(https://www.hrs.de/)
        driver.get("https://www.hrs.de/");
        //2-Site acilisinda Cookiesleri kabul et
        WebElement cookies=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        cookies.click();
        //3-Registrieren buttonuna tiklayiniz
        WebElement registrieren= driver.findElement(By.xpath("//a[@id='RegistrationButton']"));
        registrieren.click();
        //4-Vorname -Nachname-Email-Onay klikleme ve son olarak "Jetz kostenlos anmeldun" butonuna tiklama
        Actions actions=new Actions(driver); // mouse tiklama icin actions olusturduk
    }
}
