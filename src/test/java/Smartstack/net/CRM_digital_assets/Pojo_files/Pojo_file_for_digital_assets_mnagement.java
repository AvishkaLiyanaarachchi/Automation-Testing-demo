package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Pojo_file_for_digital_assets_mnagement {

    By createFolder = By.id("CRM_stakeholder-folder-list_Folders_CreateFolder_BUTTON");     By updateBtnWithoutData = By.id("CRM_stakeholder-folder-list_Folders_Buttons_Disable");     By folderField = By.id("CRM_stakeholder-folder-list_Folders_Create_INPUT");
    By updateBtnWithfoldername = By.id("CRM_stakeholder-folder-list_Folders_Buttons_Update");   By selectStakeholderGrouptoAssignFoldersBtn = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[2]/app-manage-folders/div/div[2]/app-manage-folder-folders/div/div[5]/div/button");
    By selectStakeholderGroupOption = By.id("CRM_stakeholder-group-folders_Stakeholder");   By plusIconOfstakeholderGroupSection = By.xpath("//*[@id=\"CRM_stakeholder-group-folders_Selection_treeView\"]/div/div/div[1]/div/i");
    By selectStakeholderSubGroup = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND0");     By manageEmailTemplateTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[2]/app-manage-folders/div/div[1]/div[2]/span");
    By createFolderBtn = By.id("CRM_manage-email-template_Folders_CreateFolder_BUTTON");    By updateBtnInemailtemplateWithoutData = By.id("CRM_manage-email-template_Folders_CreateFolder_BUTTON");    By folderFieldinTemplate = By.id("CRM_manage-email-template_Folders_Create_INPUT");
    By updateBtnWithdata = By.id("CRM_manage-email-template_Folders_Buttons_Update");   By smartstackTab = By.xpath("//*[@id=\"CRM_manage-email-template_SelectLibrary_Select\"]/div/div[2]/span");     By switchBtnOFsmartstackTab = By.id("CRM_smartstak_Toggle_INPUTSWITCH");
    By communityTab = By.xpath("//*[@id=\"CRM_manage-email-template_SelectLibrary_Select\"]/div/div[3]/span");  By switchInputIncommunityTab = By.id("CRM_community_Toggle_INPUTSWITCH");   By youSHaredWithCommuityTab = By.xpath("//*[@id=\"CRM_manage-email-template_SelectLibrary_Select\"]/div/div[4]/span");
    By createSubfolder = By.id("CRM_stakeholder-folder-list_SubFolders_CreateFolder_BUTTON");   By updateBTnwithoutSubfolder = By.id("CRM_stakeholder-folder-list_SubFolders_Buttons_Disable");     By subfolderInput = By.id("CRM_stakeholder-folder-list_SubFolders_Create_INPUT");
    By  updateBtnwithSubfodler= By.id("CRM_stakeholder-folder-list_SubFolders_Buttons_Update");     By selectSubfodler = By.id("CRM_stakeholder-folder-list_SubFolders_Name_0");    By createSuperFodlrBtn = By.id("CRM_stakeholder-folder-list_SuperFolders_CreateFolder_BUTTON");
    By updateBtnwithoutsuperfolder = By.id("CRM_stakeholder-folder-list_SuperFolders_Buttons_Disable");     By inputOfsuperfodler = By.id("CRM_stakeholder-folder-list_SuperFolders_Create_INPUT");     By updateBtnWithsuperfodler = By.id("CRM_stakeholder-folder-list_SuperFolders_Buttons_Update");
    By deleteFolderBtn = By.id("CRM_delete-confirm_Confirm_2_Delete_BUTTON");    By moveOption = By.id("CRM_stakeholder-folder-list_Folders_Move_1");      By moveField = By.id("CRM_stakeholder-folder-list_Folders_Move_INPUT_1");
    By moveBtn = By.id("CRM_stakeholder-folder-list_Folders_Move_BUTTON_1");    By updateBtnWithoutselectfolder = By.id("CRM_stakeholder-folder-section_Buttons_Disable");  By checkbox1inAssignfolders = By.id("CRM_stakeholder-folder-section_Folders_CHECKBOX_0");
    By checkbox2Asignfolders = By.id("CRM_stakeholder-folder-section_Folders_CHECKBOX_1");      By updateBtnwithselectFolders = By.id("CRM_stakeholder-folder-section_Buttons_Update");     By editfolderOption = By.id("CRM_add-stakeholder-folders_Buttons_Edit_0");
    By deleteOptionOfAssignfolders = By.id("CRM_add-stakeholder-folders_Buttons_Delete_0");     By deleteBtnOfpopup = By.id("CRM_delete-confirm_Confirm_2_Delete_BUTTON");      By createSubfolderInemailtemplate = By.id("CRM_manage-email-template_Folders_SubFolder_CreateFolder_BUTTON");
    By updateBtnwithoutdataInemailtemplat = By.id("CRM_manage-email-template_Folders_SubFolder_Buttons_Disable");   By inputOfemailtemplate = By.id("CRM_manage-email-template_Folders_SubFolder_Create_INPUT");    By updateBtnwithDatainEmailtemplate = By.id("CRM_manage-email-template_Folders_SubFolder_Buttons_Update");


    WebDriver driver;

    public Pojo_file_for_digital_assets_mnagement(WebDriver driver) {
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

    public boolean test_create_folder_section(String folderName){
        boolean status = true;
        try{
            if(driver.findElement(createFolder).isEnabled()) {
                driver.findElement(createFolder).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                WebElement ele = driver.findElement(updateBtnWithoutData);
                Actions action = new Actions(driver);
                action.moveToElement(ele).perform();
                driver.findElement(folderField).sendKeys(folderName);
                Pojo_file_for_digital_assets_mnagement.timeout2000();

                try {
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
                    wait.until(ExpectedConditions.elementToBeClickable(updateBtnWithfoldername));
                    Assert.assertEquals(true, false, "Can't click update button after entering folder name so can't create folders and sub folders");

                } catch (Exception e) {
                    if (driver.findElement(updateBtnWithfoldername).isEnabled()) {
                        driver.findElement(updateBtnWithfoldername).click();
                        Pojo_file_for_digital_assets_mnagement.timeout2000();
                    }

                }
            }else{
                Assert.assertEquals(true,false,"Not display create folder section");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the digital asset management section");
            status = false;
            return status;
        }
    }

    public boolean test_move_folder_inside_list(String arg1){
        boolean status = true;
        try{
            try {
                driver.findElement(moveOption).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                try {
                    if (driver.findElement(moveBtn).isEnabled()) {
                        Assert.assertEquals(true, false, "Click move button without data inside move field");
                    }
                } catch (Exception ex) {
                    driver.findElement(moveField).sendKeys(arg1);
                    Pojo_file_for_digital_assets_mnagement.timeout2000();
                    driver.findElement(moveBtn).click();
                    Pojo_file_for_digital_assets_mnagement.timeout2000();
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display folder list so can't move the folders between list");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public  boolean test_create_subfolder_and_edit_delete_folder(String  arg1, String superfodler, String updateFodler){
        boolean status = true;
        try{
            try {
                List<WebElement> elements = driver.findElements(By.xpath("//div[@id='  cdk-drop-list-17']/div"));
                int numOfRecordsList = elements.size();
                int numOfRecords = (numOfRecordsList - 1);
                System.out.println(numOfRecordsList);
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(By.id("CRM_stakeholder-folder-list_Folders_Name_12")).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(createSubfolder).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                WebElement ele = driver.findElement(updateBTnwithoutSubfolder);
                Actions action = new Actions(driver);
                action.moveToElement(ele).perform();
                driver.findElement(subfolderInput).sendKeys(arg1);
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(updateBtnwithSubfodler).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();

                //Create already existSub fodler
                driver.findElement(createSubfolder).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(subfolderInput).sendKeys(arg1);
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(updateBtnwithSubfodler).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();


                //create super fodler
                driver.findElement(selectSubfodler).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(createSuperFodlrBtn).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                WebElement ele1 = driver.findElement(updateBtnwithoutsuperfolder);
                Actions action1 = new Actions(driver);
                action1.moveToElement(ele1).perform();
                driver.findElement(inputOfsuperfodler).sendKeys(superfodler);
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(updateBtnWithsuperfodler).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();

                //Create already exist superfolder
                driver.findElement(createSuperFodlrBtn).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(inputOfsuperfodler).sendKeys(superfodler);
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(updateBtnWithsuperfodler).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();

                //Edit fodler
                WebElement ele2 = driver.findElement(By.id("CRM_stakeholder-folder-list_Folders_Name_12"));
                Actions action2 = new Actions(driver);
                action2.moveToElement(ele2).perform();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(By.id("CRM_stakeholder-folder-list_Folders_Hover_Edit_icon_12")).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(By.id("CRM_stakeholder-folder-list_Folders_Edit_INPUT_12")).sendKeys(updateFodler);
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(By.id("CRM_stakeholder-folder-list_Folders_Confirm_Tick_12")).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();


                //Delete fodler
                driver.findElement(By.xpath("//*[@id=\"CRM_stakeholder-folder-list_Folders_Hover_12\"]/span[2]/i")).click();
                Pojo_file_for_digital_assets_mnagement.timeout3000();
                driver.findElement(deleteFolderBtn).click();
                Pojo_file_for_digital_assets_mnagement.timeout3000();
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Can't create/edit/delete sub folders because can't create folder");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_select_stakehodler_group_to_assign_folders_section(){
        boolean status = true;
        try{
            if(driver.findElement(selectStakeholderGrouptoAssignFoldersBtn).isEnabled()){
                driver.findElement(selectStakeholderGrouptoAssignFoldersBtn).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(selectStakeholderGroupOption).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(plusIconOfstakeholderGroupSection).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(selectStakeholderSubGroup).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();

                try{
                    if(driver.findElement(selectStakeholderGroupOption).isDisplayed()){
                        Assert.assertEquals(true,false,"Can't select stakeholders to assign folders");
                    }
                }catch (Exception ex){}

            }else{
                Assert.assertEquals(true,false,"Not display manage stakeholder group folder assignation");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the digital asset management section");
            status = false;
            return status;
        }
    }

    public boolean test_select_folders_to_assign(){
        boolean status = true;
        try{
            try {
                WebElement ele = driver.findElement(updateBtnWithoutselectfolder);
                Actions action = new Actions(driver);
                action.moveToElement(ele).perform();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                try {
                    if (driver.findElement(checkbox1inAssignfolders).isEnabled()) {
                        driver.findElement(checkbox1inAssignfolders).click();
                        Pojo_file_for_digital_assets_mnagement.timeout2000();
                        driver.findElement(updateBtnwithselectFolders).click();
                        Pojo_file_for_digital_assets_mnagement.timeout2000();
                        driver.findElement(editfolderOption).click();
                        Pojo_file_for_digital_assets_mnagement.timeout2000();
                        driver.findElement(updateBtnwithselectFolders).click();
                        Pojo_file_for_digital_assets_mnagement.timeout2000();
                        driver.findElement(deleteOptionOfAssignfolders).click();
                        Pojo_file_for_digital_assets_mnagement.timeout3000();
                        driver.findElement(deleteBtnOfpopup).click();
                        Pojo_file_for_digital_assets_mnagement.timeout3000();


                    } else {
                        driver.findElement(checkbox2Asignfolders).click();
                        Pojo_file_for_digital_assets_mnagement.timeout2000();
                        driver.findElement(updateBtnwithselectFolders).click();
                        Pojo_file_for_digital_assets_mnagement.timeout2000();
                        driver.findElement(editfolderOption).click();
                        Pojo_file_for_digital_assets_mnagement.timeout2000();
                        driver.findElement(updateBtnwithselectFolders).click();
                        Pojo_file_for_digital_assets_mnagement.timeout2000();
                        driver.findElement(deleteOptionOfAssignfolders).click();
                        Pojo_file_for_digital_assets_mnagement.timeout3000();
                        driver.findElement(deleteBtnOfpopup).click();
                        Pojo_file_for_digital_assets_mnagement.timeout3000();
                    }
                } catch (Exception ex) {
                    Assert.assertEquals(true, false, "Not enable checkboxes for select folders so not enable update button");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Can't edit/delete assigned folders because can't assign folders");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_create_folder_of_email_template(String arg1){
        boolean status = true;
        try{
            driver.findElement(manageEmailTemplateTab).click();
            Pojo_file_for_digital_assets_mnagement.timeout2000();

            if(driver.findElement(createFolderBtn).isEnabled()){
                driver.findElement(createFolderBtn).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                WebElement ele = driver.findElement(updateBtnInemailtemplateWithoutData);
                Actions action = new Actions(driver);
                action.moveToElement(ele).perform();
                driver.findElement(folderFieldinTemplate).sendKeys(arg1);
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(updateBtnWithdata).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();

                try{
                    WebElement ele1 = driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-manage-folders/div/div[2]/app-manage-email-template-folders/div/div[3]/div[1]/div/table/tbody/tr/td[1]"));
                    String val1 = ele1.getText();
                    System.out.println(val1);

                    if(! (val1.equals(arg1))){
                        Assert.assertEquals(true,false,"Not display create folder so can't create sub folders inside email template section");
                    }
                }catch (Exception ex){}

            }else{
                Assert.assertEquals(true,false,"Not display create folder section of email template");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the email template section");
            status = false;
            return status;
        }

    }

    public  boolean test_create_subFolders(String subfolder){
        boolean status = true;
        try{
            try {
                List<WebElement> elements = driver.findElements(By.xpath("//div[@id= cdk-drop-list-18']/div"));
                int numOfRecordsList = elements.size();
                int numOfRecords = (numOfRecordsList - 1);
                System.out.println(numOfRecordsList);
                driver.findElement(By.xpath("//*[@id=\"CRM_manage-email-template_Folders_Select_13\"]/span")).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(createSubfolderInemailtemplate).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                WebElement ele = driver.findElement(updateBtnwithoutdataInemailtemplat);
                Actions action = new Actions(driver);
                action.moveToElement(ele).perform();
                driver.findElement(inputOfemailtemplate).sendKeys(subfolder);
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(updateBtnwithDatainEmailtemplate).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();

                //create already exist sub folder
                driver.findElement(createSubfolderInemailtemplate).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(inputOfemailtemplate).sendKeys(subfolder);
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                driver.findElement(updateBtnwithDatainEmailtemplate).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
                try {
                    if (driver.findElement(inputOfemailtemplate).isDisplayed()) {
                        Assert.assertEquals(true, false, "When entering already exist folder name, not display validations");
                    }
                } catch (Exception ex) {
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Can't create/update/delete sub folders inside email template because can't create folder");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the email template section");
            status = false;
            return status;
        }
    }

    public boolean test_move_to_the_smartstack_tab(){
        boolean status = true;
        try{
            try{
                driver.findElement(manageEmailTemplateTab).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
            }catch (Exception ex){}
            driver.findElement(smartstackTab).click();
            Pojo_file_for_digital_assets_mnagement.timeout2000();
            driver.findElement(switchBtnOFsmartstackTab).click();
            Pojo_file_for_digital_assets_mnagement.timeout2000();

            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
                wait.until(ExpectedConditions.elementToBeClickable(switchBtnOFsmartstackTab));
                Assert.assertEquals(true, false, "Can't enable/disable switch input in smartstack section and not display folders/sub folders");

            } catch (Exception e) {
                if (driver.findElement(switchBtnOFsmartstackTab).isEnabled()) {
                    driver.findElement(switchBtnOFsmartstackTab).click();
                    Pojo_file_for_digital_assets_mnagement.timeout2000();
                }

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the smartstack section of manage email templates section");
            status = false;
            return status;
        }
    }

    public boolean test_move_to_the_community_tab(){
        boolean status = true;
        try{
            try{
                driver.findElement(manageEmailTemplateTab).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
            }catch (Exception ex){}
            driver.findElement(communityTab).click();
            Pojo_file_for_digital_assets_mnagement.timeout2000();
            driver.findElement(switchInputIncommunityTab).click();
            Pojo_file_for_digital_assets_mnagement.timeout2000();

            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
                wait.until(ExpectedConditions.elementToBeClickable(switchInputIncommunityTab));
                Assert.assertEquals(true, false, "Can't enable/disable switch input in community section and not display folders/sub folders");

            } catch (Exception e) {
                if (driver.findElement(switchInputIncommunityTab).isEnabled()) {
                    driver.findElement(switchInputIncommunityTab).click();
                    Pojo_file_for_digital_assets_mnagement.timeout2000();
                }

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the community section of manage email templates section");
            status = false;
            return status;
        }
    }

    public boolean test_move_to_the_you_shared_with_community_tab(){
        boolean status = true;
        try{
            try{
                driver.findElement(manageEmailTemplateTab).click();
                Pojo_file_for_digital_assets_mnagement.timeout2000();
            }catch (Exception ex){}
            driver.findElement(youSHaredWithCommuityTab).click();
            Pojo_file_for_digital_assets_mnagement.timeout2000();

            try{
                WebElement ele= driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[2]/app-manage-folders/div/div[2]/app-manage-email-template-folders/div/div[3]/app-smartstak/div/div[2]/div/table/tbody"));
                String val = ele.getText();
                System.out.println(val);

                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"Not display templates inside you shared community section");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the community section of manage email templates section");
            status = false;
            return status;
        }
    }
}
