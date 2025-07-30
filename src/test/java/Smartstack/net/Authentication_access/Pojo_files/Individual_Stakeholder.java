package Smartstack.net.Authentication_access.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.lang.Boolean;

public class Individual_Stakeholder {

    By rightIconofpagination = By.xpath("//*[@id=\"stackholder-access_individual-stackholder_pagintion_PAGINATOR\"]/div/button[4]");    By leftIconOfpagination = By.xpath("//*[@id=\"stackholder-access_individual-stackholder_pagintion_PAGINATOR\"]/div/button[1]");
    By moveOption = By.id("stackholder-access_individual-stackholder_move-icon_BUTTON_1");     By moveInput = By.id("stackholder-access_individual-stackholder_move_INPUT_1");     By moveBtn = By.id("stackholder-access_individual-stackholder_move-icon-1_BUTTON_1");
    By addNewStakeholderBtn = By.id("stackholder-access_individual-stackholder_add-new_BUTTON");    By updateBtnOfaddStakeholder = By.id("authentication_stakeholder-details_Update");   By stakeholderNameInput = By.id("stakeholderFullnameId");
    By emailAddressField = By.id("authentication_profile-filed_email_INPUT");   By passwordField = By.id("authentication_login-access_password_INPUT");     By confirmPassword = By.id("authentication_login-access_conform_INPUT");
    By stakeholderGroupOption = By.id("authentication_stakeholder-groups_user_prompt_dropdown_0");  By selectstakeholderGroup = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[3]/div[3]/app-stakeholder-groups/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By clickConfirmBtn = By.id("stackholder-access_alert-box_update-1_BUTTON");  By selectTypeOption = By.xpath("//*[@id=\"authentication_stakeholder-groups_tree_view_dropdown_0\"]/div/div/div/div/div");     By confirmTickForType = By.id("stackholder-access_alert-box_update-1_BUTTON");
    By searchField = By.id("stackholder-access_individual-stackholder_search_INPUT");       By cancelBtnOfaddstakeholder = By.id("authentication_stakeholder-details_Cancel");      By deleteOption = By.id("stackholder-access_individual-stackholder_delete_BUTTON_0");
    By deleteBtnOfpopup = By.id("stackholder-access_alert-box_update-3_BUTTON");
    WebDriver driver;

