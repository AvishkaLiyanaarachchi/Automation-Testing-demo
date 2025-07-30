package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.StringTokenizer;

import static java.nio.file.Files.find;

public class Pojo_file_for_add_new_stakeholder {

    By addNewtStakholderBtn = By.xpath("//*[@id='CRM_stakeholder-list_Top_AddNew_BUTTON']");      By createNewStakeholderLink = By.xpath("//*[@id=\"CRM_stakeholder-list_Top\"]/div[3]/div[1]/span");     By updateBtn = By.id("CRM_new-stakeholder-details_Buttons_Update_BUTTON");
    By firstNameField = By.id("CRM_new-stakeholder-details_NameSection_Name_INPUT");    By emailField = By.id("CRM_profile-details_MainEmail_INPUT");  By organizationNameField = By.xpath("//*[@id=\"CRM_organization-details_Organization_INPUT\"]/span/input");
    By titleinput = By.xpath("//*[@id=\"CRM_organization-details_Title_INPUT\"]/span/input");      By digitalAssetsTab = By.id("modules_custom-tabs_name_Folder");    By emailtab = By.id("modules_custom-tabs_Email");    By noteTab = By.id("modules_custom-tabs_Notes");
    By taskTab = By.id("modules_custom-tabs_Task");     By closeBtnofpopu = By.id("CRM_Confirm_Buttons_Delete_BUTTON");     By searchField = By.id("CRM_dashboard_searchBox_INPUT");
    By selectOrganization = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[3]/div[2]/div/div[2]/app-organization-details/div/div/div/div[1]/div[1]/div[2]/p-autocomplete/span/div/ul/li");
    By selectTitle = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[3]/div[2]/div/div[2]/app-organization-details/div/div/div/div[1]/div[3]/div[2]/p-autocomplete/span/div/ul/li/span");
    By cancelBtnOfAddnewStakeholder = By.id("CRM_new-stakeholder-details_Buttons_Cancel_BUTTON");
    WebDriver driver;

    public Pojo_file_for_add_new_stakeholder(WebDriver driver) {
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

    public boolean test_click_update_button_without_data_addNewStakeholder_option(){
        boolean status = true;
        try{
            try {
                driver.findElement(addNewtStakholderBtn).click();
                Pojo_file_for_add_new_stakeholder.timeout2000();
                driver.findElement(createNewStakeholderLink).click();
            }catch (Exception ex){}
            Pojo_file_for_add_new_stakeholder.timeout2000();
            driver.findElement(updateBtn).click();
            Pojo_file_for_add_new_stakeholder.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"CRM_profile-details_close\"]/div[1]/div[3]/span"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("Invalid email address")){
                    Assert.assertEquals(true,false,"When click update button without data, it's better , display only Email is mandatory validation");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Add new stakeholder button display as disable");
            status = false;
            return status;
        }
    }

    public  boolean test_fill_require_fields_of_add_stakeholder(String name, String Invalidemail, String validemail, String organizationname, String title){
        boolean status = true;
        try{
            driver.findElement(firstNameField).sendKeys(name);
            Pojo_file_for_add_new_stakeholder.timeout2000();
            driver.findElement(emailField).sendKeys(Invalidemail);
            Pojo_file_for_add_new_stakeholder.timeout2000();
            driver.findElement(emailField).clear();
            Pojo_file_for_add_new_stakeholder.timeout2000();
            driver.findElement(emailField).sendKeys(validemail);
            Pojo_file_for_add_new_stakeholder.timeout2000();
            driver.findElement(organizationNameField).sendKeys(organizationname);
            Pojo_file_for_add_new_stakeholder.timeout2000();
            try{
                driver.findElement(selectOrganization).click();
                Pojo_file_for_add_new_stakeholder.timeout2000();
            }catch (Exception ex){}
            driver.findElement(titleinput).sendKeys(title);
            Pojo_file_for_add_new_stakeholder.timeout2000();
            try{
                driver.findElement(selectTitle).click();
                Pojo_file_for_add_new_stakeholder.timeout2000();
            }catch (Exception ex){}

            try{
               String max_length = driver.findElement(titleinput).getAttribute("maxlength");
               System.out.println(max_length);
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_grThrough_CRM_modules(){
        boolean status = true;
        try{
            driver.findElement(digitalAssetsTab).click();
            Pojo_file_for_add_new_stakeholder.timeout2000();
            driver.findElement(emailtab).click();
            Pojo_file_for_add_new_stakeholder.timeout2000();
            driver.findElement(noteTab).click();
            Pojo_file_for_add_new_stakeholder.timeout2000();
            driver.findElement(taskTab).click();
            Pojo_file_for_add_new_stakeholder.timeout2000();
            driver.findElement(updateBtn).click();
            Pojo_file_for_add_new_stakeholder.timeout3000();

            try {
                driver.findElement(closeBtnofpopu).click();
                Pojo_file_for_add_new_stakeholder.timeout3000();
                try {
                    if (driver.findElement(updateBtn).isDisplayed()) {
                        Assert.assertEquals(true, false, "When creating new stakeholder , not move to the stakeholder list");
                    }
                } catch (Exception ex) {
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"CRM modules tabs are disabled");
            status = false;
            return status;
        }
    }

    public boolean test_search_newly_created_stakeholder(String arg1){
        boolean status =true;
        try{
            try{
                driver.findElement(cancelBtnOfAddnewStakeholder).click();
                Pojo_file_for_add_new_stakeholder.timeout2000();
            }catch(Exception ex){}
            driver.findElement(searchField).sendKeys(arg1);
            Pojo_file_for_add_new_stakeholder.timeout3000();


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }



}
