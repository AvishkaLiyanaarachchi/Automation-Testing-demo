package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.bouncycastle.crypto.signers.ISOTrailers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Pojo_file_CRM_modules {

    By editStakehodlerOption = By.id("CRM_stakeholder-list_Content_Update_BUTTON_0");   By activityTypeOption = By.id("CRM_history_FilterBy_FilterList_dropdown");  By activityTypeOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div/app-history/div/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");
    By activityTypeoption3 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div/app-history/div/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[10]");
    By activityOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div/app-history/div/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[5]");
    By dateRangeOption = By.id("CRM_history_FilterBy_Date");    By fromoption = By.id("CRM_history_FilterBy_DateFrom");     By leftIconOFcalender = By.xpath("//*[@id=\"CRM_history_FilterBy_DateRange_DateFrom_Select\"]/span/div/div/div/div[1]/button[1]/span");
    By selectFromdate = By.xpath("//*[@id=\"CRM_history_FilterBy_DateRange_DateFrom_Select\"]/span/div/div/div/div[2]/table/tbody/tr[2]/td[1]");    By toOption = By.id("CRM_history_FilterBy_DateRange_DateTo");
    By rightIconOfcalender = By.xpath("//*[@id=\"CRM_history_FilterBy_DateRange_DateTo_Select\"]/span/div/div/div/div[1]/button[2]/span");  By selectTodate = By.xpath("//*[@id=\"CRM_history_FilterBy_DateRange_DateTo_Select\"]/span/div/div/div/div[2]/table/tbody/tr[5]/td[3]");
    By selectCheckbox1 = By.id("CRM_history_FilterBy_DateList_CHECKBOX_0");     By digitalAssetsOption = By.id("modules_custom-tabs_name_Folder");      By emailTab = By.id("modules_custom-tabs_name_Email");
    By newEmailBtn = By.id("CRM_filter-modules_FilterBody_NewButtons_BUTTON");  By sendBtnofAddemailSection = By.id("CRM_create-email_Buttons_Send_BUTTON");    By fromOption = By.id("CRM_create-email_From_dropdown");
    By selectFromOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[2]/app-create-email/div/div[2]/div[1]/div[2]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem");
    By ccBccLink = By.id("CRM_create-email_To_CC_Title");   By ccField = By.id("CRM_create-email_CC_INPUT");    By bccField = By.id("CRM_create-email_BCC_INPUT");      By subjectField = By.id("CRM_create-email_Subject_INPUT");
    By loadFRomtemplateBtn = By.id("CRM_create-email_EmailContent_Load_BUTTON");    By cancelBtnOfloadfromTemplate = By.id("CRM_manage-email-template_mailTemplateList_YourLibrary_Close");     By saveAstemplateBtn = By.id("CRM_create-email_EmailContent_Save_BUTTON");
    By cancelBtnOfsaveAsTemplate = By.id("CRM_manage-email-template_Folders_Cancel_BUTTON");    By contentSection = By.xpath("//*[@id=\"Elements_text_editor5_main\"]/div/div[2]/ckeditor/div[2]/div[2]/div");  By createSignatureBtn = By.id("CRM_create-email_Signature_Create_BUTTON");
    By signatureTitle = By.id("authentication_create-signature_Name_INPUT");    By insertContentOfcreateSignature = By.xpath("//*[@id=\"authentication_create-signature_Content_INPUT\"]/div/quill-editor/div[2]");     By updateBtnOfcreateSignature = By.id("authentication_create-signature_Buttons_Update");
    By dateRangeOptionOfemail = By.id("CRM_filter-modules_Main_Date");  By fromDateCalender = By.id("CRM_filter-modules_FilterBody_DateFrom");  By rightIconOfCalender = By.xpath("//*[@id=\"CRM_filter-modules_FilterBody_DateFrom_Select\"]/span/div/div/div/div[1]/button[1]/span");
    By selectFromdfate = By.xpath("//*[@id=\"CRM_filter-modules_FilterBody_DateFrom_Select\"]/span/div/div/div/div[2]/table/tbody/tr[2]/td[1]");    By toDatecaledner = By.id("CRM_filter-modules_FilterBody_DateTo");
    By selectLeftIconOfCalender = By.xpath("//*[@id=\"CRM_filter-modules_FilterBody_DateTo_Select\"]/span/div/div/div/div[1]/button[2]/span");  By selectTodateOfemail = By.xpath("//*[@id=\"CRM_filter-modules_FilterBody_DateTo_Select\"]/span/div/div/div/div[2]/table/tbody/tr[5]/td[3]");
    By senderSignatureOption = By.id("CRM_create-email_Signature_dropdown");    By selectSignature = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[2]/app-create-email/div/div[2]/div[7]/div[1]/div[2]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");
    By editSignatureBtn  = By.id("CRM_create-email_Signature_Edit_BUTTON");     By subjectTitleOption = By.id("CRM_filter-modules_Main_Email");     By filtersubjectField = By.id("CRM_filter-modules_FilterBody_Subject_INPUT");
    By allsentOption = By.id("CRM_filter-modules_Main_treeView");   By allsentOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[1]/app-filter-modules/div/div[1]/div[1]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");
    By allsentOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[1]/app-filter-modules/div/div[1]/div[1]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By allsentOption3 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[1]/app-filter-modules/div/div[1]/div[1]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By viewAllstakeholderOption = By.id("CRM_filter-modules_Stakeholder");  By viewStakeholderOption1 = By.id("CRM_filter-modules_StakeholderList_CHECKBOX_0");     By viewStakeholderOption2 = By.id("CRM_filter-modules_StakeholderList_CHECKBOX_1");
    By noteTab = By.id("modules_custom-tabs_name_Notes");   By newNoteBtn = By.id("CRM_filter-modules_FilterBody_NewButtons_Note_BUTTON");  By saveBtnOfnote = By.id("CRM_create-note_Buttons_Save_BUTTON");    By noteTitle = By.id("CRM_create-note_Note_INPUT");
    By logThisAsoption = By.id("CRM_create-note_Log_dropdown");     By logThisAsOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[2]/app-create-note/div/div/div[2]/div[2]/div[2]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By contentOptionOfnote = By.xpath("//*[@id=\"Elements_text_editor5_main\"]/div/div[2]/ckeditor/div[2]/div[2]/div");     By allNoteOption = By.id("CRM_filter-modules_User_Notes_dropdown");     By noteOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[1]/app-filter-modules/div/div[1]/div[1]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By noteOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[1]/app-filter-modules/div/div[1]/div[1]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By taskTab = By.id("modules_custom-tabs_name_Task");    By newAtskBtn = By.id("CRM_filter-modules_FilterBody_NewButtons_Task_BUTTON");  By updateBtnOftask = By.id("CRM_create-task_Buttons_Update_BUTTON");    By taskTitle = By.id("CRM_create-task_Task_INPUT");
    By logThisAsOptionIntask = By.id("CRM_create-task_Log_dropdown");   By logThisAsOption1Intask = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[2]/app-create-task/div/div/div[2]/div[3]/div[1]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By dueDateoptionInTask = By.id("CRM_create-task_DueDate_Select");   By selectDueDateinTask = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[2]/app-create-task/div/div/div[2]/div[3]/div[2]/div[2]/p-calendar/span/div/div/div/div[2]/table/tbody/tr[5]/td[7]");
    By selectTimeOption = By.id("CRM_create-task_DueTime");     By selectTime = By.xpath("//*[@id=\"CRM_create-task_DueTime_LISTBOX\"]/div/div/ul/li[1]/span");     By contentInTask = By.xpath("//*[@id=\"Elements_text_editor5_main\"]/div/div[2]/ckeditor/div[2]/div[2]/div");
    By taskTypeOption = By.id("CRM_filter-modules_User_Task_dropdown");     By taskTypeOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[1]/app-filter-modules/div/div[1]/div[1]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");
    By taskTypeOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[5]/app-modules/div/div[2]/div[2]/div[1]/app-filter-modules/div/div[1]/div[1]/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By selectTaskOption = By.id("CRM_display-item_Task_AddToFolder_icon4");     By editTaskBtn = By.id("CRM_view-task_Buttons_Edit_BUTTON");    By subscriptionTab = By.id("modules_custom-tabs_name_Subscriptions");
    By dataHistoryTab = By.id("CustomTab_Name_DataHistory");    By invoiceTab = By.id("CustomTab_Name_Invoices");   By viewFullInvoiceBtn = By.id("CRM_sub-invoice_ViewFull_BUTTON");   By servicestab = By.id("modules_custom-tabs_name_Services");
    By addServiceBtn = By.id("CRM_service_AddService_BUTTON");  By selectServiceOption = By.id("CRM_service_Service_dropdown");     By selectService = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/app-new-stakeholder-details/div/div[6]/app-modules/div/div[2]/div[2]/div/app-services/div/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem");
    By createserviceBtn = By.id("CRM_service_Select_BUTTON");   By invoicestab = By.id("modules_custom-tabs_name_Invoices");    By invoiceType = By.id("CRM_invoices_ServiceType_dropdown");    By cancelBtnOftask = By.id("CRM_create-task_Buttons_Cancel_BUTTON");
    WebDriver driver;

    public Pojo_file_CRM_modules(WebDriver driver) {
        this.driver = driver;
    }

    public  static  void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }
    public boolean test_history_section(){
        boolean status = true;
        try{
            driver.findElement(editStakehodlerOption).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(activityTypeOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                driver.findElement(activityTypeOption1).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(activityTypeOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                driver.findElement(activityOption2).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(activityTypeOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                driver.findElement(activityTypeoption3).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();

            driver.findElement(dateRangeOption).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(fromoption).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                driver.findElement(leftIconOFcalender).click();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(selectFromdate).click();
                Pojo_file_CRM_modules.timeout2000();
            }catch (Exception ex){}
            driver.findElement(toOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try {
                driver.findElement(rightIconOfcalender).click();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(selectTodate).click();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(selectCheckbox1).click();
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

    public boolean test_digital_assets(){
        boolean status =true;
        try{
            driver.findElement(digitalAssetsOption).click();
            Assert.assertEquals(true,false,"Not display create folder and sub folder sections");

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit stakeholder section");
            status = false;
            return status;
        }
    }
    public boolean test_email_section_of_modules(String invaliddata, String content, String subject){
        boolean status = true;
        try{
            driver.findElement(emailTab).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(newEmailBtn).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(sendBtnofAddemailSection).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(fromOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                driver.findElement(selectFromOption).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(ccBccLink).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                driver.findElement(ccField).sendKeys(invaliddata);
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(bccField).sendKeys(invaliddata);
                Pojo_file_CRM_modules.timeout2000();
            }catch (Exception ex){}

            driver.findElement(subjectField).sendKeys(subject);
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(loadFRomtemplateBtn).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(cancelBtnOfloadfromTemplate).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(saveAstemplateBtn).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(cancelBtnOfsaveAsTemplate).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(contentSection).sendKeys(content);
            Pojo_file_CRM_modules.timeout2000();

            try{
                WebElement ele1 = driver.findElement(ccField);
                String  val1 = ele1.getAttribute("value");
                System.out.println(val1);

                WebElement ele2 = driver.findElement(bccField);
                String val2 = ele2.getAttribute("value");
                System.out.println(val2);

                WebElement ele3 = driver.findElement(subjectField);
                String val3 = ele3.getAttribute("value");
                System.out.println(val3);

                if(val1.equals(invaliddata) || val2.equals(invaliddata) || val3.equals(invaliddata)){
                    Assert.assertEquals(true,false,"Enter invalid data CC, BCC and subject fields");
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

    public boolean test_create_signature(String invalidData, String content, String validData){
        boolean status = true;
        try{
            driver.findElement(createSignatureBtn).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                driver.findElement(signatureTitle).clear();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(signatureTitle).sendKeys(invalidData);
                try {
                    Pojo_file_CRM_modules.timeout2000();
                    driver.findElement(insertContentOfcreateSignature).sendKeys(content);
                }catch (Exception ex){}
                Pojo_file_CRM_modules.timeout2000();

                try{
                    WebElement ele= driver.findElement(signatureTitle);
                    String val = ele.getAttribute("value");
                    if(val.equals(invalidData)){
                        Assert.assertEquals(true,false,"Create signature with invalid data");
                    }
                }catch (Exception ex){}
            }catch (Exception ex){
                driver.findElement(signatureTitle).sendKeys(validData);
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(insertContentOfcreateSignature).sendKeys(content);
                Pojo_file_CRM_modules.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit stakeholder section");
            status = false;
            return status;
        }
    }

    public boolean test_edit_signature_option(String arg1){
        boolean status =true;
        try{
            driver.findElement(updateBtnOfcreateSignature).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(senderSignatureOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(selectSignature).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(editSignatureBtn).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(signatureTitle).clear();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(signatureTitle).sendKeys(arg1);
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(updateBtnOfcreateSignature).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(sendBtnofAddemailSection).click();
            Pojo_file_CRM_modules.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_filter_email(String invalidSubject, String validSubject){
        boolean status = true;
        try{
            driver.findElement(dateRangeOptionOfemail).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(fromDateCalender).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                driver.findElement(rightIconOfCalender).click();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(selectFromdfate).click();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(toDatecaledner).click();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(selectLeftIconOfCalender).click();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(selectTodateOfemail).click();
                Pojo_file_CRM_modules.timeout2000();
            }catch (Exception ex){}

            driver.findElement(subjectTitleOption).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(filtersubjectField).sendKeys(invalidSubject);
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(filtersubjectField).clear();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(filtersubjectField).sendKeys(validSubject);
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(allsentOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(allsentOption2).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(allsentOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                driver.findElement(allsentOption3).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(allsentOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(allsentOption1).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(viewAllstakeholderOption).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(viewStakeholderOption1).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(viewStakeholderOption2).click();
            Pojo_file_CRM_modules.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public  boolean test_create_new_note_section1(String invaliddata, String validdta){
        boolean status = true;
        try{
            driver.findElement(noteTab).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(newNoteBtn).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(saveBtnOfnote).click();
            Pojo_file_CRM_modules.timeout2000();
            try {
                WebElement ele = driver.findElement(noteTitle);
                ele.sendKeys(invaliddata);
                String val = ele.getAttribute("value");
                System.out.println(val);

                if(val.equals(invaliddata)){
                    Assert.assertEquals(true,false,"Enter invalid data to when creating note");
                }

                Pojo_file_CRM_modules.timeout2000();

            }catch (Exception ex){
                driver.findElement(noteTitle).sendKeys(validdta);
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_craete_note_section2(String content){
        boolean status = true;
        try{
           driver.findElement(logThisAsoption).click();
           Pojo_file_CRM_modules.timeout2000();
           try {
               driver.findElement(logThisAsOption1).click();
               Pojo_file_CRM_modules.timeout2000();
               try {
                   driver.findElement(contentOptionOfnote).sendKeys(content);
               }catch (Exception ex){}
           }catch (Exception ex){}
           Pojo_file_CRM_modules.timeout2000();

           try {
               WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
               wait.until(ExpectedConditions.elementToBeClickable(saveBtnOfnote));
               Assert.assertEquals(true, false, "1. Not enable save button after entering all fields of create note section\n\n"+
                       "2. Not display character limitation for note title");
           }catch (Exception ex){
               driver.findElement(saveBtnOfnote).click();
           }

           status = true;
           return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_filter_note(String noteTitlee){
        boolean status = true;
        try{
            try{
                driver.findElement(noteTitle).clear();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(noteTitle).sendKeys(noteTitlee);
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(saveBtnOfnote).click();
                Pojo_file_CRM_modules.timeout2000();
            }catch (Exception ex){}
            driver.findElement(allNoteOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(noteOption1).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(allNoteOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(noteOption2).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return  status;
        }
    }

    public  boolean test_create_task_section(String taskData, String content){
        boolean status = true;
        try{
            driver.findElement(taskTab).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(newAtskBtn).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(updateBtnOftask).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(taskTitle).sendKeys(taskData);
            Pojo_file_CRM_modules.timeout2000();

            driver.findElement(logThisAsOptionIntask).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(logThisAsOption1Intask).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(dueDateoptionInTask).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(selectDueDateinTask).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(selectTimeOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(selectTime).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(contentInTask).sendKeys(content);
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();

            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
                wait.until(ExpectedConditions.elementToBeClickable(updateBtnOftask));
                Assert.assertEquals(true, false, "1. Not enable update button after entering all fields of create task section\n\n"+
                        "2. Not display character limitation for task title");
            }catch (Exception ex){
                driver.findElement(updateBtnOftask).click();
                Pojo_file_CRM_modules.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return  status;
        }
    }

    public boolean test_filter_taskTypes(String taskData){
        boolean status = true;
        try{
            try{
                driver.findElement(taskTitle).clear();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(taskTitle).sendKeys(taskData);
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(updateBtnOftask).click();
                Pojo_file_CRM_modules.timeout2000();
            }catch (Exception ex){}

            try{
                driver.findElement(cancelBtnOftask).click();
                Pojo_file_CRM_modules.timeout2000();
            }catch (Exception ex){}
            driver.findElement(taskTypeOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(taskTypeOption1).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(taskTypeOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(taskTypeOption2).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();

            try{
                driver.findElement(selectTaskOption).click();
                Pojo_file_CRM_modules.timeout2000();
                driver.findElement(editTaskBtn).click();
                Pojo_file_CRM_modules.timeout2000();

                try{
                    WebElement ele= driver.findElement(taskTitle);
                    String val = ele.getAttribute("value");

                    if(val.isEmpty()){
                        Assert.assertEquals(true,false,"When moving to the edit task section , not display task title" );
                    }
                }catch (Exception ex){}
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return  status;
        }
    }

    public boolean test_move_to_subscriptions_tab(){
        boolean status = true;
        try{
            driver.findElement(subscriptionTab).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(dataHistoryTab).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(invoiceTab).click();
            Pojo_file_CRM_modules.timeout2000();

            try{
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
                wait.until(ExpectedConditions.elementToBeClickable(viewFullInvoiceBtn));
                Assert.assertEquals(true, false, "1. When click view full invoice button , not display it\n\n"+
                        "2. When click preview upcoming invoice option, not happen anything");
            }catch (Exception ex){
                driver.findElement(viewFullInvoiceBtn).click();
                Pojo_file_CRM_modules.timeout2000();

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display subscription section");
            status = false;
            return  status;
        }
    }

    public boolean test_create_service_section(){
        boolean status = true;
        try{
            driver.findElement(servicestab).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(addServiceBtn).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(selectServiceOption).click();
            Pojo_file_CRM_modules.timeout2000();
            try{
                driver.findElement(selectService).click();
            }catch (Exception ex){}
            Pojo_file_CRM_modules.timeout2000();

            try{
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
                wait.until(ExpectedConditions.elementToBeClickable(createserviceBtn));
                Assert.assertEquals(true, false, "1. When click select button after filling all fields of create service section , not display created service\n\n"+
                "2.Some times display pagination section");

            }catch (Exception ex){
                driver.findElement(createserviceBtn).click();
                Pojo_file_CRM_modules.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return  status;
        }
    }

    public boolean test_invoices_tab(){
        boolean status = true;
        try{
            driver.findElement(invoicestab).click();
            Pojo_file_CRM_modules.timeout2000();
            driver.findElement(invoiceType).click();
            Pojo_file_CRM_modules.timeout2000();


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return  status;
        }
    }




}
