package baseClasses;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

/**
 * Created by jemal on 11/12/17.
 */
public class BaseClass extends BrowserFactory {

    public static WebDriver driver = GetBrowser("chrome");

    static String url = "http://localhost:8080/zoomdata/login";
    static String ExpectedTitle = "Login";

    public void goTo() {
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1600,900));
    }

    @AfterClass
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }

}
