package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class test06 extends utilities.TestBase {
    @Test
    public void test(){
        // "http://automationpractice.com/" ADRESiNE GiDiP UYE OL.
        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("//a[@class='login']")).click();

        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("ariikan12345@arikan.com"+ Keys.ENTER);
        driver.findElement(By.cssSelector("#id_gender1")).click();
    }

}
