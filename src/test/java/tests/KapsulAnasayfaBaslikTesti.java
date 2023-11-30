package tests;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KapsulTeknoloji;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;


public class KapsulAnasayfaBaslikTesti extends ExtentReport {

    @Test
    public void testAnasayfaBasliklarinTiklanabilirligi()throws InterruptedException  {

        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("kapsulUrl"));
        String anasayfa=Driver.getDriver().getWindowHandle();


        extentTest = extentReports.createTest("Anasayfadaki basliklarin tiklanabilirligi",
                "Anasayfadaki basliklar tiklandi.");

        //Anasayfadaki 'Anasayfa' textinin  gorunurlugunu doğrula

        KapsulTeknoloji kapsulTeknoloji=new KapsulTeknoloji();
        Assert.assertTrue(kapsulTeknoloji.anasayfa.isDisplayed());
        extentTest.info("'Anasayfa'texti goruldu.");

        //Anasayfadaki 'Hakkimizda' textinin gorunurlugunu ve tiklanabilirligini dogrula


        Assert.assertTrue(kapsulTeknoloji.hakkimizda.isDisplayed());
        ReusableMethods.anasayfayaGec();
        kapsulTeknoloji.hakkimizda.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.anasayfayaGec();
        extentTest.info("'Hakkimizda'textinin gorunurlugu ve tiklanabilirligi dogrulandi.");

        //Anasayfadaki 'Yarismalar' textinin gorunurlugunu ve tiklanabilirligini dogrula

        Assert.assertTrue(kapsulTeknoloji.yarismalar.isDisplayed());
        ReusableMethods.anasayfayaGec();
        kapsulTeknoloji.yarismalar.click();
        extentTest.info("'Yarismalar' textinin gorunurlugu ve tiklanabilirligi dogrulandi.");
        Driver.getDriver().navigate().back();
        ReusableMethods.anasayfayaGec();

        //Anasayfadaki 'Hakkimizda' textinin gorunurlugunu ve tiklanabilirligini dogrula

        Assert.assertTrue(kapsulTeknoloji.girisimcilik.isDisplayed());
        ReusableMethods.anasayfayaGec();
        kapsulTeknoloji.girisimcilik.click();
        ReusableMethods.bekle(5);
        extentTest.info("'Girisimcilik' textinin gorunurlugu ve tiklanabilirligi dogrulandi.");






    }
}

