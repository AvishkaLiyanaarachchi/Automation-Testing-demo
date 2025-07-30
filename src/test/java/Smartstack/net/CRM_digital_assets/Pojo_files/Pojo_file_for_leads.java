package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.bouncycastle.crypto.signers.ISOTrailers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_leads {

    By rightSidePAgination =By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-lead-list/div/div[2]/p-paginator/div/button[4]");      By leftsidepagination = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-lead-list/div/div[2]/p-paginator/div/button[1]");
    By moveOption = By.id("CRM_lead-list_Move_icon_1");     By moveInput = By.id("CRM_lead-list_Move_INPUT_1");     By moveBtn = By.id("CRM_lead-list_Move_BUTTON_1");      By recordsperpageOption = By.id("CRM_lead-list_rowsPerPage_dropdown");
    By selectRecordsperpAge1= By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-lead-list/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By selectRecordsperpage2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-lead-list/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[4]");
    By searchoption = By.id("CRM_dashboard_searchBox_INPUT");    By viewingOption = By.id("CRM_dashboard_Viewing_Dropdown");     By selectViewingoption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/div[2]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By selectViewingOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/div[2]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[5]");     By viewStakeholder = By.id("Elements_services_tree_view_main");
    By selectViewStakeholderOption1 = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND1");      By selectViewStakeholderoption3 = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND2");      By organizationTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[1]/div/app-tab-view/div/div[2]/span");
    By leadsTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[1]/div/app-tab-view/div/div[3]/span");   By selectViewStakeholderoption = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND0");
    By sortingOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-lead-list/div/div[1]/div[2]/p-table/div/div/table/thead/tr/th[4]/p-sorticon");

    WebDriver driver;

    public Pojo_file_for_leads(WebDriver driver)  {
        this.driver = driver;
    }

    public static  void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    public static  void timeout3000(){
        try{
            Thread.sleep(3000);
        }catch (Exception ex){}
    }

    public  boolean test_pagination_and_move_option_lead_list(String arg1){
        boolean status = true;
        try{
            if(driver.findElement(By.id("pr_id_8-table")).isDisplayed()){
                driver.findElement(rightSidePAgination).click();
                Pojo_file_for_leads.timeout2000();
                driver.findElement(leftsidepagination).click();
                Pojo_file_for_leads.timeout2000();
                driver.findElement(moveOption).click();
                Pojo_file_for_leads.timeout2000();
                try{
                    if(driver.findElement(moveBtn).isEnabled()){
                        Assert.assertEquals(true,false,"Move button is enable without data to move field");
                    }
                }catch (Exception ex){
                    driver.findElement(moveInput).sendKeys(arg1);
                    Pojo_file_for_leads.timeout2000();
                    driver.findElement(moveBtn).click();
                }
            }else{
                try{
                    WebElement ele=  driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-lead-list/div/div/div[2]/div/span"));
                    String val1 = ele.getText();
                    if(val1.equals("There are no records to display")){
                        Assert.assertEquals(true,false,"Not dispaly lead list and display message as 'There are no records to display'");
                    }
                }catch (Exception ex){
                    Assert.assertEquals(true,false,"Not display message , if not display leads list");
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

    public  boolean test_leads_list_with_records_per_page_options(){
        boolean status = true;
        try{
            driver.findElement(recordsperpageOption).click();
            Pojo_file_for_leads.timeout2000();
            try {
                driver.findElement(selectRecordsperpAge1).click();
            }catch (Exception ex){}
            Pojo_file_for_leads.timeout2000();
            driver.findElement(rightSidePAgination).click();
            Pojo_file_for_leads.timeout2000();
            driver.findElement(recordsperpageOption).click();
            Pojo_file_for_leads.timeout2000();
            try {
                driver.findElement(selectRecordsperpage2).click();
            }catch (Exception ex){}
            Pojo_file_for_leads.timeout2000();

            try{
                WebElement ele= driver.findElement(By.xpath("//*[@id=\"CRM_lead-list_Content_41\"]/span/span"));
                String val= ele.getText();
                System.out.println(val);

                if(val.equals("42")){
                    Assert.assertEquals(true,false,"When selecting records per page option, not display correct count of leads\n\n"+
                            "Ex:- When selecting records per page option as 40, display 42 lead list");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display leads list");
            status = false;
            return status;
        }

    }

    public boolean test_search_lead_list(String firstName,String lastName , String fullname, String email){
        boolean status = true;
        try{
            driver.findElement(searchoption).sendKeys(firstName);
            Pojo_file_for_leads.timeout3000();
            driver.findElement(searchoption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_leads.timeout3000();
            driver.findElement(searchoption).sendKeys(lastName);
            Pojo_file_for_leads.timeout3000();
            driver.findElement(searchoption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_leads.timeout3000();
            driver.findElement(searchoption).sendKeys(email);
            Pojo_file_for_leads.timeout3000();
            driver.findElement(searchoption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_leads.timeout3000();
            driver.findElement(searchoption).sendKeys(fullname);
            Pojo_file_for_leads.timeout3000();

            try{
                WebElement ele= driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-lead-list/div/div/div[2]/div/span"));
                String val = ele.getText();
                System.out.println(val);
                if(val.equals("There are no records to display")){
                    Assert.assertEquals(true,false,"When searching leads list with full name , not display records.");
                }
            }catch(Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display leads list");
            status = false;
            return status;
        }

    }

    public boolean test_search_with_invaliddata_in_leadList(String invalidData){
        boolean status = true;
        try{
            driver.findElement(searchoption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_leads.timeout3000();
            driver.findElement(searchoption).sendKeys(invalidData);
            Pojo_file_for_leads.timeout3000();
            driver.findElement(searchoption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_leads.timeout3000();
            try{
                WebElement ele= driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-lead-list/div/div/div[2]/div/span"));
                String val = ele.getText();
                System.out.println(val);
                if(val.equals("There are no records to display")){
                    Assert.assertEquals(true,false,"When searching leads list with invalid data and clear search field , not display all records.");
                }
            }catch(Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display leads list");
            status = false;
            return status;
        }
    }

    public boolean test_viewing_and_view_stakeholder(){
        boolean status = true;
        try{
            driver.findElement(organizationTab).click();
            Pojo_file_for_leads.timeout3000();
            driver.findElement(leadsTab).click();
            Pojo_file_for_leads.timeout3000();
            driver.findElement(viewingOption).click();
            Pojo_file_for_organization.timeout3000();
            try{
                driver.findElement(selectViewingoption).click();
                Pojo_file_for_organization.timeout3000();
            }catch (Exception ex){}
            driver.findElement(viewingOption).click();
            Pojo_file_for_organization.timeout3000();
            try{
                driver.findElement(selectViewingOption2).click();
                Pojo_file_for_organization.timeout3000();
            }catch (Exception ex){}

            driver.findElement(viewStakeholder).click();
            Pojo_file_for_organization.timeout3000();
            try {
                driver.findElement(selectViewStakeholderOption1).click();
            }catch (Exception ex){}
            Pojo_file_for_organization.timeout3000();
            try {
                driver.findElement(selectViewStakeholderoption3).click();
            }catch(Exception ex){}
            Pojo_file_for_organization.timeout3000();
            try{
                driver.findElement(selectViewStakeholderoption).click();
            }catch(Exception ex){}
            Pojo_file_for_organization.timeout3000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display leads list");
            status = false;
            return status;
        }
    }

    public boolean test_sorting_option_of_lead_list(){
        boolean status = true;
        try{
            driver.findElement(sortingOption).click();
            Pojo_file_for_leads.timeout3000();
            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-lead-list/div/div/div[2]/p-table/div/div/table/tbody"));
                String val = ele.getText();

                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"When click sort option of lead list, hide everything");
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



}
