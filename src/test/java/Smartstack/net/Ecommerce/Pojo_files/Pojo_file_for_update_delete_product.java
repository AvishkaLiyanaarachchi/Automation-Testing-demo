package Smartstack.net.Ecommerce.Pojo_files;

import org.bouncycastle.jcajce.provider.util.SecretKeyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.StringTokenizer;

public class Pojo_file_for_update_delete_product {

    By searchField = By.id("eCommerce_product_Search_INPUT");   By editOption = By.id("eCommerce_product-list_Update_BUTTON_0");      By manageContentSectionBtn = By.id("eCommerce_add-product_AddNewExpandableContent_BUTTON");
    By okBtn = By.xpath("//*[@id=\"eCommerce_add-product_Main_Buttons\"]/button[1]");       By titleInputInexpandableContent = By.xpath("//*[@id=\"eCommerce_add-product_Main\"]/div[2]/div[1]/div[3]/div/div[4]/p-dialog/div/div/div[2]/div[1]/input");
    By contentField= By.xpath("//*[@id=\"Elements_text_editor5_main\"]/div/div[2]/ckeditor/div[2]/div[2]/div");     By editOptionOfexpandableContent = By.xpath("//*[@id=\"eCommerce_add-product_Main\"]/div[2]/div[1]/div[3]/div/div[2]/div/div/div[2]/div[1]/span/i");
    By deleteOptionOfexpandableContent = By.xpath("//*[@id=\"eCommerce_add-product_Main\"]/div[2]/div[1]/div[3]/div/div[2]/div/div/div[2]/div[2]/span/i");      By deleteBtn = By.id("eCommerce_alert-box_Buttons_Delete");
    By cancelBtnOfExpandableContent = By.xpath("//*[@id=\"eCommerce_add-product_Main_Buttons\"]/button[2]");    By skuField = By.id("eCommerce_add-product_SKU_INPUT");     By barcodeField = By.id("eCommerce_add-product_Barcode_INPUT");
    By trackQtyOption = By.id("eCommerce_add-product_Track_CHECKBOX");      By comtimueSellingOption = By.id("eCommerce_add-product_ContinueSelling_CHECKBOX");     By qtyField = By.id("eCommerce_add-product_Quantity_INPUT");
    By selectShippingOption = By.id("eCommerce_add-product_Shipping_INPUT");    By shippingField = By.id("eCommerce_add-product_Weight_INPUT");     By calculateOption = By.id("eCommerce_add-product_WeightType_dropdown");
    By selectShippingCountry = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-product/div/div/app-add-product/div/div[2]/div[1]/div[7]/div/div/div[3]/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[4]");
    By countryOption = By.id("eCommerce_add-product_Country_dropdown");     By addVarientBtn = By.id("eCommerce_add-product_ProductVariant_AddNewVariant_BUTTON");      By saveBtnOfproductVarien = By.id("eCommerce_add-variant_VariantValues_Save_BUTTON");
    By varientName = By.id("eCommerce_add-variant_VariantName_INPUT");      By varientValue = By.id("eCommerce_add-variant_VariantValues_Choice_INPUT_0");  By editOptionVarinet = By.id("eCommerce_add-product_ProductVariant_Buttons_Update_0");
    By deleteVarientOption = By.id("eCommerce_add-product_ProductVariant_Buttons_Delete_0");    By pageTitleField = By.id("eCommerce_add-product_PageTitle_INPUT");     By pageDesField = By.id("eCommerce_add-product_PageDescription_INPUT");
    By pageURLOption = By.id("eCommerce_add-product_defaultPH_DIV");    By pageURLoption1 = By.id("eCommerce_add-product_permissionList_SPAN");     By pageKeyWordField = By.id("eCommerce_add-product_PageKeywords_INPUT");
    By assignproductCAtegoryBtn = By.id("eCommerce_add-product_ProductCategory_Assign_BUTTON");     By updateBtnOfcategory = By.id("eCommerce_assign-product-Update_BUTTON");   By selectProductCategory = By.id("eCommerce_assign-product-category_Select_CHECKBOX_0");
    By vendorField = By.id("eCommerce_add-product_Input-sectiont_vendor_INPUT");    By selectVendor = By.xpath("//*[@id=\"eCommerce_add-product_Main\"]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[1]/div/span");
    By deleteOption = By.xpath("//*[@id=\"eCommerce_add-product_Main\"]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[1]/div/i");
    By deleteBtnOfVendorOption = By.id("eCommerce_alert-box_Buttons_Delete");     By addCouponCodeCheckbox = By.id("eCommerce_add-product_CouponCodes_CHECKBOX");   By addCouponCodeField= By.id("eCommerce_add-product_CouponCodes_Search_INPUT");
    By selectCouponCode = By.id("eCommerce_add-product_CouponCodes_Add_Coupon_Name_0");     By bulkDiscount = By.id("eCommerce_add-product_AddToBulk_CHECKBOX");    By bulkDiscountField = By.id("eCommerce_add-product_AddToBulk_Search_INPUT");
    By selectdiscount = By.id("eCommerce_add-product_AddToBulk_Popup");     By addQuantitydiscount = By.id("eCommerce_add-product_AddToBulkQuantity_CHECKBOX");     By quantitydiscountField = By.id("eCommerce_add-product_AddToBulkQuantity_Search_INPUT");
    By quantityDiscountOption = By.id("eCommerce_add-product_AddToBulkQuantity_Popup");     By saveBtn = By.id("eCommerce_add-product_Main_Buttons_Save");      By productTitle = By.id("eCommerce_add-product_ProductTitle_INPUT");
    WebDriver driver;

