package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KapsulTeknoloji {
    public KapsulTeknoloji(){PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath= "//div[contains(@class,'general-background')]")
    public WebElement space;

    @FindBy(xpath = "//*[text()='Anasayfa']")
    public WebElement anasayfa;

    @FindBy(xpath = "(//*[text()='Hakkımızda'])[1]")
    public WebElement hakkimizda;

    @FindBy(xpath = "(//*[text()='Yarışmalar'])[1]")
    public WebElement yarismalar;

    @FindBy(xpath = "(//*[text()='Girişimcilik'])[1]")
    public WebElement girisimcilik;
    @FindBy(xpath = "(//*[@viewBox='0 0 88.99 23.81'])[1]")
    public WebElement innoPark;

    @FindBy(xpath = "(//*[@viewBox='0 0 88.97 13.29'])[1]")
    public WebElement aselsanKonya;

    @FindBy(xpath = "(//*[@viewBox='0 0 58.65 88.99'])[1]")
    public WebElement KGTÜ;

    @FindBy(xpath = "(//*[@viewBox='0 0 88.96 89.05'])[1]")
    public WebElement KTO;

    @FindBy(xpath = "(//*[@viewBox='0 0 135.77 88.99'])[1]")
    public WebElement KTOÜ;

    @FindBy(xpath= "(//*[@viewBox='0 0 88.97 88.16'])[1]")
    public WebElement SU;

    @FindBy(xpath = "(//*[@viewBox='0 0 67.8 88.99'])[1]")
    public WebElement BIST;

    @FindBy(xpath = "(//*[@viewBox='0 0 88.98 88.98'])[1]")
    public WebElement NEU ;

    @FindBy(xpath = "(//*[@viewBox='0 0 88.98 88.98'])[1]")
    public WebElement KTU;


    @FindBy(xpath = "(//*[@alt='InnoPark Konya Teknoloji Geliştirme Bölgesi'])[1]")
    public WebElement innoParkWebSite;

    @FindBy(xpath = "(//*[@class='fs-bold'])[1]")
    public WebElement aselsanWebSite;

    @FindBy(xpath = "//*[@alt='Konya Gıda ve Tarım Üniversitesi']")
    public WebElement KGTÜWebSite;

    @FindBy(xpath = "//*[@alt='Konya Ticaret Odası']")
    public WebElement KTOWebSite;

    @FindBy(xpath = "//*[@alt='KTO karatay Üniversitesi']")
    public WebElement KTOÜWebSite;

    @FindBy(xpath = "//*[@alt='Selçuk Üniversitesi")
    public WebElement SÜWebSite;

    @FindBy(xpath = "//*[@class='modal fade show']")
    public WebElement BISTWebSite;

    @FindBy(xpath = "//*[@width='120']")
    public WebElement NEUWebSite ;

    @FindBy(xpath = "//*[@style='width:82%; height:82%;']")
    public WebElement KTUWebSite;

    @FindBy(xpath = "//*[@integrity='sha512-euoFGowhlaLqXsPWQ48qSkBSCFs3DPRyiwVu3FjR96cMPx+Fr+gpWRhIafcHwqwCqWS42RZhIudOvEI+Ckf6MA==']")
    public WebElement space2;








}
