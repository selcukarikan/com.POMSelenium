package tests.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;

public class C01_pages extends utilities.TestBase {
    //amazon sayfasina gidip
    //nutella icin arama yapiniz
    //sonc sayisini yazdirin ve sonuc yazisinin nutella icerdigini test ediniz
    @Test
    public void test(){
        driver.get("https://www.amazon.com");
        WebElement suchBox= driver.findElement(By.id("twotabsearchtextbox"));
        suchBox.sendKeys("Nutella", Keys.ENTER);
        WebElement ergebnissen= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(ergebnissen.getText());
        Assert.assertTrue(ergebnissen.getText().contains("Nutella"));
    }
    @Test
    public void testPOM(){
        driver.get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage(driver);
        amazonPage.suchBox.sendKeys("Nutella",Keys.ENTER);
        amazonPage.suchBox.sendKeys("Nutella"+Keys.ENTER);
        System.out.println(amazonPage.ergebnissen.getText());
        Assert.assertTrue(amazonPage.ergebnissen.getText().contains("Nutella"));



    }


}
