package cz.czechitas;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        System.out.println("jeste je potreba nastavit cestu k driveru");
        //nastavte si prosím cestu k svemu driveru
        System.setProperty("webdriver.gecko.driver", "C:\\DevGit\\geckodriver.exe");

        WebDriver browser  = new FirefoxDriver();
        browser.quit();
    }

    @Test
    public void NovyTest(){}

}
