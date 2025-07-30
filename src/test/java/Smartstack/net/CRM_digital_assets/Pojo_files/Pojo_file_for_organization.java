package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.bouncycastle.crypto.signers.ISOTrailers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_organization {

    By rightSidePagination = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div[2]/p-paginator/div/button[4]");     By leftSidePagination = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div[2]/p-paginator/div/button[1]");
    By moveOption = By.id("CRM_organisation-list_Move_icon_1");     By moveInput = By.id("CRM_organisation-list_Move_INPUT_1");     By moveBtn = By.id("CRM_organisation-list_Move_BUTTON_1");      By sortingOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div[1]/div[2]/p-table/div/div/table/thead/tr/th[4]/p-sorticon");
    By recordsperPageOption = By.id("CRM_organisation-list_PerPage_dropdown");  By recordsperPageoption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By recordsperpageOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By recordsperpageoption3 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[5]");
    By serchOption = By.id("CRM_dashboard_searchBox_INPUT");    By viewingOption = By.id("CRM_dashboard_Viewing_Dropdown");     By selectViewingoption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/div[2]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By selectViewingOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[2]/div[2]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[5]");     By viewStakeholder = By.id("Elements_services_tree_view_main");
    By selectViewStakeholderOption1 = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND1");      By selectViewStakeholderoption3 = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND2");
    WebDriver driver;

    public Pojo_file_for_organization(WebDriver driver) {
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
    public boolean test_organization_list(String arg1){
        boolean status = true;
        try{
            if(driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div[1]/div[2]/p-table/div/div/table/tbody/tr[1]")).isDisplayed()){
                driver.findElement(rightSidePagination).click();
                Pojo_file_for_organization.timeout2000();
                driver.findElement(leftSidePagination).click();
                Pojo_file_for_organization.timeout2000();

                driver.findElement(moveOption).click();
                Pojo_file_for_organization.timeout2000();
                try{
                    driver.findElement(moveBtn).click();
                    Pojo_file_for_organization.timeout3000();

                    Assert.assertEquals(true,false,"Click move button, without data to move field");
                }catch (Exception ex){
                    driver.findElement(moveInput).sendKeys(arg1);
                    Pojo_file_for_organization.timeout2000();
                    driver.findElement(moveBtn).click();
                    Pojo_file_for_organization.timeout2000();
                }
            }else{
                try{
                    WebElement  ele= driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div/div[2]/div/span"));
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals("There are no records to display")){
                        Assert.assertEquals(true,false,"Not display organization list and display  message as 'There are no records to display'");
                    }
                }catch (Exception ex){
                    Assert.assertEquals(true,false,"Not display message, If not display organization list");
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

    public boolean test_records_per_page_option(){
        boolean status = true;
        try{
            try{
                driver.findElement(sortingOption).click();
                Pojo_file_for_organization.timeout2000();
            }catch (Exception ex){System.out.println(ex);}
            driver.findElement(recordsperPageOption).click();
            Pojo_file_for_organization.timeout2000();
            try {
                driver.findElement(recordsperPageoption1).click();
            }catch (Exception ex){}
            Pojo_file_for_organization.timeout3000();
            driver.findElement(recordsperPageOption).click();
            Pojo_file_for_organization.timeout2000();
            try{
                driver.findElement(recordsperpageOption2).click();
                Pojo_file_for_organization.timeout3000();
                driver.findElement(rightSidePagination).click();
                Pojo_file_for_organization.timeout3000();
            }catch (Exception ex){}
            driver.findElement(recordsperPageOption).click();
            Pojo_file_for_organization.timeout2000();
            try{
                driver.findElement(recordsperpageoption3).click();
                Pojo_file_for_organization.timeout3000();
            }catch (Exception ex){}

            try{
                WebElement  ele= driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div/div[2]/div/span"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("There are no records to display")){
                    Assert.assertEquals(true,false,"Not display organization list and display  message as 'There are no records to display'");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display organization list so not display records per page options");
            status = false;
            return status;
        }
    }

    public boolean test_search_option(String invalidData, String fitrstNameData, String lastNameData, String fullName){
        boolean status = true;
        try{
            driver.findElement(serchOption).sendKeys(invalidData);
            Pojo_file_for_organization.timeout3000();
            driver.findElement(serchOption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_organization.timeout3000();
            driver.findElement(serchOption).sendKeys(fitrstNameData);
            Pojo_file_for_organization.timeout3000();
            driver.findElement(serchOption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_organization.timeout3000();
            driver.findElement(serchOption).sendKeys(lastNameData);
            Pojo_file_for_organization.timeout3000();
            driver.findElement(serchOption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_organization.timeout3000();
            driver.findElement(serchOption).sendKeys(fullName);
            Pojo_file_for_organization.timeout3000();
            driver.findElement(serchOption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_organization.timeout3000();

            try{
                WebElement  ele= driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[3]/app-organisation-list/div/div/div[2]/div/span"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("There are no records to display")){
                    Assert.assertEquals(true,false,"Not display organization list when searching with full name and main contact name");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display organization list");
            status = false;
            return status;
        }
    }

    public boolean test_viewing_and_view_stakeholder(){
        boolean status = true;
        try{
            driver.findElement(serchOption).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_organization.timeout3000();
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

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display organization list");
            status = false;
            return status;
        }
    }




}
