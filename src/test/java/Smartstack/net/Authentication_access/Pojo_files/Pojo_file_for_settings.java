package Smartstack.net.Authentication_access.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Pojo_file_for_settings {

    By newStakeholderRegistrationOption = By.id("authentication_general-settings_Approval_INPUTSWITCH");    By selectAdministratorBtn = By.id("authentication_general-settings_display_Select_button");
    By filterStakeholderGroupOption = By.id("Elements_services_tree_view_main");        By selectGroup1 = By.id("Elements_services_tree_view_Checkbox0");   By selectGroup2 = By.id("Elements_services_tree_view_Checkbox1");
    By searchField = By.id("authentication_select-administrator_Stakeholder_Search_INPUT");     By selectStakeholder = By.id("authentication_select-administrator_Stakeholder_CHECKBOX_0");     By selectStakehodler1 = By.id("authentication_select-administrator_Stakeholder_CHECKBOX_1");
    By selectDefaultStakholderOption = By.id("authentication_general-settings_Select_Button");  By selectStakholderIntable = By.xpath("//*[@id=\"authentication_select-default_Stakeholder_group_Content_0\"]/span[2]");
    By selectGroupinTable = By.xpath("//*[@id=\"authentication_select-default_Stakeholder_group_GroupType_0\"]/span[2]");   By updateBtnofselectDefaultStakeholderSection = By.id("authentication_select-default_Stakeholder_group_Update_button");
    By updateBtnofSelectStakeholder = By.id("authentication_select-administrator_Stakeholder_Update_button");   By AdministratorEmailTemplate1 = By.id("authentication_email-template_Template_INPUTSWITCH_0"); By administratorEmailtemplate2 = By.id("authentication_email-template_Template_INPUTSWITCH_1");
    By administratorEmailtemplate3 = By.id("authentication_email-template_Template_INPUTSWITCH_2");     By websiteEmailtemplate1 = By.id("authentication_email-template_WebsiteTemplate_INPUTSWITCH_0");    By websiteEmailtemplate2 = By.id("authentication_email-template_WebsiteTemplate_INPUTSWITCH_1");
    By websiteEmailTemplate3 = By.id("authentication_email-template_WebsiteTemplate_2");    By fromOptionofTemplate = By.id("authentication_email-template_FromEmail_dropdown");    By selectFromOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-email-templates-settings/div/div/div[2]/div[2]/div[3]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem");
    By selectAdminTemplate1 = By.xpath("//*[@id=\"authentication_email-template_Template_1\"]/span");   By selectAdminTemplate2 = By.xpath("//*[@id=\"authentication_email-template_Template_2\"]/span");
    By selectWebsiteTemp1late1 = By.xpath("//*[@id=\"authentication_email-template_WebsiteTemplate_0\"]/span");     By selectWebsiteTemplate2 = By.xpath("//*[@id=\"authentication_email-template_WebsiteTemplate_1\"]/span");
    By adminTemplate= By.xpath("//*[@id=\"authentication_email-template_Template_0\"]/span");       By subjectInput = By.id("authentication_email-template_Subject_Input");     By restoreDefaultTemplatBtn = By.id("authentication_email-template_Buttons_section_Restore");
    By insertContentOption = By.xpath("//*[@id=\"authentication_email-template_EmailEditor_INPUT\"]/div/quill-editor/div[2]/div[1]");   By createSignatureBtn = By.id("authentication_email-template_Signature_Create_button");
    By signatureTitle = By.id("authentication_create-signature_Name_INPUT");    By insertAreaOfcreateSigntaure = By.xpath("//*[@id=\"authentication_create-signature_Content_INPUT\"]/div/quill-editor/div[2]/div[1]");
    By updateBtnOfcreateSigntaure = By.id("authentication_create-signature_Buttons_Update");    By editSignatureBtn = By.id("authentication_email-template_Signature_Edit_button");     By selectSignatureOption = By.id("authentication_email-template_Signature_dropdown");
    By updateBtnOfemailtemplate = By.id("authentication_email-template_Buttons_section_Update");    By field1OfCustomizationSettings = By.id("authentication_tab-settings_Custom_Menu_INPUT_0");     By restoreBtn1 = By.id("authentication_tab-settings_Restore_BUTTON_0");
    By fields2CustomizationSettings = By.id("authentication_tab-settings_Custom_Menu_INPUT_1");     By restoreBtn2 = By.id("authentication_tab-settings_Restore_BUTTON_1");    By updateBtnOfcustomizationSetting = By.id("authentication_tab-settings_Buttons_Update_BUTTON");
    WebDriver driver;

    public Pojo_file_for_settings(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    public static void timeout3000(){
        try{
            Thread.sleep(3000);
        }catch (Exception ex){}
    }

    public boolean test_administrator_registration(String invaliddata){
        boolean status = true;
        try{
            driver.findElement(newStakeholderRegistrationOption).click();
            try{
                driver.findElement(selectAdministratorBtn).click();
                Pojo_file_for_settings.timeout2000();
                driver.findElement(filterStakeholderGroupOption).click();
                Pojo_file_for_settings.timeout2000();
                try{
                    driver.findElement(selectGroup1).click();
                    Pojo_file_for_settings.timeout3000();
                    driver.findElement(selectGroup2).click();
                    Pojo_file_for_settings.timeout3000();
                    driver.findElement(selectGroup2).click();
                    Pojo_file_for_settings.timeout3000();

                    driver.findElement(searchField).sendKeys(invaliddata);
                    Pojo_file_for_settings.timeout3000();

                    try{
                        if(driver.findElement(By.id("authentication_select-administrator_Stakeholder_listbox")).isDisplayed()){
                            Assert.assertEquals(true,false,"Search field is not working , when entering invalid data not clear stakeholder list");
                        }
                    }catch (Exception ex){}

                }catch (Exception ex){}

            }catch (Exception ex){
                driver.findElement(selectDefaultStakholderOption).click();
                Pojo_file_for_settings.timeout2000();
                driver.findElement(selectStakholderIntable).click();
                Pojo_file_for_settings.timeout2000();
                driver.findElement(selectGroupinTable).click();
                Pojo_file_for_settings.timeout2000();
                driver.findElement(updateBtnofselectDefaultStakeholderSection).click();
                Pojo_file_for_settings.timeout3000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_search_field_of_administrator_registration(String validData){
        boolean status =true;
        try{
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(searchField).sendKeys(validData);
            Pojo_file_for_stakeholder_group_tab.timeout2000();

            try{
                if(driver.findElement(By.id("authentication_select-administrator_Stakeholder_listbox")).isDisplayed()){
                    Assert.assertEquals(true,false,"Search field is not working , Not display stakeholder according to the searched data");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            Assert.assertEquals(true,false,"Disable new stakeholder registration so not display search option, Search option display inside enable section of new stakeholder registration");
            status = false;
            return status;
        }
    }

    public  boolean test_select_stakeholder_for_new_admin_registration(){
        boolean status = true;
        try{
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            try {
                if(driver.findElement(selectStakeholder).isEnabled()){
                    driver.findElement(updateBtnofSelectStakeholder).click();
                }
            }catch(Exception ex){
                driver.findElement(selectStakeholder).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(selectStakehodler1).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(updateBtnofSelectStakeholder).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            Assert.assertEquals(true,false,"Disable new stakeholder registration so not display search option, Search option display inside enable section of new stakeholder registration");
            status = false;
            return status;
        }
    }

    public boolean test_enbale_disable_administrator_email_template(){
        boolean status = true;
        try{
            WebElement ele = driver.findElement(AdministratorEmailTemplate1);
            Actions action = new Actions(driver);
            action.moveToElement(ele).perform();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(AdministratorEmailTemplate1).click();
            Pojo_file_for_settings.timeout2000();
            WebElement ele1 = driver.findElement(AdministratorEmailTemplate1);
            Actions action1 = new Actions(driver);
            action1.moveToElement(ele1).perform();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(AdministratorEmailTemplate1).click();
            Pojo_file_for_settings.timeout2000();

            WebElement ele2 = driver.findElement(administratorEmailtemplate2);
            Actions action2 = new Actions(driver);
            action2.moveToElement(ele2).perform();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(administratorEmailtemplate2).click();
            Pojo_file_for_settings.timeout2000();
            WebElement ele3 = driver.findElement(administratorEmailtemplate2);
            Actions action3 = new Actions(driver);
            action3.moveToElement(ele3).perform();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(administratorEmailtemplate2).click();
            Pojo_file_for_settings.timeout2000();

            driver.findElement(administratorEmailtemplate3).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(administratorEmailtemplate3).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;

        }
    }

    public boolean test_website_email_template(){
        boolean status = true;
        try{
            WebElement ele = driver.findElement(websiteEmailtemplate1);
            Actions action = new Actions(driver);
            action.moveToElement(ele).perform();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(websiteEmailtemplate1).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(websiteEmailtemplate1).click();

            driver.findElement(websiteEmailtemplate2).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(websiteEmailtemplate2).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(websiteEmailTemplate3).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(websiteEmailTemplate3).click();
            Pojo_file_for_settings.timeout2000();

            Assert.assertEquals(true,false,"Not display mouse over tooltip for website email template section");

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;

        }
    }

    public boolean test_select_email_templates(String arg1){
        boolean status= true;
        try{
            driver.findElement(selectAdminTemplate1).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(selectAdminTemplate2).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(selectWebsiteTemp1late1).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(selectWebsiteTemplate2).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(adminTemplate).click();
            Pojo_file_for_settings.timeout2000();

            driver.findElement(fromOptionofTemplate).click();
            Pojo_file_for_settings.timeout2000();
            try {
                driver.findElement(selectFromOption).click();
            }catch (Exception ex){}

            driver.findElement(subjectInput).clear();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(restoreDefaultTemplatBtn).click();
            Pojo_file_for_settings.timeout2000();

            driver.findElement(insertContentOption).sendKeys(arg1);
            Pojo_file_for_settings.timeout2000();

            try{
                WebElement ele = driver.findElement(subjectInput);
                String val = ele.getAttribute("value");
                System.out.println(val);

                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"Not restoring default template when click restore button");
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

    public boolean test_create_signature_section(String invalidData, String invalidContent, String validData, String validContent){
        boolean status = true;
        try{
            driver.findElement(createSignatureBtn).click();
            Pojo_file_for_settings.timeout2000();
            try {
                driver.findElement(signatureTitle).sendKeys(invalidData);
                Pojo_file_for_settings.timeout2000();
                driver.findElement(insertAreaOfcreateSigntaure).sendKeys(invalidContent);
                Pojo_file_for_settings.timeout2000();

                try {
                    WebElement ele = driver.findElement(signatureTitle);
                    String val = ele.getAttribute("value");
                    System.out.println(val);
                    if (val.equals(invalidData)) {
                        Assert.assertEquals(true, false, "Create signature with invalid data");
                    }
                } catch (Exception ex) {
                }
            }catch (Exception ex1){
                driver.findElement(signatureTitle).sendKeys(validData);
                Pojo_file_for_settings.timeout2000();
                driver.findElement(insertAreaOfcreateSigntaure).sendKeys(validContent);
                Pojo_file_for_settings.timeout2000();
                driver.findElement(updateBtnOfcreateSigntaure).click();
                Pojo_file_for_settings.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;

        }
    }

    public boolean test_edit_signature_section(String validData,String validContent){

        boolean status =true;
        try{
            driver.findElement(updateBtnOfcreateSigntaure).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(selectSignatureOption).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(editSignatureBtn).click();
            Pojo_file_for_settings.timeout2000();

            try{
                WebElement ele = driver.findElement(signatureTitle);
                String val = ele.getAttribute("value");
                System.out.println(val);

                WebElement ele1 = driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-email-templates-settings/div/div/div[2]/div[2]/div[7]/div[2]/p-dropdown/div/div[3]/div/ul/li"));
                String val1 = ele1.getText();
                System.out.println(val1);

                if(val.isEmpty() || val1.equals("No results found")){
                    Assert.assertEquals(true,false,"1. Not display signature title inside edit signature section\n\n"+
                            "2. Not display created signature when open dropdown");
                }
            }catch (Exception ex){
                driver.findElement(signatureTitle).sendKeys(validData);
                Pojo_file_for_settings.timeout2000();
                driver.findElement(insertAreaOfcreateSigntaure).sendKeys(validContent);
                Pojo_file_for_settings.timeout2000();
                driver.findElement(updateBtnOfcreateSigntaure).click();
                Pojo_file_for_settings.timeout2000();
                driver.findElement(updateBtnOfemailtemplate).click();
                Pojo_file_for_settings.timeout3000();

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;

        }
    }

    public boolean test_with_customization_settings(String field1, String field2){
        boolean status = true;
        try{
            driver.findElement(field1OfCustomizationSettings).sendKeys(field1);
            Pojo_file_for_settings.timeout2000();
            driver.findElement(fields2CustomizationSettings).sendKeys(field2);
            Pojo_file_for_settings.timeout2000();
            driver.findElement(updateBtnOfcustomizationSetting).click();
            Pojo_file_for_settings.timeout3000();
            driver.findElement(restoreBtn1).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(restoreBtn2).click();
            Pojo_file_for_settings.timeout2000();
            driver.findElement(updateBtnOfcustomizationSetting).click();
            Pojo_file_for_settings.timeout3000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;

        }
    }





}
