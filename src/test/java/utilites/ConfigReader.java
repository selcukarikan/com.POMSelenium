package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1- Properties objesi olusturacagiz

    static Properties properties;

    //2-bu classin amaci configuration.properties dosyasini okumak
    //ve oradaki key value ikililerini kullanarak istedigimiz key e ait valueyi bize getirmek

    static {
        String dosyaYolu="src/test/java/utilites/ConfigReader.java";
        try {
            FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fileInputStream);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //3- test classlarindan configReader classina ulasip yukaridaki islemleri
    //yapmamizi saglayacak bir method olustrucagiz

    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;

    }


}
