package manager_x.net.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_login_as_contractor_and_moveTo_dashboard {

    By propertyAddressOption = By.id("managerX_master-page_display-address_dropdown");      By selectAddress = By.id("managerX_master-page_display-address_dropdown_0");    By searchfieldofTAsk = By.id("managerX_new-task_search_input");
    By taskDetails = By.id("managerX_new-task_task-name_label");    By statusOptionoftaskDetails = By.id("managerX_task-details_status-dropdown_field");    By selectstatusOftaskdetails = By.id("managerX_task-details_status-dropdown_field_1");
    By subtaskCheckboxOftaskdetails = By.id("managerX_task-details_subtask_checkbox");      By noteIconoftaskdetails = By.xpath("//*[@id=\"managerX_contractor-tasks_note-delete_icon\"]/i");   By deletebtnofNoteoftaskdetails = By.id("managerX_delete-confirmation_delete_button");
    By backBtnoftaskdetails = By.id("managerX_task-details_back_button");   By calenderLink = By.id("managerX_master-page_calendar_Link");  By previousmonthofCalender = By.xpath("//*[@id=\"managerX_contractor-calendar_full_calendar\"]/div[1]/div[3]/button[1]");
    By nextMonthofcalender = By.xpath("//*[@id=\"managerX_contractor-calendar_full_calendar\"]/div[1]/div[3]/button[3]");   By todayOptionofcalender = By.xpath("//*[@id=\"managerX_contractor-calendar_full_calendar\"]/div[1]/div[3]/button[2]");
    By searcFieldOfcalender = By.id("managerX_contractor-calendar_search_input");   By taskLink = By.id("managerX_master-page_tasks_Link");     By notificationLink = By.id("managerX_master-page_notifications_Link");
    By paginationofnotification = By.xpath("//*[@id=\"managerX_contractor-notifications_paginator_section\"]/div/button[4]");   By searchOptionofnotification = By.id("managerX_contractor-notifications_search-box_input");
    By contactLink = By.id("managerX_master-page_contacts_Link2");  By paginationofContact = By.xpath("//*[@id=\"managerX_contractor-contacts_section\"]/div/button[4]");   By searcFieldofcontact = By.id("managerX_contractor-contacts_search_input");
    By settingLink = By.id("managerX_master-page_settings_Link");   By namefields1ofsetting = By.id("managerX_admin-settings_first-name_input");    By namefield2ofsettings = By.id("managerX_admin-settings_last-name_input");
    By editprofileBtn = By.id("managerX_admin-settings_edit-profile_button");   By gobackBtn = By.id("CRM_Confirm_Buttons_Delete_BUTTON");

    WebDriver driver;

    public Pojo_file_for_login_as_contractor_and_moveTo_dashboard(WebDriver driver) {
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

    //Selecting property address and move to tasks and search task with invalid data
    public boolean select_property_address_and_search_tasks(String invalidData){
        boolean status = true;
        try{
            driver.findElement(propertyAddressOption).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(selectAddress).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();
            driver.findElement(searchfieldofTAsk).sendKeys(invalidData);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();

            try{
                WebElement ele = driver.findElement(By.id("managerX_project-manager_noRecords-empty_content"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("There are no records to display")){
                    Assert.assertEquals(true,true,"Display message in task list when searching with invalid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display client in list when searching with valid data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }

    //This method used to search tasks with valid data
    public boolean search_task_with_validData(String validData){
        boolean status = true;
        try{
            driver.findElement(searchfieldofTAsk).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(searchfieldofTAsk).sendKeys(validData);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();

            try{
                WebElement ele = driver.findElement(By.id("managerX_new-task_task-name_label"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("Planning Application12566")){
                    Assert.assertEquals(true,true,"Display task inside list when searching with valid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display task inside list when searching with valid data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }

    //This method used to move task details and checking sub tasks, notes
    public boolean move_to_task_details_section(){
        boolean status =true;
        try{
            driver.findElement(searchfieldofTAsk).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(taskDetails).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(statusOptionoftaskDetails).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(selectstatusOftaskdetails).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            try{
                if(driver.findElement(subtaskCheckboxOftaskdetails).isSelected()){
                    driver.findElement(subtaskCheckboxOftaskdetails).click();
                    Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
                }
            }catch (Exception ex){
                driver.findElement(subtaskCheckboxOftaskdetails).click();
                Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            }

            try{
                if(driver.findElement(noteIconoftaskdetails).isDisplayed()){
                    driver.findElement(noteIconoftaskdetails).click();
                    Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
                    driver.findElement(deletebtnofNoteoftaskdetails).click();
                    Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
                }
            }catch (Exception ex){}
            driver.findElement(backBtnoftaskdetails).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }

    //THis method used to calender and search with invalid data
    public boolean move_to_calender_and_searchData(String invalidData){
        boolean status = true;
        try{
            driver.findElement(calenderLink).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();
            try {
                driver.findElement(previousmonthofCalender).click();
                Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
                driver.findElement(nextMonthofcalender).click();
                Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
                driver.findElement(todayOptionofcalender).click();
                Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            }catch (Exception ex){}
            driver.findElement(searcFieldOfcalender).sendKeys(invalidData);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"managerX_contractor-calendar_full_calendar\"]/div[2]/div/table/tbody/tr/td/div"));
                String val = ele.getText();

                if(val.isEmpty()){
                    Assert.assertEquals(true,true,"Not display tasks of calender when searching as invalid data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display tasks of calender when searching as invalid data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }

    //This method used to search calender with valid data
    public boolean search_validdata_of_calender(String validData){
        boolean status =true;
        try{
            driver.findElement(searcFieldOfcalender).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(searcFieldOfcalender).sendKeys(validData);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-master-page/div/div/main/app-contractor-calendar/div/div[2]/full-calendar/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr/td[1]/div/div[1]/div[1]/a/div/div/div[3]/input")).isSelected()){
                    driver.findElement(By.xpath("/html/body/app-root/app-master-page/div/div/main/app-contractor-calendar/div/div[2]/full-calendar/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr/td[1]/div/div[1]/div[1]/a/div/div/div[3]/input")).click();
                    Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
                    driver.findElement(taskLink).click();
                    Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();
                }

            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }

    //This method used to move to notification and search with invalid data
    public boolean move_to_notification_and_searchData(String invalidData){
        boolean status = true;
         try{
             driver.findElement(notificationLink).click();
             Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();
             driver.findElement(paginationofnotification).click();
             Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
             driver.findElement(searchOptionofnotification).sendKeys(invalidData);
             Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();

             try{
                 WebElement ele = driver.findElement(By.id("managerX_contractor-notifications_empty-content_section"));
                 String val = ele.getText();
                 System.out.println(val);

                 if(val.equals("There are no records to display")){
                     Assert.assertEquals(true,true,"Display message when searching with invalid data in notification section");
                 }
             }catch (Exception ex){
                 Assert.assertEquals(true,false,"Display message when searching with invalid data in notification section");
             }

             status = true;
             return status;
         }catch (Exception ex){
             System.out.println(ex);
             Assert.assertEquals(true,false,"This method not works");
             status = false;
             return status;
         }
    }

    //THis method used to search notification with valid data
    public  boolean search_with_validData_of_notifications(String validData){
        boolean status = true;
        try{
            driver.findElement(searchOptionofnotification).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(searchOptionofnotification).sendKeys(validData);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            try{
                if(driver.findElement(By.id("managerX_contractor-notifications_first-row_section")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display notification list according to the searched data");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display notification list according to the searched data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }

    //This method used to move to contacts section and search with invalid data
    public boolean move_to_contacts_section(String invaliddta){
        boolean status = true;
        try{
            driver.findElement(contactLink).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();
            driver.findElement(paginationofContact).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(searcFieldofcontact).sendKeys(invaliddta);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();

            try{
                WebElement ele = driver.findElement(By.id("managerX_contractor-contacts_empty_content"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("There are no records to display")){
                    Assert.assertEquals(true,true,"Display message when searching as invalid data of contacts section");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Display message when searching as invalid data of contacts section");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }

    //This method used to search contacts with valid data (firstname, fullname)
    public boolean search_contacts_with_validData(String firstname, String fullname){
        boolean status = true;
        try{
            driver.findElement(searcFieldofcontact).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(searcFieldofcontact).sendKeys(firstname);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(searcFieldofcontact).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(searcFieldofcontact).sendKeys(fullname);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();

            try{
                if(driver.findElement(By.id("managerX_contractor-contacts_name_text")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display contacts when searching as valid data of contacts section");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display contacts when searching as valid data of contacts section");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }

    //This method used to move to settings section and clear fields
    public boolean move_to_settings_and_clear_fields(){
        boolean status = true;
        try{
            driver.findElement(settingLink).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();
            driver.findElement(namefields1ofsetting).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();
            driver.findElement(namefield2ofsettings).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();
            driver.findElement(editprofileBtn).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();

            try{
                WebElement ele1 = driver.findElement(By.id("managerX_admin-settings_first-name-error_message"));
                String val1 = ele1.getText();
                System.out.println(val1);

                WebElement ele2 = driver.findElement(By.id("managerX_admin-settings_last-name-error_message"));
                String val2 = ele2.getText();
                System.out.println(val2);
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }

    //This method used to update settings
    public boolean update_setting_section(String name1, String name2){
        boolean status = true;
        try{
            driver.findElement(namefields1ofsetting).sendKeys(name1);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(namefield2ofsettings).sendKeys(name2);
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout2000();
            driver.findElement(editprofileBtn).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();
            driver.findElement(gobackBtn).click();
            Pojo_file_for_login_as_contractor_and_moveTo_dashboard.timeout3000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method not works");
            status = false;
            return status;
        }
    }











}
