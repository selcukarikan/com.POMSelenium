package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilites.Driver;

public class C01_WebTables {
    @Test
    public void test() throws InterruptedException {
        //● login() metodun oluşturun ve oturum açın.
        //● http://qa-environment.koalaresorthotels.com /admin/HotelRoomAdmin adresine
        //gidin
        //○ Username : manager
        //○ Password : Manager1!
        QAConcortPage qaConcortPage = new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
        qaConcortPage.hotelManagementLinki.click();
        qaConcortPage.hotelRoomsLinki.click();

        // 1. pages sayfasinda bir metod oluşturun : printData(int row, int column);
        //	 Satır(row) ve sütun(column) numarasını girdiğinizde, printData metodu bu
        //	hücredeki(cell) veriyi yazdırmalıdır.
        Thread.sleep(2345);
    String actualDAta=qaConcortPage.printData(3,4);
    Thread.sleep(3456);
        //	2. Ve bu metodu printData() methodunu cagirmak icin kullanin.
        //	   Örnek: printData (3,5); => 3. satır, 5. Sütundaki veriyi yazdırmalıdır

        //	3. yazdirilan datanin olmasi gereken dataya (Happy Hotel) esit oldugunu test edin
        // assert'u bu class'da yapmak istiyorsak istenen datanin bu class'a donmesini saglamaliyiz
        Assert.assertEquals(actualDAta,"Happy Hotel","yazilan data istenenden farkli");
        Driver.closeDriver();
    }
}