    public Pojo_file_for_update_delete_product(WebDriver driver) {
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


    public boolean test_search_newly_create_product(String arg1){
        boolean status = true;
        try{
            driver.findElement(searchField).sendKeys(arg1);
            Pojo_file_for_add_product.timeout2000();
            try{
                WebElement ele= driver.findElement(By.xpath("//*[@id=\"productListComponentRefECom\"]/div/div[2]"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("Sorry, no matching results found.")){
                    driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
                    Pojo_file_for_update_delete_product.timeout2000();
                    if(driver.findElement(editOption).isEnabled()) {
                        driver.findElement(editOption).click();
                        Pojo_file_for_add_product.timeout2000();
                    }else{
                        Assert.assertEquals(true,false,"Not display edit product section");
                    }
                }
            }catch (Exception ex){
                if(driver.findElement(editOption).isEnabled()) {
                    driver.findElement(editOption).click();
                    Pojo_file_for_add_product.timeout2000();
                }else{
                    Assert.assertEquals(true,false,"Not display edit product section");
                }
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display newly created product so not display it when searching");
            status = false;
            return status;
        }
    }

    public boolean test_manage_expandable_content_section_editProduct_section(){
        boolean status = true;
        try{
            driver.findElement(manageContentSectionBtn).click();
            Pojo_file_for_product_section.timeout2000();

            try{
                if(driver.findElement(okBtn).isEnabled()){
                    Assert.assertEquals(true,false,"Enable Ok button without entering expandable content section required fields");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit product section so can't move to the manage expandable content section");
            status = false;
            return status;
        }
    }

    public boolean test_create_expandable_content_with_invalidData(String invalidData){
        boolean status = true;
        try{
            WebElement ele = driver.findElement(titleInputInexpandableContent);
            ele.sendKeys(invalidData);
            Pojo_file_for_add_product.timeout2000();

            try{
                String val1 =  ele.getAttribute("value");
                System.out.println(val1);

                if(val1.equals(invalidData)){
                    Assert.assertEquals(true,false,"Enter invalid data to title of manage content section");
                }
            }catch (Exception ex){}


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit product section so can't move to the manage expandable content section");
            status = false;
            return status;
        }
    }

    //manage expandable content section is not working
    public boolean test_create_edit_delete_manage_expandable_content_section(String validData, String content, String updateTitle){
        boolean status = true;
        try{
            driver.findElement(titleInputInexpandableContent).clear();
            Pojo_file_for_add_product.timeout2000();
            driver.findElement(titleInputInexpandableContent).sendKeys(validData);
            Pojo_file_for_add_product.timeout2000();
            driver.findElement(contentField).sendKeys(content);
            Pojo_file_for_add_product.timeout2000();
            driver.findElement(okBtn).click();
            Pojo_file_for_add_product.timeout2000();
            try{
                driver.findElement(editOptionOfexpandableContent).click();
                Pojo_file_for_add_product.timeout2000();
                driver.findElement(titleInputInexpandableContent).sendKeys(updateTitle);
                Pojo_file_for_add_product.timeout2000();
                driver.findElement(okBtn).click();
                Pojo_file_for_add_product.timeout2000();
            }catch (Exception ex){}

            try{
                driver.findElement(deleteOptionOfexpandableContent).click();
                Pojo_file_for_add_product.timeout3000();
                driver.findElement(deleteBtn).click();
                Pojo_file_for_add_product.timeout3000();
            }catch (Exception ex){}

            try{
                if(driver.findElement(By.xpath("//*[@id=\"eCommerce_add-product_Main\"]/div[2]/div[1]/div[3]/div/div[2]/div")).isDisplayed()){
                    Assert.assertEquals(true,false,"When editing/deleting manage expandable content , not editing/deleting");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit product section so can't move to the manage expandable content section");
            status = false;
            return status;
        }
    }

    public boolean test_inventory_section_of_edit_product(String invalidData, String validDataSKU,String validBarccode){
        boolean status = true;
        try{
            try {
                driver.findElement(cancelBtnOfExpandableContent).click();
                Pojo_file_for_update_delete_product.timeout2000();
            }catch (Exception ex){}
            driver.findElement(skuField).sendKeys(invalidData);
            Pojo_file_for_update_delete_product.timeout2000();
            try{
                driver.findElement(barcodeField).sendKeys(invalidData);
                Pojo_file_for_update_delete_product.timeout2000();
            }catch (Exception ex){
                driver.findElement(barcodeField).sendKeys(validBarccode);
                Pojo_file_for_update_delete_product.timeout2000();
            }

            try{
                WebElement ele = driver.findElement(skuField);
                String val = ele.getText();
                System.out.println(val);

                if(val.equals(invalidData)){
                    Assert.assertEquals(true,false,"Enter invalid data to SKU field");
                }
            }catch (Exception ex){
                driver.findElement(skuField).sendKeys(validDataSKU);
                Pojo_file_for_update_delete_product.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit product section");
            status = false;
            return status;
        }
    }

    public boolean test_quantity_and_shipping_section_of_edit_product(String qty, String shippingAmount){
        boolean status = true;
        try{
            driver.findElement(trackQtyOption).click();
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(comtimueSellingOption).click();
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(qtyField).sendKeys(qty);
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(selectShippingOption).click();
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(calculateOption).click();
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(shippingField).sendKeys(shippingAmount);
            Pojo_file_for_update_delete_product.timeout2000();

            try{
                WebElement ele= driver.findElement(shippingField);
                String val = ele.getAttribute("value");
                System.out.println(val);

                if(val.equals(shippingAmount)){
                    Assert.assertEquals(true,false,"Not display number limitation of shipping field");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit product section");
            status = false;
            return status;
        }
    }

    public boolean test_varient_section_of_edit_product(String varientNameData, String varientValueData){
        boolean status = true;
        try{
            driver.findElement(countryOption).click();
            Pojo_file_for_update_delete_product.timeout2000();
            try{
                driver.findElement(selectShippingCountry).click();
                Pojo_file_for_update_delete_product.timeout2000();
            }catch (Exception ex){}
            driver.findElement(addVarientBtn).click();
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(saveBtnOfproductVarien).click();
            Pojo_file_for_update_delete_product.timeout2000();
            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"eCommerce_add-variant_VariantValues_Buttons_Section\"]/label"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("Variant name is emplty!")){
                    driver.findElement(varientName).sendKeys(varientNameData);
                    Pojo_file_for_update_delete_product.timeout2000();
                    driver.findElement(varientValue).sendKeys(varientValueData);
                    Pojo_file_for_update_delete_product.timeout2000();
                    driver.findElement(saveBtnOfproductVarien).click();
                    Pojo_file_for_update_delete_product.timeout2000();

                    driver.findElement(editOptionVarinet).click();
                    Pojo_file_for_update_delete_product.timeout2000();
                    driver.findElement(varientName).sendKeys(varientNameData);
                    Pojo_file_for_update_delete_product.timeout2000();
                    driver.findElement(saveBtnOfproductVarien).click();
                    Pojo_file_for_update_delete_product.timeout2000();

                    driver.findElement(deleteVarientOption).click();
                    Pojo_file_for_update_delete_product.timeout2000();

                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation when click save button without data");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit product section");
            status = false;
            return status;
        }
    }

    public boolean test_seo_section_of_edit_product(String pageTitle, String pageDes, String keyword){
        boolean status = true;
        try{
            driver.findElement(pageTitleField).sendKeys(pageTitle);
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(pageDesField).sendKeys(pageDes);
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(pageURLOption).click();
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(pageURLoption1).click();
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(pageKeyWordField).sendKeys(keyword);

            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(assignproductCAtegoryBtn).click();
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(updateBtnOfcategory).click();
            Pojo_file_for_update_delete_product.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"onBtnPrintClickprint\"]/div[3]/div[3]/label"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("Product category not selected!")){
                    driver.findElement(selectProductCategory).click();
                    Pojo_file_for_update_delete_product.timeout2000();
                    driver.findElement(updateBtnOfcategory).click();
                    Pojo_file_for_update_delete_product.timeout2000();
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display validation when click update button without selecting product category");
            }
            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit product section");
            status = false;
            return status;
        }
    }

    public boolean test_vendor_section(){
        boolean status = true;
        try{
            driver.findElement(vendorField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Pojo_file_for_update_delete_product.timeout2000();

            WebElement ele1 = driver.findElement(selectVendor);
            Actions action1 = new Actions(driver);
            action1.moveToElement(ele1).perform();
            driver.findElement(deleteOption).click();
            Pojo_file_for_update_delete_product.timeout3000();
            driver.findElement(deleteBtnOfVendorOption).click();
            Pojo_file_for_update_delete_product.timeout3000();

            try{
                WebElement ele = driver.findElement(vendorField);
                String val = ele.getAttribute("value");
                System.out.println(val);

                if(val.equals("Vendor 1")){
                    Assert.assertEquals(true,false,"Display deleted vendor inside vendor section");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit product section");
            status = false;
            return status;
        }
    }

    public boolean test_select_couponCode_and_discount_for_edit_product(String updatetilte){
        boolean status = true;
        try{
            driver.findElement(addCouponCodeCheckbox).click();
            Pojo_file_for_update_delete_product.timeout2000();
            WebElement ele1 = driver.findElement(addCouponCodeField);
            Actions action1 = new Actions(driver);
            action1.moveToElement(ele1).perform();
            driver.findElement(selectCouponCode).click();
            Pojo_file_for_update_delete_product.timeout2000();

            driver.findElement(bulkDiscount).click();
            Pojo_file_for_update_delete_product.timeout2000();
            WebElement ele2 = driver.findElement( bulkDiscountField);
            Actions action2 = new Actions(driver);
            action2.moveToElement(ele2).perform();
            driver.findElement(selectdiscount).click();
            Pojo_file_for_update_delete_product.timeout2000();

            driver.findElement(addQuantitydiscount).click();
            Pojo_file_for_update_delete_product.timeout2000();
            WebElement ele3 = driver.findElement( quantitydiscountField);
            Actions action3 = new Actions(driver);
            action3.moveToElement(ele3).perform();
            driver.findElement(quantityDiscountOption).click();
            Pojo_file_for_update_delete_product.timeout2000();

            driver.findElement(productTitle).sendKeys(updatetilte);
            Pojo_file_for_update_delete_product.timeout2000();
            driver.findElement(saveBtn).click();
            Pojo_file_for_update_delete_product.timeout3000();

            try{
                if(driver.findElement(productTitle).isDisplayed()){
                    Assert.assertEquals(true,false,"Not updating product so not moving to the product list");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display edit product section");
            status = false;
            return status;
        }
    }


}
