package Meris_hub.Main_test_files;

import org.openqa.selenium.By;
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

    @FindBy (id="email")
    WebElement userEmail;

    @FindBy (id="password")
    WebElement pass;

    @FindBy (xpath="//*[@id=\"formAuthentication\"]/div[3]/button")
    WebElement loginBtn;

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public void click_loginBtn_without_email_and_password(){
        try{
            Page_factory_pattern.timeout2000();
            loginBtn.click();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"formAuthentication\"]/div[1]/span/div/span")).isDisplayed() && driver.findElement(By.xpath("//*[@id=\"formAuthentication\"]/div[2]/span/div/span")).isDisplayed()){
                    Assert.assertEquals(true, true, "When click login button without data, display validations for email and password ");
                }else{
                    Assert.assertEquals(true, false, "Not display validations when click login button without data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true, false, "Not display validations when click login button without data");
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public void enter_email_and_password_and_click_loginBtn(String email, String pwd){
        try{
            userEmail.sendKeys(email);
            Page_factory_pattern.timeout2000();
            pass.sendKeys(pwd);
            Page_factory_pattern.timeout2000();
            loginBtn.click();
            Page_factory_pattern.timeout2000();

            WebElement ele = userEmail;
            String val = ele.getAttribute("value");
            System.out.println(val);

            if(val.equals(email)){
                Assert.assertEquals(true,true,"Display validation when enter invalid email");

            }else{
                Assert.assertEquals(true, false,"Not Display validation when enter invalid email");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public void enter_valid_email_and_password(String validEmail, String pwd){
        try{
            userEmail.sendKeys(validEmail);
            Page_factory_pattern.timeout2000();
            pass.sendKeys(pwd);
            Page_factory_pattern.timeout2000();

            WebElement ele = userEmail;
            String val = userEmail.getAttribute("value");
            System.out.println(val);

            try{
                if(val.equals(validEmail)){
                    Assert.assertEquals(true, true,"Login to the system with valid credential");
                }else{
                    Assert.assertEquals(true, false,"Can't Login to the system with invalid credential");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }
        }catch (Exception ex){

        }
    }
}
