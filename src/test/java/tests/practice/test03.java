package tests.practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Set;

public class test03 extends utilities.TestBase {
    // 1) https://www.ntv.com.tr/ ADRESİNE GİT
    // 2) SAYFANIN TiTLE'NIN "NTV HABER - Haberler, Son Dakika Haberleri" OLDUGUNU DOGRULA
    // 3) SAYFANIN HANDLE DEGERiNi AL.
    // 4) SPOR SAYFASINA TIKLA
    // 5) URL'iN "https://www.ntvspor.net/" OLDUGUNU DOGRULA
    // 6) ANA SAYFAYA GERi DON
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.ntv.com.tr/");
        System.out.println("Sayfa Title :"+driver.getTitle());

        String expectedTitle="NTV HABER - Haberler, Son Dakika Haberleri";
        String actualTitle=driver.getTitle();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"expected title actual title dan farkli");


        String ilkSayfaHandleDegeri=driver.getWindowHandle();
        System.out.println("1. sayfanin Handle degeri : " +ilkSayfaHandleDegeri);

        //tekrar cookiesi atlamak zorundayim
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

        driver.findElement(By.xpath("//a[@class='header-category-link spor']")).click();
        System.out.println(driver.getCurrentUrl());
        Set<String> tumWindowHandle=driver.getWindowHandles();
        System.out.println("Tum windows Handle : "+tumWindowHandle);

        String ikinciWindowHandle="";
        for (String each: tumWindowHandle
             ) {
          if(!each.equals(ilkSayfaHandleDegeri)){
              ikinciWindowHandle=each;
          }
            System.out.println("2. sayfa Window Handle : "+ikinciWindowHandle);
          //2. sayfaya gecmis olduk
          driver.switchTo().window(ikinciWindowHandle);

            System.out.println(driver.getCurrentUrl());

            String expectedUrl="https://www.ntvspor.net/";
            String actualUrl= driver.getCurrentUrl();
            softAssert.assertEquals(actualUrl,expectedUrl,"beklenen url ler farkli ");
        }

       softAssert.assertAll();
        Thread.sleep(3000);
        driver.switchTo().window(ilkSayfaHandleDegeri);
    }

}
