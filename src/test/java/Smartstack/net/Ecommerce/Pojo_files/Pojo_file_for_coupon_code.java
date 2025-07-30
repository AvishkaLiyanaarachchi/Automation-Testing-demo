package Smartstack.net.Ecommerce.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_coupon_code {

    By rightsidepagination = By.xpath("//*[@id=\"eCommerce_coupon-codes_Paginator\"]/div/button[4]");   By leftsidepagination = By.xpath("//*[@id=\"eCommerce_coupon-codes_Paginator\"]/div/button[1]");
    By recordsperpageOption = By.id("eCommerce_coupon-codes_page_dropdown");    By selectRecordspEprpage1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div/div/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By selectRecordsperpageOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div/div/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[4]");
    By sortingOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div[1]/div/div[2]/p-table/div/div/table/thead/tr/th[4]/p-sorticon");
    By moveOption = By.id("eCommerce_coupon-code_move-icon_BUTTON");    By moveInput = By.id("eCommerce_coupon-codes_Move_INPUT_1");    By moveBtn = By.id("eCommerce_coupon-codes_Move_BUTTON_1");
    By statusOption1 = By.id("eCommerce_coupon-codes_Status_INPUTSWITCH_0");    By statusOption2 = By.id("eCommerce_coupon-codes_Status_INPUTSWITCH_1");    By addCouponCodeBtn = By.id("eCommerce_coupon-codes_CreateCoupon_BUTTON");
    By saveBtnOfAddCoupon = By.id("eCommerce_create-coupon-code_Buttons_Save");    By couponNameField = By.id("eCommerce_create-coupon-code_CouponName_INPUT");     By COUPONcODEfIELD = By.id("eCommerce_create-coupon-code_CouponCode_INPUT");
    By discountTypeOption = By.id("eCommerce_create-coupon-code_DiscountType_dropdown");    By fixedAmountOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div/app-create-coupon-code/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By discountValueField = By.id("eCommerce_create-coupon-code_DiscountPrice_INPUT");  By discountTypeOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div/app-create-coupon-code/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By countrySelectionoption = By.id("eCommerce_create-coupon-code_CountrySelect_Multiselect");    By Selectcountry = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div/app-create-coupon-code/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/p-multiselect/div/div[4]/div/ul/p-multiselectitem[2]/li/div[1]/div");
    By discountOptionType3 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div/app-create-coupon-code/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[4]");
    By selectProductsBtn = By.id("eCommerce_create-coupon-code_AssignY_Select_BUTTON");     By selectBtnOfselectProduct = By.id("eCommerce_select-products_emarketing_Select_BUTTON");      By seelctProductinTable = By.id("eCommerce_select-products_Type_Name_0");
    By selectCheckboxForProduct = By.id("eCommerce_select-products_emarketing_Move_CHECKBOX_0");    By selectCheckbox1Ofproduct = By.id("eCommerce_select-products_emarketing_Move_CHECKBOX_1");    By startDateOption = By.id("eCommerce_create-coupon-code_ExpiryDate_Start");
    By selectStartDate = By.xpath("//*[@id=\"eCommerce_create-coupon-code_ExpiryDate_From_Calendar\"]/span/div/div/div/div[2]/table/tbody/tr[3]/td[4]");    By endDtaeOption = By.id("eCommerce_create-coupon-code_ExpiryDate_EndDate_Date");
    By clickRightSideOption = By.xpath("//*[@id=\"eCommerce_create-coupon-code_ExpiryDate_EndDate_Div_Calendar\"]/span/div/div/div/div[1]/button[2]/span");     By selectEndDate = By.xpath("//*[@id=\"eCommerce_create-coupon-code_ExpiryDate_EndDate_Div_Calendar\"]/span/div/div/div/div[2]/table/tbody/tr[5]/td[5]");
    By selectSTardDatecheckbox = By.id("eCommerce_create-coupon-code_ExpiryDate_CHECKBOX");     By selectEnddateCheckbox = By.id("eCommerce_create-coupon-code_ExpiryDate_EndDate_CHECKBOX");   By startTimeOption = By.id("eCommerce_create-coupon-code_ExpiryDate_From_Time_dropdown");
    By selectStartTime1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div/app-create-coupon-code/div/div[2]/div/div[5]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]/li/span");
    By endTimeOption = By.id("eCommerce_create-coupon-code_ExpiryDate_EndDate_Time_dropdown");     By selectEndtime = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div/app-create-coupon-code/div/div[2]/div/div[5]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]/li/span");

    WebDriver driver;

    public Pojo_file_for_coupon_code(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    public boolean test_select_paginations_and_recordsperpage_options(){
        boolean status = true;
        try{
            try {
               /* /html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div[1]/div/div[2]/p-table/div/div/table/tbody*/
                if(driver.findElement(By.xpath("//*[@id=\"pr_id_8-table\"]/tbody")).isDisplayed()) {
                    driver.findElement(rightsidepagination).click();
                    Pojo_file_for_coupon_code.timeout2000();
                    driver.findElement(leftsidepagination).click();
                    Pojo_file_for_coupon_code.timeout2000();
                    try{
                        driver.findElement(sortingOption).click();
                        Pojo_file_for_coupon_code.timeout2000();
                    }catch (Exception ex){}
                    driver.findElement(recordsperpageOption).click();
                    Pojo_file_for_coupon_code.timeout2000();
                    try {
                        driver.findElement(selectRecordspEprpage1).click();
                        Pojo_file_for_coupon_code.timeout2000();
                    }catch (Exception ex){}
                    driver.findElement(recordsperpageOption).click();
                    Pojo_file_for_coupon_code.timeout2000();
                    try {
                        driver.findElement(selectRecordsperpageOption2).click();
                        Pojo_file_for_coupon_code.timeout2000();
                    }catch (Exception ex){}

                    try {
                        WebElement ele = driver.findElement(recordsperpageOption);
                        String val = ele.getText();
                        System.out.println(val);
                        if (val.equals("20 records per page")) {
                            Assert.assertEquals(true, false, "When selecting records per page option , not display  selected records per page inside dropdown");
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
                        Assert.assertEquals(true, false, "If not display coupon code , display message as 'Sorry, no matching results found.");
                    }
                }catch (Exception ex1){
                    Assert.assertEquals(true,false,"Not display message , if not display coupon code list");
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

    public boolean test_select_move_option_of_couponList(String invaliddata, String arg1){
        boolean status = true;
        try {
            try {
                if (driver.findElement(By.xpath("//*[@id=\"pr_id_8-table\"]/tbody")).isDisplayed()) {
                    driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div[1]/div/div[2]/p-table/div/div/table/tbody/tr[2]/td[2]/div/button")).click();
                    Pojo_file_for_coupon_code.timeout2000();
                    driver.findElement(moveInput).sendKeys(invaliddata);
                    Pojo_file_for_coupon_code.timeout2000();
                    try {
                        if (driver.findElement(moveBtn).isEnabled()) {
                            Assert.assertEquals(true, false, "When entering invalid data to move field , not enable move button");
                        }
                    } catch (Exception ex) {
                        driver.findElement(moveInput).clear();
                        Pojo_file_for_coupon_code.timeout2000();
                        driver.findElement(moveInput).sendKeys(arg1);
                        Pojo_file_for_coupon_code.timeout2000();
                        driver.findElement(moveBtn).click();
                        Pojo_file_for_coupon_code.timeout2000();

                    }
                }
            } catch (Exception ex) {
                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "If not display coupon code , display message as 'Sorry, no matching results found.");
                    }
                } catch (Exception ex1) {
                    Assert.assertEquals(true, false, "Not display message , if not display coupon code list");
                }
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_select_status_option(){
        boolean status = true;
        try{
            try {
                if (driver.findElement(By.xpath("//*[@id=\"pr_id_8-table\"]/tbody")).isDisplayed()) {
                    driver.findElement(statusOption1).click();
                    Pojo_file_for_coupon_code.timeout2000();
                    driver.findElement(statusOption2).click();
                    Pojo_file_for_coupon_code.timeout2000();
                }
            }catch (Exception ex) {
                try {
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals("Sorry, no matching results found.")) {
                        Assert.assertEquals(true, false, "If not display coupon code , display message as 'Sorry, no matching results found.");
                    }
                } catch (Exception ex2) {
                    Assert.assertEquals(true, false, "Not display message , if not display coupon code list");
                }
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_add_couponCode_section(String invalidData, String validData){
        boolean status = true;
        try{
            driver.findElement(addCouponCodeBtn).click();
            Pojo_file_for_coupon_code.timeout2000();
            driver.findElement(saveBtnOfAddCoupon).click();
            Pojo_file_for_coupon_code.timeout2000();
            driver.findElement(couponNameField).sendKeys(invalidData);

            try{
                WebElement ele = driver.findElement(couponNameField);
                String val = ele.getAttribute("value");

                if(val.equals(invalidData)){
                    Assert.assertEquals(true,false,"Enter invalid data to create coupon code");
                }
            }catch (Exception ex){
                driver.findElement(couponNameField).sendKeys(validData);
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Add coupon code button displays as disabled");
            status = false;
            return status;
        }
    }

    public  boolean test_create_coupon_code_section1(String arg1, String discountValue){
        boolean status = true;
        try{
            driver.findElement(COUPONcODEfIELD).sendKeys(arg1);
            Pojo_file_for_coupon_code.timeout2000();
            driver.findElement(discountTypeOption).click();
            Pojo_file_for_coupon_code.timeout2000();
            try{
                driver.findElement(fixedAmountOption).click();
                Pojo_file_for_coupon_code.timeout2000();
            }catch (Exception ex){}
            driver.findElement(discountValueField).sendKeys(discountValue);
            Pojo_file_for_coupon_code.timeout2000();
            driver.findElement(discountTypeOption).click();
            Pojo_file_for_coupon_code.timeout2000();
            try {
                driver.findElement(discountTypeOption2).click();
                Pojo_file_for_coupon_code.timeout2000();
            }catch (Exception ex){}

            driver.findElement(countrySelectionoption).click();
            Pojo_file_for_coupon_code.timeout2000();
            try{
                driver.findElement(Selectcountry).click();
                Pojo_file_for_coupon_code.timeout2000();
            }catch (Exception ex){}
            driver.findElement(discountTypeOption).click();
            Pojo_file_for_coupon_code.timeout2000();
            try {
                driver.findElement(discountOptionType3).click();
                Pojo_file_for_coupon_code.timeout2000();
            }catch (Exception ex){}

            driver.findElement(selectProductsBtn).click();
            Pojo_file_for_coupon_code.timeout2000();
            driver.findElement(selectBtnOfselectProduct).click();
            Pojo_file_for_coupon_code.timeout2000();
            try{
                driver.findElement(seelctProductinTable).click();
                Pojo_file_for_coupon_code.timeout2000();
                driver.findElement(selectCheckboxForProduct).click();
                Pojo_file_for_coupon_code.timeout2000();
                driver.findElement(selectCheckbox1Ofproduct).click();
                Pojo_file_for_coupon_code.timeout2000();
            }catch (Exception ex){}
            driver.findElement(selectBtnOfselectProduct).click();
            Pojo_file_for_coupon_code.timeout2000();
            driver.findElement(saveBtnOfAddCoupon).click();
            Pojo_file_for_coupon_code.timeout2000();


            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Add coupon code button displays as disabled");
            status = false;
            return status;
        }
    }

    public boolean test_create_coupon_code_section2(){
        boolean status = true;
        try{
            driver.findElement(startDateOption).click();
            Pojo_file_for_coupon_code.timeout2000();
            try{
                driver.findElement(selectStartDate).click();
                Pojo_file_for_coupon_code.timeout2000();
            }catch (Exception ex){}
            driver.findElement(endDtaeOption).click();
            Pojo_file_for_coupon_code.timeout2000();
            try {
                driver.findElement(clickRightSideOption).click();
                Pojo_file_for_coupon_code.timeout2000();
                driver.findElement(selectEndDate).click();
                Pojo_file_for_coupon_code.timeout2000();
            }catch (Exception ex){}
            driver.findElement(saveBtnOfAddCoupon).click();
            Pojo_file_for_coupon_code.timeout2000();
            driver.findElement(selectSTardDatecheckbox).click();
            Pojo_file_for_coupon_code.timeout2000();
            driver.findElement(selectEnddateCheckbox).click();
            Pojo_file_for_coupon_code.timeout2000();
            driver.findElement(startTimeOption).click();
            driver.findElement(startTimeOption).click();
            Pojo_file_for_coupon_code.timeout2000();

            try{
                if(driver.findElement(selectStartTime1).isDisplayed()){
                    driver.findElement(selectStartTime1).click();
                    Pojo_file_for_coupon_code.timeout2000();
                    driver.findElement(saveBtnOfAddCoupon).click();
                    Pojo_file_for_coupon_code.timeout2000();

                }else{
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display start time options and end time options when click start time and end time");
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Add coupon code button displays as disabled");
            status = false;
            return status;
        }
    }

    public boolean test_create_coupon_code(){
        boolean status = true;
        try{
            try {
               driver.findElement(saveBtnOfAddCoupon).click();
               Pojo_file_for_coupon_code.timeout2000();
               try{
                   WebElement ele = driver.findElement(By.xpath("//*[@id=\"eCommerce_create-coupon-code_Buttons\"]/label"));
                   String val = ele.getText();
                   System.out.println(val);
                   if(val.equals("Select set advance Start and End date!")){
                       Assert.assertEquals(true,false,"After filling all required fields of add coupon code section , display validation, not creating coupon code");
                   }
               }catch (Exception ex){}
            }catch (Exception ex){}

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }
}
