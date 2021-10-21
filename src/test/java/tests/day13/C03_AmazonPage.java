package tests.day13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;

public class C03_AmazonPage extends utilities.TestBase {
    @Test
    public void test() throws InterruptedException {
        //amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        //dropdown menuden book kategorisini secin
        AmazonPage amazonPage=new AmazonPage(driver);
        Select select=new Select(amazonPage.dropdownMenu);
        Thread.sleep(9067);
        select.selectByVisibleText("Books");
        //java icin arama yapin
        Thread.sleep(10056);
        amazonPage.suchBox.sendKeys("Java"+ Keys.ENTER);
        //bulunan sonuc yazisini yazin
        System.out.println(amazonPage.ergebnissen.getText());
        //ilk urun isminde java gectigini test ediniz
Assert.assertTrue(amazonPage.firstproductname.getText().contains("Java"));
    }
}
