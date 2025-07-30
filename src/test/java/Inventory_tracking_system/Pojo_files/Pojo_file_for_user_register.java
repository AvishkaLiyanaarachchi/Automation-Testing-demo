package Inventory_tracking_system.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_user_register {

    By signuplink = By.id("inventory-system_login_singUp_ATAG");      By signupBtn = By.id("inventory-system_register_signup_BUTTON");    By nameField = By.id("inventory-system_register_username_INPUT");
    By emailField = By.id("inventory-system_register_email_INPUT");      By passwordField = By.id("inventory-system_register_password1_INPUT");   By repasswordField = By.id("inventory-system_register_password2_INPUT");     By signinOption = By.id("inventory-system_register_signUp_ATAG");
    By emailFieldinSigninSection = By.id("inventory-system_login_email_INPUT");  By passwordFieldinSigninSection = By.id("inventory-system_login_password_INPUT");    By signinBtn = By.id("inventory-system_login_signIn_BUTTON");


    WebDriver driver;

    public Pojo_file_for_user_register(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    //This method used to click sign up button without filling fields
    public boolean click_signUp_btn_without_filling_fields(){
        boolean status = true;
        try{
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(signuplink).click();
            Thread.sleep(5000);
            driver.findElement(signupBtn).click();
            Pojo_file_for_user_register.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-register/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[1]/div")).isDisplayed() && driver.findElement(By.xpath("/html/body/app-root/app-register/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[2]/div")).isDisplayed()){
                    Assert.assertEquals(true, true,"Display validations under name, email address, password and re enter password fields when click sign up button without data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true, false,"Not display validations under name, email address, password and re enter password fields when click sign up button without data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to this method");
            status = false;
            return status;
        }
    }

    //This method used to click sign up button with name and email address only
    public boolean click_signup_btn_with_name_and_email_fieldsOnly(String name, String email){
        boolean status = true;
        try{
            driver.findElement(nameField).sendKeys(name);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(emailField).sendKeys(email);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(signupBtn).click();
            Pojo_file_for_user_register.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-register/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[3]/div")).isDisplayed() && driver.findElement(By.xpath("/html/body/app-root/app-register/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[4]/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under password fields when click sign up button without passwords");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display validation under password fields when click sign up button without passwords");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to this method");
            status = false;
            return status;
        }
    }

    //This method used to click signup button with passwords only
    public boolean click_signup_btn_with_password_without_name_and_email(String password, String repassword){
        boolean status = true;
        try{
            driver.findElement(nameField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(emailField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(passwordField).sendKeys(password);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(repasswordField).sendKeys(repassword);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(signupBtn).click();
            Pojo_file_for_user_register.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-register/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[1]/div")).isDisplayed() && driver.findElement(By.xpath("/html/body/app-root/app-register/div/main/div/div/div/div/div/div[7]/div/div[2]/form/div[2]/div")).isDisplayed()){
                    Assert.assertEquals(true, true,"Display validations under name, email address fields when click sign up button without data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true, false,"Not display validations under name, email address fields when click sign up button without data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to this method");
            status = false;
            return status;
        }
    }

    //This method used to enter invalid data user registration section
    public boolean filling_user_registration_fields_with_invaliddata(String name, String invalidemailAddress){
        boolean status = true;
        try{
            driver.findElement(nameField).sendKeys(name);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(emailField).sendKeys(invalidemailAddress);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(signupBtn).click();
            Pojo_file_for_user_register.timeout2000();

            try{
                WebElement ele = driver.findElement(emailField);
                String val = ele.getAttribute("value");
                System.out.println(val);

                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"User registration with invalid name, email address");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,true,"Can't User registration with invalid name, email address");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to this method");
            status = false;
            return status;
        }
    }

    //This method used to enter valid data to register user
    public boolean filling_user_registration_fields_with_validdata(String name, String emailaddress, String password, String repassword){
        boolean status = true;
        try{
            driver.findElement(nameField).sendKeys(name);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(emailField).sendKeys(emailaddress);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(passwordField).sendKeys(password);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(repasswordField).sendKeys(repassword);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(signupBtn).click();
            Thread.sleep(5000);

            driver.findElement(signinOption).click();
            Thread.sleep(5000);
            driver.findElement(emailFieldinSigninSection).sendKeys(emailaddress);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(passwordFieldinSigninSection).sendKeys(password);
            Pojo_file_for_user_register.timeout2000();
            driver.findElement(signinBtn).click();
            Thread.sleep(5000);

            try{
                if(driver.findElement(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/li[1]/a")).isDisplayed()){
                    Assert.assertEquals(true,true,"Move to the dashboard when login with valid user account");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Can't move to the dashboard when login with valid user account");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to this method");
            status = false;
            return status;
        }
    }


}
