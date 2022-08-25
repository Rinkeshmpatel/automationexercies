package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest{

    String baseUrl = "http://automationexercise.com";

    @Before

    public void setup() {

        openBrowser(baseUrl);

    }

    @Test

    public void Usershouldnevigatetohomepageisvisiblesuccessfully(){

        //* click on the ‘login/Sign In’ link by xpath
        WebElement ClickSignTest01 = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        ClickSignTest01.click();


        //WebElement driver input email address());
        WebElement EnterUsername01 = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
        EnterUsername01.sendKeys("Rinkeshpm05@gmail.com");

      // WebElement driver input password
        WebElement  EnterPassword = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
        EnterPassword.sendKeys("123456789");

       //click on login button
        WebElement clickLoginbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        clickLoginbutton.click();

        //clcik on delete button
        WebElement ClickDeleteAccount= driver.findElement(By.xpath("//a[@href=\"/delete_account\"]"));
        ClickDeleteAccount.click();

        //VerifythatACCOUNTDELETEDisvisible

    }

    @Test
    public void loginuserwithincorrectemailandpassword3() {

        //* click on the ‘login/Sign In’ link by xpath
        WebElement ClickSignTest03 = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        ClickSignTest03.click();


        //WebElement driver input email address());
        WebElement EnterUsername01 = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
        EnterUsername01.sendKeys("Rinkeshrr@yahoo.com");

        // WebElement driver input password
        WebElement EnterPassword = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
        EnterPassword.sendKeys("58598598598");

        //click on login button
        WebElement clickLoginbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        clickLoginbutton.click();


    }
    @Test
    public void logoutuser04() {


        //* click on the ‘login/Sign In’ link by xpath
        WebElement ClickSignTest04 = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        ClickSignTest04.click();


        //WebElement driver input email address());
        WebElement EnterUsername01 = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
        EnterUsername01.sendKeys("Rinkeshpm05@gmail.com");

        // WebElement driver input password
        WebElement EnterPassword = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
        EnterPassword.sendKeys("123456789");

        //click on login button
        WebElement clickLoginbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        clickLoginbutton.click();

        //Click on logout button
        WebElement Clicklogoutbutton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        Clicklogoutbutton.click();
    }

    @Test
        public void RegisterUserwithExistingemail05() {
    //* click on the ‘login/Sign In’ link by xpath
    WebElement ClickSignTest05 = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    ClickSignTest05.click();

    //WebElement driver input email address());
    WebElement Entername05 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
    Entername05.sendKeys("Rinkesh");

    //Enternameandalreadyregisteredemailaddress
    WebElement Enterregisteremail = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
    Enterregisteremail.sendKeys("Rinkeshpm05@gmail.com");

    //ClickSignupbutton
    WebElement Clickonsignupbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
    Clickonsignupbutton.click();

    //VerifyerrorEmailAddressalreadyexistisvisible
    WebElement VerifyError = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p"));
    VerifyError.getText();

    }
@Test
    public void VerifyTestcasepage06() {




    //* click on the ‘login/Sign In’ link by xpath
    WebElement ClickSignTest06 = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    ClickSignTest06.click();

    //Click on the test case button
    WebElement Clickontestcasebutton = driver.findElement(By.xpath("//a[@href=\"/test_cases\"]"));
    Clickontestcasebutton.click();
}
@Test

    public void VerifyAllProductsandproductdetailpage08() {

    //* click on the ‘login/Sign In’ link by xpath
    WebElement ClickSignTest08 = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    ClickSignTest08.click();

    //WebElement driver input email address());
    WebElement EnterUsername08 = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    EnterUsername08.sendKeys("Rinkeshpm05@gmail.com");

    // WebElement driver input password
    WebElement EnterPassword = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    EnterPassword.sendKeys("123456789");

    //click on login button
    WebElement clickLoginbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
    clickLoginbutton.click();

    //Click on product button
    WebElement Clickonproductsbutton = driver.findElement(By.xpath("//a[@href=\"/products\"]"));
    Clickonproductsbutton.click();

    //click on view product of first product
    WebElement Clickonviewproduct = driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]"));
    Clickonviewproduct.click();

}
@Test

    public void Serchproduct09(){

    //click on product button
    WebElement Clickonproductsbutton = driver.findElement(By.xpath("//a[@href=\"/products\"]"));
    Clickonproductsbutton.click();

    //user should see all product page
    WebElement pagescrolldowntoallproduct = driver.findElement(By.xpath("//html[@lang=\"en\"]"));
    pagescrolldowntoallproduct.click();


    // productserchbynameand click on serch

    WebElement inputtheproductnameinserchbar = driver.findElement(By.xpath("//input[@type=\"text\"]"));
    inputtheproductnameinserchbar.sendKeys("Colour Blocked Shirt – Sky Blue");

    //clickonserchbutton
    WebElement clickonsearchbutton = driver.findElement(By.xpath("//i[@class=\"fa fa-search\"]"));
    clickonsearchbutton.click();

}
    @After
    public void teardown() {

    }
}