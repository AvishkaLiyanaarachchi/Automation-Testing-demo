package Inventory_tracking_system.Main_test_file;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Page_factory_pattern {

    final WebDriver driver;

    public Page_factory_pattern(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="inventory-system_login_email_INPUT")
    WebElement useremail;

    @FindBy(id="inventory-system_login_password_INPUT")
    WebElement password;

    @FindBy(id="inventory-system_login_signIn_BUTTON")
    WebElement signIn;


    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    //This method used to clcik sign in button without email and password
    public void clickSigninBtn_without_EmailAndPassword(){
        try{
            Page_factory_pattern.timeout2000();
            signIn.click();
            //Page_factory_pattern.timeout2000();
            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-login/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[1]/div")).isDisplayed() && driver.findElement(By.xpath("/html/body/app-root/app-login/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[2]/div[2]")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under email address and password fields when click sign in button without filing fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation under email address and password fields when click sign in button without filing fields");
            }

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    //This method used to click sign in button with email address
    public void click_signIn_bto_with_emailAddress(String uEmail){
        try{
            useremail.sendKeys(uEmail);
            Page_factory_pattern.timeout2000();
            signIn.click();
            //Page_factory_pattern.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-login/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[2]/div[2]")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under password field when click sign in button without email address");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation under password field when click sign in button without email address");
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    //This method used to click sign in button with password
    public void click_signIn_btn_with_password(String uPassword){
        try {
            useremail.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Page_factory_pattern.timeout2000();
            password.sendKeys(uPassword);
            Page_factory_pattern.timeout2000();
            signIn.click();
            //Page_factory_pattern.timeout2000();

            try {
                if (driver.findElement(By.xpath("/html/body/app-root/app-login/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[1]/div")).isDisplayed()) {
                    Assert.assertEquals(true, true, "Display validation under email address field when click sign in button without password");
                }
            } catch (Exception ex) {
                Assert.assertEquals(true, false, "Not display validation under email address field when click sign in button without password");
            }

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    //This method used to click sign in button with invalid email address and password
    public void click_signIn_btn_with_invalid_emailAddress_and_password(String uEmail, String uPassword){
        try {
            useremail.sendKeys(uEmail);
            Page_factory_pattern.timeout2000();
            password.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Page_factory_pattern.timeout2000();
            password.sendKeys(uPassword);
            Page_factory_pattern.timeout2000();
            signIn.click();
            //Page_factory_pattern.timeout2000();

            try {
                if (driver.findElement(By.xpath("/html/body/app-root/app-login/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[1]/div")).isDisplayed()) {
                    Assert.assertEquals(true, true, "Display validation under email address field");
                }
            } catch (Exception ex) {
                Assert.assertEquals(true, false, "Not display validation under email address field");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    //This method used to login to the system with valid email address and password
    public void click_login_btn_with_valid_emailAddress_and_password(String validUemail, String validUpassword){
        try{
            useremail.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Page_factory_pattern.timeout2000();
            useremail.sendKeys(validUemail);
            Page_factory_pattern.timeout2000();
            password.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Page_factory_pattern.timeout2000();
            password.sendKeys(validUpassword);
            Page_factory_pattern.timeout2000();
            signIn.click();
            Thread.sleep(5000);

            try{
                if(driver.findElement(By.xpath("//*[@id=\"navbarBlur\"]/div/nav")).isDisplayed()){
                    Assert.assertEquals(true,true,"Move to the dashboard of inventory tracking system");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Can't move to the dashboard of inventory tracking system");
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }


}
