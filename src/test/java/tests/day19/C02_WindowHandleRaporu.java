package tests.day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.Driver;

public class C02_WindowHandleRaporu extends utilities.TestBaseRapor {
    @Test

        public void test() {

        extentTest=extentReports.createTest("window handle test","yeni sayfada new window yazisini ");

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
    extentTest.info("istenilen adrese gidildi");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
    extentTest.info("linke tiklandi");
        utilities.ReusableMethods.switchToWindow("New Window");
    extentTest.info("yeni sayfaya gecildi");
        WebElement newWindowYaziElemnti = Driver.getDriver().findElement(By.tagName("h3"));
        extentTest.info("test edecegimiz yazi locate edildi");
        Assert.assertTrue(newWindowYaziElemnti.isDisplayed());
        extentTest.info("yazinin gorunur oldugu test edildi");
    }

}
