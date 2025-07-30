package manager_x.net.Pojo_files;

import org.bouncycastle.crypto.signers.ISOTrailers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_login_as_admin_and_move_to_system {
    By clientLink = By.id("managerX_master-page_projects_Link");    By propertyAddressdropdown = By.id("managerX_master-page_display-address_dropdown");    By selectAddress1 = By.id("managerX_master-page_display-address_dropdown_2");
    By selectAddres2 = By.id("managerX_master-page_display-address_dropdown_0");    By paginationIconOfclients = By.xpath("//*[@id=\"managerX_admin-projects_paginator_section\"]/div/button[4]");  By searchOption = By.id("managerX_admin-projects_search-box_input");
    By addnewclient = By.id("managerX_admin-projects_addNewClient_button");     By createBtnOfaddnewClient = By.id("managerX_new-client_create_button");    By firstnameofnewclient = By.id("managerX_new-client_first-Name_Input");
    By lastnameofnewclient = By.id("managerX_new-client_lastNameInput");    By emailofnewclient = By.id("managerX_new-client_email_Input");     By contactnofornewclient = By.id("managerX_new-client_contact-Number_Input");
    By streetaddressofnewclient = By.id("managerX_new-client_street-Address_Input");    By cityfornewclient = By.id("managerX_new-client_city_Input");     By statefornewclient = By.id("managerX_new-client_state_Input");
    By postcodefornewclient = By.xpath("//*[@id=\"managerX_new-client_postal-Code_Content\"]/div/span/input");  By countryfornewclient = By.id("managerX_new-client_address-Drop_Down");    By startdateoptionfornewclient = By.id("managerX_new-client_Start-Date_toggle");
    By selectstartdatefornewclient = By.xpath("//*[@id=\"pn_id_201_panel\"]/div/div/div[2]/table/tbody/tr[5]/td[2]");   By enddateoptionfornewclient = By.id("managerX_new-client_end-Date_toggle");    By nextmonthoption = By.xpath("//*[@id=\"pn_id_201_panel\"]/div/div/div[1]/button[2]");
    By selectenddatefornewclient = By.xpath("//*[@id=\"pn_id_201_panel\"]/div/div/div[2]/table/tbody/tr[4]/td[4]");     By editClientOption = By.id("managerX_admin-projects_client-edit_button");
    By contactLink = By.id("managerX_master-page_contacts_Link");   By paginationofContact = By.xpath("//*[@id=\"managerX_admin-contacts_paginator_sections\"]/div/button[4]");     By searchOptionofContact = By.id("managerX_admin-contacts_search_input");
    By addnewContactBtn = By.id("managerX_admin-contacts_add-new-contact_button");  By addnewcontactcard = By.id("managerX_new-contact-add_contact_button");    By submitBtnofaddnewContact = By.id("managerX_new-contact_create_button");
    By firstNameofcontact = By.id("managerX_new-contact_first-ame_input");     By lastnameofContact = By.id("managerX_new-contact_last-name_input");    By emailforAddnewcontact = By.id("managerX-new-contact-email-input");
    By passwordforAddnewcontact = By.id("managerX_new-contact_password_input");    By contactNoforAddnewcontact = By.id("managerX_new-contact_contact-number_input");   By roleoptionforAddnewcontact = By.id("managerX_new-contact_role-detail_dropdown");
    By companyNamefieldforAddnewcontact = By.xpath("//*[@id=\"managerX_new-contact_company-name_value-label\"]/div[1]/span/input");     By editcontactOption = By.id("managerX_admin-contacts_edit_icon");
    By importContactOption = By.id("managerX_new-contact_import-contact_button");   By selectsupplierOptionforImportConatct = By.xpath("//*[@id=\"managerX_new-contact_usertype_button\"]/div/div[2]");     By clcikplusIcon = By.id("managerX_import-contact_add_icon");
    By clickCloseicon = By.id("managerX_import-contact_remove_icon");   By clickdeleteBtnofcontact = By.id("managerX_delete-confirmation_delete_button");   By backIconofimportContact = By.id("managerX_new-contact_import-contact-details-cancel_button");
    By backIconofmanageContact = By.xpath("//*[@id=\"managerX_new-contact_back_button\"]/i");   By stagesLink = By.id("managerX_master-page_checklist_Link");   By stagedropdownofstageList = By.id("managerX_admin-checklist_stage_dropdown");
    By selectstagefromdropdown = By.id("managerX_admin-checklist_stage-dropdown_item");     By searchFieldOfstagesList = By.id("managerX_admin-checklist_search_input");    By taskLink = By.id("managerX_master-page_tasks_Link2");
    By paginationOftasks = By.xpath("//*[@id=\"managerX_admin-tasks_pagiantor_section\"]/div/button[4]");   By searchFieldoftask = By.id("managerX_admin-tasks_search_input");  By addnewTaskbtn = By.xpath("//*[@id=\"managerX_admin-tasks_contacts-table_section\"]/div/button");
    By createBtnoftask = By.id("managerX_new-task_create_button");      By taskName = By.id("managerX_new-task_name_input");    By description = By.id("managerX_new-task_description_input");  By startdateOption = By.id("managerX_new-task_display-start_date");
    By selectStartDate = By.xpath("/html/body/div[2]/div/p-calendar/span/div/div/div/div[2]/table/tbody/tr[5]/td[3]");      By endDateoptionOftask = By.id("managerX_new-task_display-due_date");   By nextmonthOption = By.xpath("/html/body/div[2]/div/p-calendar/span/div/div/div/div[1]/button[2]");
    By selectDuedate = By.xpath("/html/body/div[2]/div/p-calendar/span/div/div/div/div[2]/table/tbody/tr[4]/td[6]");    By supplierIcon = By.id("managerX_new-task_add-person_icon");   By stagedropdownOftask = By.xpath("//*[@id=\"managerX_new-task_stage_dropdown\"]/p-dropdown");
    By selectStagefromOption = By.xpath("/html/body/app-root/app-master-page/div/div/main/app-admin-tasks/p-sidebar/div/div[2]/app-new-task/div/div[5]/div[1]/div[2]/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[2]/li");
    By substageOption = By.id("managerX_new-task_sub-stage-dropdown_list");     By selectSubstage = By.id("managerX_new-task_sub-stage-dropdown_list_1");   By substageCategoryOption = By.id("managerX_new-task_sub-stage-category_dropdown-list");
    By substageCategory = By.id("managerX_new-task_sub-stage-category_dropdown-list_1");     By calenderOption = By.id("managerX_master-page_calendar_Link");   By searchFieldOfcalender = By.id("managerX_admin-calendar_search-query_input");
    By editTaskOption = By.id("managerX_admin-tasks_task-edit_icon");   By statusoftask = By.id("managerX_new-task_status_dropdown");   By selectStatusfortask = By.xpath("//*[@id=\"managerX_new-task_status_dropdown_1\"]/div/div");
    By addSubtaskBtn = By.id("managerX_new-task_add-subtask_button");   By subtaskFiel = By.id("managerX_new-task_new-note_textarea");  By createSubtaskbtn = By.id("managerX_new-task_new-note-create_button");
    By addsubnotebtn = By.id("managerX_new-task_add-note_button");  By subnotefield = By.id("managerX_new-task_note_textarea");     By createsubnoteBtn = By.id("managerX_new-task_note-create_button");
    By updateTaskCancelUcon = By.id("managerX_new-task_cancel_icon");   By removeTaskBtn = By.id("managerX_new-task_remove_button");    By contractLInk = By.id("managerX_master-page_contract_Link");
    By searcfieldOfcontrcat = By.id("managerX_admin-project-contract_search_input");    By notificationLink = By.id("managerX_master-page_notifications_Link");     By paginationOfnotification = By.xpath("//*[@id=\"managerX_admin-notification_paginator_section\"]/div/button[4]");
    By searchNotification = By.id("managerX_admin-notification_search_input");      By settingLink = By.id("managerX_master-page_settings_Link");   By nameField1Ofsetting = By.id("managerX_admin-settings_first-name_input");
    By namefield2Ofsetting = By.id("managerX_admin-settings_last-name_input");      By editprofileBtn = By.id("managerX_admin-settings_edit-profile_button");   By gobackBtn = By.id("CRM_Confirm_Buttons_Delete_BUTTON"); By accesslevelLink = By.id("managerX_master-page_access-Level-Settings_Link");
    By usertypenamefield1 = By.id("managerX_access-level_current-name_input");  By updateBtnofuserType = By.id("managerX_access-level_update_button");    By restoreBtn = By.id("managerX_access-level_restore_button");
    By addnewBtnofroleName = By.id("managerX_access-level_add-new_button");  By rolenameField = By.id("managerX_access-level_original-name_input");     By submitRoleName = By.id("managerX_access-level_submit_button");
    By selectpmOption1 = By.id("managerX_access-level_appUpdate-UserType_dropdown");    By selectpmforoption1 = By.id("managerX_access-level_appUpdate-UserType_dropdown_1");   By selectPmoption2 = By.xpath("//*[@id=\"managerX_access-level_Project-ManagerList_section\"]/p-dropdown");
    By selectPmforoption2 = By.xpath("/html/body/app-root/app-master-page/div/div/main/app-access-level/div/div[9]/div/p-dropdown/div/p-overlay/div/div/div/div/ul/p-dropdownitem[2]/li");  By stageLevelLink = By.id("managerX_master-page_stage-Level-Settings_Link");
    By addnewstageBtn = By.id("managerX_stage-level-component_add-stage-button");   By stageField = By.id("managerX_stage-level-component_stage-name_input");   By craetestageBtn = By.id("managerX_stage-level-component_create-stage_button");
    By addnewsubstageBtn = By.id("managerX_stage-level-component_add-sub-stage_button");    By substageField = By.id("managerX_stage-level-component_sub-stage-name_input");    By createSubstageBtn = By.id("managerX_stage-level-component_create-sub-stage_button");
    By addsubcategoryBtn = By.id("managerX_stage-level-component_add-sub-stage-category_button");   By createSubcategoryBtn = By.id("managerX_stage-level-component_create-sub-stage-category_button"); By subcategoryField = By.id("managerX_stage-level-component_sub-stage-category-name_input");

    WebDriver driver;

    public Pojo_file_for_login_as_admin_and_move_to_system(WebDriver driver) {
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

    //THis method used to move to clients , select pagination and search with valid name
    public boolean move_to_client_section_select_pagination(String invalidname){
        boolean status = true;
        try{
            driver.findElement(clientLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(propertyAddressdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectAddress1).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(propertyAddressdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectAddres2).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            try{
                driver.findElement(paginationIconOfclients).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            }catch (Exception ex){}

            driver.findElement(searchOption).sendKeys(invalidname);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                WebElement ele = driver.findElement(By.id("managerX_admin-projects_noRecords-empty_content"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("There are no records to display")){
                    Assert.assertEquals(true,true,"Display message when searching with invalid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display message when searching with invalid data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;
        }
    }

    //THis method used to search clients by valid firstname and fullname
    public boolean search_client_with_valid_data(String firstname, String fullname){
        boolean status = true;
        try{
            driver.findElement(searchOption).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchOption).sendKeys(firstname);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(searchOption).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchOption).sendKeys(fullname);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();

            try{
                WebElement ele = driver.findElement(By.id("managerX_admin-projects_client-fullname_text"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals(fullname)){
                    Assert.assertEquals(true,true,"Display client list when searching as firstname and full name");
                }else{
                    Assert.assertEquals(true,true,"Display message if there are no any records to display ");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display client list when searching as firstname and full name");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;
        }
    }

    //This method used to click submit button without data in add new client
    public boolean add_new_client_method1(){
        boolean status = true;
        try{
            driver.findElement(searchOption).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(addnewclient).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createBtnOfaddnewClient).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-client_Error_Message1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"When click submit button ithout filling required fields , display validations under fields");
                }

            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validations when click submit button ithout filling required fields , display validations under fields");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }

    }

    //This method used to enter invalid email of add new client section
    public boolean add_new_client_method2(String firstname, String lastname, String invalidEmail){
        boolean status = true;
        try{
            driver.findElement(firstnameofnewclient).sendKeys(firstname);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(lastnameofnewclient).sendKeys(lastname);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(emailofnewclient).sendKeys(invalidEmail);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createBtnOfaddnewClient).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-client_Error_Message4\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under email address field when entering invalid email");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation under email address field when entering invalid email");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }

    }

    //This method used to create new client
    public  boolean add_new_client_method3(String email ,String conNo, String streetAddress, String city, String state, String postcode) {
        boolean status = true;
        try {
            driver.findElement(emailofnewclient).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(emailofnewclient).sendKeys(email);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(contactnofornewclient).sendKeys(conNo);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(streetaddressofnewclient).sendKeys(streetAddress);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(cityfornewclient).sendKeys(city);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(statefornewclient).sendKeys(state);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(postcodefornewclient).sendKeys(postcode);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(countryfornewclient).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(countryfornewclient).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                driver.findElement(startdateoptionfornewclient).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(selectstartdatefornewclient).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(enddateoptionfornewclient).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(nextmonthoption).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(selectenddatefornewclient).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            }catch (Exception ex){}

            driver.findElement(createBtnOfaddnewClient).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(paginationIconOfclients).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }
    //This method used to open property address and select address
    public boolean open_property_address_option(){
        boolean status = true;
        try{
            driver.navigate().refresh();
            Thread.sleep(4000);
            driver.findElement(propertyAddressdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_master-page_display-address_dropdown_12")).isDisplayed()){
                    Assert.assertEquals(true, true,"Display newly created property inside list");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display newly created property address inside list");
            }
            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //his method user to edit selected client fromm list
    public boolean edit_cleint_from_list(String updatename){
        boolean status = true;
        try{
            try{
                driver.findElement(By.id("managerX_master-page_display-address_dropdown_12")).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();

            }catch (Exception ex){
                driver.findElement(propertyAddressdropdown).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            }
            driver.findElement(editClientOption).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(firstnameofnewclient).sendKeys(updatename);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createBtnOfaddnewClient).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to move contacts section and search with invalid data
    public boolean move_contacts_section(String invalidData){
        boolean status = true;
        try{
            driver.findElement(contactLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(propertyAddressdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectAddres2).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(paginationofContact).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchOptionofContact).sendKeys(invalidData);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_admin-contacts_no-records_text\"]/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display message when searching as invalid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display message when searching as invalid data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to search contact with valid firstname and fullname
    public boolean search_with_validdata_inside_contacts_section(String validData, String fullName){
        boolean status = true;
        try{
            driver.findElement(searchOptionofContact).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchOptionofContact).sendKeys(validData);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchOptionofContact).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchOptionofContact).sendKeys(fullName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                WebElement ele = driver.findElement(By.id("managerX_admin-contacts_name_text"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals(fullName)){
                    Assert.assertEquals(true,true,"Display contacts when searching with valid firstname/fullname");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display contacts when searching with valid firstname/fullname");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to click submit button without filling data of add new contact
    public boolean add_new_contact(){
        boolean status = true;
        try{
            driver.findElement(propertyAddressdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            try{
                driver.findElement(By.id("managerX_master-page_display-address_dropdown_12")).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();

            }catch (Exception ex){
                driver.findElement(By.id("managerX_master-page_display-address_dropdown_11")).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            }
            driver.findElement(searchOptionofContact).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(addnewContactBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(addnewcontactcard).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(submitBtnofaddnewContact).click();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-contact_error1\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations under required fields when click submit button without filling fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validations under required fields when click submit button without filling fields");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to enter invalid email for add new contact section
    public boolean add_new_contact_method2(String firstName, String lastName, String invalidemail){
        boolean status = true;
        try{
            driver.findElement(firstNameofcontact).sendKeys(firstName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(lastnameofContact).sendKeys(lastName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(emailforAddnewcontact).sendKeys(invalidemail);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(submitBtnofaddnewContact).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-contact_error4\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under email field when entering invalid email");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display validation under email field when entering invalid email");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //THis method used to add new contact from list
    public boolean add_new_contact_mehtod3(String email,String password, String contactno, String company){
        boolean status = true;
        try{
            driver.findElement(emailforAddnewcontact).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(emailforAddnewcontact).sendKeys(email);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(passwordforAddnewcontact).sendKeys(password);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(contactNoforAddnewcontact).sendKeys(contactno);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(roleoptionforAddnewcontact).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(roleoptionforAddnewcontact).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(companyNamefieldforAddnewcontact).sendKeys(company);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(submitBtnofaddnewContact).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-master-page/div/div/main/app-admin-contacts/div/div[2]/p-table/div/div/table/tbody"));
                String val = ele.getText();
                System.out.println(val);

                if(val.contains(email)){
                    Assert.assertEquals(true,true,"Display newly created contact from list");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display newly created contact from list");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to edit selected contact from list
    public boolean edit_contact_from_list(String updateName){
        boolean status = true;
        try{
            try {
                driver.findElement(editcontactOption).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(firstNameofcontact).sendKeys(updateName);
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(submitBtnofaddnewContact).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            }catch (Exception ex){
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-client_header_Title\"]/span")).isDisplayed()){
                    driver.findElement(By.id("managerX_new-client_first-Name_Input")).sendKeys(updateName);
                    Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                    driver.findElement(createBtnOfaddnewClient).click();
                    Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                }
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //THis method used to import contact for list
    public boolean import_contact_for_list(){
        boolean status =true;
        try{
            driver.findElement(addnewContactBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(importContactOption).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectsupplierOptionforImportConatct).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                driver.findElement(clcikplusIcon).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            }catch (Exception ex){
                driver.findElement(clickCloseicon).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(clickdeleteBtnofcontact).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(clcikplusIcon).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            }
            driver.findElement(backIconofimportContact).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(backIconofmanageContact).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //THis method used to move to stages list and search stages with invalid data
    public boolean move_to_stagesList_section(String invalidName){
        boolean status = true;
        try{
            driver.findElement(stagesLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(propertyAddressdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectAddres2).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(stagedropdownofstageList).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectstagefromdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            driver.findElement(searchFieldOfstagesList).sendKeys(invalidName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_admin-checklist_empty-SubStageCategoryDetails_content")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display message when searching with invalid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display message when searching with invalid data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to search stages with valid data
    public boolean search_stages_list(String validData){
        boolean status = true;
        try {
            driver.findElement(searchFieldOfstagesList).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchFieldOfstagesList).sendKeys(validData);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_admin-checklist_sub-stage-category_header")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display stages list sub stages list when searching with valid name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display stages list sub stages list when searching with valid name");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to move to task section, select pagination and search task with invalid data
    public boolean move_ta_task_section(String invalidData){
        boolean status =true;
        try{
            driver.findElement(taskLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(paginationOftasks).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchFieldoftask).sendKeys(invalidData);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_admin-tasks_noRecords_text")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display message when searching with invalid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display message when searching with invalid data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to search task with valid data
    public boolean search_task_with_validData(String validData){
        boolean status = true;
        try{
            driver.findElement(searchFieldoftask).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchFieldoftask).sendKeys(validData);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            try{
                WebElement ele = driver.findElement(By.id("managerX_admin-tasks_task-name_label"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals(validData)){
                    Assert.assertEquals(true,true,"Dispaly task when searching with valid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Dispaly task when searching with valid data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //THis method used click create task button of add new task
    public boolean add_new_task_method1(){
        boolean status = true;
        try{
            driver.findElement(searchFieldoftask).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(propertyAddressdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            try {
                driver.findElement(By.id("managerX_master-page_display-address_dropdown_12")).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            }catch (Exception ex){
                driver.findElement(By.id("managerX_master-page_display-address_dropdown_11")).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            }

            driver.findElement(addnewTaskbtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createBtnoftask).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-task_error_Message\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations under required fields when click submit button without filling fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display validations under required fields when click submit button without filling fields");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //THis method used to add new task from list
    public boolean add_new_task_method2(String validtaskName, String des){
        boolean status = true;
        try{
            driver.findElement(taskLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(addnewTaskbtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(taskName).sendKeys(validtaskName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(description).sendKeys(des);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

                driver.findElement(startdateOption).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                try{
                driver.findElement(selectStartDate).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(endDateoptionOftask).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(nextmonthOption).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(selectDuedate).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                }catch (Exception ex){}

            driver.findElement(supplierIcon).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(stagedropdownOftask).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            try {
                driver.findElement(selectStagefromOption).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            }catch (Exception ex){}
            driver.findElement(substageOption).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectSubstage).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(substageCategoryOption).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(substageCategory).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createBtnoftask).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            driver.findElement(calenderOption).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"managerX_admin-calendar_calendarOptions_calendar\"]/div[2]/div"));
                String val = ele.getText();
                System.out.println(val);

                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"Not display newly created task inside calender");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,true,"Display newly created task inside calender");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //THis method used to move to calender and search task
    public boolean move_to_calender_section(String invalidData){
        boolean status = true;
        try{
            driver.findElement(searchFieldOfcalender).sendKeys(invalidData);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"managerX_admin-calendar_calendarOptions_calendar\"]/div[2]/div"));
                String val = ele.getText();
                System.out.println(val);

                if(val.isEmpty()){
                    Assert.assertEquals(true,true,"When searching with invalid data clear the calender");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"When searching with invalid data not clear the calender");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to edit task from list
    public boolean edit_task_from_list(String updatetaskname){
        boolean status = true;
        try{
            driver.findElement(taskLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(editTaskOption).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(taskName).sendKeys(updatetaskname);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(statusoftask).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectStatusfortask).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(addSubtaskBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createSubtaskbtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(addsubnotebtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createsubnoteBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_new-task_new-note-error_message\"]/span")).isDisplayed() || driver.findElement(By.xpath("//*[@id=\"managerX_new-task_note-error_message\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations when click buttons of task and note without entering names");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validations when click buttons of task and note without entering names");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to edit task with entering sub task and sub note
    public boolean edit_task_with_entering_subTask_subNote(String subtaskName, String subnotename){
        boolean status = true;
        try{
            driver.findElement(subtaskFiel).sendKeys(subtaskName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createSubtaskbtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(subnotefield).sendKeys(subnotename);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createsubnoteBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(updateTaskCancelUcon).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(By.id("managerX_admin-tasks_task-status_checkbox")).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            driver.findElement(calenderOption).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(searchFieldOfcalender).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(taskLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(editTaskOption).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(removeTaskBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();

            try{
                if(driver.findElement(By.id("managerX_admin-tasks_noRecords_text")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display message of task list when deleting tasks");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display message of task list when deleting tasks");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //THis method used to move to contract and search with invalid/valid data
    public boolean move_to_contract_and_search(String invalidData, String validData){
        boolean status = true;
        try{
            driver.findElement(propertyAddressdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectAddres2).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(contractLInk).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searcfieldOfcontrcat).sendKeys(invalidData);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searcfieldOfcontrcat).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searcfieldOfcontrcat).sendKeys(validData);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to move to notification and search with invalid data
    public boolean move_to_notification_section(String invalidData){
        boolean status = true;
        try{
            driver.findElement(notificationLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(paginationOfnotification).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchNotification).sendKeys(invalidData);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_admin-notification_empty\"]/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display message under notification list when searching with invalid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display message under notification list when searching with invalid data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //THis method used to search notification with valid data and move to settings ,
    public boolean search_notification_from_list_move_to_setitngs(String validName){
        boolean status = true;
        try{
            driver.findElement(searchNotification).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchNotification).sendKeys(validName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(searchNotification).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(propertyAddressdropdown).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            try {
                driver.findElement(By.id("managerX_master-page_display-address_dropdown_12")).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            }catch (Exception ex){
                driver.findElement(By.id("managerX_master-page_display-address_dropdown_11")).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            }
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(settingLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(nameField1Ofsetting).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(namefield2Ofsetting).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(editprofileBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_admin-settings_first-name-error_message")).isDisplayed() ||driver.findElement(By.id("managerX_admin-settings_last-name-error_message")).isDisplayed()){
                    Assert.assertEquals(true,true,"Clear name fields and when click edit profile button , display validation under fields");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Clear name fields and when click edit profile button , not display validation under fields");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //This method used to update setting and move to access level and add
    public boolean update_setting_section_move_toAccess_level_section(String name1, String name2, String updateName){
        boolean status = true;
        try{
            driver.findElement(nameField1Ofsetting).sendKeys(name1);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(namefield2Ofsetting).sendKeys(name2);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(editprofileBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(gobackBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();

            driver.findElement(accesslevelLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout3000();
            driver.findElement(usertypenamefield1).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(updateBtnofuserType).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(restoreBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(usertypenamefield1).sendKeys(updateName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(updateBtnofuserType).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                WebElement ele = driver.findElement(usertypenamefield1);
                String val = ele.getAttribute("value");
                if(val.equals(updateName)){
                    Assert.assertEquals(true,true,"Updating and restoring user type name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Updating and restoring user type name");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }
//This method used to add new role for access level
    public boolean add_new_role_in_accessLevel(String roleName){
        boolean status =true;
        try{
            driver.findElement(addnewBtnofroleName).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(rolenameField).sendKeys(roleName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(submitRoleName).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectpmOption1).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(selectpmforoption1).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            try{
                driver.findElement(selectPmoption2).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
                driver.findElement(selectPmforoption2).click();
                Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    //Below method used to move stage level section and add , stage, sub stage and sub category
    public boolean move_to_stage_level_section(){
        boolean status = true;
        try{
            driver.findElement(By.id("managerX_new-task_cancel_icon")).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(stageLevelLink).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(addnewstageBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(craetestageBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_stage-level-component_stage-name_errorMessage")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under stage field when click button without name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation under stage field when click button without name");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    public boolean add_stage_and_move_to_subStage(String stageName){

        boolean status = true;
        try{
            driver.findElement(stageField).sendKeys(stageName);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(craetestageBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(By.id("managerX_stage-level-component_stage_stageObjList")).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(addnewsubstageBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createSubstageBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            try{
                if(driver.findElement(By.xpath("//*[@id=\"managerX_stage-level-component_sub-stage-name_error\"]/span")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under sub satge field without name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not Display validation under sub satge field without name");
            }
            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    public boolean add_sub_stage_and_move_to_sub_category_section(String substage){
        boolean status = true;
        try{
            driver.findElement(substageField).sendKeys(substage);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createSubstageBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(By.id("managerX_stage-level-component_sub-stage_subStageObj")).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(addsubcategoryBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createSubcategoryBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_stage-level-component_sub-stage-category-name_errorMessage")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under sub category field clcik button without entering name");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not Display validation under sub category field clcik button without entering name");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }

    public boolean create_sub_category_in_stage_level(String subcategory){
        boolean status = true;
        try{
            driver.findElement(subcategoryField).sendKeys(subcategory);
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();
            driver.findElement(createSubcategoryBtn).click();
            Pojo_file_for_login_as_admin_and_move_to_system.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status=false;
            return status;

        }
    }









}
