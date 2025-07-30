package Smartstack.net.Authentication_access.Pojo_files;

import org.bouncycastle.crypto.signers.ISOTrailers;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class Pojo_file_for_stakeholder_group_tab {

    By addNewStakeholderGroup = By.id("authentication_select-stakeholder-group_StakeholderGroup_Add_new_button");   By addnewstakeholderField = By.id("authentication_select-stakeholder-group_StakeholderGroup_Create_INPUT");     By updateBtnofStakeholderGroup = By.id("authentication_select-stakeholder-group_StakeholderGroup_Create_update_button");
    By updateBtnWithoutdata = By.id("authentication_select-stakeholder-group_StakeholderGroup_Create_disable_button");  By selectStakehodlergorpu = By.id("authentication_select-stakeholder-group_StakeholderGroup_Name_3");   By addnewBtnOfGroup = By.id("authentication_select-stakeholder-group_GroupType_Create_ADD_button");
    By addneFieldOfGroup = By.id("authentication_select-stakeholder-group_GroupType_Create_INPUT");     By updateBtnwithoutdataOfGroup = By.id("authentication_select-stakeholder-group_GroupType_Create_disable_button");      By updateBtnWithDataofGroup = By.id("authentication_select-stakeholder-group_GroupType_Create_update_button");
    By selectGroup = By.id("authentication_select-stakeholder-group_GroupType_Name_0");  By addSubGroupBtn = By.id("authentication_select-stakeholder-group_Topic_Create_Add_button");  By updateBtnOfwithoutSubgroup = By.id("authentication_select-stakeholder-group_Topic_disable_button");
    By subgroupField = By.id("authentication_select-stakeholder-group_Topic_Create_INPUT");     By updateBtnOfsubgroup = By.id("authentication_select-stakeholder-group_Topic_updat_button");   By selectSubgroup = By.id("authentication_select-stakeholder-group_Topic_Name_0");
    By addnewSegment = By.id("authentication_select-stakeholder-group_Category_Create_Add_button");     By updateBtnofwithoutSegment = By.id("authentication_select-stakeholder-group_Category_Create_Disable_button");     By segmentField = By.id("authentication_select-stakeholder-group_Category_Create_INPUT");
    By updateBtnOfSegment = By.id("authentication_select-stakeholder-group_Category_Create_Update_button");     By selectSegment = By.id("authentication_select-stakeholder-group_Category_Name_0");    By addnewBtnodsubsegment = By.id("authentication_select-stakeholder-group_SubCategory_Create_Add_button");
    By updateBtnofSubsegmentWithoutData = By.id("authentication_select-stakeholder-group_SubCategory_Create_Dissable_button");  By subsegmentField = By.id("authentication_select-stakeholder-group_SubCategory_Create_INPUT");     By updateBtnofSubsegment = By.id("authentication_select-stakeholder-group_SubCategory_Create_Update_button");
    By selectSubsegment = By.id("authentication_select-stakeholder-group_SubCategory_Name_0");      By addnewBtnofSubset = By.id("authentication_select-stakeholder-group_SuperCategory_Create_Add_button");    By updateBtnWithoutsubset = By.id("authentication_select-stakeholder-group_SuperCategory_Create_Disable_button");
    By subsetInputField = By.id("authentication_select-stakeholder-group_SuperCategory_Create_INPUT");    By updateBtnofsubset = By.id("authentication_select-stakeholder-group_SuperCategory_Create_Update_button");   By mouseOverEditoption = By.id("authentication_select-stakeholder-group_StakeholderGroup_hover_edit_3");
    By editIconofStakeholder = By.id("authentication_select-stakeholder-group_StakeholderGroup_hover_edit_icon_3");     By confirmTickOfEditOption = By.id("authentication_select-stakeholder-group_StakeholderGroup_confirm_tick_3");      By editFieldOfStakeholderGroup = By.id("authentication_select-stakeholder-group_StakeholderGroup_Edit_INPUT_3");
    By OkbTnofPopup = By.id("stackholder-access_alert-box_ok_BUTTON");      By deleteBtnPfPopup = By.id("stackholder-access_alert-box_update-2_BUTTON");    By stakeholderGroupNamefield = By.id("authentication_group-type-settings_Topic_INPUT");
    By okBTnofGroupNamePopup = By.id("stackholder-access_alert-box_ok_BUTTON");     By addstakeholderBtn = By.id("stackholder-access_stackholders-assigned_stackholder_add-stackholder_BUTTON");    By disableupdateBTnOfadStakehodler = By.id("authentication_add-stakeholder_Disable_Button");
    By stakeholderGroupOptionOfaddTsakehodler = By.id("Elements_services_tree_view_main");  By selectStakehodlerGroup = By.id("Elements_services_tree_view_Checkbox0");     By cancelBtnOfaddStakehodler = By.id("authentication_add-stakeholder_Cancel_Button");
    By searchFeildOfAddstakeholder = By.id("authentication_add-stakeholder_search_box_INPUT");     By checkboxOfstakehodler = By.xpath("//*[@id=\"authentication_add-stakeholder_Stakeholders_0\"]/div/p-checkbox");
    By updateBtnofaddtakeholder = By.id("authentication_add-stakeholder_Update_Button");      By editOptionOfgroup = By.id("authentication_select-stakeholder-group_GroupType_hover_edit_icon_0");      By confirmTickofEditGroup = By.id("authentication_select-stakeholder-group_GroupType_Confirm_tick_icon_0");
    By editgroupField = By.id("authentication_select-stakeholder-group_GroupType_Edit_INPUT_0");        By selectSubset = By.id("authentication_select-stakeholder-group_SuperCategory_Name_0");
    WebDriver driver;

    public Pojo_file_for_stakeholder_group_tab(WebDriver driver) {
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

    public boolean test_add_new_stakeholder_group(String arg1 , String group, String subgroup, String segment, String subsegment, String subset, String anotherGroup){
        boolean status =true;
        try{
            driver.findElement(addNewStakeholderGroup).click();
            WebElement ele = driver.findElement(updateBtnWithoutdata);
            Actions action = new Actions(driver);
            action.moveToElement(ele).perform();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(addnewstakeholderField).sendKeys(arg1);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnofStakeholderGroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();

            try{
                if(driver.findElement(OkbTnofPopup).isDisplayed()){
                    Pojo_file_for_stakeholder_group_tab.timeout3000();
                    driver.findElement(OkbTnofPopup).click();
                    Pojo_file_for_stakeholder_group_tab.timeout3000();
                    driver.findElement(addNewStakeholderGroup).click();
                    Pojo_file_for_stakeholder_group_tab.timeout2000();
                    driver.findElement(addnewstakeholderField).sendKeys(anotherGroup);
                    Pojo_file_for_stakeholder_group_tab.timeout2000();
                    driver.findElement(updateBtnofStakeholderGroup).click();
                    Pojo_file_for_stakeholder_group_tab.timeout2000();
                }
            }catch (Exception ex){

            }

            List<WebElement> elements = driver.findElements(By.xpath("//div[@id='cdk-drop-list-2']/div"));
            int numOfRecordsList = elements.size();
            int numOfRecords = (numOfRecordsList -1);
            System.out.println(numOfRecords);

            //Create group
            driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_Name_"+numOfRecords)).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(addnewBtnOfGroup).click();
            WebElement ele1 = driver.findElement(updateBtnwithoutdataOfGroup);
            Actions action1 = new Actions(driver);
            action1.moveToElement(ele1).perform();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(addneFieldOfGroup).sendKeys(group);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnWithDataofGroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout3000();

            //Already exist group
            driver.findElement(addnewBtnOfGroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(addneFieldOfGroup).sendKeys(group);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnWithDataofGroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            try{
                driver.findElement(OkbTnofPopup).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
            }catch(Exception ex){
                Assert.assertEquals(true,false,"Create already exist group");
            }

            //Create sub group
            driver.findElement(selectGroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(addSubGroupBtn).click();
            WebElement ele2 = driver.findElement(updateBtnOfwithoutSubgroup);
            Actions action2 = new Actions(driver);
            action2.moveToElement(ele2).perform();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(subgroupField).sendKeys(subgroup);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnOfsubgroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();

            //Create already exist group
            driver.findElement(addSubGroupBtn).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(subgroupField).sendKeys(subgroup);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnOfsubgroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            try{
                driver.findElement(OkbTnofPopup).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
            }catch(Exception ex){
                Assert.assertEquals(true,false,"Create already exist sub group");
            }

            //Creete segment
            driver.findElement(selectSubgroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(addnewSegment).click();
            WebElement ele3 = driver.findElement(updateBtnofwithoutSegment);
            Actions action3 = new Actions(driver);
            action3.moveToElement(ele3).perform();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(segmentField).sendKeys(segment);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnOfSegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout3000();

            //Create already exist segment
            driver.findElement(addnewSegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(segmentField).sendKeys(segment);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnOfSegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            try{
                driver.findElement(OkbTnofPopup).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
            }catch(Exception ex){
                Assert.assertEquals(true,false,"Create already exist sub group");
            }

            //create subsegment
            driver.findElement(selectSegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(addnewBtnodsubsegment).click();
            WebElement ele4 = driver.findElement(updateBtnofSubsegmentWithoutData);
            Actions action4 = new Actions(driver);
            action4.moveToElement(ele4).perform();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(subsegmentField).sendKeys(subsegment);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnofSubsegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();

            //Create already exist segment
            driver.findElement(addnewBtnodsubsegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(subsegmentField).sendKeys(subsegment);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnofSubsegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            try{
                driver.findElement(OkbTnofPopup).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
            }catch(Exception ex){
                Assert.assertEquals(true,false,"Create already exist sub group");
            }

            //create subset
            driver.findElement(selectSubsegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(addnewBtnofSubset).click();
            WebElement ele5 = driver.findElement(updateBtnWithoutsubset);
            Actions action5 = new Actions(driver);
            action5.moveToElement(ele5).perform();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(subsetInputField).sendKeys(subset);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnofsubset).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();

            //Create already exist subsegment
            driver.findElement(addnewBtnofSubset).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(subsetInputField).sendKeys(subset);
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(updateBtnofsubset).click();
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            try{
                driver.findElement(OkbTnofPopup).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
            }catch(Exception ex){
                Assert.assertEquals(true,false,"Create already exist sub group");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_edit_stakeholder_group(String editstakeholder, String editGroup){
        boolean status = true;
        try{
            List<WebElement> elements = driver.findElements(By.xpath("//div[@id='cdk-drop-list-2']/div"));
            int numOfRecordsList = elements.size();
            int numOfRecords = (numOfRecordsList -1);
            System.out.println(numOfRecords);

            driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_Name_"+numOfRecords)).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_hover_edit_icon_"+numOfRecords)).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_confirm_tick_"+numOfRecords)).click();
            Pojo_file_for_stakeholder_group_tab.timeout3000();

            try {
                driver.findElement(OkbTnofPopup).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
                driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_Name_" + numOfRecords)).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_hover_edit_icon_" + numOfRecords)).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_Edit_INPUT_" + numOfRecords)).sendKeys(editstakeholder);
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_confirm_tick_" + numOfRecords)).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();

                driver.findElement(selectGroup).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(editOptionOfgroup).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(confirmTickofEditGroup).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
                driver.findElement(OkbTnofPopup).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();

                driver.findElement(selectGroup).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(editOptionOfgroup).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(editgroupField).sendKeys(editGroup);
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(confirmTickofEditGroup).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();

                try{
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"stackholder-access_master-page_group-stackholder_DIV\"]/div/app-group-stakeholder/div/div[2]/app-select-stakeholder-group/div/div/div/table/tbody/tr/td[2]/div/div[1]/span"));
                    String val = ele.getText();
                    System.out.println();

                    if(val.equals("No group created")){
                        Assert.assertEquals(true,false,"After editing stakeholder group , hide selected group");
                    }
                }catch (Exception ex){}

            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation when entering already exist group name");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_stakeholder_group_settings(){
        boolean status = true;
        try{
            List<WebElement> elements = driver.findElements(By.xpath("//div[@id='cdk-drop-list-2']/div"));
            int numOfRecordsList = elements.size();
            int numOfRecords = (numOfRecordsList -1);
            System.out.println(numOfRecords);

            driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_Name_"+numOfRecords)).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(selectGroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(selectSubgroup).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(selectSegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(selectSubsegment).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(selectSubset).click();
            Pojo_file_for_stakeholder_group_tab.timeout2000();

            driver.findElement(stakeholderGroupNamefield).clear();
            try {
                driver.findElement(addstakeholderBtn).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                try {
                    driver.findElement(okBTnofGroupNamePopup).click();
                    Pojo_file_for_stakeholder_group_tab.timeout3000();
                } catch (Exception ex) {
                    Assert.assertEquals(true, false, "Not display validation when clearing stakeholder group name field");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display add stakeholder option");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_add_stakeholder_section1(String invalidData){
        boolean status = true;
        try{
            try {
                driver.findElement(addstakeholderBtn).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                WebElement ele1 = driver.findElement(disableupdateBTnOfadStakehodler);
                Actions action1 = new Actions(driver);
                action1.moveToElement(ele1).perform();
                driver.findElement(stakeholderGroupOptionOfaddTsakehodler).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
                driver.findElement(selectStakehodlerGroup).click();
                Pojo_file_for_stakeholder_group_tab.timeout3000();
                driver.findElement(searchFeildOfAddstakeholder).sendKeys(invalidData);
                Pojo_file_for_stakeholder_group_tab.timeout3000();

                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"stackholder-access_master-page_group-stackholder_DIV\"]/div/app-group-stakeholder/div/div[4]/app-add-stakeholder/div/div[2]/div[3]"));
                    String val = ele.getText();
                    if (val.isEmpty()) {
                        Assert.assertEquals(true, false, "Not display stakeholder list");
                    }
                } catch (Exception ex) {
                }
            }catch (Exception ex){
                 Assert.assertEquals(true,false,"Not display add stakeholder option");
            }


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public  boolean test_with_add_staekholder_section2(String firstName, String lastName, String fullName){
        boolean status = true;
        try{
            driver.findElement(searchFeildOfAddstakeholder).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            driver.findElement(searchFeildOfAddstakeholder).sendKeys(firstName);
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            driver.findElement(searchFeildOfAddstakeholder).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            driver.findElement(searchFeildOfAddstakeholder).sendKeys(lastName);
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            driver.findElement(searchFeildOfAddstakeholder).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            driver.findElement(searchFeildOfAddstakeholder).sendKeys(fullName);
            Pojo_file_for_stakeholder_group_tab.timeout3000();

            try{
                WebElement ele =driver.findElement(By.xpath("//*[@id=\"stackholder-access_master-page_group-stackholder_DIV\"]/div/app-group-stakeholder/div/div[4]/app-add-stakeholder/div/div[2]/div[3]"));
                String val = ele.getText();
                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"Not display stakeholder list when searching with full name");
                }
            }catch (Exception ex){}


            status = true;
            return status;
        }catch (Exception ex){
            Assert.assertEquals(true,false,"Not display add stakeholder section for selected group");
            status = false;
            return status;
        }
    }

    public boolean test_with_add_stakeholder_section3(String validName){
        boolean status = true;
        try{
            driver.findElement(searchFeildOfAddstakeholder).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            try {
                if(driver.findElement(checkboxOfstakehodler).isDisplayed()) {
                    driver.findElement(checkboxOfstakehodler).click();
                    Pojo_file_for_stakeholder_group_tab.timeout2000();
                    driver.findElement(updateBtnofaddtakeholder).click();
                    Pojo_file_for_stakeholder_group_tab.timeout2000();
                }
            }catch (Exception ex){
                driver.findElement(searchFeildOfAddstakeholder).sendKeys(validName);
                Pojo_file_for_stakeholder_group_tab.timeout3000();
                driver.findElement(checkboxOfstakehodler).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
                driver.findElement(updateBtnofaddtakeholder).click();
                Pojo_file_for_stakeholder_group_tab.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            Assert.assertEquals(true,false,"Not display add stakeholder section for selected group");
            status = false;
            return status;
        }
    }


    public boolean test_delete_stakeholderGroup(){
        boolean status = true;
        try{
            List<WebElement> elements = driver.findElements(By.xpath("//div[@id='cdk-drop-list-2']/div"));
            int numOfRecordsList = elements.size();
            int numOfRecords = (numOfRecordsList -1);
            System.out.println(numOfRecords);

            WebElement ele1 = driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_Name_"+numOfRecords));
            Actions action1 = new Actions(driver);
            action1.moveToElement(ele1).perform();
            Pojo_file_for_stakeholder_group_tab.timeout2000();
            driver.findElement(By.id("authentication_select-stakeholder-group_StakeholderGroup_hover_delete_icon_"+numOfRecords));
            Pojo_file_for_stakeholder_group_tab.timeout3000();
            driver.findElement(deleteBtnPfPopup).click();
            Pojo_file_for_stakeholder_group_tab.timeout3000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }
}
