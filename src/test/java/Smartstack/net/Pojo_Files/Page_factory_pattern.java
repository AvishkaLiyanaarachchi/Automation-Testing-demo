package Smartstack.net.Pojo_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.StringTokenizer;

public class Page_factory_pattern {

    By organizationListDropdown = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[1]/app-root-header/nav/div[2]/div[4]/p-dropdown");   By selectOrganizationFromList = By.xpath("/html/body/app-root/div/div/div[1]/app-root-header/nav/div[2]/div[4]/p-dropdown/div/div[3]/div/ul/p-dropdownitem");
    final WebDriver driver;

    public Page_factory_pattern(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(id = "wrapper"),
            @FindBy(id = "Smartstak_signupPage_sign_up_email")
    })
    WebElement userEmail;

    @FindBy(id = "Smartstak_loginAccount_userPassword")
    WebElement user_password;

    @FindBy(id = "Smartstak_signupPage_login_button")
    WebElement continue_with_email;

    @FindBy(id = "Smartstak_loginAccount_loginOnClick")
    WebElement log_in;

    @FindBy(id = "Smartstak_requestTAC_firstTACNumber")
    WebElement veri_code_input1;

    @FindBy(id = "Smartstak_requestTAC_secondTACNumber")
    WebElement very_code_input2;

    @FindBy(id ="Smartstak_requestTAC_thirdTACNumber")
    WebElement very_code_input3;

    @FindBy(id="Smartstak_requestTAC_fourthTACNumber")
    WebElement very_code_input4;

    @FindBy(id="Smartstak_requestTAC_fifthTACNumber")
    WebElement very_code_input5;

    @FindBy(id="Smartstak_requestTAC_sixthTACNumber")
    WebElement very_code_input6;

    @FindBy(id = "Smartstak_requestTAC_Continue")
    WebElement continue_but;

    @FindBy(id = "Smartstak_siteCreation_userFirstName")
    WebElement firstName;
    @FindBy(id = "Smartstak_siteCreation_userLastName")
    WebElement lastName;

    @FindBy(id = "Smartstak_siteCreation_Password")
    WebElement new_password;

    @FindBy(id = "Smartstak_siteCreation_yoursitename")
    WebElement siteName;

    @FindBy(id = "Smartstak_siteCreation_PhoneNumber")
    WebElement phoneNumber;

    @FindBy (id = "Smartstak_siteCreation_createAccountOnClick")
    WebElement createAccountBtn;

    public void loginDetails(String uemail1 ,String uEmail, String password,String tac_code1, String tac_code2, String tac_code3, String tac_code4, String tac_code5, String tac_code6){

        try{
            continue_with_email.click();
            Thread.sleep(1000);
            userEmail.sendKeys(uemail1);
            Thread.sleep(1000);
            continue_with_email.click();
            Thread.sleep(1000);
            userEmail.clear();
            Thread.sleep(1000);
            userEmail.sendKeys(uEmail);
            Thread.sleep(1000);
            continue_with_email.click();
            Thread.sleep(1000);
//            user_password.sendKeys(password);
//            Thread.sleep(1000);
//            log_in.click();
//            Thread.sleep(1000);
//            veri_code_input1.sendKeys(tac_code1);
//            very_code_input2.sendKeys(tac_code2);
//            very_code_input3.sendKeys(tac_code3);
//            very_code_input4.sendKeys(tac_code4);
//            very_code_input5.sendKeys(tac_code5);
//            very_code_input6.sendKeys(tac_code6);
//            continue_but.click();
//                Thread.sleep(3000);
           log_in.click();
            Thread.sleep(1000);
            try{
                try {
                    if (driver.findElement(By.xpath("//*[@id=\"bodySection\"]/app-root/div[2]/div/div/div[2]")).isDisplayed()) {
                        Assert.assertEquals(true, false, "When click login button without password , not display validation");
                    }
                } catch (Exception ex) {

                }
            }catch (Exception ex){
                user_password.sendKeys(password);
                Thread.sleep(1000);
                log_in.click();
                Thread.sleep(1000);
                veri_code_input1.sendKeys(tac_code1);
                very_code_input2.sendKeys(tac_code2);
                very_code_input3.sendKeys(tac_code3);
                very_code_input4.sendKeys(tac_code4);
                very_code_input5.sendKeys(tac_code5);
                very_code_input6.sendKeys(tac_code6);
                continue_but.click();
                Thread.sleep(3000);

                driver.findElement(organizationListDropdown).click();
                Thread.sleep(1000);
                driver.findElement(selectOrganizationFromList).click();
            }

        }catch(Exception ex){
            System.out.println(ex);
        }

    }

    public void check_login_details_with_password(String uemail1,String uEmail, String password1, String password, String wtac_code1, String wtac_code2, String wtac_code3, String wtac_code4, String wtac_code5, String wtac_code6,
                                                  String tac_code1, String tac_code2, String tac_code3, String tac_code4, String tac_code5, String tac_code6){
        try{
            continue_with_email.click();
            Thread.sleep(1000);
            userEmail.sendKeys(uemail1);
            Thread.sleep(1000);
            continue_with_email.click();
            Thread.sleep(1000);
            userEmail.clear();
            Thread.sleep(1000);
            userEmail.sendKeys(uEmail);
            Thread.sleep(1000);
            continue_with_email.click();
            Thread.sleep(1000);
            user_password.sendKeys(password1);
            Thread.sleep(1000);
            log_in.click();
            Thread.sleep(1000);
            user_password.clear();
            Thread.sleep(1000);
            user_password.sendKeys(password);
            Thread.sleep(1000);
            log_in.click();
            Thread.sleep(1000);
            veri_code_input1.sendKeys(wtac_code1);
            very_code_input2.sendKeys(wtac_code2);
            very_code_input3.sendKeys(wtac_code3);
            very_code_input4.sendKeys(wtac_code4);
            very_code_input5.sendKeys(wtac_code5);
            very_code_input6.sendKeys(wtac_code6);
            continue_but.click();
            Thread.sleep(1000);
            veri_code_input1.clear();
            Thread.sleep(1000);
            veri_code_input1.sendKeys(tac_code1);
            very_code_input2.sendKeys(tac_code2);
            very_code_input3.sendKeys(tac_code3);
            very_code_input4.sendKeys(tac_code4);
            very_code_input5.sendKeys(tac_code5);
            very_code_input6.sendKeys(tac_code6);
            continue_but.click();
            Thread.sleep(3000);

            driver.findElement(organizationListDropdown).click();
            Thread.sleep(1000);
            driver.findElement(selectOrganizationFromList).click();

        }catch (Exception ex){
            System.out.println(ex);
        }
    }



}
