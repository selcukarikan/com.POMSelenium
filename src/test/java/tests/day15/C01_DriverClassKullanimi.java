package tests.day15;

import org.testng.annotations.Test;
import utilites.ConfigReader;
import utilites.Driver;

public class C01_DriverClassKullanimi {
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));



        Driver.closeDriver();
    }
}
