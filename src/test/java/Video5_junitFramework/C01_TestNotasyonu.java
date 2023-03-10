package Video5_junitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu {
    // Simdiye kadar Java da bir class in calismasi icin main method sarttir diyorduk
    // @Test notasyonu ile bu mecburiyet bitti
    public static void main(String[] args) {
        // Ayarlari yapalim
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1 - https:www.amazon.com sayfasina gidin
        driver.get("https:www.amazon.com");

        // 2 - arama cubuguna "Nutella" yazdirin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");
        // 3 - Nutella yazdiktan sonra ENTER a basarak isleminizi yapin
        aramaKutusu.submit();



    }
}
