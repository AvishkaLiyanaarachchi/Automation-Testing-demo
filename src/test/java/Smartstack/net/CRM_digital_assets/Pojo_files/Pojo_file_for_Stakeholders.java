package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.bouncycastle.crypto.signers.ISOTrailers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_Stakeholders {

    By rightIconofPagination = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div[2]/p-paginator/div/button[4]");   By leftIconofpagination = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div[2]/p-paginator/div/button[1]");
    By StakeholderRecord = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div[1]/div[2]/p-table/div/div/table/tbody/tr[1]");     By moveOptionofStakeholder = By.xpath("//*[@id=\"CRM_stakeholder-list_Content_1\"]/div/button");    By moveInput = By.id("CRM_stakeholder-list_Content_Overlay_INPUT_1");
    By moveBtn = By.id("CRM_stakeholder-list_Content_Move_BUTTON_1");   By recordsperpageOption = By.id("CRM_stakeholder-list_Top_page_dropdown");      By select20PerpageOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By select100PerpageOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[5]");
    By select15RecordsperpageOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By sortingOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div[1]/div[2]/p-table/div/div/table/thead/tr/th[4]/p-sorticon");
    By searchFieldInstakeholderList = By.id("CRM_dashboard_searchBox_INPUT");   By viewingOption = By.id("CRM_dashboard_Viewing_Dropdown"); By selectViewingOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/div[2]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By selectViewingOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/div[2]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By viewingOption3 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/div[2]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");   By viewStakeholderOption = By.id("CRM_dashboard_ViewStakeholder_treeview");
    By viewStakeholderOption1 = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND1");    By viewStakeholderOption2 = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND2");     By viewStakeholderOption3 = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND0");

    WebDriver driver;

    public Pojo_file_for_Stakeholders(WebDriver driver) {
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

    public static void timeout5000(){
        try{
            Thread.sleep(5000);
        }catch (Exception ex){}
    }


    public boolean test_pagination_and_move_option_of_stakeholderList(String arg1){
        boolean status = true;
        try{
                if(driver.findElement(StakeholderRecord).isDisplayed()){
                    driver.findElement(rightIconofPagination).click();
                    Pojo_file_for_Stakeholders.timeout2000();
                    driver.findElement(leftIconofpagination).click();
                    Pojo_file_for_Stakeholders.timeout3000();

                    driver.findElement(moveOptionofStakeholder).click();
                    Pojo_file_for_Stakeholders.timeout2000();
                    try {
                        driver.findElement(moveBtn).click();
                        Pojo_file_for_Stakeholders.timeout3000();
                        try {
                            if (driver.findElement(moveBtn).isEnabled()) {
                                Assert.assertEquals(true, false, "Enable move button without data to the move field");
                            }
                        } catch (Exception ex) {
                        }
                    }catch (Exception ex){
                        driver.findElement(moveInput).sendKeys(arg1);
                        Pojo_file_for_Stakeholders.timeout2000();
                        driver.findElement(moveBtn).click();
                        Pojo_file_for_Stakeholders.timeout3000();
                    }

                }else{
                    try {
                        WebElement ele = driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div/div[2]/div/span"));
                        String val = ele.getText();
                        System.out.println(val);
                        if(val.equals("There are no records to display")){
                            Assert.assertEquals(true, false, "Display message as 'There are no records to display");
                        }

                    }catch (Exception ex){
                        Assert.assertEquals(true, false, "Not display message , if not display stakeholder list");
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

    public boolean test_records_perpage_option_and_sorting_option(){
        boolean status = true;
        try{
            driver.findElement(recordsperpageOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try {
                driver.findElement(select20PerpageOption).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(rightIconofPagination).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(recordsperpageOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(select100PerpageOption).click();
            }catch(Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(rightIconofPagination).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(recordsperpageOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try {
                driver.findElement(select15RecordsperpageOption).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();

            status = true;
            return status;

        }catch (Exception ex){
            Assert.assertEquals(true,false,"Not display records per page option");
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_search_option_of_stakeholderList(String invalidData, String firstName, String lastName, String emailAddress, String fullName){
        boolean status = true;
        try{
            driver.findElement(searchFieldInstakeholderList).sendKeys(invalidData);
            Pojo_file_for_Stakeholders.timeout3000();
            driver.findElement(searchFieldInstakeholderList).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_Stakeholders.timeout3000();
            driver.findElement(searchFieldInstakeholderList).sendKeys(firstName);
            Pojo_file_for_Stakeholders.timeout3000();
            driver.findElement(searchFieldInstakeholderList).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_Stakeholders.timeout3000();
            driver.findElement(searchFieldInstakeholderList).sendKeys(lastName);
            Pojo_file_for_Stakeholders.timeout3000();
            driver.findElement(searchFieldInstakeholderList).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_Stakeholders.timeout3000();
            driver.findElement(searchFieldInstakeholderList).sendKeys(emailAddress);
            Pojo_file_for_Stakeholders.timeout3000();
            driver.findElement(searchFieldInstakeholderList).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_Stakeholders.timeout3000();
            driver.findElement(searchFieldInstakeholderList).sendKeys(fullName);
            Pojo_file_for_Stakeholders.timeout3000();

            try {
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-stakeholder-list/div/div/div[2]/div/span"));
                String val = ele.getText();
                System.out.println(val);
                if(val.equals("There are no records to display")){
                    Assert.assertEquals(true, false, "When searching with full name , not display stakeholder");
                }

            }catch (Exception ex){}

            status = true;
            return status;

        }catch (Exception ex){
            Assert.assertEquals(true,false,"Search option not display as disable");
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_viewing_and_view_stakeholder_options(){
        boolean status  = true;
        try{
            driver.findElement(searchFieldInstakeholderList).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_Stakeholders.timeout5000();
            driver.findElement(viewingOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(selectViewingOption1).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(viewingOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(selectViewingOption2).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(viewingOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(viewingOption3).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(viewingOption).click();
            Pojo_file_for_Stakeholders.timeout2000();

            driver.findElement(viewStakeholderOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(viewStakeholderOption1).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(rightIconofPagination).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(leftIconofpagination).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(viewStakeholderOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(viewStakeholderOption2).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(rightIconofPagination).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(leftIconofpagination).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(viewStakeholderOption).click();
            Pojo_file_for_Stakeholders.timeout2000();
            driver.findElement(viewStakeholderOption3).click();
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(rightIconofPagination).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();
            try{
                driver.findElement(leftIconofpagination).click();
            }catch (Exception ex){}
            Pojo_file_for_Stakeholders.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            Assert.assertEquals(true,false,"viewing and view stakeholder options display as disable");
            System.out.println(ex);
            status = false;
            return status;
        }
    }


}
