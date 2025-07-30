package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Pojo_file_for_add_edit_organization {

    By addOrganizationBtn = By.id("CRM_organisation-list_Add_BUTTON");      By searchOption = By.id("CRM_dashboard_searchBox_INPUT");    By updateBtn = By.id("CRM_new-stakeholder-details_Buttons_Update_BUTTON");
    By editOptionforOrganization = By.id("CRM_organisation-list_Buttons_Edit_0");   By workPhoneField = By.id("CRM_new-organization-details_WorkPhone_INPUT");      By updateBtnOfeditOrganization = By.id("CRM_new-organization-details_Buttons_Update");
    By cancelBtnOforganization = By.id("CRM_new-stakeholder-details_Buttons_Cancel_BUTTON");    By industryOption = By.id("CRM_new-organization-details_Industry_dropdown");    By selectIndustry = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-organization-details/div/div[2]/div[2]/div[1]/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[357]");
    By contactOwner = By.id("CRM_new-organization-details_Contact_Plus");   By stakeholderGroup = By.id("CRM_stakeholder-group_Group_Name_0");  By selectCheckbox = By.id("CRM_stakeholder-group_GroupType_CHECKBOX_0");
    By individualStakeholder = By.id("CRM_select_owner_Tab_Individual_Click");      By filterStakeholderGroup = By.id("CRM_individual-stakeholder_Group_treeView");     By plusIconofstakeholderGroupSection = By.xpath("//*[@id=\"CRM_individual-stakeholder_Group_treeView\"]/div/div[2]/div[2]/div[1]/i[1]");
    By selectStakeholderGroup = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND0");    By searchOptionForcontactOwner = By.id("CRM_individual-stakeholder_Search_INPUT");   By selectStakeholderGroupIncontactOwner = By.xpath("//*[@id=\"CRM_individual-stakeholder_Group_treeView\"]/div/div[2]/div[2]/div[1]/div");
    By selectStakehodler = By.xpath("//*[@id=\"CRM_individual-stakeholder_List_CHECKBOX_0\"]/div/div[2]");  By updateBtnOfselectStakeholder = By.id("CRM_individual-stakeholder_Buttons_Update");   By linkExisitingStakehodlerBtn = By.id("CRM_new-organization-details_ButtonField_Link");
    By stakeholderGroupOfLinkedExisitngStakehodler = By.id("CRM_select-stakeholders_treeView");     By selectStakeholdergroup1InLinkedOption = By.xpath("//*[@id=\"CRM_select-stakeholders_treeView\"]/div/div[2]/div[1]/div/div");
    By searchOptiofLinkedExistingSection = By.id("CRM_select-stakeholders_Search_INPUT");   By selectStakehodlerInexisting = By.id("CRM_select-stakeholders_List_CHECKBOX_0");  By upateBtnOflinkedExistingStakeholder= By.id("CRM_select-stakeholders_Buttons_Update");
    By createnewcontactOwner = By.id("CRM_new-organization-details_ButtonField_Create");    By organizationTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[1]/div/app-tab-view/div/div[2]/span");

    WebDriver driver;

    public Pojo_file_for_add_edit_organization(WebDriver driver) {
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

    public boolean test_add_organization_section(){
        boolean status = true;
        try{
            driver.findElement(addOrganizationBtn).click();
            Pojo_file_for_add_edit_organization.timeout2000();

            status = false;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_update_organization_and_search_organization(String arg1){
        boolean status = true;
        try{
            driver.findElement(updateBtn).click();
            Pojo_file_for_add_edit_organization.timeout3000();
            try {
                driver.findElement(searchOption).sendKeys(arg1);
                Pojo_file_for_add_edit_organization.timeout3000();
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not creating new organization because email is invalid");
            status = false;
            return status;
        }
    }

    public boolean test_clear_field_of_edit_organization(){
        boolean status = true;
        try{
            try{
                driver.findElement(cancelBtnOforganization).click();
                Pojo_file_for_add_edit_organization.timeout3000();
            }catch (Exception ex){}
            try {
                driver.findElement(searchOption).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_add_edit_organization.timeout3000();
            }catch(Exception ex){}
            if(driver.findElement(editOptionforOrganization).isDisplayed()) {
                driver.findElement(editOptionforOrganization).click();
                Pojo_file_for_add_edit_organization.timeout2000();
                driver.findElement(workPhoneField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
                Pojo_file_for_add_edit_organization.timeout2000();
                driver.findElement(updateBtnOfeditOrganization).click();
                Pojo_file_for_add_edit_organization.timeout3000();

                try{
                    if(driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div[1]/div[2]/p-table/div/div/table/tbody/tr[1]")).isDisplayed()){
                        Assert.assertEquals(true,false,"When clearing required fields of edit organization section and click update button , not display validation and move to the organization list");
                    }
                }catch (Exception ex){}

            }else{
                try{
                    WebElement ele= driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div/div[2]/div/span"));
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals("There are no records to display")){
                        Assert.assertEquals(true,false,"Not display organization list and display  message as 'There are no records to display'");
                    }
                }catch (Exception ex){
                    Assert.assertEquals(true,false,"Not display message, If not display organization list");
                }
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_edit_organization_section(String invalidData, String contactno, String firstName, String lastName, String fullName){
        boolean status = true;
        try{
            if(driver.findElement(editOptionforOrganization).isDisplayed()) {
                driver.findElement(editOptionforOrganization).click();
                Pojo_file_for_add_edit_organization.timeout3000();
                driver.findElement(workPhoneField).clear();
                Pojo_file_for_add_edit_organization.timeout2000();
                driver.findElement(workPhoneField).sendKeys(contactno);
                Pojo_file_for_add_edit_organization.timeout2000();
                driver.findElement(industryOption).click();
                Pojo_file_for_add_edit_organization.timeout2000();
                try{
                    driver.findElement(selectIndustry).click();
                }catch (Exception ex){}
                Pojo_file_for_add_edit_organization.timeout2000();
                driver.findElement(contactOwner).click();
                Pojo_file_for_add_edit_organization.timeout2000();
                driver.findElement(stakeholderGroup).click();
                Pojo_file_for_add_edit_organization.timeout2000();
                try {
                    driver.findElement(selectCheckbox).click();
                }catch (Exception ex){}
                Pojo_file_for_add_edit_organization.timeout2000();
                driver.findElement(individualStakeholder).click();
                Pojo_file_for_add_edit_organization.timeout2000();
                driver.findElement(filterStakeholderGroup).click();
                Pojo_file_for_add_edit_organization.timeout2000();
                try{
                    driver.findElement(plusIconofstakeholderGroupSection).click();
                    Pojo_file_for_add_edit_organization.timeout2000();
                    driver.findElement(selectStakeholderGroup).click();
                    Pojo_file_for_add_edit_organization.timeout2000();
                }catch (Exception ex){
                    driver.findElement(selectStakeholderGroupIncontactOwner).click();
                }
                Pojo_file_for_add_edit_organization.timeout2000();
                driver.findElement(searchOptionForcontactOwner).sendKeys(invalidData);
                Pojo_file_for_add_edit_organization.timeout3000();
                driver.findElement(searchOptionForcontactOwner).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
                Pojo_file_for_add_edit_organization.timeout3000();
                driver.findElement(searchOptionForcontactOwner).sendKeys(firstName);
                Pojo_file_for_add_edit_organization.timeout3000();
                driver.findElement(searchOptionForcontactOwner).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
                Pojo_file_for_add_edit_organization.timeout3000();
                driver.findElement(searchOptionForcontactOwner).sendKeys(lastName);
                Pojo_file_for_add_edit_organization.timeout3000();
                driver.findElement(searchOptionForcontactOwner).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
                Pojo_file_for_add_edit_organization.timeout3000();
                driver.findElement(searchOptionForcontactOwner).sendKeys(fullName);
                Pojo_file_for_add_edit_organization.timeout3000();

                try{
                    if(driver.findElement(By.xpath("//*[@id=\"CRM_new-organization-details_Main\"]/div[3]/app-select-owner/div/div[2]/div[2]/app-individual-stakeholder-selection/div/div[3]")).isDisplayed()){
                        Assert.assertEquals(true,false,"When searching with full name , not display searched stakeholder");
                    }
                }catch (Exception ex){}


            }else{
                try{
                    WebElement ele= driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div/div[2]/div/span"));
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals("There are no records to display")){
                        Assert.assertEquals(true,false,"Not display organization list and display  message as 'There are no records to display'");
                    }
                }catch (Exception ex){
                    Assert.assertEquals(true,false,"Not display message, If not display organization list");
                }
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_select_contact_owner_of_edit_organization(){
        boolean status = true;
        try{
            try {
                driver.findElement(searchOptionForcontactOwner).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_add_edit_organization.timeout3000();
                try {
                    if (driver.findElement(selectStakehodler).isSelected()) {
                        driver.findElement(updateBtnOfselectStakeholder).click();
                        Pojo_file_for_add_edit_organization.timeout2000();
                    }

                } catch (Exception ex) {
                    driver.findElement(selectStakehodler).click();
                    Pojo_file_for_add_edit_organization.timeout2000();
                    driver.findElement(updateBtnOfselectStakeholder).click();
                    Pojo_file_for_add_edit_organization.timeout2000();
                }
            }catch (Exception ex){
                driver.findElement(updateBtnOfselectStakeholder).click();
                Pojo_file_for_add_edit_organization.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't add new contact owner");
            status = false;
            return status;
        }
    }

    public boolean test_linked_existing_stakeholders_option1(String firstname, String lastName, String fullName){
        boolean status = true;
        try{
            driver.findElement(linkExisitingStakehodlerBtn).click();
            Pojo_file_for_add_edit_organization.timeout2000();
            driver.findElement(stakeholderGroupOfLinkedExisitngStakehodler).click();
            Pojo_file_for_add_edit_organization.timeout2000();
            try {
                driver.findElement(selectStakeholdergroup1InLinkedOption).click();
                Pojo_file_for_add_edit_organization.timeout2000();
            }catch (Exception ex){}
            driver.findElement(searchOptiofLinkedExistingSection).sendKeys(firstname);
            Pojo_file_for_add_edit_organization.timeout3000();
            driver.findElement(searchOptiofLinkedExistingSection).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_add_edit_organization.timeout3000();
            driver.findElement(searchOptiofLinkedExistingSection).sendKeys(lastName);
            Pojo_file_for_add_edit_organization.timeout3000();
            driver.findElement(searchOptiofLinkedExistingSection).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_add_edit_organization.timeout3000();
            driver.findElement(searchOptiofLinkedExistingSection).sendKeys(fullName);
            Pojo_file_for_add_edit_organization.timeout3000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"CRM_new-organization-details_Main\"]/div[4]/app-select-stakeholders/div/div[2]/div/div/div[3]")).isDisplayed()){
                    Assert.assertEquals(true,false,"1. Getting more time to display stakeholder list when filtering and searching\n\n"+
                            "2. When searching with full name, not display stakeholder");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Linked existing stakeholder option is not working");
            status = false;
            return status;
        }

    }

    public boolean test_linked_existing_stakeholders_option2() {
        boolean status = true;
        try {
            try {
                driver.findElement(searchOptiofLinkedExistingSection).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_add_edit_organization.timeout3000();
                try {
                    if(driver.findElement(selectStakehodlerInexisting).isEnabled()) {
                        driver.findElement(selectStakehodlerInexisting).click();
                        Pojo_file_for_add_edit_organization.timeout3000();
                    }
                }catch (Exception ex){}
                driver.findElement(upateBtnOflinkedExistingStakeholder).click();
                Pojo_file_for_add_edit_organization.timeout3000();
                driver.findElement(updateBtnOfeditOrganization).click();
                Pojo_file_for_add_edit_organization.timeout3000();
            }catch (Exception ex){
                driver.findElement(updateBtnOfeditOrganization).click();
                Pojo_file_for_add_edit_organization.timeout3000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_craete_new_contact_owner_section(){
        boolean status = true;
        try{
            driver.findElement(createnewcontactOwner).click();
            Pojo_file_for_add_edit_organization.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the edit organization section so can't move to the create new contact owner section");
            status = false;
            return status;
        }
    }

    public boolean test_search_create_new_contact_owner_insde_edit_organization(){
        boolean status = true;
        try{
            driver.findElement(organizationTab).click();
            Pojo_file_for_add_edit_organization.timeout2000();
            driver.findElement(editOptionforOrganization).click();
            Pojo_file_for_add_edit_organization.timeout2000();
            List<WebElement> elements = driver.findElements(By.xpath("//div[@id='cdk-drop-list-9']/div"));
            int numOfRecordsList = elements.size();
            System.out.println(numOfRecordsList);

            if(numOfRecordsList < 2){
                Assert.assertEquals(true,false,"Not display newly created contact owner for selected organization");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }
}