    public Individual_Stakeholder(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout1000(){
        try{
            Thread.sleep(1000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void timeout3000(){
        try{
            Thread.sleep(3000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void timeout4000(){
        try{
            Thread.sleep(4000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public boolean test_stakeholder_list(String arg1){
        boolean status  =true;
        try{
            driver.findElement(rightIconofpagination).click();
            Individual_Stakeholder.timeout2000();
            driver.findElement(leftIconOfpagination).click();
            Individual_Stakeholder.timeout2000();

            WebElement ele = driver.findElement(moveOption);
            Actions action = new Actions(driver);
            action.moveToElement(ele).perform();
            Individual_Stakeholder.timeout1000();
            driver.findElement(moveInput).sendKeys(arg1);
            Individual_Stakeholder.timeout1000();
            driver.findElement(moveBtn).click();
            Individual_Stakeholder.timeout2000();

            try{
                if(driver.findElement(By.id("stackholder-access_individual-stackholder_emaail-section_SPAN_1")) != driver.findElement(By.id("stackholder-access_individual-stackholder_full-name-section_SPAN_0"))) {
                    Assert.assertEquals(true, false, "Not moved the record between stakeholder list");
                }
            }catch (Exception ex){

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display stakeholder list so pagination section is disable");
            status = false;
            return status;

        }
    }

    public boolean test_add_new_stakeholder_section1(String arg1 ,String arg2, String arg3, String arg4, String arg5, String arg6, String arg7){
        boolean status = true;
        try{
            driver.findElement(addNewStakeholderBtn).click();
            Individual_Stakeholder.timeout1000();
            driver.findElement(updateBtnOfaddStakeholder).click();
            Individual_Stakeholder.timeout1000();
            driver.findElement(stakeholderNameInput).sendKeys(arg1);
            Individual_Stakeholder.timeout1000();
            driver.findElement(updateBtnOfaddStakeholder).click();
            Individual_Stakeholder.timeout1000();
            driver.findElement(emailAddressField).sendKeys(arg2);
            Individual_Stakeholder.timeout1000();
            driver.findElement(emailAddressField).clear();
            Individual_Stakeholder.timeout1000();
            driver.findElement(emailAddressField).sendKeys(arg3);
            Individual_Stakeholder.timeout1000();

            driver.findElement(passwordField).clear();
            Individual_Stakeholder.timeout1000();
            driver.findElement(confirmPassword).clear();
            Individual_Stakeholder.timeout1000();

            driver.findElement(passwordField).sendKeys(arg4);
            Individual_Stakeholder.timeout1000();
            driver.findElement(confirmPassword).sendKeys(arg5);
            Individual_Stakeholder.timeout1000();
            driver.findElement(passwordField).clear();
            Individual_Stakeholder.timeout1000();
            driver.findElement(confirmPassword).clear();
            Individual_Stakeholder.timeout1000();
            driver.findElement(passwordField).sendKeys(arg6);
            Individual_Stakeholder.timeout1000();
            driver.findElement(confirmPassword).sendKeys(arg7);
            Individual_Stakeholder.timeout1000();

            try{
                try{
                    WebElement ele =  driver.findElement(By.xpath("//*[@id=\"stackholder-access_master-page_add-new-stackholder_DIV\"]/app-stakeholder-details/div/div[3]/div[2]/app-login-access/div/div[6]"));
                    boolean val = ele.isDisplayed();
                    System.out.println(val);
                }catch (Exception ex){}

                if(driver.findElement(By.id("authentication_login-access_conform_password")).isDisplayed()){
                    Assert.assertEquals(true,false,"1. Not display validation message under fields without entering password \n\n" +
                            " 2. Not include password format after entering passwords to the fields");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;

        }
    }

    public boolean test_add_new_stakeholder_section2(String arg1, String arg2, String arg4, String arg5, String arg6){
        boolean status = true;
        try{
            try {
                driver.findElement(stakeholderGroupOption).click();
                Individual_Stakeholder.timeout1000();
                driver.findElement(selectstakeholderGroup).click();
                Individual_Stakeholder.timeout1000();
                driver.findElement(clickConfirmBtn).click();
                Individual_Stakeholder.timeout1000();
                driver.findElement(selectTypeOption).click();
                Individual_Stakeholder.timeout1000();
                driver.findElement(confirmTickForType).click();
                Individual_Stakeholder.timeout2000();
                driver.findElement(updateBtnOfaddStakeholder).click();
                Individual_Stakeholder.timeout3000();

            }catch (Exception ex) {
                driver.findElement(updateBtnOfaddStakeholder).click();
                Individual_Stakeholder.timeout3000();

            }

            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"stackholder-access_master-page_add-new-stackholder_DIV\"]/app-stakeholder-details/div/div[3]/div[1]/app-profile-details/div/div[2]/div[2]/div/div/span[2]"));
                String val = ele.getText();
                System.out.println(val);
                if(val.equals("Email already exists !!")){
                    driver.findElement(emailAddressField).clear();
                    Individual_Stakeholder.timeout1000();
                    driver.findElement(emailAddressField).sendKeys(arg6);
                    Individual_Stakeholder.timeout1000();
                    driver.findElement(updateBtnOfaddStakeholder).click();
                    Individual_Stakeholder.timeout2000();
                }
            }catch (Exception ex1){}

            try{
                WebElement ele = driver.findElement(stakeholderGroupOption);
                boolean val = ele.isEnabled();
                System.out.println(val);

                if(driver.findElement(By.id("stakeholderFullnameId")).isDisplayed() ){
                    Assert.assertEquals(true,false,"1. Can't select stakeholder group, type when creating new stakeholder.\n\n"+
                            "2. Not move to the stakeholder list after creating new stakeholder");
                }
            }catch (Exception ex){}


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;

        }
    }

    public boolean test_search_and_delete_created_stakeholder(String arg1){
        boolean status = true;
        try{
            try {
                driver.findElement(cancelBtnOfaddstakeholder).click();
            }catch (Exception ex){}
            Individual_Stakeholder.timeout4000();
            driver.findElement(searchField).sendKeys(arg1);
            Individual_Stakeholder.timeout4000();
            driver.findElement(deleteOption).click();
            Individual_Stakeholder.timeout3000();
            driver.findElement(deleteBtnOfpopup).click();
            Individual_Stakeholder.timeout3000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;

        }
    }


}
