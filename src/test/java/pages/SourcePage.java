package pages;

import baseClasses.BaseClass;
import org.openqa.selenium.By;

import static pages.SourcePage.locator.pageTitle;


/**
 * Created by jemal on 11/12/17.
 */
public class SourcePage extends BaseClass {
    static String url = "http://localhost:8080/zoomdata/admin.html#sources";
    static String ExpectedTitle = "Manage Connections";


    public void goToSource() {
        driver.get(url);
    }

    public static boolean isAtSourcePage() {
         System.out.println(driver.findElement(pageTitle).getText());
        return driver.findElement(pageTitle).getText().equalsIgnoreCase(ExpectedTitle);
    }


    interface locator{
        By pageTitle = By.cssSelector(".btn.zd-button.blue.connections-btn");

    }
}
