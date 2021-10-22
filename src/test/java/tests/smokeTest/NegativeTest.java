package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilites.ConfigReader;
import utilites.Driver;

public class NegativeTest {


    QAConcortPage qaConcortPage=new QAConcortPage();

    @Test(priority = -5)
    public void falschePassword(){

        // 1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
        //3 Farkli test Methodunda 3 senaryoyu test et
        //				- yanlisSifre
        //				- yanlisKulllanici
        //				- yanlisSifreKullanici
        //test data yanlis username: manager1 , yanlis password : manager1!
        //2) https://qa-environment.concorthotel.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        //3) Login butonuna bas
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.firstLoginLink.click();
        //4) Verilen senaryolar ile giris yapilamadigini test et
        qaConcortPage.usernameBox.sendKeys(ConfigReader.getProperty("CHQAValidUserName"));
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAInValidPassword"));
        qaConcortPage.loginButton.click();
        Assert.assertTrue(qaConcortPage.loginFailedYazisi.isDisplayed());

    }
    @Test(dependsOnMethods = "falschePassword")
    public void falscheUsername(){
        qaConcortPage=new QAConcortPage();
        qaConcortPage.usernameBox.clear();
        qaConcortPage.usernameBox.sendKeys(ConfigReader.getProperty("CHQAInValidUserName"));
        qaConcortPage.passwordKutusu.clear();
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAInValidPassword"));
        qaConcortPage.loginButton.click();
        Assert.assertTrue(qaConcortPage.loginFailedYazisi.isDisplayed());
    }
    @Test(dependsOnMethods = "falschePassword")
    public void falscheUsernameUndPasswor(){
        qaConcortPage=new QAConcortPage();
        qaConcortPage.usernameBox.clear();
        qaConcortPage.usernameBox.sendKeys(ConfigReader.getProperty("CHQAInValidUserName"));
        qaConcortPage.passwordKutusu.clear();
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAInValidPassword"));
        qaConcortPage.loginButton.click();
        Assert.assertTrue(qaConcortPage.loginFailedYazisi.isDisplayed());
    }
}
