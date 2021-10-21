package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilites.ConfigReader;

public class C03_PositiveTestConfigReaderIle extends utilities.TestBase {

@Test
    public void positiveTestConfig(){
    //https://www.concorthotel.com/ adresine gidiniz

    driver.get(ConfigReader.getProperty("CHUrl"));
    ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);

    // login tusuna basiniz
concortHotelPage.firstLoginLink.click();
    //test data username:manager ,
concortHotelPage.usernameBox.sendKeys(ConfigReader.getProperty("CHValidUsername"));
    //test data password:Manager1!
    concortHotelPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHValidPassword"));
concortHotelPage.loginButton.click();
    //Degerleri girildiginde sayfaya basarili bir sekilde girilebildigini test et
    Assert.assertTrue(concortHotelPage.basariliGirisYaziElementi.isDisplayed());

}
}
