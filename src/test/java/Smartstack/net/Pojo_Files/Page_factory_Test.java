package Smartstack.net.Pojo_Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_factory_Test {

    WebDriver driver;
    Page_factory_pattern obj;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();//Setup the chrome driver
        driver = new ChromeDriver();
        driver.get("https://ssdevelopment.smartstak.net/");//Give the URL
        driver.manage().window().maximize(); //maximize the browser window
    }

    @Test
    public void name() {
        obj = new Page_factory_pattern(driver);
        //obj.loginDetails("des@whyte.com","123","1","2","3","4","5","6");

    }
}
