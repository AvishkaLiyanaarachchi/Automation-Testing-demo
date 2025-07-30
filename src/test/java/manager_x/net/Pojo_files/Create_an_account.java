package manager_x.net.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Create_an_account {

    By createanaccountBTn = By.id("managerx-login_create_account_button");      By emailField = By.id("managerx-create_account_email_input");   By passwordField = By.id("managerx-create_account_password_input");
    By createAdminaccountBtn = By.id("managerx-create_account_create_admin_account_button");    By createAdminaccountBtnindetails = By.id("managerX-create_account_form-create_acc_button");    By firstNameField = By.id("managerX-create_account_form-first_name_input");
    By lastNameField = By.id("managerX-create_account_form-last_name_input");   By contactNofield = By.id("managerX-create_account_form-contact_number_input");     By constructionAddressField = By.id("managerX-create_account_form-street_address_textarea");
    By cityField = By.id("managerX-create_account_form-city_input");    By stateField = By.id("managerX-create_account_form-state_input");      By postcodeField = By.id("managerX-create_account_form-postcode_input");
    By countryField = By.id("managerX-create_account_form-country_dropdown");   By createaccountBtnforPM = By.id("managerx-create_account_create_builder_account_button");  By createaccountBtnforPm = By.id("managerX-create_account_form-create_acc_button");
    By companyName = By.id("managerX-create_account_form-builder_company_name_input");      By createIndividualContractorBtn = By.id("managerx-create_account_create_contractor_account_button");   By createContractorBTn = By.id("managerX-create_account_form-create_acc_button");
    By roledropdown = By.id("managerX-create_account_form-role_dropdown");

    WebDriver driver;

    public Create_an_account(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    //This method used to move to create an account section without email and password
    public boolean click_create_an_account_btn_without_email_and_password(){
        boolean status = true;
        try{
            Create_an_account.timeout2000();
            driver.findElement(By.xpath("/html/body/app-root/app-login/div/img")).click();
            Create_an_account.timeout2000();
            driver.findElement(createanaccountBTn).click();
            Create_an_account.timeout2000();
            driver.findElement(createAdminaccountBtn).click();
            Create_an_account.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-create_account_email_empty_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations under email address and password fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation under email address and password fields");
            }

            status=true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status=false;
            return status;
        }
    }

    //This method used to move to create an account section with invalid email and password
    public boolean click_create_an_account_button_with_invalid_email_and_password(String invalidEmail, String invalidPassword){
        boolean status = true;
        try{
            driver.findElement(emailField).sendKeys(invalidEmail);
            Create_an_account.timeout2000();
            driver.findElement(passwordField).sendKeys(invalidPassword);
            Create_an_account.timeout2000();
            driver.findElement(createAdminaccountBtn).click();
            Create_an_account.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-create_account_email_empty_error2\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under email address field for invalid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation under email and password fields for invalid data");
            }

            status=true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status=false;
            return status;
        }
    }

    //This method used to Move to create and account section with valid email and password
    public boolean click_create_an_account_button_with_email_and_password(String validEmail, String validpassword){
        boolean status = true;
        try{
            driver.findElement(emailField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Create_an_account.timeout2000();
            driver.findElement(emailField).sendKeys(validEmail);
            Create_an_account.timeout2000();
            driver.findElement(passwordField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Create_an_account.timeout2000();
            driver.findElement(passwordField).sendKeys(validpassword);
            Create_an_account.timeout2000();
            driver.findElement(createAdminaccountBtn).click();
            Create_an_account.timeout2000();

            try{
                if(driver.findElement(By.id("managerX-create_account_form-first_name_input")).isDisplayed()){
                    Assert.assertEquals(true,true,"Move to the create account of admin section");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not moved to the create and admin account section");
            }

            status=true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status=false;
            return status;
        }
    }

    //This method used to  click button without filling fields of create an account section
    public boolean click_create_admin_accountBtn_without_filling_fields(){
        boolean status = true;
        try{
            driver.findElement(createAdminaccountBtnindetails).click();
            Create_an_account.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-create_account_form_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"When click create admin account button without filling fields, display validations");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation when click create admin account button without filling fields");
            }

            status=true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status=false;
            return status;
        }
    }

    //This method used to create an account for admin
    public boolean create_admin_account(String firstName, String lastname, String contactno, String constructionaddress, String city, String state, String postcode){
        boolean status = true;
        try{

            driver.findElement(firstNameField).sendKeys(firstName);
            Create_an_account.timeout2000();
            driver.findElement(lastNameField).sendKeys(lastname);
            Create_an_account.timeout2000();
            driver.findElement(contactNofield).sendKeys(contactno);
            Create_an_account.timeout2000();
            driver.findElement(constructionAddressField).sendKeys(constructionaddress);
            Create_an_account.timeout2000();
            driver.findElement(cityField).sendKeys(city);
            Create_an_account.timeout2000();
            driver.findElement(stateField).sendKeys(state);
            Create_an_account.timeout2000();
            driver.findElement(postcodeField).sendKeys(postcode);
            Create_an_account.timeout2000();
            driver.findElement(countryField).click();
            Create_an_account.timeout2000();
            driver.findElement(countryField).click();
            Create_an_account.timeout2000();
            driver.findElement(createAdminaccountBtnindetails).click();
            Create_an_account.timeout2000();


            status=true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status=false;
            return status;
        }

    }

    //This method used to create an account for project manager
    public boolean click_create_account_of_projectManager(String email, String password){
        boolean status = true;
        try{
            Create_an_account.timeout2000();
            driver.findElement(createanaccountBTn).click();
            Create_an_account.timeout2000();
            driver.findElement(emailField).sendKeys(email);
            Create_an_account.timeout2000();
            driver.findElement(passwordField).sendKeys(password);
            Create_an_account.timeout2000();
            driver.findElement(createaccountBtnforPM).click();
            Create_an_account.timeout2000();
            driver.findElement(createaccountBtnforPm).click();
            Create_an_account.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-create_account_form_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation when click create project manager account button without filling fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation when click create project manager account button without filling fields");
            }

            status=true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status=false;
            return status;
        }

    }

    public boolean creeta_account_for_project_manager(String firstname, String lastname, String conNo, String company){
        boolean status = true;
        try{
            driver.findElement(firstNameField).sendKeys(firstname);
            Create_an_account.timeout2000();
            driver.findElement(lastNameField).sendKeys(lastname);
            Create_an_account.timeout2000();
            driver.findElement(contactNofield).sendKeys(conNo);
            Create_an_account.timeout2000();
            driver.findElement(companyName).sendKeys(company);
            Create_an_account.timeout2000();
            driver.findElement(createaccountBtnforPm).click();
            Create_an_account.timeout2000();

            status=true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status=false;
            return status;
        }

    }

    //This method used to click button without filling fields of create an account of contractor
    public boolean click_create_accountBTn_for_contractor(String email, String password){
        boolean status = true;
        try{
            Create_an_account.timeout2000();
            driver.findElement(createanaccountBTn).click();
            Create_an_account.timeout2000();
            driver.findElement(emailField).sendKeys(email);
            Create_an_account.timeout2000();
            driver.findElement(passwordField).sendKeys(password);
            Create_an_account.timeout2000();
            driver.findElement(createIndividualContractorBtn).click();
            Create_an_account.timeout2000();
            driver.findElement(createContractorBTn).click();
            Create_an_account.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerx-create_account_form_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations when click create an individual contractor button without filling fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validations when click create an individual contractor button without filling fields");
            }

            status=true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status=false;
            return status;
        }
    }

    //This method used to create an account for contractor
    public boolean create_account_for_contractor(String firstname, String lastname, String conNo){
        boolean status = true;
        try{
            driver.findElement(firstNameField).sendKeys(firstname);
            Create_an_account.timeout2000();
            driver.findElement(lastNameField).sendKeys(lastname);
            Create_an_account.timeout2000();
            driver.findElement(contactNofield).sendKeys(conNo);
            Create_an_account.timeout2000();
            driver.findElement(roledropdown).click();
            Create_an_account.timeout2000();
            driver.findElement(roledropdown).click();
            Create_an_account.timeout2000();
            driver.findElement(createContractorBTn).click();
            Create_an_account.timeout2000();

            status=true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status=false;
            return status;
        }
    }






}
