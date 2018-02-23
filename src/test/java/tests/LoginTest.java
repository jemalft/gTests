package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest{


@Test(priority = 0)
    public void canGoToLoginPage(){
                  pages.Pages.loginPage().goToLoginPage();
                  Assert.assertTrue(pages.Pages.loginPage().isAtLoginPage());
}
@Test(priority = 1)
    public void loginAsValidZoomDataUser() throws InterruptedException {
                  pages.Pages.loginPage().loginAsValidUser("admin","Z00mda1a!");

}
//@Test(priority = 2)
    public void canGoToSourcePage() throws InterruptedException {
                  pages.Pages.sourcePage().goToSource();
                 // Pages.loginPage().loginAsValidUser("admin","Z00mda1a!");
                  Assert.assertTrue(pages.Pages.sourcePage().isAtSourcePage());

}

}
