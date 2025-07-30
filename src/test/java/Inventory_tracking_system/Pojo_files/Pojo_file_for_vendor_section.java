package Inventory_tracking_system.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Pojo_file_for_vendor_section {

    By vendorLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/ul/li[4]/a");   By searchOptionofVendor = By.id("inventory-system_vendor_search_INPUT");    By addVendorOption = By.id("inventory-system_vendor_add-new-vendor_BUTTON");
    By saveBtnofaddvendor = By.id("inventory-system_add-new-vendor_save_BUTTON");   By vendorNameField = By.id("inventory-system_add-new-vendor_name_INPUT");   By editOptionofVendor = By.id("inventory-system_vendor_edit_BUTTON7");
    By editoption2Ofvendor = By.id("inventory-system_vendor_edit_BUTTON1");     By updateBtnOfvendor = By.id("inventory-system_add-new-vendor_update_BUTTON");    By deleteOptionofSelectedVendor = By.id("inventory-system_add-new-vendor_delete_BUTTON");
    By yesBtnOfdeleteOption = By.xpath("//*[@id=\"productModal\"]/div/div/app-new-vendor/p-confirmdialog/div/div/div[3]/button[2]");
    WebDriver driver;

    public Pojo_file_for_vendor_section(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    //This method used to vendor section and searched vendor by invalid data
    public boolean moveTo_vendor_search_vendor_by_invalidData(String invalidData){
        boolean status =  true;
        try{
            driver.findElement(vendorLink).click();
            Thread.sleep(4000);
            driver.findElement(searchOptionofVendor).sendKeys(invalidData);
            Pojo_file_for_vendor_section.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-vendor/div/div[1]/div/div[2]/div/div/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display message inside vendor table when searching as invalid data");
                }else {
                    Assert.assertEquals(true,false,"Not display message inside vendor table when searching as invalid data");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not works");
            status = false;
            return status;
        }
    }

    //This method used to searched vendor with valid data
    public boolean search_vendor_with_validData(String validData){
        boolean status = true;
        try{
            driver.findElement(searchOptionofVendor).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_vendor_section.timeout2000();
            driver.findElement(searchOptionofVendor).sendKeys(validData);
            Pojo_file_for_vendor_section.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-vendor/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[1]")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display vendor inside list when searching with valid data");
                }else{
                    Assert.assertEquals(true,false,"Not display vendor inside list when searching with valid data");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }
            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not works");
            status = false;
            return status;
        }
    }

    //This method used to move to add vendor and click save button without filling data
    public boolean moveTo_add_vendor_and_click_saveBtn_without_data(){
        boolean status = true;
        try{
            driver.findElement(searchOptionofVendor).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_vendor_section.timeout2000();
            driver.findElement(addVendorOption).click();
            Pojo_file_for_vendor_section.timeout2000();
            driver.findElement(saveBtnofaddvendor).click();
            Pojo_file_for_vendor_section.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"productModal\"]/div/div/app-new-vendor/div[1]/div/div/div/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under vendor name field when click save button without vendor name");
                }else{
                    Assert.assertEquals(true,false,"Not display validation under vendor name field when click save button without vendor name");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }
            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not works");
            status = false;
            return status;
        }
    }

    //This method used to create new vendor
    public  boolean create_new_vendor_inside_list(String vendor){
        boolean status = true;
        try{
            try{
                driver.findElement(addVendorOption).click();
                Pojo_file_for_vendor_section.timeout2000();
                driver.findElement(vendorNameField).sendKeys(vendor);
                Pojo_file_for_vendor_section.timeout2000();
                driver.findElement(saveBtnofaddvendor).click();
                Pojo_file_for_vendor_section.timeout2000();

            }catch (Exception ex){}

            driver.findElement(vendorNameField).sendKeys(vendor);
            Pojo_file_for_vendor_section.timeout2000();
            driver.findElement(saveBtnofaddvendor).click();
            Pojo_file_for_vendor_section.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-vendor/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody"));
                String val = ele.getText();
                System.out.println(val);
                if(val.contains(vendor)){
                    Assert.assertEquals(true,true,"Display newly created vendor inside list");
                }else{
                    Assert.assertEquals(true,false,"Not display newly created vendor inside list");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not works");
            status = false;
            return status;
        }
    }
    //This method used move to update vendor and clear field and click update button
    public boolean edit_selected_vendor_inside_list_method1(){
        boolean status = true;
        try{
            try {
                List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pn_id_35-table\"]/tbody"));
                System.out.println(rows);

                List<WebElement> rows1 = driver.findElements(By.xpath("//*[@id=\"pn_id_35-table\"]/tbody//tr[1]"));
                System.out.println(rows1);
            }catch (Exception ex){}
            try {
                driver.findElement(editOptionofVendor).click();
                Pojo_file_for_vendor_section.timeout2000();
            }catch (Exception ex){
                driver.findElement(editoption2Ofvendor).click();
                Pojo_file_for_vendor_section.timeout2000();
            }

            driver.findElement(vendorNameField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_vendor_section.timeout2000();
            driver.findElement(updateBtnOfvendor).click();
            Pojo_file_for_vendor_section.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"productModal\"]/div/div/app-new-vendor/div[1]/div/div/div/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"When click update button without vendor name , display validation");
                }else{
                    Assert.assertEquals(true,false,"When click update button without vendor name , display validation");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not works");
            status = false;
            return status;
        }
    }

    //This method used to update selected vendor from list
    public boolean edit_selected_vendor_from_list_method2(String vendor){
        boolean status = true;
        try{
            driver.findElement(vendorNameField).sendKeys(vendor);
            Pojo_file_for_vendor_section.timeout2000();
            driver.findElement(updateBtnOfvendor).click();
            Pojo_file_for_vendor_section.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-vendor/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody"));
                String val = ele.getText();
                System.out.println(val);
                if(val.contains(vendor)){
                    Assert.assertEquals(true,true,"Display updated vendor inside list");
                }else{
                    Assert.assertEquals(true,false,"Not display updated vendor inside list");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not works");
            status = false;
            return status;
        }
    }

    //This method used to delete selected from list
    public boolean deleting_selected_vendor_from_list(){
        boolean status  = true;
        try{
            try {
                List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pn_id_1-table\"]/tbody"));
                System.out.println(rows);

                List<WebElement> rows1 = driver.findElements(By.xpath("//*[@id=\"pn_id_1-table\"]/tbody/tr[1]"));
                System.out.println(rows1);
            }catch (Exception ex){}

            try {
                driver.findElement(editOptionofVendor).click();
                Pojo_file_for_vendor_section.timeout2000();
            }catch (Exception ex){
                driver.findElement(editoption2Ofvendor).click();
                Pojo_file_for_vendor_section.timeout2000();
            }
            driver.findElement(deleteOptionofSelectedVendor).click();
            Pojo_file_for_vendor_section.timeout2000();
            WebElement ele = driver.findElement(yesBtnOfdeleteOption);
            String val = ele.getCssValue("background-color");
            driver.findElement(yesBtnOfdeleteOption).click();
            Thread.sleep(4000);


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not works");
            status = false;
            return status;
        }

    }
}
