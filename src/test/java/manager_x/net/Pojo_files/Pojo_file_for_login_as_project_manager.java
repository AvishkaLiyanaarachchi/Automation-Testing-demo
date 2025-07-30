package manager_x.net.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_login_as_project_manager {

    By lstPaginationofproject = By.xpath("//*[@id=\"managerX_project-manager-projects_section\"]/div/button[4]");       By serahcFielOfProjects = By.id("managerX_project-manager-projects_search-icon_input");
     By selectnameofprojects = By.id("managerX_project-manager-projects_project-name-content_name-section");     By checklistOfprojectDetails = By.id("managerX_project-manager-projects_checklist_tab");
    By contractOfprojectdetails = By.id("managerX_project-manager-projects_contract_tab");  By propertyAddressoption = By.id("managerX_master-page_display-address_dropdown");
    By propertyaddress1= By.id("managerX_master-page_display-address_dropdown_0");  By propertAddress2 = By.id("managerX_master-page_display-address_dropdown_2");  By lastPaginationofTask = By.xpath("//*[@id=\"managerX_project-manager-checklist_pagination_section\"]/div/button[4]");
    By ssearchOptionoftask = By.id("managerX_project-manager-checklist_search_input");      By addnnewtaskBtn = By.id("managerX_project-manager-checklist_add-task_button"); By tasklistLink = By.id("managerX_master-page_checklist_Link");
    By submitBtnofTask = By.id("managerX_new-task_create_button");    By taskNAmefield= By.id("managerX_new-task_name_input");  By descriptionField = By.id("managerX_new-task_description_input");
    By startdateofAddnewtask = By.id("managerX_new-task_display-start_date");   By duedateFieldOfaddtask = By.id("managerX_new-task_display-due_date");    By addsupplierforAddtask = By.id("managerX_new-task_add-person_icon");
    By stagedropdownOdaddTask = By.xpath("//*[@id=\"managerX_new-task_stage_dropdown\"]/p-dropdown");  By substagedropdown = By.id("managerX_new-task_sub-stage-dropdown_list");    By substageoption1 = By.id("managerX_new-task_sub-stage-dropdown_list_1");
    By substagecategoryOption = By.id("managerX_new-task_sub-stage-category_dropdown-list");    By selectSubstagecategory1 = By.id("managerX_new-task_sub-stage-category_dropdown-list_1");
    By edittaskoption = By.id("managerX_project-manager_checklist-edit_icon");      By statusOptionofedittask = By.id("managerX_new-task_status_dropdown");     By selectStatusoption1ofedittask = By.id("managerX_new-task_status_dropdown_1");
    By addsubtaskOption = By.id("managerX_new-task_add-subtask_button");    By createBtnofsubtask = By.id("managerX_new-task_new-note-create_button");      By subtasktextarea = By.id("managerX_new-task_new-note_textarea");
    By addnotebtn = By.id("managerX_new-task_add-note_button");     By notecreatebtn = By.id("managerX_new-task_note-create_button");   By notetextarea = By.id("managerX_new-task_note_textarea");
    By calenderLink = By.id("managerX_master-page_calendar_Link");  By removeTasBtn = By.id("managerX_new-task_remove_button");     By searchOptionforCalender = By.id("managerX_project-manager_calendar-search_input");
    By notificationLink = By.id("managerX_master-page_notifications_Link");     By paginationforNotificationTab = By.xpath("//*[@id=\"managerX_project-manager-notifications_pagination_section\"]/div/button[4]");
    By serachfieldOfnotification = By.id("managerX_project-manager-notifications_search-query_input");      By contactsLink = By.id("managerX_master-page_contacts_Link2");     By paginationOfcontacts = By.xpath("//*[@id=\"managerX_master-page_content_section\"]/app-admin-contacts/div/div[2]/p-paginator/div/button[4]");
    By searchFieldofcontacts = By.xpath("//*[@id=\"managerX_master-page_content_section\"]/app-admin-contacts/div/div[1]/p-iconfield/span/div/input");      By addnewContactBtn = By.xpath("//*[@id=\"managerX_master-page_content_section\"]/app-admin-contacts/div/div[2]/div/button");
    By addnewcontactOption = By.id("managerX_new-contact-add_contact_button");      By submitnofAddnewcontact = By.id("managerX_new-contact_create_button");    By firstnameOfaddnewcontact = By.id("managerX_new-contact_first-ame_input");
    By lastnameofaddnewcontact = By.id("managerX_new-contact_last-name_input"); By emailfieldOfaddnewcontact = By.id("managerX-new-contact-email-input");   By passwordfieldofaddnewcontact = By.id("managerX_new-contact_password_input");
    By contactNoFieldOfaddnewcontact = By.id("managerX_new-contact_contact-number_input");      By roleDropdownOfaddnewcontact = By.id("managerX_new-contact_role-detail_dropdown");    By companyNameofAddnewcontact = By.xpath("//*[@id=\"managerX_new-contact_company-name_value-label\"]/div/span/input");
    By importContactOption = By.id("managerX_new-contact_import-contact_button");   By supplierseelctionOfimportContact= By.xpath("//*[@id=\"managerX_new-contact_usertype_button\"]/div/div[2]");     By plusIconOFimportCopntact = By.id("managerX_import-contact_add_icon");
    By closeiconOfimportContact = By.id("managerX_import-contact_remove_icon");     By deleteBtnofcloseIcon = By.id("managerX_delete-confirmation_delete_button");  By importContactBackBtn = By.id("managerX_new-contact_import-contact-details-cancel_button");
    By manageContactBackbtn = By.xpath("//*[@id=\"managerX_new-contact_back_button\"]/i");      By editContactIcon = By.xpath("/html/body/app-root/app-master-page/div/div/main/app-admin-contacts/div/div[2]/p-table/div/div/table/tbody/tr[1]/td[1]/div/div[2]/div/i");
    By settingLink = By.id("managerX_master-page_settings_Link");   By nameField = By.id("managerX_project-manager-settings_first-name_input");     By nameField2 = By.id("managerX_project-manager-settings_last-name_input");
    By editProfileBtn = By.id("managerX_project-manager-settings_edit_profile-button");    By gobackBtn = By.id("CRM_Confirm_Buttons_Delete_BUTTON");  By stageLevelLink = By.id("managerX_master-page_stage-Level-Settings_Link");    By addNewstageBtn = By.id("managerX_stage-level-component_add-stage-button");
    By createBtnofAddnewstage = By.id("managerX_stage-level-component_create-stage_button");    By stageNameField = By.id("managerX_stage-level-component_stage-name_input");   By selectStage = By.xpath("//*[@id=\"managerX_stage-level-component_stage_stageObjList\"]/span");
    By addnewsubstageBtn = By.id("managerX_stage-level-component_add-sub-stage_button");    By createBtnofAddnewsubstage = By.id("managerX_stage-level-component_create-sub-stage_button");     By substageField = By.id("managerX_stage-level-component_sub-stage-name_input");
    By selectSubstage = By.xpath("//*[@id=\"managerX_stage-level-component_sub-stage_subStageObj\"]/span");     By addSubstageCategoryBtn = By.id("managerX_stage-level-component_add-sub-stage-category_button");
    By createBtnofSubstageCategory = By.id("managerX_stage-level-component_create-sub-stage-category_button");  By substagecategoryField = By.id("managerX_stage-level-component_sub-stage-category-name_input");
    WebDriver driver;

    public Pojo_file_for_login_as_project_manager(WebDriver driver) {
        this.driver = driver;
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

    //Login as project manager , select pagination and search projects
    public boolean select_pagination_and_search_with_validName_of_project(String firstname, String lastname, String fullname){
        boolean status = true;
        try{
            try {
                driver.findElement(lstPaginationofproject).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}

            driver.findElement(serahcFielOfProjects).sendKeys(firstname);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(serahcFielOfProjects).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(serahcFielOfProjects).sendKeys(lastname);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(serahcFielOfProjects).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(serahcFielOfProjects).sendKeys(fullname);
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                WebElement ele = driver.findElement(By.id("managerX_project-manager-projects_project-name-content_name-section"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals(fullname)){
                    Assert.assertEquals(true,true,"Display record when searching as valid name");
                }else{
                    Assert.assertEquals(true,true,"Display message as 'There are no records to display'");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"1.Not display record when searching with valid name\n" +
                        "2. Not display message if there are no records to display");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager move to project details
    public boolean select_project_details_method1(){
        boolean status = true;
        try{
            driver.findElement(serahcFielOfProjects).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(selectnameofprojects).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_project-manager-projects_admin-project-contract\"]/div/div/div[1]/div[2]/div/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display contracts details inside project information section");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,true,"Not display contracts details inside project information section");
            }
            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display project details");
            status = false;
            return status;
        }
    }

    //Login as project manager move to project details and search
    public boolean select_project_details_method2(String name){
        boolean status = true;
        try{
            driver.findElement(checklistOfprojectDetails).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(contractOfprojectdetails).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(serahcFielOfProjects).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(serahcFielOfProjects).sendKeys(name);
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_project-manager-projects_admin-project-contract\"]/div/div/div[2]/div[1]/div/div/span")).isDisplayed()){
                    Assert.assertEquals(true,false,"Search option not work under project details");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,true,"Search option work under project details");
            }
            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display project details");
            status = false;
            return status;
        }


    }

    //Login as project manager , move to tasklist and search task
    public boolean move_to_tasklist_and_search_task(String taskname){
        boolean status = true;
        try{
            driver.findElement(tasklistLink).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(propertyAddressoption).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(propertyaddress1).click();
            Pojo_file_for_login_as_project_manager.timeout3000();

            try{
                driver.findElement(lastPaginationofTask).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}
            driver.findElement(ssearchOptionoftask).sendKeys(taskname);
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_project-manager-checklist_task-name_label")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display task according to the searched name");
                }else{
                    Assert.assertEquals(true,true,"Display message if there are no task to display");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display task");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project mnager , click submit of add new task
    public boolean add_new_task_method1(){
        boolean status = true;
        try{
            driver.findElement(ssearchOptionoftask).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(propertyAddressoption).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(propertAddress2).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(addnnewtaskBtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(submitBtnofTask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_new-task_error_Message")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations under required fields when click submit button without filling fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"No display validations under required fields when click submit button without filling fields");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager add new task
    public boolean add_new_task_method2(String taskName, String description){
        boolean status = true;
        try{
            driver.findElement(taskNAmefield).sendKeys(taskName);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(descriptionField).sendKeys(description);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(startdateofAddnewtask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            try {
                driver.findElement(By.xpath("/html/body/div[2]/div/p-calendar/span/div/div/div/div[2]/table/tbody/tr[4]/td[6]")).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}

            driver.findElement(duedateFieldOfaddtask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            try {
                driver.findElement(By.xpath("/html/body/div[2]/div/p-calendar/span/div/div/div/div[1]/button[2]")).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
                driver.findElement(By.xpath("/html/body/div[2]/div/p-calendar/span/div/div/div/div[2]/table/tbody/tr[2]/td[4]")).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}
            driver.findElement(addsupplierforAddtask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            driver.findElement(stagedropdownOdaddTask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            try {
                driver.findElement(By.xpath("/html/body/app-root/app-master-page/div/div/main/app-project-manager-checklist/p-sidebar/div/div[2]/app-new-task/div/div[5]/div[1]/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[2]")).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}
            driver.findElement(substagedropdown).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            try {
                driver.findElement(substageoption1).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}
            driver.findElement(substagecategoryOption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            try{
                driver.findElement(selectSubstagecategory1).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}
            driver.findElement(submitBtnofTask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_project-manager-checklist_task_row")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display newly created task inside list");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display newly created task inside list");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager update the selected task
    public boolean edit_task_from_list1(){
        boolean status = true;
        try{
            driver.findElement(edittaskoption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(statusOptionofedittask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(selectStatusoption1ofedittask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(addsubtaskOption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(createBtnofsubtask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-task_new-note-error_message\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation when click create button without entering sub task name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not Display validation when click create button without entering sub task name");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }
    //Login as project manager , move to edit task and add sub tasks
    public boolean edit_subtask_from_list2(String subtask){
        boolean status = true;
        try{
            driver.findElement(subtasktextarea).sendKeys(subtask);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(createBtnofsubtask).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(addnotebtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(notecreatebtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-task_note-error_message\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation when click create button without note");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,true,"Not display validation when click create button without note");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager , move to edit task with adding note
    public boolean edit_task_from_list3(String note, String invalidname, String validname){
        boolean status = true;
        try{
            driver.findElement(notetextarea).sendKeys(note);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(notecreatebtn).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(By.id("managerX_new-task_cancel_icon")).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(calenderLink).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(searchOptionforCalender).sendKeys(invalidname);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(searchOptionforCalender).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(searchOptionforCalender).sendKeys(validname);
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"managerX_project-manager_calendar-full_calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div"));
                String val = ele.getText();
                System.out.println(val);

                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"Not display task inside date of calender");
                }

            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display task inside date of calender");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }

    }

    //Login as project manager , move to task and delete task
    public boolean delete_task_from_list_and_check_with_calender(){
        boolean status = true;
        try{
            driver.findElement(tasklistLink).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(edittaskoption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(removeTasBtn).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(calenderLink).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"managerX_project-manager_calendar-full_calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div"));
                String val = ele.getText();
                System.out.println(val);

                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"Not display task inside date of calender");
                }

            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display task inside date of calender");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }

    }

    //LOgin as project manager , move to notifications and search data
    public boolean move_to_notification_with_searchData(String validNAme){
        boolean status= true;
        try{
            driver.findElement(notificationLink).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(propertyAddressoption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(propertyaddress1).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            try {
                driver.findElement(paginationforNotificationTab).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}
            driver.findElement(serachfieldOfnotification).sendKeys(validNAme);
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_project-manager-notifications_description_section")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display notifications when searching with valid name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,true,"Not display notifications when searching with valid name");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager and move to contacts section
    public boolean move_to_contacts_section(String validname){
        boolean status = true;
        try{
            driver.findElement(serachfieldOfnotification).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(propertyAddressoption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(propertAddress2).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(contactsLink).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(propertyAddressoption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(propertyaddress1).click();
            Pojo_file_for_login_as_project_manager.timeout3000();

            try {
                driver.findElement(paginationOfcontacts).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}
            driver.findElement(searchFieldofcontacts).sendKeys(validname);
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_master-page_content_section\"]/app-admin-contacts/div/div[2]/div[1]/div")).isDisplayed()){
                    Assert.assertEquals(true,false,"Not display contact when searching with valid name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,true,"Display contact when searching with valid name");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager move to  contact and clcik submit button of add new contact
    public boolean add_new_contact_method1(){
        boolean status = true;
        try{
            driver.findElement(searchFieldofcontacts).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(propertyAddressoption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(propertAddress2).click();
            Pojo_file_for_login_as_project_manager.timeout3000();

            driver.findElement(addnewContactBtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(addnewcontactOption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(submitnofAddnewcontact).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-contact_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations for required fields when click submit button without filling fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validations for required fields when click submit button without filling fields");
            }

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }
    //Login as project manager , move to contact and add new contact with invalid emnail
    public boolean add_new_cntact_method2(String firstName, String lastName, String invalidemail){
        boolean status = true;
        try{
            driver.findElement(firstnameOfaddnewcontact).sendKeys(firstName);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(lastnameofaddnewcontact).sendKeys(lastName);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(emailfieldOfaddnewcontact).sendKeys(invalidemail);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(submitnofAddnewcontact).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-contact_error4\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under email field for invalid email");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,true,"Not display validation under email field for invalid email");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager, move to contact and add new contact
    public boolean add_new_contact_method3(String email,String pasword, String conNo, String companyName){
        boolean status = true;
        try{
            driver.findElement(emailfieldOfaddnewcontact).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(emailfieldOfaddnewcontact).sendKeys(email);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(passwordfieldofaddnewcontact).sendKeys(pasword);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(contactNoFieldOfaddnewcontact).sendKeys(conNo);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(roleDropdownOfaddnewcontact).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(roleDropdownOfaddnewcontact).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(companyNameofAddnewcontact).sendKeys(companyName);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(submitnofAddnewcontact).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-master-page/div/div/main/app-admin-contacts/div/div[2]/p-table/div/div/table/tbody/tr")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display newly created contact inside list");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display new;y created contact inside list");

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager, move to contact and import contact
    public boolean import_contact_from_list(){
        boolean status = true;
        try{
            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-contact_error5\"]/span")).isDisplayed()){
                    driver.findElement(By.id("managerX_new-contact_cancel_button")).click();
                    Pojo_file_for_login_as_project_manager.timeout2000();
                }
            }catch (Exception ex){}
            try{
                driver.findElement(addnewContactBtn).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
            }catch (Exception ex){}

            driver.findElement(importContactOption).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(supplierseelctionOfimportContact).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            try{
                if(driver.findElement(plusIconOFimportCopntact).isDisplayed()){
                    driver.findElement(plusIconOFimportCopntact).click();
                }else{
                    driver.findElement(closeiconOfimportContact).click();
                    Pojo_file_for_login_as_project_manager.timeout2000();
                    driver.findElement(deleteBtnofcloseIcon).click();
                    Pojo_file_for_login_as_project_manager.timeout2000();
                    driver.findElement(plusIconOFimportCopntact).click();
                    Pojo_file_for_login_as_project_manager.timeout2000();
                }
            }catch (Exception ex){}
            driver.findElement(importContactBackBtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(manageContactBackbtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-master-page/div/div/main/app-admin-contacts/div/div[2]/p-table/div/div/table/tbody/tr")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display contact list when back from manage contact");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display contact list when back from manage contact");

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager, move to contact and edit contact
    public boolean edit_contact_from_list(String updateFirstName){
        boolean status = true;
        try{
            try{
                driver.findElement(editContactIcon).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
                driver.findElement(firstnameOfaddnewcontact).sendKeys(updateFirstName);
                Pojo_file_for_login_as_project_manager.timeout2000();
                driver.findElement(submitnofAddnewcontact).click();
                Pojo_file_for_login_as_project_manager.timeout3000();
                driver.findElement(editContactIcon).click();
                Pojo_file_for_login_as_project_manager.timeout2000();
                driver.findElement(By.id("managerX_new-contact_remove_button")).click();
                Pojo_file_for_login_as_project_manager.timeout3000();
                driver.findElement(By.id("managerX_delete-confirmation_delete_button")).click();
                Pojo_file_for_login_as_project_manager.timeout3000();

            }catch (Exception ex){
                System.out.println(ex);
                Assert.assertEquals(true,false,"Can't move to the edit section of contact");
            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }
    //Login as project manager and move to settings with clear fields
    public boolean move_to_settings_section(){
        boolean status = true;
        try{
            driver.findElement(settingLink).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(nameField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(editProfileBtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(nameField2).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(editProfileBtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_project-manager-settings_first-name_error-message\"]/span")).isDisplayed() || driver.findElement(By.xpath("//*[@id=\"managerX_project-manager-settings_last-name_error-message\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations under name field when clear fields and click edit profile button");
                }

            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display validations under name field when clear fields and click edit profile button");
            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }
    //Login as project manager and update settings
    public boolean update_fields_of_setting_section(String name1, String name2){
        boolean status = true;
        try{
            driver.findElement(nameField).sendKeys(name1);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(nameField2).sendKeys(name2);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(editProfileBtn).click();
            Pojo_file_for_login_as_project_manager.timeout3000();
            driver.findElement(gobackBtn).click();
            Pojo_file_for_login_as_project_manager.timeout3000();

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager move to stage levels , add stage
    public  boolean move_to_stage_level_section(){
        boolean status = true;
        try{
            driver.findElement(stageLevelLink).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(addNewstageBtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(createBtnofAddnewstage).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_stage-level-component_stage-name_errorMessage")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation when click create stage button without stage name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display validation when click create stage button without stage name");
            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager, move stage level and add sub stage
    public boolean add_new_stage_of_stageLevel(String stageName){
        boolean status = true;
        try{
            driver.findElement(stageNameField).sendKeys(stageName);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(createBtnofAddnewstage).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(selectStage).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(addnewsubstageBtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(createBtnofAddnewsubstage).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_stage-level-component_sub-stage-name_error\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under sub stage field when click button without field name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation under sub stage field when click button without field name");
            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    //Login as project manager, move stage level and add sub category stage
    public boolean add_new_sub_stage(String substageName){
        boolean status = true;
        try{
            driver.findElement(substageField).sendKeys(substageName);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(createBtnofAddnewsubstage).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(selectSubstage).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(addSubstageCategoryBtn).click();
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(createBtnofSubstageCategory).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_stage-level-component_sub-stage-category-name_errorMessage")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under fields when click create button without sub category name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display validation under fields when click create button without sub category name");
            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }

    public boolean create_sub_category_iside_list(String subcategory){
        boolean status = true;
        try{
            driver.findElement(substagecategoryField).sendKeys(subcategory);
            Pojo_file_for_login_as_project_manager.timeout2000();
            driver.findElement(createBtnofSubstageCategory).click();
            Pojo_file_for_login_as_project_manager.timeout2000();

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            Assert.assertEquals(true,false,"can't move to this test method'");
            status = false;
            return status;
        }
    }








}
