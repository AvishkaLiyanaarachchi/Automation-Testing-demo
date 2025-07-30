package manager_x.net.Main_test_file;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;

public class Page_factory_pattern {

    By propertyAddressDropdown = By.id("managerX_master-page_display-address_dropdown");    By selectAddress1 = By.id("managerX_master-page_display-address_dropdown_1");   By selectAddress2 = By.id("managerX_master-page_display-address_dropdown_2");
    By logoutOption = By.id("managerX_master-page_logout_Link");    By loginBtnForProjectManager = By.id("managerx-login_builder_login_button");    By loginBtnforContractor = By.id("managerx-login_contractor_login_button");

    final WebDriver driver;

    public Page_factory_pattern(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

//    @FindAll({
//            @FindBy(id = "wrapper"),
//            @FindBy(id = "managerx-login_email_INPUT")
//    })
//    WebElement userEmail;
    @FindBy(id = "managerx-login_email_INPUT")
    WebElement userEmail;

    @FindBy(id = "managerx-login_password_INPUT")
    WebElement user_password;

    @FindBy(id = "managerx-login_admin_login_button")
    WebElement login;

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public void clickLoginButton_without_email_password(){
        try{
            Page_factory_pattern.timeout2000();
            login.click();
            Page_factory_pattern.timeout2000();
            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-login_email_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display email address and password validations when click login button without them");

                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation when click login button without email address and password");
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public void clickLoginbutton_with_email_address(String uEmail){
        try{
            userEmail.sendKeys(uEmail);
            Page_factory_pattern.timeout2000();
            login.click();
            Page_factory_pattern.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-login_password_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display password field validation");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display password field validation when click login button without email address");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }

    }
    public void clickLoginbutton_with_password(String upassword){
        try{
            userEmail.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Page_factory_pattern.timeout2000();
            user_password.sendKeys(upassword);
            Page_factory_pattern.timeout2000();
            login.click();
            Page_factory_pattern.timeout2000();


            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-login_email_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display email address field validation");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display email address field validation when click login button without pasword");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public void loginWithInvalidemailandPassword(String uEmail, String uPassword){
        try{

            userEmail.sendKeys(uEmail);
            Page_factory_pattern.timeout2000();
            login.click();
            Page_factory_pattern.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-login_email_error2\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Can't login to the system with invalid email address and password");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Login to the system with invalid email address and password");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    public void loginWithValidemailAndpassword(String validUEmail, String validupassword){
        try{
            userEmail.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Page_factory_pattern.timeout2000();
            userEmail.sendKeys(validUEmail);
            Page_factory_pattern.timeout2000();
            user_password.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Page_factory_pattern.timeout2000();
            user_password.sendKeys(validupassword);
            Page_factory_pattern.timeout2000();
            login.click();
            Page_factory_pattern.timeout2000();

            try {
                if (driver.findElement(By.id("managerX_master-page_overviewMenu_Item")).isDisplayed()) {
                    Assert.assertEquals(true, true, "Move to the dashboard");
                }
            }catch (Exception ex){
                    Assert.assertEquals(true,false,"Can't move to the dashboard with valid login details");
                }
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    public boolean select_property_address(){
        boolean status = true;
        try{
            driver.findElement(propertyAddressDropdown).click();
            Page_factory_pattern.timeout2000();
            driver.findElement(selectAddress1).click();
            Thread.sleep(3000);
            driver.findElement(propertyAddressDropdown).click();
            Thread.sleep(3000);
            driver.findElement(selectAddress2).click();
            Thread.sleep(3000);

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            System.out.println("Not display property address");
            status = false;
            return status;

        }
    }

    //logout from the system
    public void logout_from_system(){
        try{
            driver.findElement(logoutOption).click();
            Page_factory_pattern.timeout2000();

            try{
                if(userEmail.isDisplayed()){
                    Assert.assertEquals(true,true,"Logout from the system");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not logout from the system");
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public void click_projectManagerloginBtn_without_filling_fields(){
        try{
            driver.findElement(loginBtnForProjectManager).click();
            Page_factory_pattern.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-login_email_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations under email address and password fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validations under email address and password fields");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public void login_as_project_manager(String email, String password){
        try{
            userEmail.sendKeys(email);
            Page_factory_pattern.timeout2000();
            user_password.sendKeys(password);
            Page_factory_pattern.timeout2000();
            driver.findElement(loginBtnForProjectManager).click();
            Page_factory_pattern.timeout2000();

            try {
                if (driver.findElement(By.id("managerX_master-page_display-address_dropdown")).isDisplayed()) {
                    Assert.assertEquals(true, true, "Move to the dashboard of project manager");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Can't move to the dashboard with valid project manager login details");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }


    }

    public void click_contractor_loginBtn_without_filling_fields(){
    try{
        driver.findElement(loginBtnforContractor).click();
        Page_factory_pattern.timeout2000();

        try{
            if(driver.findElement(By.xpath("//*[@id=\"managerx-login_email_error1\"]/span")).isDisplayed()){
                Assert.assertEquals(true,true,"Display validations under email address and password fields");
            }
        }catch (Exception ex){
            Assert.assertEquals(true,false,"Not display validations under email address and password fields");
        }
    }catch (Exception ex){
        System.out.println(ex);
    }
    }

    public void login_as_contractor(String email, String password){
        try{
            userEmail.sendKeys(email);
            Page_factory_pattern.timeout2000();
            user_password.sendKeys(password);
            Page_factory_pattern.timeout2000();
            driver.findElement(loginBtnforContractor).click();
            Page_factory_pattern.timeout2000();

            try {
                if (driver.findElement(By.id("managerX_master-page_overviewMenu_Item")).isDisplayed()) {
                    Assert.assertEquals(true, true, "Move to the dashboard of contractorr");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Can't move to the dashboard with valid contractor login details");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }








}
