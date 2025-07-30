package Smartstack.net.Ecommerce.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class POjo_file_for_quantity_discount {

    By createQuantiytDiscount = By.id("eCommerce_quantity-discounts_Create_BUTTON");    By saveBTnofCreateQuantityDiscount = By.id("eCommerce_create-quantity-discounts_Buttons_Save");     By discountTitle = By.id("eCommerce_create-quantity-discounts_Discount_INPUT");
    By discountyTypeOption = By.id("eCommerce_create-quantity-discounts_DiscountType_dropdown");    By discoutnValue = By.id("eCommerce_create-quantity-discounts_DiscountValue_INPUT");    By fixedAmountOption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-quantity-discounts/div/div/app-create-quantity-discount/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By discountType2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-quantity-discounts/div/div/app-create-quantity-discount/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By countryOption = By.id("eCommerce_create-quantity-discounts_Country_dropdown");   By selectCountryOption1 = By.xpath("//*[@id=\"eCommerce_create-quantity-discounts_Country_dropdown\"]/div/div[4]/div/ul/p-multiselectitem[2]/li/div[1]/div");
    By discountType3 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-quantity-discounts/div/div/app-create-quantity-discount/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[4]");
    By selectProductBtn = By.id("eCommerce_create-quantity-discounts_SelectProduct_BUTTON");    By selectBtn = By.id("eCommerce_select-products_emarketing_Select_BUTTON");     By selectProduct = By.id("eCommerce_select-products_Type_Name_0");
    By maximumQuantityOption = By.id("eCommerce_create-quantity-discounts_MaximumQuantity_CHECKBOX_1");     By maximumInput = By.id("eCommerce_create-quantity-discounts_MaximumQuantity_INPUT");   By usageLimitOption1 = By.id("eCommerce_create-quantity-discounts_UsageLimit_CHECKBOX_0");
    By usageLimit2 = By.id("eCommerce_create-quantity-discounts_UsageLimit_CHECKBOX_1");    By usageLimitInput = By.id("eCommerce_create-quantity-discounts_UsageLimit_INPUT_1");   By customerEligibilityOption2 = By.id("SEPCIFIC$STACHOLDER");
    By stakehodlerGroupOption = By.id("eCommerce_create-quantity-discounts_Eligibility_treeView_1");    By selectStakeholder = By.id("eCommerce_tree-view_Checkbox-section_INPUT");     By customerEligibilityOption3 = By.id("SPECIFIC$CUSTOMER");
    By specificCustomwerOption = By.id("eCommerce_create-quantity-discounts_Eligibility_Customer_click_2");     By stakehodlerGroupOptionOfspecificCustomer = By.id("authentication_add-stakeholder_treeView");     By selectGroupOfspecificCustomer = By.id("eCommerce_tree-view_Checkbox-section_INPUT");
    By searchField = By.id("eCommerce_add-select-stakeholder_Search_INPUT");    By updateBtnOfcustomerEligibility = By.id("eCommerce_add-select-stakeholder_Buttons_Update");   By cancelBtnOfcustomereligibility = By.id("eCommerce_add-select-stakeholder_Buttons_Cancel");
    By starDateOption = By.id("eCommerce_create-quantity-discounts_Expiry_Start_Select");   By selectStartdate = By.xpath("//*[@id=\"eCommerce_create-quantity-discounts_Expiry_Start_PrimeCalandar\"]/span/div/div/div/div[2]/table/tbody/tr[4]/td[3]");
    By endDateOption = By.id("eCommerce_create-quantity-discounts_Expiry_End_Select");      By nextMonthIcon = By.xpath("//*[@id=\"eCommerce_create-quantity-discounts_Expiry_End_PrimeCalendar\"]/span/div/div/div/div[1]/button[2]/span");
    By selectNextMonth = By.xpath("//*[@id=\"eCommerce_create-quantity-discounts_Expiry_End_PrimeCalendar\"]/span/div/div/div/div[2]/table/tbody/tr[5]/td[5]");     By startTimeOption = By.id("eCommerce_create-quantity-discounts_Expiry_Start_Time_dropdown");
    By SelectStartTime = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-quantity-discounts/div/div/app-create-quantity-discount/div/div[2]/div/div[5]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By assignproductCategoryOption = By.id("eCommerce_create-quantity-discounts_AppliesTo_Assign_BUTTON");  By updateBtnOfassignProductCategory = By.id("eCommerce_assign-product-Update_BUTTON");  By selectProductCategory = By.id("eCommerce_assign-product-category_Select_CHECKBOX_0");
    By expireDAteCheckbox1 = By.id("eCommerce_create-quantity-discounts_Expiry_Start_CHECKBOX");    By expireDAteCheckbox2 = By.id("eCommerce_create-quantity-discounts_Expiry_End_CHECKBOX");      By fixedAmountInput = By.id("eCommerce_create-quantity-discounts_DiscountAmount_INPUT");
    By selectProductCheckbox = By.id("eCommerce_select-products_emarketing_Move_CHECKBOX_0");   By leftSidePagination = By.xpath("//*[@id=\"eCommerce_quantity-discounts_Paginator\"]/div/button[4]");     By rightSdePagination = By.xpath("//*[@id=\"eCommerce_quantity-discounts_Paginator\"]/div/button[1]");
    By moveOption = By.id("eCommerce_quantity-discounts_Move_Button_icon_1");   By moveInput = By.id("eCommerce_quantity-discounts_Move_INPUT_1");  By moveBtn = By.id("eCommerce_quantity-discounts_Move_BUTTON_1");
    By recordsperPageOption = By.id("eCommerce_quantity-discounts_page_dropdown");  By selectRecordsperpage1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-quantity-discounts/div/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By selectREcordsperPage2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-quantity-discounts/div/div/div[1]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[5]");
    By statusOption = By.id("eCommerce_quantity-discounts_Status_INPUTSWITCH_0");   By cloneOption = By.id("eCommerce_quantity-discounts_Buttons_Clone_0");     By deleteOption = By.id("eCommerce_quantity-discounts_Buttons_Delete_0");
    By deleteBtn =  By.id("Elements_alert-box_Delete_BUTTON");      By editOption = By.id("eCommerce_quantity-discounts_Buttons_Edit_0");
    WebDriver driver;

    public POjo_file_for_quantity_discount(WebDriver driver) {
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


    public boolean test_paginationOf_quantity_discount(String arg1){
        boolean status = true;
        try{
            try{
                if(driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-quantity-discounts/div/div/div[1]/div[2]/p-table/div/div/table/tbody")).isDisplayed()){
                    driver.findElement(leftSidePagination).click();
                    POjo_file_for_quantity_discount.timeout2000();
                    driver.findElement(rightSdePagination).click();
                    POjo_file_for_quantity_discount.timeout2000();
                    driver.findElement(moveOption).click();
                    POjo_file_for_quantity_discount.timeout2000();
                    driver.findElement(moveInput).sendKeys(arg1);
                    POjo_file_for_quantity_discount.timeout2000();
                    driver.findElement(moveBtn).click();
                    POjo_file_for_quantity_discount.timeout2000();

                    driver.findElement(recordsperPageOption).click();
                    POjo_file_for_quantity_discount.timeout2000();
                    try{
                        driver.findElement(selectRecordsperpage1).click();
                        POjo_file_for_quantity_discount.timeout2000();
                        driver.findElement(rightSdePagination).click();
                        POjo_file_for_quantity_discount.timeout2000();
                    }catch (Exception ex){}
                    driver.findElement(recordsperPageOption).click();
                    POjo_file_for_quantity_discount.timeout2000();
                    try{
                        driver.findElement(selectREcordsperPage2).click();
                        POjo_file_for_quantity_discount.timeout2000();
                    }catch (Exception ex){}
                    driver.findElement(statusOption).click();
                    POjo_file_for_quantity_discount.timeout2000();
                    driver.findElement(cloneOption).click();
                    POjo_file_for_quantity_discount.timeout3000();
                    driver.findElement(rightSdePagination).click();
                    POjo_file_for_quantity_discount.timeout2000();
                    driver.findElement(deleteOption).click();
                    POjo_file_for_quantity_discount.timeout3000();
                    driver.findElement(deleteBtn).click();
                    POjo_file_for_quantity_discount.timeout3000();

                    driver.findElement(editOption).click();
                    POjo_file_for_quantity_discount.timeout2000();
                    try{
                        WebElement ele = driver.findElement(By.xpath("//*[@id=\"eCommerce_create-quantity-discounts_Buttons\"]/label"));
                        String val = ele.getText();
                        System.out.println(val);
                        if(val.equals("Select set advance Start and End date!")){
                            Assert.assertEquals(true,false,"Not saving records when click save button of edit quantity discount section");
                        }
                    }catch (Exception ex){}

                }else{}
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display quantity discount list");
            }

            status = false;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = true;
            return status;

        }
    }

    public boolean test_move_to_create_quantity_discount_section(String invaliddata, String validdata){
        boolean status = true;
        try{
            driver.findElement(createQuantiytDiscount).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(saveBTnofCreateQuantityDiscount).click();
            POjo_file_for_quantity_discount.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"eCommerce_create-quantity-discounts_Buttons\"]/label")).isDisplayed()){
                    driver.findElement(discountTitle).sendKeys(invaliddata);
                    POjo_file_for_quantity_discount.timeout2000();
                    try{
                        WebElement ele = driver.findElement(discountTitle);
                        String val = ele.getAttribute("value");
                        if(val.equals(invaliddata)){
                            Assert.assertEquals(true,false,"Enter invalid data when creating quantity discount");
                        }
                    }catch (Exception ex){
                        driver.findElement(discountTitle).sendKeys(validdata);
                        POjo_file_for_quantity_discount.timeout2000();
                    }
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation when click save button without filling required fields");
            }

            status = false;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display create quantity discount section");
            status = true;
            return status;

        }
    }

    public  boolean test_create_quantiyt_discount_section1(String discountValue, String arg1){
        boolean status = true;
        try{
            driver.findElement(discoutnValue).sendKeys(discountValue);
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(discountyTypeOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            try {
                driver.findElement(fixedAmountOption).click();
                POjo_file_for_quantity_discount.timeout2000();
                driver.findElement(fixedAmountInput).sendKeys(discountValue);
                POjo_file_for_quantity_discount.timeout2000();
            }catch (Exception ex){}
            driver.findElement(discountyTypeOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            try {
                driver.findElement(discountType2).click();
                POjo_file_for_quantity_discount.timeout2000();
            }catch (Exception ex){}
            driver.findElement(countryOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            try{
                driver.findElement(selectCountryOption1).click();
                POjo_file_for_quantity_discount.timeout2000();
            }catch (Exception ex){}
            driver.findElement(discountyTypeOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            try {
                driver.findElement(discountType3).click();
                POjo_file_for_quantity_discount.timeout2000();
                driver.findElement(selectProductBtn).click();
                POjo_file_for_quantity_discount.timeout2000();
                driver.findElement(selectBtn).click();
                POjo_file_for_quantity_discount.timeout2000();
                try{
                    WebElement ele = driver.findElement(By.xpath("//*[@id=\"eCommerce_select-products_emarketing_Buttons\"]/div[3]/label"));
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals("Product(s) not selected!")) {

                        driver.findElement(selectProduct).click();
                        POjo_file_for_quantity_discount.timeout2000();
                        driver.findElement(selectProductCheckbox).click();
                        POjo_file_for_quantity_discount.timeout2000();
                        driver.findElement(selectBtn).click();
                        POjo_file_for_quantity_discount.timeout2000();
                    }

                }catch(Exception ex){
                    Assert.assertEquals(true,false,"Not display validation  when click save button , without selecting products");
                }
            }catch (Exception ex){}

            driver.findElement(saveBTnofCreateQuantityDiscount).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(maximumQuantityOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(maximumInput).sendKeys(arg1);
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(usageLimitOption1).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(usageLimit2).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(usageLimitInput).sendKeys(arg1);
            POjo_file_for_quantity_discount.timeout2000();

            driver.findElement(customerEligibilityOption2).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(stakehodlerGroupOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(selectStakeholder).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(stakehodlerGroupOption).click();
            POjo_file_for_quantity_discount.timeout2000();

            try{
                WebElement ele = driver.findElement(stakehodlerGroupOption);
                String val = ele.getText();
                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"Not display selected stakeholder group inside the dropdown");
                }
            }catch (Exception ex){}

            status = false;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display create quantity discount section");
            status = true;
            return status;

        }
    }

    public boolean test_select_specific_customer_inside_quantity_discount_section(String invalidData){
        boolean status = true;
        try{
            driver.findElement(customerEligibilityOption3).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(specificCustomwerOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(stakehodlerGroupOptionOfspecificCustomer).click();
            POjo_file_for_quantity_discount.timeout2000();
            try{
                driver.findElement(selectGroupOfspecificCustomer).click();
                POjo_file_for_quantity_discount.timeout2000();
                driver.findElement(stakehodlerGroupOptionOfspecificCustomer).click();
                POjo_file_for_quantity_discount.timeout2000();
            }catch (Exception ex){}
            driver.findElement(searchField).sendKeys(invalidData);
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            POjo_file_for_quantity_discount.timeout2000();

            try{
                WebElement ele = driver.findElement(By.id("eCommerce_add-select-stakeholder_Listbox"));
                String val = ele.getText();
                System.out.println(val);
                if(val.isEmpty()){
                    Assert.assertEquals(true,false,"Not display stakeholder when searching and filtering");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display created quantity discount section");
            status = false;
            return status;
        }
    }

    public boolean test_expire_dates_section_create_quantity_discount(){
        boolean status = true;
        try{
            try{
                driver.findElement(updateBtnOfcustomerEligibility).click();
                POjo_file_for_quantity_discount.timeout2000();

            }catch (Exception ex){
                driver.findElement(cancelBtnOfcustomereligibility).click();
                POjo_file_for_quantity_discount.timeout2000();
            }
            driver.findElement(starDateOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            try {
                driver.findElement(selectStartdate).click();
                POjo_file_for_quantity_discount.timeout2000();
            }catch (Exception ex){}
            driver.findElement(endDateOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            try {
                driver.findElement(nextMonthIcon).click();
                POjo_file_for_quantity_discount.timeout2000();
                driver.findElement(selectNextMonth).click();
                POjo_file_for_quantity_discount.timeout2000();
            }catch (Exception ex){}
            driver.findElement(expireDAteCheckbox1).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(expireDAteCheckbox2).click();
            POjo_file_for_quantity_discount.timeout2000();

            driver.findElement(startTimeOption).click();
            driver.findElement(startTimeOption).click();
            POjo_file_for_quantity_discount.timeout2000();

            try{
                if(driver.findElement(SelectStartTime).isDisplayed()){
                    driver.findElement(SelectStartTime).click();
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display start time options when click start time dropdown and not display end time options when click end time dropdown");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display created quantity discount section");
            status = false;
            return status;
        }
    }

    public boolean test_assign_product_category_section_of_craete_quantity_discount(){
        boolean status = true;
        try{
            driver.findElement(assignproductCategoryOption).click();
            POjo_file_for_quantity_discount.timeout2000();
            driver.findElement(updateBtnOfassignProductCategory).click();
            POjo_file_for_quantity_discount.timeout2000();
            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"onBtnPrintClickprint\"]/div[3]/div[3]/label"));
                String val = ele.getText();
                if(val.equals("Product category not selected!")){
                    driver.findElement(selectProductCategory).click();
                    POjo_file_for_quantity_discount.timeout2000();
                    driver.findElement(updateBtnOfassignProductCategory).click();
                    POjo_file_for_quantity_discount.timeout2000();
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation message without selected product category");
            }


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display created quantity discount section");
            status = false;
            return status;
        }
    }

    public  boolean test_save_the_create_quantity_discount(){
        boolean status = true;
        try{
            driver.findElement(saveBTnofCreateQuantityDiscount).click();
            POjo_file_for_quantity_discount.timeout2000();
            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"eCommerce_create-quantity-discounts_Buttons\"]/label"));
                String val = ele.getText();
                System.out.println(val);

                WebElement ele1 = driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-quantity-discounts/div/div/div/div[2]/p-table/div/div/table/tbody"));
                String val1 = ele1.getText();

                if(val.equals("Select set advance Start and End date!") || val1.isEmpty()){
                    Assert.assertEquals(true,false,"Not creating new quantity discount when filling required fields");
                }
            }catch (Exception ex){

            }
            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display created quantity discount section");
            status = false;
            return status;
        }
    }


}
