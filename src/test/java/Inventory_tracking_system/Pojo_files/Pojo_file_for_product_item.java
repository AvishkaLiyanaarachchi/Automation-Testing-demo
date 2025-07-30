package Inventory_tracking_system.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Pojo_file_for_product_item {


    By productItemLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/ul/li[3]/a");      By searchOptionofproductItem = By.id("inventory-system_product-item_search_INPUT");     By rightSidePagfination = By.xpath("/html/body/app-root/app-main/div/main/div/app-product-item/div/div[1]/div/div[2]/div/p-paginator/div/button[4]");
    By addProductItemLink = By.id("inventory-system_product-item_add-new-product-item_BUTTON");     By saveBtnofProductItem = By.id("inventory-system_add-new-product-item_save_BUTTON");   By titleField = By.id("inventory-system_add-new-product-item_title_INPUT");
    By categoryOption = By.id("inventory-system_add-new-product-item_category_SELECT");     By electCategoryOption = By.xpath("//*[@id=\"inventory-system_add-new-product-item_category_SELECT\"]/option[5]");
    By selectCategoryOption2 = By.xpath("//*[@id=\"inventory-system_add-new-product-item_category_SELECT\"]/option[2]");    By subcategoryOption = By.id("inventory-system_add-new-product-item_subcategory_SELECT");
    By selectSubcategory = By.xpath("//*[@id=\"inventory-system_add-new-product-item_subcategory_SELECT\"]/option[2]");     By costPriceInput = By.id("inventory-system_add-new-product-item_cost-price_INPUT");
    By salePriceField = By.id("inventory-system_add-new-product-item_sale-price_INPUT");    By quantityField = By.id("inventory-system_add-new-product-item_quantity_INPUT");   By startDateField = By.id("inventory-system_add-new-product-item_sale-price-startdate_DATE");
    By endDateField = By.id("inventory-system_add-new-product-item_sale-price-enddate_DATE");   By skuCodeField = By.id("inventory-system_add-new-product-item_sku_INPUT");     By expireDateField = By.id("inventory-system_add-new-product-item_expiration_DATE");
    By saveBtn = By.id("inventory-system_add-new-product-item_save_BUTTON");    By vendorOption = By.id("inventory-system_add-new-product-item_vendor_SELECT");     By selectVendor = By.xpath("//*[@id=\"inventory-system_add-new-product-item_vendor_SELECT\"]/option[7]");
    By editOption1 = By.id("inventory-system_product-item_edit_BUTTON26");    By leftsidepagination = By.xpath("/html/body/app-root/app-main/div/main/div/app-product-item/div/div[1]/div/div[2]/div/p-paginator/div/button[1]");
    By editOption2 = By.id("inventory-system_product-item_edit_BUTTON1");   By selectProductOption = By.id("newProductDropdown");   By selectProduct = By.xpath("//*[@id=\"newProductDropdown\"]/option[2]");
    By plusIconOfproduct = By.id("inventory-system_add-new-product-item_add-related-product_BUTTON");   By variationOption = By.xpath("//*[@id=\"flexSwitchCheckDefault\"]");   By dimensionLength1 = By.id("inventory-system_add-new-product-item_dimension_INPUT1");
    By dimessionLength2 = By.id("inventory-system_add-new-product-item_dimension_INPUT2");  By dimensonLength3 = By.id("inventory-system_add-new-product-item_dimension_INPUT3");   By weightField = By.id("inventory-system_add-new-product-item_weight_INPUT");
    By colorOption = By.id("inventory-system_add-new-product-item_color_SELECT");   By searchFieldOfcolorOption = By.xpath("//*[@id=\"inventory-system_add-new-product-item_color_SELECT_list\"]/div[1]/div[2]/input");
    By selectColor = By.xpath("//*[@id=\"inventory-system_add-new-product-item_color_SELECT_0\"]/div/div");     By sizeOption = By.id("inventory-system_add-new-product-item_size_SELECT");     By searchOptionofSize = By.xpath("//*[@id=\"inventory-system_add-new-product-item_size_SELECT_list\"]/div[1]/div[2]/input");
    By selectSize = By.xpath("//*[@id=\"inventory-system_add-new-product-item_size_SELECT_0\"]/div/div");     By updateBtnofeditProductItem = By.id("inventory-system_add-new-product-item_update_BUTTON");
    By deleteOption = By.id("inventory-system_add-new-product-item_delete_BUTTON");     By yesBtnOfdeleteOption = By.xpath("//*[@id=\"productItemModal\"]/div/div/app-new-product-item/p-confirmdialog/div/div/div[3]/button[2]");
    By addbulkUploadOption = By.id("inventory-system_product-item_add-bulk-upload_BUTTON");     By downloadOptionforItemBulk = By.id("inventory-system_product-item_excel-template_item_BUTTON1");     By imageBulkUploadOption = By.id("inventory-system_bulkupload_image_TAB2");
    By downloadOptionforImagebulk = By.id("inventory-system_product-item_excel-template_image_BUTTON1");    By zipFileOption = By.id("inventory-system_bulkupload_zip_TAB3");   By closeOptionOfbulkUpload = By.id("inventory-system_product-item_excel&zip_close_BUTTON");
    WebDriver driver;

    public Pojo_file_for_product_item(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    //This method used to move to product item and searched with invalid data
    public  boolean moveTo_product_item_and_search_with_invalidData(String invalidData){
        boolean status = true;
        try{
            driver.findElement(productItemLink).click();
            Thread.sleep(4000);
            driver.findElement(searchOptionofproductItem).sendKeys(invalidData);
            Pojo_file_for_product_item.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-product-item/div/div[1]/div/div[2]/div/div/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display message inside table when searching with invalid data");
                }else{
                    Assert.assertEquals(true,false,"Not display message inside table when searching with invalid data");
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

    //This method used to searched product item with valid data
    public boolean search_product_with_validdata(String validdata){
        boolean status = true;
        try{
            driver.findElement(searchOptionofproductItem).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(searchOptionofproductItem).sendKeys(validdata);
            Pojo_file_for_product_item.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-product-item/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[1]")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display searched product item inside list");
                }else{
                    Assert.assertEquals(true,false,"Not display searched product item inside list");
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

    //This method used to add product item and click save button without filling data
    public boolean moveTo_add_product_item_andclcik_save_btn_without_filling_fields(){
        boolean status = true;
        try{
            try {
                driver.findElement(rightSidePagfination).click();
                Pojo_file_for_product_item.timeout2000();
            }catch (Exception ex){}
            driver.findElement(searchOptionofproductItem).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(addProductItemLink).click();
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(saveBtnofProductItem).click();
            Pojo_file_for_product_item.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"productItemModal\"]/div/div/app-new-product-item/div[1]/div[1]/div[1]/div/div")).isDisplayed() && driver.findElement(By.xpath("//*[@id=\"productItemModal\"]/div/div/app-new-product-item/div[1]/div[1]/div[2]/div/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations under required fields when click save button without filling fields");
                }else{
                    Assert.assertEquals(true,false,"Not display validations under required fields when click save button without filling fields");
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

    //This method used to create new product item
    public boolean add_product_item_for_list_method1(String title, String costPrice, String salePrice, String qty, String startdate, String endDate, String sku, String expireDate){
        boolean status = true;
        try{
            driver.findElement(titleField).sendKeys(title);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(categoryOption).click();
            Pojo_file_for_product_item.timeout2000();

            try{
                Select se = new Select(driver.findElement(By.id("inventory-system_add-new-product-item_category_SELECT")));
                List<WebElement> l = se.getOptions();
                System.out.println(l.size());
                try {
                    driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-item_category_SELECT\"]/option["+l.size()+"]")).click();
                    Pojo_file_for_product_item.timeout2000();
                }catch (Exception ex){
                    driver.findElement(electCategoryOption).click();
                    Pojo_file_for_product_item.timeout2000();
                }
            }catch(Exception ex){
                driver.findElement(selectCategoryOption2).click();
                Pojo_file_for_product_item.timeout2000();
            }

            driver.findElement(subcategoryOption).click();
            Pojo_file_for_product_item.timeout2000();
            try{
                Select se = new Select(driver.findElement(By.id("inventory-system_add-new-product-item_subcategory_SELECT")));
                List<WebElement> l1 = se.getOptions();
                System.out.println(l1.size());
                try {
                    driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-item_subcategory_SELECT\"]/option[" + l1.size() + "]")).click();
                    Pojo_file_for_product_item.timeout2000();
                }catch (Exception ex){
                    driver.findElement(selectSubcategory).click();
                    Pojo_file_for_product_item.timeout2000();
                }
            }catch (Exception ex){}

            driver.findElement(costPriceInput).sendKeys(costPrice);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(salePriceField).sendKeys(salePrice);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(quantityField).sendKeys(qty);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(startDateField).sendKeys(startdate);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(endDateField).sendKeys(endDate);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(skuCodeField).sendKeys(sku);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(expireDateField).sendKeys(expireDate);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(saveBtn).click();
            Pojo_file_for_product_item.timeout2000();

            try{
                if(driver.findElement(titleField).isDisplayed() && driver.findElement(categoryOption).isDisplayed()){
                    Assert.assertEquals(true,false,"When click save button without filling fields, display validations under field then fill that fields and click save button\n "+
                    "Display error message , not create new product item\n"+
                            "My suggestion:- Vendor is required field so need to display validation under vendor field");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not works");
            status = false;
            return status;
        }
    }

    //This method used to add product item with selecting product
    public boolean add_product_for_list_method2(){
        boolean status = true;
        try{
            driver.findElement(vendorOption).click();
            Pojo_file_for_product_item.timeout2000();
            try{
                Select se = new Select(driver.findElement(By.id("inventory-system_add-new-product-item_vendor_SELECT")));
                List<WebElement> l1 = se.getOptions();
                System.out.println(l1.size());
                try {
                    driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-item_vendor_SELECT\"]/option["+l1.size()+"]")).click();
                    Pojo_file_for_product_item.timeout2000();
                }catch (Exception ex){
                    driver.findElement(selectVendor).click();
                    Pojo_file_for_product_item.timeout2000();
                }

            }catch (Exception ex){}

            driver.findElement(selectProductOption).click();
            Pojo_file_for_product_item.timeout2000();
            try{
                if(driver.findElement(selectProduct).isDisplayed()) {
                    driver.findElement(selectProduct).click();
                    Pojo_file_for_product_item.timeout2000();
                    driver.findElement(plusIconOfproduct).click();
                    Pojo_file_for_product_item.timeout2000();
                }

            }catch (Exception ex){
                driver.findElement(categoryOption).click();
                Pojo_file_for_product_item.timeout2000();
                try {
                    driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-item_category_SELECT\"]/option[3]")).click();
                    Pojo_file_for_product_item.timeout2000();
                }catch (Exception ex1){
                    driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-item_category_SELECT\"]/option[2]")).click();
                    Pojo_file_for_product_item.timeout2000();
                }
                driver.findElement(subcategoryOption).click();
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-item_subcategory_SELECT\"]/option[2]")).click();
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(vendorOption).click();
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-item_vendor_SELECT\"]/option[2]")).click();
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(selectProductOption).click();
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(selectProduct).click();
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(plusIconOfproduct).click();
                Pojo_file_for_product_item.timeout2000();
            }

            driver.findElement(saveBtn).click();
            Thread.sleep(3000);

            try{
                if(driver.findElement(titleField).isDisplayed() && driver.findElement(categoryOption).isDisplayed()){
                    Assert.assertEquals(true,false,"When selecting product , display error message , not create a new product item");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"this method is not works");
            status = false;
            return status;
        }
    }

    //This method used to edit product item
    public boolean edit_selected_product_item_from_list_method1(String minuslenght1, String Minuslenght2, String minusLenght3, String minusWeight, String sku){
        boolean status = true;
        try{
        try {
            driver.findElement(By.id("inventory-system_add-new-product-item_remove-related-product_BUTTON")).click();
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(saveBtn).click();
            Thread.sleep(3000);
            try{
                driver.findElement(skuCodeField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(skuCodeField).sendKeys(sku);
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(saveBtn).click();
                Thread.sleep(3000);
                driver.findElement(rightSidePagfination).click();
                Thread.sleep(3000);
            }catch (Exception ex){}

        }catch (Exception ex){

        }
        try{
            List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"pn_id_99-table\"]/tbody"));
            int numOfRecordsList = elements.size();
            //int numOfRecords = (numOfRecordsList - 1);
            System.out.println(numOfRecordsList);

            List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pn_id_99-table\"]/tbody"));
            System.out.println(rows);

        }catch (Exception ex){}

        try {
            driver.findElement(By.id("inventory-system_add-new-product-item_close_BUTTON2")).click();
            Pojo_file_for_product_item.timeout2000();
        }catch (Exception ex){}

        try{
            driver.findElement(editOption1).click();
            Pojo_file_for_product_item.timeout2000();
        }catch (Exception ex){
            driver.findElement(leftsidepagination).click();
            Thread.sleep(3000);
            driver.findElement(editOption2).click();
            Pojo_file_for_product_item.timeout2000();
        }
        try {
            driver.findElement(variationOption).click();
            Thread.sleep(3000);
            driver.findElement(dimensionLength1).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(dimensionLength1).sendKeys(minuslenght1);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(dimessionLength2).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(dimessionLength2).sendKeys(Minuslenght2);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(dimensonLength3).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(dimensonLength3).sendKeys(minusLenght3);
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(weightField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(weightField).sendKeys(minusWeight);
            Pojo_file_for_product_item.timeout2000();
        }catch (Exception ex){}

        try{
            WebElement ele1 = driver.findElement(dimensionLength1);
            String val = ele1.getAttribute("value");
            System.out.println(val);

            WebElement ele2 = driver.findElement(dimessionLength2);
            String val2 = ele2.getAttribute("value");
            System.out.println(val2);

            WebElement ele3 = driver.findElement(dimensonLength3);
            String val3 = ele3.getAttribute("value");
            System.out.println(val3);

            if(val.equals(minuslenght1) && val2.equals(Minuslenght2) && val3.equals(minusLenght3)){
                Assert.assertEquals(true,false,"Select minus value for length fields and weight");
            }
        }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not works");
            status = false;
            return status;
        }

    }

    //This method used to edit product item with update variations
    public boolean edit_selected_product_group_from_list_method2(String invaliddata, String validData, String invalidSize, String validSize, String updateTitle){
        boolean status = true;
        try{
            try {
                driver.findElement(colorOption).click();
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(searchFieldOfcolorOption).sendKeys(invaliddata);
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(searchFieldOfcolorOption).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(searchFieldOfcolorOption).sendKeys(validData);
                Pojo_file_for_product_item.timeout2000();
                try {
                    driver.findElement(selectColor).click();
                    Pojo_file_for_product_item.timeout2000();
                } catch (Exception ex) {
                }

                driver.findElement(sizeOption).click();
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(searchOptionofSize).sendKeys(invalidSize);
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(searchOptionofSize).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(searchOptionofSize).sendKeys(validSize);
                Pojo_file_for_product_item.timeout2000();
                try {
                    driver.findElement(selectSize).click();
                    Pojo_file_for_product_item.timeout2000();
                } catch (Exception ex) {
                }
                driver.findElement(updateBtnofeditProductItem).click();
                Pojo_file_for_product_item.timeout2000();
            }catch (Exception ex){
                driver.findElement(titleField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(titleField).sendKeys(updateTitle);
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(updateBtnofeditProductItem).click();
                Pojo_file_for_product_item.timeout2000();
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

    //This method used to move to bulk upload section and download on item bulk upload and image bulk upload
    public boolean bulk_upload_section(){
        boolean status = true;
        try{
            driver.findElement(addbulkUploadOption).click();
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(downloadOptionforItemBulk).click();
            Thread.sleep(4000);
            driver.findElement(imageBulkUploadOption).click();
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(downloadOptionforImagebulk).click();
            Thread.sleep(4000);
            driver.findElement(zipFileOption).click();
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(closeOptionOfbulkUpload).click();
            Pojo_file_for_product_item.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true, false, "This method is not works");
            status = false;
            return status;
        }
    }

    //This method used to deleting selected product group
    public boolean deleting_selected_productItem(){
        boolean status = true;
        try{
            try{
                try{
                    driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-product-item/div/div[1]/div/div[2]/div/p-paginator/div/button[4]")).click();
                    Pojo_file_for_product_item.timeout2000();
                }catch (Exception ex){}
                driver.findElement(editOption1).click();
                Pojo_file_for_product_item.timeout2000();

            }catch (Exception ex){
                try {
                    driver.findElement(leftsidepagination).click();
                    Thread.sleep(3000);
                }catch (Exception ex1){}
                driver.findElement(editOption2).click();
                Pojo_file_for_product_item.timeout2000();
            }
            driver.findElement(deleteOption).click();
            Pojo_file_for_product_item.timeout2000();
            driver.findElement(yesBtnOfdeleteOption).click();
            Pojo_file_for_product_item.timeout2000();

            try{
                if(driver.findElement(By.id("inventory-system_add-new-product-item_title_INPUT")).isDisplayed()){
                    Assert.assertEquals(true,false,"Can't delete selected product item, display error message");
                }
            }catch (Exception ex){}


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true, false, "This method is not works");
            status = false;
            return status;
        }
    }
}
