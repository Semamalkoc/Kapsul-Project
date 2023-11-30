package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KapsulTeknoloji;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Set;

public class AnasayfadanPaydasWebSitesiGoruntuleme extends ExtentReport {
    @Test
    public void testPaydasWebSitesiGoruntuleme() throws InterruptedException {
        extentTest = extentReports.createTest("PaydasWebSitesiGoruntuleme","Paydas web sitesi goruntulendi.");
        //Anasayfaya git

        Driver.getDriver().get(ConfigReader.getProperty("kapsulUrl"));
        KapsulTeknoloji kapsulTeknoloji = new KapsulTeknoloji();
        ReusableMethods.anasayfayaGec();
        String anasayfa = Driver.getDriver().getWindowHandle();
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 1500);
        actions.perform();
        extentTest.info("'Anasayfaya gidildi'.");

        // Paydas 'Selcuk Unıversitesi' Web sitesinin gorundugunu dogrula

        ReusableMethods.bekle(2);
        kapsulTeknoloji.SU.click();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String w : windowHandles
        ) {
            if (!w.equals(anasayfa)) {
                Driver.getDriver().switchTo().window(w);
            }
        }
        String suURL = Driver.getDriver().getCurrentUrl();
        System.out.println(suURL);
        Assert.assertTrue(suURL.contains("selcuk"));
        Driver.closeDriver();
        extentTest.info("'Selcuk Universitesi' web sitesi goruntulendi.");



       /* List<WebElement>paydaslar=Driver.getDriver().findElements(By.xpath("//*[@class='m-3 h-24 w-24 fill-white sm:m-1 xl:h-16 xl:w-16 2xl:h-24 2xl:w-24']"));


        for (int i = 8; i < 16; i++) {
            paydaslar=Driver.getDriver().findElements(By.xpath("//*[@class='m-3 h-24 w-24 fill-white sm:m-1 xl:h-16 xl:w-16 2xl:h-24 2xl:w-24']"));
            paydaslar.get(i).click();
            ReusableMethods.bekle(5);
            System.out.println(Driver.getDriver().getTitle());

            Driver.getDriver().switchTo().window(anasayfa);
            Driver.closeDriver();
        }

        */



    }
}

