package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilites.Driver;

public class test08 {
    @Test
    public void test(){
        QAConcortPage qaConcortPageconcortPage=new QAConcortPage();
        qaConcortPageconcortPage.ConcortHotelLogin();
        qaConcortPageconcortPage.hotelManagementLinki.click();
        qaConcortPageconcortPage.hotelRoomsLinki.click();

        qaConcortPageconcortPage.printData(3,4);
    }
    public void printData(int satir, int sutun){
        String xpath="//tbody//tr["+satir+"]//td["+sutun+"]";
      //  System.out.println("satir no : "+satir+"sutun no : "+sutun);
        // System.out.println(xpath);
       WebElement istenenData=Driver.getDriver().findElement(By.xpath(xpath));
        System.out.println(istenenData);
    }
}
