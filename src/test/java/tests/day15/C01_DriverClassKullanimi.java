package tests.day15;

import org.testng.annotations.Test;
import utilites.ConfigReader;
import utilites.Driver;

public class C01_DriverClassKullanimi {
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));

        // Driver driver=new Driver();
        //Driver classindan obje olusturulmamasini istedigimiz icin Driver classi Singletib yapiyoruz
        //bunun icin default constructor yerine parametresiz bir constructor olusturup
        //acces modifieri private yapiyoruz


        //Driver driver=new Driver("ben istedim olmadi");
        //Driver classinda parametreli constructor olmadigi icin kullanamayiz


        Driver.closeDriver();
    }
}
