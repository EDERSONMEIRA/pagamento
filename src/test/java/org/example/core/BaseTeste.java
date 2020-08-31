package org.example.core;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;

public class BaseTeste {

    @After
    public void finalizar(){
        DriverFactory.killDriver();
    }

    @BeforeClass
    public static void inicializar() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }


}
