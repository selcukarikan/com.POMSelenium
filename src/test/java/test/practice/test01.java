package test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilites.ConfigReader;
import utilites.Driver;

public class test01 extends utilities.TestBase {
    AmazonPage amazonPage;
    @Test
    public void test(){

    Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    amazonPage=new AmazonPage();
    amazonPage.suchBox.sendKeys(ConfigReader.getProperty("amazonArananKelime"));


    }
}
