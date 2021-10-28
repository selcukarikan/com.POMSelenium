package tests.day15;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilites.Driver;

public class C02_E2ETest {

    @Test(groups = "birinciGrup")
    public void test() throws InterruptedException {



    //Tests packagenin altına class olusturun: D17_CreateHotel

    //2. Bir metod olusturun: createHotel

    //3. http://qa-environment.concorthotels.com adresine git.
        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //girin.
        //a. Username : manager
        //b. Password : Manager1!
        //5. Login butonuna tıklayın.
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();


    //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        qaConcortPage.hotelManagementLinki.click();
        Thread.sleep(3456);
        qaConcortPage.hotelListLink.click();
        qaConcortPage.addHotelCodeKutusu.click();
        Thread.sleep(3456);
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Actions actions=new Actions(Driver.getDriver());
        Thread.sleep(3000);
        Faker faker=new Faker();
        actions.click(qaConcortPage.addHotelCodeKutusu)
                .sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).perform();
        //8. Save butonuna tıklayın.
        actions.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1500);
        qaConcortPage.addHotelSave.click();
        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.

        Thread.sleep(1500);
        System.out.println(qaConcortPage.addHotelSuccesfullYazisi.getText());

        Assert.assertTrue(qaConcortPage.addHotelSuccesfullYazisi.isDisplayed());
        //10. OK butonuna tıklayın.
        Thread.sleep(3000);
        qaConcortPage.addHotelAllertOk.click();
        Driver.closeDriver();
    }
}