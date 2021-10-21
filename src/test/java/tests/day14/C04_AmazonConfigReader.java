package tests.day14;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilites.ConfigReader;

public class C04_AmazonConfigReader extends utilities.TestBase {


    @Test
    public void test(){
        //amazon sayfasina gidip
        driver.get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage=new AmazonPage(driver);
        //nutella icin arama yapiniz
        amazonPage.suchBox.sendKeys(ConfigReader.getProperty("amazonArananKelime")+Keys.ENTER);

        //sonc sayisini yazdirin ve sonuc yazisinin nutella icerdigini test ediniz
        System.out.println(amazonPage.ergebnissen.getText());
        Assert.
                assertTrue(amazonPage.ergebnissen.getText().
                        contains(ConfigReader.getProperty("amazonArananKelime")));
    }

}
