package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
    WebDriver driver;
    //bir page sayfasi olusturuldugunda mutlaka yapmamiz gerek sey
    // bir constructor olusturup drivera ilk degerei atamaktir .(instantiate)
   public AmazonPage(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);

    }
   public AmazonPage (){

    }
    //WebElement suchBox=driver.findElement(By.id("twotabsearchtextbox"));
    @FindBy(id="twotabsearchtextbox")
    public WebElement suchBox;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement ergebnissen;


    @FindBy(id="searchDropdownBox")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public WebElement firstproductname;




}
