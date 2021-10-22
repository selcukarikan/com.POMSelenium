package tests.day15;

import org.testng.annotations.Test;
import pages.QAConcortPage;

public class C02_E2ETest {

    @Test
    public void test(){



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

    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

    //8. Save butonuna tıklayın.

    //9. “Hotel was inserted successfully” textinin göründüğünü test edin.

    //10. OK butonuna tıklayın.
}
}
