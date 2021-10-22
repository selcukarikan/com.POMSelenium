package utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
   private Driver(){

   }
   private static WebDriver driver;
   //driveri baska classlardan sadece Driver class ismi ile cagirabilmek icin static yaptik
   //henuz bu driver  ilgili ayarlar yapmadigim icin baska classlardan bunu yanlislikla cagirmayalim diye
   //erisimi private yaptik(Sadece bu classin kullanimina actik)

   public static WebDriver getDriver() {

      if (driver==null) {
//buraya yazdigimiz if in neden i bu method her calistiginda yeni bir drive olusturmamasi icin kullaniyoruz
         //if driveri kontrol edecek bir deger atamasi yapildiysa yeni bir driver olusturmayacak
         switch (ConfigReader.getProperty("browser")) {

            //case in driveri istedigimiz driverde calistirmak icin kullaniyoruz
            //configuration properties dosyasinda browser olarak ne yazdiksa tum testlerimiz o browser'da calisacak
            //  browser secimi yapilmadiysa default olarak chrome devreye girecek
            case "chrome":
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
               break;
            case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               break;
            case "opera":
               WebDriverManager.operadriver().setup();
               driver = new OperaDriver();
               break;
            case "edge":
               WebDriverManager.edgedriver().setup();
               driver = new EdgeDriver();
               break;
            default:
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
         }
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      }
         return driver;
      }

   public static void closeDriver() {
      if (driver!=null){
         driver.close();

      }
   driver=null;
      // burada yeniden null degeri atamamizin sebebi. bir sonraki getDriver method'u cagirisimizda
      // yeni deger atayabilmek istememizdir.
   }
    
}
