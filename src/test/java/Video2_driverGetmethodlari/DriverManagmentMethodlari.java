package Video2_driverGetmethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManagmentMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         // driver.manage().window(). methodlari
        // 1A - driver.manage().window().getSize() --> icinde oldgu sayfanin pixel olarak ölculerini döndürür

        System.out.println(driver.manage().window().getSize()); // (1050,832) pixel
        System.out.println(driver.manage().window().getSize().height);
        // 1B driver.manage().window().getPosition() --> icinde oldugu sayfanin pixel olarak konumunu döndürür
        System.out.println(driver.manage().window().getPosition()); // (10,10)

        // 1-C driver.manage().window().setPosition(new Point(15,15)); --> icinde oldgu sayfanin sol alt kösesini
        // bizim yazacagimiz pixele tasir
        driver.manage().window().setPosition(new Point(15,15));

        // 1D  driver.manage().window().setSize(new Dimension(900,600));
        // icinde oldugu sayfanin sol alt kösesi sabit olarak bizim yazacagimiz ölcülere getirir
        driver.manage().window().setSize(new Dimension(900,600));

        System.out.println("yeni pencere olculeri : " + driver.manage().window().getSize());
        System.out.println("yeni pencere konumu : " + driver.manage().window().getPosition());

        // 1E driver.manage().window().maximize(); --> icinde oldugu sayfayi maximize yapar
        // 1F driver.manage().window().fullscreen(); --> icinde oldugu sayfayi fullscreen yapar
        // farklarini görmek icin bu methodlari kullanip, baslangic noktalarini  ve boyutlarini yazdiralim
        driver.manage().window().maximize();
        System.out.println("maximize konum : " + driver.manage().window().getPosition());
        System.out.println("maximize boyut : " + driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize());

        // 1 - G driver.manage().window().minimize(); --> sayfayi simge durumunda kücültür
        driver.manage().window().minimize();

        // 2 -
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*

         */


    }
}
