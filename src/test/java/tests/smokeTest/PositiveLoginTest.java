package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilites.ConfigReader;
import utilites.Driver;

public class PositiveLoginTest {
    @Test
    public void positiveLoginTest(){

    //Bir test method olustur positiveLoginTest()
    //https://qa-environment.concorthotel.com/ adresine git

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));

        QAConcortPage qaConcortPage=new QAConcortPage();

    //login butonuna bas
       qaConcortPage.firstLoginLink.click();

    //test data username: manager ,
    qaConcortPage.usernameBox.sendKeys(ConfigReader.getProperty("CHQAValidUserName"));

    //test data password : Manager1!
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
        qaConcortPage.loginButton.click();

    //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(qaConcortPage.basariliGirisYaziElementi.isDisplayed());
        Driver.closeDriver();

    }
}
