package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Pojo_file_for_add_edit_leads {

    By addNewStakeholderbtn = By.id("CRM_lead-list_AddNew_BUTTON");     By statusOption = By.id("CRM_new-stakeholder-details_StatusSection_Selected");  By selectstatus = By.xpath("//*[@id=\"CRM_new-stakeholder-details_StatusSection_Dropdown_status_2\"]/span");
    By addStatuslink = By.id("CRM_new-stakeholder-details_StatusSection_AddNew_BUTTON");    By addStatusField = By.id("CRM_new-stakeholder-details_AddNewStatus_INPUT");    By updateStatusBtn = By.id("CRM_new-stakeholder-details_AddNewStatus_ButtonSection_Update_BUTTON");
    By searchField = By.id("CRM_dashboard_searchBox_INPUT");        By cancelBtn = By.id("CRM_new-stakeholder-details_Buttons_Cancel_BUTTON");      By updateBtn = By.id("CRM_new-stakeholder-details_Buttons_Update_BUTTON");
    By editOption = By.id("CRM_stakeholder-list_Content_Update_BUTTON_0");
    WebDriver driver;

    public Pojo_file_for_add_edit_leads(WebDriver driver) {
        this.driver = driver;
    }
    public  static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    public  static void timeout3000(){
        try{
            Thread.sleep(3000);
        }catch (Exception ex){}
    }

    public boolean test_move_to_addnew_stakeholder_section(){
        boolean status = true;
        try{
            driver.findElement(addNewStakeholderbtn).click();
            Pojo_file_for_add_edit_leads.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the add new stakeholder section");
            status = false;
            return status;
        }
    }
    public boolean test_select_status_in_add_new_lead(String arg1){
        boolean status = true;
        try{
            driver.findElement(statusOption).click();
            Pojo_file_for_add_edit_leads.timeout2000();
            try {
                WebElement ele = driver.findElement(selectstatus);
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("Hot lead")) {
                    driver.findElement(selectstatus).click();
                    Pojo_file_for_add_edit_leads.timeout2000();
                }
            }catch (Exception ex){
                driver.findElement(addStatuslink).click();
                Pojo_file_for_add_edit_leads.timeout2000();
                driver.findElement(statusOption).click();
                Pojo_file_for_add_edit_leads.timeout2000();
                driver.findElement(addStatusField).sendKeys(arg1);
                Pojo_file_for_add_edit_leads.timeout2000();
                driver.findElement(updateStatusBtn).click();

                List<WebElement> elements = driver.findElements(By.xpath("//div[@id='CRM_new-stakeholder-details_StatusSection_Dropdown']/div"));
                int numOfRecordsList = elements.size();
                int numOfRecords = (numOfRecordsList -1);
                System.out.println(numOfRecordsList);

                driver.findElement(By.xpath("//*[@id=\"CRM_new-stakeholder-details_StatusSection_Dropdown_status_8\"]/span")).click();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the add new stakeholder section");
            status = false;
            return status;
        }
    }

    public boolean test_search_newlead(String arg1){
        boolean status = true;
        try{
            try{
                driver.findElement(updateBtn).click();
                Pojo_file_for_add_edit_leads.timeout2000();
                driver.findElement(cancelBtn).click();
                Pojo_file_for_add_edit_leads.timeout2000();
            }catch (Exception ex){}

            driver.findElement(searchField).sendKeys(arg1);
            Pojo_file_for_add_edit_leads.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_clear_searchField(){
        boolean status = true;
        try{
            try {
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div/div[2]/div/span"));
                String val = ele.getText();
                System.out.println(val);

                if (val.equals("There are no records to display")) {
                    driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                    Pojo_file_for_add_edit_leads.timeout3000();
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
