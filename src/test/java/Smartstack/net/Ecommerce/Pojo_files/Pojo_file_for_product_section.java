package Smartstack.net.Ecommerce.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_product_section {

    By searchField = By.id("eCommerce_product_Search_INPUT");   By recordsperPageOption = By.id("eCommerce_product-list_ProductOptions_date_dropdown");     By rightSideofpagination = By.xpath("//*[@id=\"eCommerce_product-list_Paginator\"]/div/button[4]");
    By leftSideofpagination = By.xpath("//*[@id=\"eCommerce_product-list_Paginator\"]/div/button[1]");      By selectRecordsperPage1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-product-list/div/div[1]/div/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By selectRecordsperpage2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-product-list/div/div[1]/div/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");
    By selectRecordsPerpageOption3 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-product-list/div/div[1]/div/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[5]");
    By moveOption = By.xpath("//*[@id=\"eCommerce_product-list_Move_Icon_1\"]/button");     By moveInput = By.id("eCommerce_product-list_Move_INPUT_1");    By moveBtn = By.id("eCommerce_product-list_Move_BUTTON_1");
    By sortingOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-product-list/div/div[1]/div/div[2]/p-table/div/div/table/thead/tr/th[4]/p-sorticon");
    By addProductOption = By.id("eCommerce_product-list_AddProduct_BUTTON");    By importProductOption = By.id("eCommerce_product-list_ProductOptions_ImportProduct");  By impottBtn = By.id("eCommerce_add-import-product_Import_BUTTON");
    By uploadFileOption = By.id("eCommerce_add-import-product_Upload_BUTTON");  By uploadIcon1 = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-add-import-product/div/app-nopopup-upload-file/div/div[2]/div[1]/div[2]/div");
    By uploadIcon2 = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-add-import-product/div/app-nopopup-upload-file/div/div[2]/div[1]/div[4]/div");
    By cancelBtnOfuploadOption = By.id("eCommerce_nopopup-upload-file_button-section-section_Upload-selected-files_BUTTON2");   By canelBtnOfimportOption = By.id("eCommerce_add-import-product_Close_BUTTON");     By exportOption = By.id("eCommerce_product-list_ProductOptions_ExportProduct");
    By chekboxForexportOption1 = By.id("eCommerce_add-export-product_Excel_CHECKBOX");  By checkboxForexportOption2 = By.id("eCommerce_add-export-product_XML_CHECKBOX");   By savebTn = By.id("eCommerce_add-export-product_Save_BUTTON");
    By featuredOption = By.id("eCommerce_product-list_Featured_BUTTON_0");  By visibleOption = By.id("eCommerce_product-list_Visible_BUTTON_0");    By cloneOption = By.id("eCommerce_product-list_Duplicate_BUTTON_0");
    By deleteOption = By.id("eCommerce_product-list_Delete_BUTTON_0"); By deleteBtn = By.id("Elements_alert-box_Delete_BUTTON");    By faturedTab = By.id("eCommerce_dashboard_Bar_1");
    By allTab = By.id("eCommerce_dashboard_Bar_0");     By notvisibleTab = By.id("eCommerce_dashboard_Bar_4");
    WebDriver driver;

    public Pojo_file_for_product_section(WebDriver driver) {
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
    public boolean test_select_paginations_of_product(){
        boolean status = true;
        try{
            try {
                if (driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-product-list/div/div[1]/div/div[2]/p-table/div/div/table/tbody")).isDisplayed()) {
                    driver.findElement(rightSideofpagination).click();
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(leftSideofpagination).click();
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(recordsperPageOption).click();
                    Pojo_file_for_product_section.timeout2000();
                    try {
                        driver.findElement(selectRecordsperPage1).click();
                        Pojo_file_for_product_section.timeout2000();
                    }catch(Exception ex){}
                    driver.findElement(recordsperPageOption).click();
                    Pojo_file_for_product_section.timeout2000();
                    try{
                        driver.findElement(selectRecordsperpage2).click();
                        Pojo_file_for_product_section.timeout2000();
                    }catch (Exception ex){}
                    driver.findElement(recordsperPageOption).click();
                    Pojo_file_for_product_section.timeout2000();
                    try{
                        driver.findElement(selectRecordsPerpageOption3).click();
                        Pojo_file_for_product_section.timeout2000();
                    }catch (Exception ex){}

                }
            }catch (Exception ex){
                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "If not display product , display message as 'Sorry, no matching results found.");
                    }
                }catch (Exception ex1){
                    Assert.assertEquals(true,false,"Not display message , if not display products");
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

    public boolean test_search_product_section(String invalidData, String firstName, String lastName){
        boolean status = true;
        try{
            try {
                if(driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-product-list/div/div[1]/div/div[2]/p-table/div/div/table/tbody")).isDisplayed()) {
                    driver.findElement(searchField).sendKeys(invalidData);
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(searchField).sendKeys(firstName);
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(searchField).sendKeys(lastName);
                    Pojo_file_for_product_section.timeout2000();

                    try{
                        WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                        String val = ele.getText();
                        System.out.println(val);

                        if(val.equals("Sorry, no matching results found.")){
                            Assert.assertEquals(true,false,"When searching with last name , display message as 'Sorry, no matching results found.");
                        }
                    }catch (Exception ex){}
                }
            }catch (Exception ex){
                try{
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals("Sorry, no matching results found.")){
                        Assert.assertEquals(true,false,"If not display records , display message as 'Sorry, no matching results found.");
                    }
                }catch (Exception ex1){
                    Assert.assertEquals(true,false,"Not display message , if not display records");
                }

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status= false;
            return status;
        }

    }

    public boolean test_search_product_with_fullname(String fullName) {
        boolean status = true;
        try {
            try {
                driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_product_section.timeout2000();
                driver.findElement(searchField).sendKeys(fullName);
                Pojo_file_for_product_section.timeout2000();

                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "When searching with full name , not display product and display message as 'Sorry, no matching results found.");
                    }
                } catch (Exception ex) {
                }


            } catch (Exception ex) {
                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "If not display records , display message as 'Sorry, no matching results found.");
                    }
                } catch (Exception ex1) {
                    Assert.assertEquals(true, false, "Not display message , if not display records");
                }

            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_search_product_with_vendorName(String vendorName){
        boolean status = true;
        try {
            try {
                driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_product_section.timeout2000();
                driver.findElement(searchField).sendKeys(vendorName);
                Pojo_file_for_product_section.timeout2000();

                    try {
                        WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                        String val = ele.getText();
                        System.out.println(val);

                        if (val.equals("Sorry, no matching results found.")) {
                            Assert.assertEquals(true, false, "When searching with vendor name , display message as 'Sorry, no matching results found.");
                        }
                    } catch (Exception ex) {
                    }

            } catch (Exception ex) {
                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "If not display records , display message as 'Sorry, no matching results found.");
                    }
                } catch (Exception ex1) {
                    Assert.assertEquals(true, false, "Not display message , if not display records");
                }

            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_option_of_product(String invaliddata){
        boolean status = true;
        try{
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_product_section.timeout2000();
            try {
                if (driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-product-list/div/div[1]/div/div[2]/p-table/div/div/table/tbody")).isDisplayed()) {
                    driver.findElement(moveOption).click();
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(moveInput).sendKeys(invaliddata);
                    Pojo_file_for_product_section.timeout2000();

                    try {
                        if (driver.findElement(moveBtn).isEnabled()) {
                            Assert.assertEquals(true, false, "Move button is enabled invalid data in move field");
                        }
                    } catch (Exception ex) {
                    }
                }
            }catch (Exception ex){
                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "If not display records , display message as 'Sorry, no matching results found.");
                    }
                } catch (Exception ex1) {
                    Assert.assertEquals(true, false, "Not display message , if not display records");
                }
            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_option_inside_product_list(String validData){
        boolean status = true;
        try{
            try {
                if (driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-product-list/div/div[1]/div/div[2]/p-table/div/div/table/tbody")).isDisplayed()) {
                    driver.findElement(moveInput).clear();
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(moveInput).sendKeys(validData);
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(moveBtn).click();
                    Pojo_file_for_product_section.timeout2000();
                    try {
                        driver.findElement(sortingOption).click();
                        Pojo_file_for_product_section.timeout2000();
                    }catch (Exception ex){}
                }
            }catch (Exception ex){
                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "If not display records , display message as 'Sorry, no matching results found.");
                    }
                } catch (Exception ex1) {
                    Assert.assertEquals(true, false, "Not display message , if not display records");
                }
            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_import_products(){
        boolean status = true;
        try{
            driver.findElement(addProductOption).click();
            Pojo_file_for_product_section.timeout2000();
            driver.findElement(importProductOption).click();
            Pojo_file_for_product_section.timeout2000();
            driver.findElement(impottBtn).click();
            Pojo_file_for_product_section.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-add-import-product/div/div[5]/div[3]/label"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("CSV file is not uploaded!")){
                    driver.findElement(uploadFileOption).click();
                    Pojo_file_for_product_section.timeout2000();
                    try{
                        driver.findElement(uploadIcon1).click();
                        Pojo_file_for_product_section.timeout2000();
                        driver.findElement(uploadIcon2).click();
                        Pojo_file_for_product_section.timeout2000();

                        try{
                            WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-add-import-product/div/app-nopopup-upload-file/div/div[2]/div[2]"));
                            String val1 = ele1.getText();
                            if(val1.isEmpty()){
                                Assert.assertEquals(true,false,"Not display validation as without implementation when click upload option");
                            }
                        }catch (Exception ex){}
                    }catch (Exception ex){}

                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation when click save button without uploading files");
            }
            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_export_products_section(){
        boolean status = true;
        try{
            driver.findElement(cancelBtnOfuploadOption).click();
            Pojo_file_for_product_section.timeout2000();
            driver.findElement(canelBtnOfimportOption).click();
            Pojo_file_for_product_section.timeout2000();
            driver.findElement(exportOption).click();
            Pojo_file_for_product_section.timeout2000();
            try{
                if(driver.findElement(chekboxForexportOption1).isSelected()){
                    driver.findElement(savebTn).click();
                    Pojo_file_for_product_section.timeout2000();
                }
            }catch (Exception ex) {
                driver.findElement(chekboxForexportOption1).click();
                Pojo_file_for_product_section.timeout2000();
                driver.findElement(checkboxForexportOption2).click();
                Pojo_file_for_product_section.timeout2000();
                driver.findElement(savebTn).click();
                Pojo_file_for_product_section.timeout2000();

                try{
                    if(! (driver.findElement(savebTn).isDisplayed())){
                        Assert.assertEquals(true,false,"Closing export product section when unselect options and click save button");
                    }
                }catch (Exception ex1){}
            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_featured_visible_outOFstock_options_in_product_section(){
        boolean status = true;
        try{
            try{
                driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_product_section.timeout2000();
            if (driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div[3]/app-product-list/div/div[1]/div/div[2]/p-table/div/div/table/tbody")).isDisplayed()) {
                driver.findElement(featuredOption).click();
                Pojo_file_for_product_section.timeout2000();
                driver.findElement(faturedTab).click();
                Pojo_file_for_product_section.timeout3000();
                driver.findElement(allTab).click();
                Pojo_file_for_product_section.timeout3000();

                driver.findElement(visibleOption).click();
                Pojo_file_for_product_section.timeout2000();
                driver.findElement(notvisibleTab).click();
                Pojo_file_for_product_section.timeout3000();
                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "When featured and not visible products , not display inside featured and not visible tabs");
                    }
                } catch (Exception ex) {
                    driver.findElement(allTab).click();
                    Pojo_file_for_product_section.timeout3000();
                    driver.findElement(cloneOption).click();
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(rightSideofpagination).click();
                    Pojo_file_for_product_section.timeout2000();
                    driver.findElement(deleteOption).click();
                    Pojo_file_for_product_section.timeout3000();
                    driver.findElement(deleteBtn).click();
                    Pojo_file_for_product_section.timeout3000();

                }
            }
            }catch(Exception ex) {
                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "If not display records , display message as 'Sorry, no matching results found.");
                    }
                } catch (Exception ex1) {
                    Assert.assertEquals(true, false, "Not display message , if not display records");
                }
            }

            status = true;
            return status;
        }catch (Exception ex) {
            System.out.println(ex);
            status = false;
            return status;
        }
    }



}
