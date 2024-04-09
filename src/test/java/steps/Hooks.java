package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Base;

import java.util.concurrent.TimeUnit;

public class Hooks{

    Base base;

    public Hooks(Base base) {
        this.base = base;
    }

    @Before
    public void iniciar() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        base.driver = new ChromeDriver(options);
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
    }

  //  @After
    //public void finalizar() {
 //       base.driver.quit();
   // }
}