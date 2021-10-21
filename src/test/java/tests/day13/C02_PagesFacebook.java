package tests.day13;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;

public class C02_PagesFacebook extends utilities.TestBase {





    @Test
    public void test(){
        // facebook login sayfasina gidiniz
        driver.get("https://www.facebook.com");
        this.driver=driver;
        FacebookPage facebookPage=new FacebookPage(driver);

        facebookPage.cookies();
        //kullanici adi :arikan@arikan.com
        facebookPage.mailBox.sendKeys("arikan@arikan.com");
        //sifre=12345
        facebookPage.password.sendKeys("12345");
       facebookPage.loginKey.click();
        //yazdigimzida giris yapamadigimizi test edin
        Assert.assertTrue(facebookPage.keinKontoverknüpft.isDisplayed());




    }

}
