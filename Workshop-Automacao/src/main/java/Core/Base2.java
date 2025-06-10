package Core;

import org.junit.After;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base2 {

    private static WebDriver driver;

    public static boolean FECHAR_BROWSER = false;

    public static Browsers browser = Browsers.CHROME;

    public enum Browsers {
        CHROME,
        FIREFOX
    }

    private static Base2 driverChrome() {
        //Caminho ate a pasta da propriedade driver
        System.setProperty("webdriver.chrome.driver", "src/main/java/driverWeb/chromedriver.exe");
        return new Base2();
    }

    public static WebDriver getDriver(){
        if(driver == null) {
            driverChrome();
            CHROME: driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1200, 765));
        }
        return driver;
    }


    @After
    public void killDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
