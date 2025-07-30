package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class POjo_file_foe_edit_stakeholder {

    By editIconofStakeholder = By.id("CRM_stakeholder-list_Content_Update_BUTTON_0");   By profileDetailshideIcon = By.id("CRM_new-stakeholder-details_ProfileTop_Minus");    By organizationDetailsHideicon = By.id("CRM_new-stakeholder-details_OrganizationTop_Minus");
    By statusOption = By.id("CRM_new-stakeholder-details_StatusSection_Selected");  By addStatusLink = By.id("CRM_new-stakeholder-details_StatusSection_AddNew_BUTTON");      By statusField = By.id("CRM_new-stakeholder-details_AddNewStatus_INPUT");
    By updateBtnOfstatus = By.id("CRM_new-stakeholder-details_AddNewStatus_ButtonSection_Update_BUTTON");   By deleteBtnOfpopup = By.id("CRM_DeleteStatus_Buttons_Delete_BUTTON");      By selectStatus = By.id("CRM_new-stakeholder-details_StatusSection_Dropdown_status_Drag_button_0");
    By callOption = By.id("CRM_new-stakeholder-details_TaskType_dropdown");     By callOption1= By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[2]/div/div[4]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By callOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[2]/div/div[4]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By statusInput = By.id("CRM_new-stakeholder-details_TaskType_INPUT");     By statusOption3 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[2]/div/div[4]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");
    By calenderOption = By.id("CRM_new-stakeholder-details_DateSelection_calendar");    By selectCalender = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[2]/div/div[6]/div[1]/div[2]/p-calendar/span/div/div/div/div[2]/table/tbody/tr[4]/td[6]");
    By timeOption = By.id("CRM_new-stakeholder-details_TimeSelection");     By selectTimeoption1 = By.xpath("//*[@id=\"CRM_new-stakeholder-details_TimeSelection\"]/div/div[3]/p-listbox/div/div/ul/li[1]/span");   By addBtn = By.id("CRM_new-stakeholder-details_TimeSelection_Add_BUTTON");
    By adjustBalanceBtn = By.id("CRM_credit-balance_main_buttons_Add_BUTTON");    By adjustmentType = By.id("CRM_credit-balance_AdjustmentType_Dropdown");  By adjustmentType1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[3]/app-credit-balance/div/div/div[3]/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/li");
    By amountField= By.id("CRM_credit-balance_Amount_INPUT");   By textAreainAdjustBalanceSection = By.xpath("//*[@id=\"CRM_credit-balance_Notes_INPUT\"]/div/quill-editor/div[2]/div[1]");     By updateBtnOfadjustBalance = By.id("CRM_credit-balance_Adjusts_Buttons_Update_BUTTON");
    By createLogBtn = By.id("CRM_credit-balance_main_buttons_Credit_BUTTON");       By viewOptionOfcreatelog = By.id("CRM_credit-balance_CreditLog_Dropdown");  By closeBtnofcreteLog = By.id("CRM_credit-balance_CreditLog_Button_Close_BUTTON");
    By addemailAddresLink = By.id("CRM_profile-details_AddNewEmail_BUTTON");  By addEmailInput = By.id("CRM_profile-details_AdditionalEmail_INPUT_0");  By closeIconofemailinput = By.id("CRM_profile-details_AdditionalEmail_Remove_0");
    By addTabIcon = By.id("CRM_profile-details_TagList_Plus_BUTTON");   By updateBtnOfTab = By.id("CRM_profile-details_AddTag_Buttons_Update");     By tagNameInput= By.id("CRM_profile-details_AddTag_INPUT");     By selectTag = By.id("CRM_profile-details_TagList_Display");
    By selectTag1 = By.id("CRM_profile-details_TagList_Name_Select_0");   By addContactNoLink = By.id("CRM_profile-details_AddNewContact_BUTTON");      By newContactNoinput = By.id("CRM_profile-details_AdditionalContact_INPUT_0");
    By contactNoCloseIcon = By.id("CRM_profile-details_AdditionalContact_Remove_0");    By createContactNoIcon = By.id("CRM_profile-details_ContactOwner_Plus_icon");   By selectStakholderGroup = By.id("CRM_stakeholder-group_Group_Name_0");
    By selectstakholderSubgroup = By.id("CRM_stakeholder-group_GroupType_CHECKBOX_0");      By individualStakeholderTab = By.id("CRM_select_owner_Tab_Individual_Click");   By stakeholderGroupOption = By.id("CRM_individual-stakeholder_Group_treeView");
    By plusIcon = By.xpath("//*[@id=\"CRM_individual-stakeholder_Group_treeView\"]/div/div[2]/div[1]/div/i[1]");    By selectStakeholderOption = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND0");     By searchField = By.id("CRM_individual-stakeholder_Search_INPUT");
    By selectStakeholde = By.id("CRM_individual-stakeholder_List_CHECKBOX_0");      By selectGroup = By.xpath("//*[@id=\"CRM_individual-stakeholder_Group_treeView\"]/div/div[2]/div[1]/div[1]/div");   By updateBtnofStakeholderGroup = By.id("CRM_individual-stakeholder_Buttons_Update");
    By organizationInput = By.xpath("//*[@id=\"CRM_organization-details_Organization_INPUT\"]/span/input");     By titleInput = By.xpath("//*[@id=\"CRM_organization-details_Title_INPUT\"]/span/input");   By industryOption = By.id("CRM_organization-details_Industry_dropdown");
    By selectIndustry = By.xpath(" /html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[4]/div[2]/div/div[2]/app-organization-details/div/div/div/div[1]/div[3]/div[2]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By updateBtnofeditStakeholder = By.id("CRM_new-stakeholder-details_Buttons_Update_BUTTON");     By selectOrg = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[4]/div[2]/div/div[2]/app-organization-details/div/div/div/div[1]/div[1]/div[2]/p-autocomplete/span/div/ul/li[1]/span");
    By selectTitle = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[4]/div[2]/div/div[2]/app-organization-details/div/div/div/div[1]/div[2]/div[2]/p-autocomplete/span/div/ul/li[1]/span");

    WebDriver driver;

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

    public POjo_file_foe_edit_stakeholder(WebDriver driver) {
        this.driver = driver;
    }

    public  boolean test_edit_stakeholder_section(){
        boolean status = true;
        try{
            driver.findElement(editIconofStakeholder).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try{
                if(driver.findElement(profileDetailshideIcon).isDisplayed() || driver.findElement(organizationDetailsHideicon).isDisplayed()){
                  Assert.assertEquals(true, false, "When moving to the edit stakehodler section , display profile details and organization details as hide");

                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit option for stakeholder");
            status = false;
            return status;
        }
    }

    public boolean test_status_option_of_edit_stakeholder(String newStatus, String updateStatus, String status1){
        boolean status = true;
        try{
            driver.findElement(statusOption).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(addStatusLink).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusOption).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusField).sendKeys(newStatus);
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(updateBtnOfstatus).click();
            POjo_file_foe_edit_stakeholder.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"CRM_new-stakeholder-details_StatusSection\"]/div[2]/div/div[4]/label"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("name already exist!")){
                    driver.findElement(statusField).sendKeys(status1);
                    POjo_file_foe_edit_stakeholder.timeout2000();
                    driver.findElement(updateBtnOfstatus).click();
                    POjo_file_foe_edit_stakeholder.timeout2000();
                }
            }catch (Exception ex){}

            List<WebElement> elements = driver.findElements(By.xpath("//div[@id='CRM_new-stakeholder-details_StatusSection_Dropdown']/div"));
            int numOfRecordsList = elements.size();
            int numOfRecords = (numOfRecordsList -1);
            System.out.println(numOfRecordsList);

            try {
                WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"CRM_new-stakeholder-details_StatusSection_Dropdown_status_7\"]/span"));
                Actions action1 = new Actions(driver);
                action1.moveToElement(ele1).perform();
                driver.findElement(By.id("CRM_new-stakeholder-details_StatusSection_Dropdown_status_Icons_Edit_" + numOfRecords));
                POjo_file_foe_edit_stakeholder.timeout2000();
                driver.findElement(updateBtnOfstatus).click();
                POjo_file_foe_edit_stakeholder.timeout2000();

                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"CRM_new-stakeholder-details_StatusSection\"]/div[2]/div/div[4]/label"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("name already exist!")) {
                        driver.findElement(statusField).sendKeys(updateStatus);
                        POjo_file_foe_edit_stakeholder.timeout2000();
                        driver.findElement(updateBtnOfstatus).click();
                        POjo_file_foe_edit_stakeholder.timeout2000();
                    }
                } catch (Exception ex) {
                }

                POjo_file_foe_edit_stakeholder.timeout2000();
                driver.findElement(statusOption).click();
                POjo_file_foe_edit_stakeholder.timeout2000();
                WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"CRM_new-stakeholder-details_StatusSection_Dropdown_status_7\"]/span"));
                Actions action2 = new Actions(driver);
                action2.moveToElement(ele2).perform();
                driver.findElement(By.id("CRM_new-stakeholder-details_StatusSection_Dropdown_status_Icons_Delete_"+numOfRecords)).click();
                POjo_file_foe_edit_stakeholder.timeout3000();
                driver.findElement(deleteBtnOfpopup).click();
                POjo_file_foe_edit_stakeholder.timeout3000();
                driver.findElement(selectStatus).click();
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit stakeholder section");
            status = false;
            return status;
        }
    }

    public boolean test_call_option_of_edit_stakeholder(String invalidData, String Validtodo, String Validtomeet, String validTocall){
        boolean status = true;
        try{
            driver.findElement(callOption).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try{
                driver.findElement(callOption1).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).sendKeys(invalidData);
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).clear();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).sendKeys(Validtodo);
            POjo_file_foe_edit_stakeholder.timeout2000();

            driver.findElement(callOption).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try{
                driver.findElement(callOption2).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).clear();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).sendKeys(invalidData);
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).clear();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).sendKeys(Validtomeet);
            POjo_file_foe_edit_stakeholder.timeout2000();

            driver.findElement(callOption).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try{
                driver.findElement(statusOption3).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).clear();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).sendKeys(invalidData);
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).clear();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(statusInput).sendKeys(validTocall);
            POjo_file_foe_edit_stakeholder.timeout2000();

            driver.findElement(calenderOption).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try {
                driver.findElement(selectCalender).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(timeOption).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try {
                driver.findElement(selectTimeoption1).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();

            try{
                WebElement ele= driver.findElement(statusInput);
                String val = ele.getAttribute("value");
                System.out.println(val);

                if(val.equals(validTocall)){
                    Assert.assertEquals(true,false,"Not display number limitation for to call option");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit stakeholder section");
            status = false;
            return status;
        }
    }

    public boolean test_adjust_balance_section(String invalidAmount, String validAmount, String note){
        boolean status = true;
        try{
            driver.findElement(addBtn).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(adjustBalanceBtn).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(adjustmentType).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try{
                driver.findElement(adjustmentType1).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();
            try {
                driver.findElement(amountField).clear();
                POjo_file_foe_edit_stakeholder.timeout2000();
                driver.findElement(amountField).sendKeys(invalidAmount);
            }catch (Exception ex){
                driver.findElement(amountField).clear();
                POjo_file_foe_edit_stakeholder.timeout2000();
                driver.findElement(amountField).sendKeys(validAmount);
            }
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(textAreainAdjustBalanceSection).sendKeys(note);
            POjo_file_foe_edit_stakeholder.timeout2000();

            try{
                WebElement ele1 = driver.findElement(amountField);
                String val1 = ele1.getAttribute("value");
                System.out.println(val1);

                if(val1.equals(invalidAmount)){
                    Assert.assertEquals(true,false,"1.Not display adjustment type\n\n"+
                            "2.Enter minus value to amount and enable update button");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit stakeholder section");
            status = false;
            return status;
        }
    }

    public boolean test_create_log_section_and_add_newEmail(String invaliEmail){
        boolean status = true;
        try{
            driver.findElement(updateBtnOfadjustBalance).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try {
                driver.findElement(createLogBtn).click();
                POjo_file_foe_edit_stakeholder.timeout2000();
                driver.findElement(viewOptionOfcreatelog).click();
                POjo_file_foe_edit_stakeholder.timeout2000();
                driver.findElement(closeBtnofcreteLog).click();
                POjo_file_foe_edit_stakeholder.timeout2000();
            }catch (Exception ex){}

            try {
                driver.findElement(profileDetailshideIcon).click();
            }catch (Exception ex){}

            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(addemailAddresLink).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try {
                driver.findElement(addEmailInput).sendKeys(invaliEmail);
                POjo_file_foe_edit_stakeholder.timeout2000();

                Assert.assertEquals(true, false, "Not display validation when eetring invalid new email address");
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit stakeholder section");
            status = false;
            return status;
        }
    }

    public boolean test_tag_section(String arg1, String contactNo, String invalidData, String name, String fullName){
        boolean status = true;
        try{
            driver.findElement(closeIconofemailinput).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(addTabIcon).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(updateBtnOfTab).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(tagNameInput).sendKeys(arg1);
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(updateBtnOfTab).click();
            POjo_file_foe_edit_stakeholder.timeout2000();

            driver.findElement(selectTag).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(selectTag1).click();
            POjo_file_foe_edit_stakeholder.timeout2000();

            driver.findElement(addContactNoLink).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(newContactNoinput).sendKeys(contactNo);
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(contactNoCloseIcon).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(createContactNoIcon).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(selectStakholderGroup).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try{
                driver.findElement(selectstakholderSubgroup).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();


            driver.findElement(individualStakeholderTab).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(stakeholderGroupOption).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try{
                driver.findElement(plusIcon).click();
                POjo_file_foe_edit_stakeholder.timeout2000();
                driver.findElement(selectStakeholderOption).click();
                POjo_file_foe_edit_stakeholder.timeout2000();
            }catch (Exception ex){
                driver.findElement(selectGroup).click();
                POjo_file_foe_edit_stakeholder.timeout2000();
            }

            driver.findElement(searchField).sendKeys(invalidData);
            POjo_file_foe_edit_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            POjo_file_foe_edit_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(name);
            POjo_file_foe_edit_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            POjo_file_foe_edit_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(fullName);
            POjo_file_foe_edit_stakeholder.timeout3000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-select-owner/div/div[2]/div[2]/app-individual-stakeholder-selection/div/div[3]")).isDisplayed()){
                    Assert.assertEquals(true,false,"Not display stakeholder according to the searched full name");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit stakeholder section");
            status = false;
            return status;
        }
    }

    public boolean test_update_organization_details_of_edit_stakeholder(String arg1,String arg2){
        boolean status = true;
        try{

            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            POjo_file_foe_edit_stakeholder.timeout3000();
            driver.findElement(selectStakeholde).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(updateBtnofStakeholderGroup).click();
            POjo_file_foe_edit_stakeholder.timeout2000();

            try {
                driver.findElement(organizationDetailsHideicon).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(organizationInput).clear();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(organizationInput).sendKeys(arg1);
            POjo_file_foe_edit_stakeholder.timeout2000();
            try{
                driver.findElement(selectOrg).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(titleInput).clear();
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(titleInput).sendKeys(arg2);
            POjo_file_foe_edit_stakeholder.timeout2000();
            try{
                driver.findElement(selectTitle).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(industryOption).click();
            POjo_file_foe_edit_stakeholder.timeout2000();
            try {
                driver.findElement(selectIndustry).click();
            }catch (Exception ex){}
            POjo_file_foe_edit_stakeholder.timeout2000();
            driver.findElement(updateBtnofeditStakeholder).click();
            POjo_file_foe_edit_stakeholder.timeout3000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit stakeholder section");
            status = false;
            return status;
        }
    }


}
