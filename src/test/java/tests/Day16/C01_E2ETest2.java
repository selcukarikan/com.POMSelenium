package tests.Day16;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilites.ConfigReader;
import utilites.Driver;

public class C01_E2ETest2 {
    @Test
    public void RoomCreateTest() throws InterruptedException {
    //Tests packagenin altına class olusturun: D18_HotelRoomCreation
    //2. Bir metod olusturun: RoomCreateTest()
    //3. http://qa-environment.koalaresorthotels.com adresine gidin.
    //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
    //a. Username : manager
    //b. Password : Manager1!

    //5. Login butonuna tıklayın.
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
    //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        qaConcortPage.hotelManagementLinki.click();
        qaConcortPage.hotelRoomsLinki.click();
        qaConcortPage.addHotelRoomButonu.click();
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Select select=new Select(qaConcortPage.addRoomIdDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("CHQAAAddRommIdHotel"));
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("CHQAAdRoomDescription"))
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("CHQAAdRommPrice"))
                .perform();

        select=new Select(qaConcortPage.addRoomType);
        select.selectByVisibleText(ConfigReader.getProperty("CHQAAddRoomType"));


        actions.sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(1,2)))
                .sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(0,5)))
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .perform();

        Thread.sleep(2000);
        qaConcortPage.addRoomSaveButonu.click();


    //8. Save butonuna basin.
    //
    //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
       Thread.sleep(2000);
        Assert.assertTrue(qaConcortPage.addHotelSuccesfullYazisi.isDisplayed());

    //10. OK butonuna tıklayın.
    qaConcortPage.addRoomAllertOkButonu.click();
    //11. Hotel rooms linkine tıklayın.
    actions.sendKeys(Keys.HOME).perform();
    Thread.sleep(2000);
    qaConcortPage.addroomHotelRoomsLinki.click();
    //12. "LIST OF HOTELROOMS" textinin göründüğünü test ediniz.
        Assert.assertTrue(qaConcortPage.addRoomHotelRoomListyazisi.isDisplayed());

        Driver.closeDriver();

}}
