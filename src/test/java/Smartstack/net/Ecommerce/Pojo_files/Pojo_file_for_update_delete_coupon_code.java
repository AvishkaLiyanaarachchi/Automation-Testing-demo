package Smartstack.net.Ecommerce.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_update_delete_coupon_code {

    By editOptionofcouponcode = By.id("eCommerce_coupon-codes_Buttons_Edit_0");     By couponNameInput = By.id("eCommerce_create-coupon-code_CouponName_INPUT");    By selectPurchasedAmountOption1 = By.id("MPA");
    By selecdtPurchasedAmountOption2 = By.id("MQA");    By minimumItemOption = By.id("eCommerce_create-coupon-code_DiscountOption_SelectedDiv_INPUT_2");    By minimumPurchasedAmountInput = By.id("eCommerce_create-coupon-code_DiscountOption_SpecificCustomer_INPUT_1");
    By usageLimitOption1 = By.id("eCommerce_create-coupon-code_UsageLimit_CHECKBOX_0");     By usageLimitOption2 = By.id("eCommerce_create-coupon-code_UsageLimit_CHECKBOX_1");     By usageLimitInput = By.id("eCommerce_create-coupon-code_UsageLimit_Checked_INPUT_1");
    By usageLimitOption3 = By.id("eCommerce_create-coupon-code_UsageLimit_CHECKBOX_2");     By usageLimitInput2 = By.id("eCommerce_create-coupon-code_UsageLimit_Total_INPUT_2");   By customerEligibilityOption1 = By.id("EVERY$ONE");
    By customerEligibilityOption2 = By.id("SEPCIFIC$STACHOLDER");    By specificStakeholderOption = By.id("Elements_services_tree_view_main");      By selectStakeholderGroup1 = By.id("Elements_services_tree_view_Checkbox0");
    By customerEligibilityOption3 = By.id("SPECIFIC$CUSTOMER");     By specofocStakehodlerDropdown = By.id("eCommerce_create-coupon-code_CustomerEligibility_Selected_2");      By staekhodlerGroupOption = By.id("authentication_add-stakeholder_treeView");
    By selectGroup1 = By.id("eCommerce_tree-view_Checkbox-section_INPUT");  By selectGroup2 = By.id("eCommerce_tree-view_Checkbox-section_INPUT");      By timeOption = By.id("eCommerce_create-coupon-code_ExpiryDate_From_Time_dropdown");
    By selectTimeOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-coupon-codes/div/div/app-create-coupon-code/div/div[2]/div/div[5]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]/li/span");
    By assignproductCAtegoryBtn = By.id("eCommerce_create-coupon-code_AssignProducts_BUTTON");      By updateBtnofAssignProductCategory = By.id("eCommerce_assign-product-Update_BUTTON");  By checkboxofProductCategory = By.id("eCommerce_assign-product-category_Select_CHECKBOX_0");
    By saveButton = By.id("eCommerce_create-coupon-code_Save_BottomSection_BUTTON");    By discountField = By.id("eCommerce_create-coupon-code_DiscountValue_INPUT");   By cloneIcon = By.id("eCommerce_coupon-codes_Buttons_Duplicate_0");
    By deleteicon = By.id("eCommerce_coupon-codes_Buttons_Delete_0");   By deleteBtn = By.id("Elements_alert-box_Delete_BUTTON");       By rightSidepagination = By.xpath("//*[@id=\"eCommerce_coupon-codes_Paginator\"]/div/button[4]");
    By cancelBtnOfcouponCode = By.id("eCommerce_create-coupon-code_Buttons_Cancel");

    WebDriver driver;
    public Pojo_file_for_update_delete_coupon_code(WebDriver driver) {
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

    public boolean test_update_couponCode_section1(String updateName, String amount, String item, String usageLimit, String usageLimit1){
        boolean status = true;
        try{
            try {
                if (driver.findElement(By.xpath("//*[@id=\"pr_id_8-table\"]/tbody")).isDisplayed()) {
                    driver.findElement(editOptionofcouponcode).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(couponNameInput).sendKeys(updateName);
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(selectPurchasedAmountOption1).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(minimumPurchasedAmountInput).sendKeys(amount);
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(selecdtPurchasedAmountOption2).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(minimumItemOption).sendKeys(item);
                    Pojo_file_for_update_delete_coupon_code.timeout2000();

                    driver.findElement(usageLimitOption1).click();
                    Pojo_file_for_coupon_code.timeout2000();
                    driver.findElement(usageLimitOption2).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(usageLimitInput).sendKeys(usageLimit);
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(usageLimitOption3).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(usageLimitInput2).sendKeys(usageLimit1);
                    Pojo_file_for_update_delete_coupon_code.timeout2000();

                    driver.findElement(customerEligibilityOption1).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(customerEligibilityOption2).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(specificStakeholderOption).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(selectStakeholderGroup1).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                    driver.findElement(specificStakeholderOption).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();

                    try {
                        WebElement ele = driver.findElement(specificStakeholderOption);
                        String val = ele.getText();
                        System.out.println(val);

                        if (val.isEmpty()) {
                            Assert.assertEquals(true, false, "Not display selected stakeholder group inside dropdown");
                        }
                    } catch (Exception ex) {
                    }
                }else{}
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

   public boolean test_update_couponCode_section2(){
        boolean status = true;
        try{
            driver.findElement(timeOption).click();
            driver.findElement(timeOption).click();
            Pojo_file_for_update_delete_coupon_code.timeout2000();
            try{
                if(driver.findElement(selectTimeOption).isDisplayed()){
                    driver.findElement(selectTimeOption).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display time options when open start and end time");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the edit coupon code section");
            status = false;
            return status;
        }
   }

   public boolean test_update_couponCode_section3(String value){
        boolean status = true;
        try{
            driver.findElement(assignproductCAtegoryBtn).click();
            Pojo_file_for_update_delete_coupon_code.timeout2000();
            driver.findElement(updateBtnofAssignProductCategory).click();
            Pojo_file_for_update_delete_coupon_code.timeout2000();
            try {
                driver.findElement(checkboxofProductCategory).click();
                Pojo_file_for_update_delete_coupon_code.timeout2000();
                driver.findElement(updateBtnofAssignProductCategory).click();
                Pojo_file_for_update_delete_coupon_code.timeout2000();
                driver.findElement(saveButton).click();
                Pojo_file_for_update_delete_coupon_code.timeout2000();
                driver.findElement(discountField).clear();
                Pojo_file_for_update_delete_coupon_code.timeout2000();
                driver.findElement(discountField).sendKeys(value);
                Pojo_file_for_update_delete_coupon_code.timeout2000();
                driver.findElement(saveButton).click();
                Pojo_file_for_update_delete_coupon_code.timeout2000();

                try{
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"eCommerce_create-coupon-code_Buttons\"]/label"));
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals("Select set advance Start and End date!")){
                        Assert.assertEquals(true,false,"Display validation when click save button with filling required field");
                    }
                }catch (Exception ex){}

            }catch (Exception ex){
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"onBtnPrintClickprint\"]/div[3]/div[3]/label"));
                String val = ele.getText();
                if(! (val.equals("Product category not selected!"))){
                    Assert.assertEquals(true,false,"Not display validation when click update button without select product category");
                }
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Can't move to the edit coupon code section");
            status = false;
            return status;
        }
   }


   public boolean test_clone_and_delete_coupon_code(){
        boolean status = true;
        try{
            try{
                try{
                    driver.findElement(cancelBtnOfcouponCode).click();
                    Pojo_file_for_update_delete_coupon_code.timeout2000();
                }catch (Exception ex){}
                if (driver.findElement(By.xpath("//*[@id=\"pr_id_8-table\"]/tbody")).isDisplayed()) {
                    driver.findElement(cloneIcon).click();
                    Pojo_file_for_update_delete_coupon_code.timeout3000();
                    try{
                        driver.findElement(rightSidepagination).click();
                        Pojo_file_for_update_delete_coupon_code.timeout2000();
                    }catch (Exception ex){
                    }
                    driver.findElement(deleteicon).click();
                    Pojo_file_for_update_delete_coupon_code.timeout3000();
                    driver.findElement(deleteBtn).click();
                    Pojo_file_for_update_delete_coupon_code.timeout3000();
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





}
