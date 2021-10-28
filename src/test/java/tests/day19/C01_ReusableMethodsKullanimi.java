package tests.day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.Driver;

import java.util.Set;

public class C01_ReusableMethodsKullanimi {
    @Test
    public void test(){

        // https://the-internet.herokuapp.com/windows

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaHandleDegeri=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        Set<String> windowHandleKumesi=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";
        for(String each: windowHandleKumesi){
        if ((!each.equals(ilkSayfaHandleDegeri))){
            ikinciSayfaHandleDegeri=each;
        }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);

//yeni sayfa da New Window yazisinin gorundugunu test edelim

        WebElement newWindowYaziElemnti=Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(newWindowYaziElemnti.isDisplayed());
Driver.closeDriver();

    }
    @Test
    public void
}
