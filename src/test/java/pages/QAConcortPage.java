package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class QAConcortPage {
    WebDriver driver;
    public QAConcortPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(linkText = "Log in")
        public WebElement firstLoginLink;

        @FindBy(id = "UserName")
        public WebElement usernameBox;

        @FindBy(id = "Password")
        public WebElement passwordKutusu;

        @FindBy(id = "btnSubmit")
        public WebElement loginButton;

        @FindBy(xpath = "//span[text()='ListOfUsers']")
        public WebElement basariliGirisYaziElementi;

         @FindBy (xpath = "//*[.='Try again please']")
        public WebElement loginFailedYazisi;


    }

