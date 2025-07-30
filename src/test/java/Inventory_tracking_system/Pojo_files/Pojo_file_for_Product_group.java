package Inventory_tracking_system.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Pojo_file_for_Product_group {

    By productGroupLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/ul/li[2]/a");     By searchOptionofProductGroup = By.id("inventory-system_product-group_search_INPUT");       By sectionLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/li[2]");
    By addProductGroup = By.id("inventory-system_product-group_add-new-product-group_INPUT");   By saveBtnOfaddProductGroup = By.id("inventory-system_add-new-product-group_save_BUTTON");  By categoryOption = By.id("inventory-system_add-new-product-group_category_SELECT");
    By selectCategory = By.xpath("//*[@id=\"inventory-system_add-new-product-group_category_SELECT\"]/option[4]");  By subcategoryOption = By.id("inventory-system_add-new-product-group_subcategory_SELECT");  By selectSubcategory = By.xpath("//*[@id=\"inventory-system_add-new-product-group_subcategory_SELECT\"]/option");
    By titleField = By.id("inventory-system_add-new-product-group_title_INPUT");    By barcodeField = By.id("inventory-system_add-new-product-group_barcode_INPUT");    By editProductGroupOption = By.id("inventory-system_product-group_edit_BUTTON");
    By updateBtnforeditProductGroup = By.id("inventory-system_add-new-product-group_update_BUTTON");    By deleteOptionOfselectedProductGroup = By.id("inventory-system_add-new-product-group_delete_BUTTON");      By deleteBtnofProductGroup = By.xpath("//*[@id=\"productModal\"]/div/div/app-new-product/p-confirmdialog/div/div/div[3]/button[2]");
    By textareaOfproductGroup = By.xpath("//*[@id=\"inventory-system_add-new-product-group_description_TEXTEDITOR\"]/div/div[2]/div[1]");   By productItemOption = By.id("newProductDropdown"); By selectProductItem = By.xpath("//*[@id=\"newProductDropdown\"]/option[2]");
    By plusIconofproductItem = By.id("inventory-system_add-new-product-group_add-related-product_BUTTON");
    WebDriver driver;

    public Pojo_file_for_Product_group(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    //This method used to move to product group and search product with invalid data
    public boolean search_product_group_with_invalidData(String invalidData){
        boolean status = true;
        try{
//            driver.findElement(sectionLink).click();
//            Thread.sleep(4000);
            driver.findElement(productGroupLink).click();
            Thread.sleep(4000);
            driver.findElement(searchOptionofProductGroup).sendKeys(invalidData);
            Pojo_file_for_Product_group.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-product/div/div[1]/div/div[2]/div/div/div")).isDisplayed()){
                    Assert.assertEquals(true, true,"Display message as 'There are no records to display' when searching product group with invalid data");
                }else{
                    Assert.assertEquals(true, false,"Not display message as 'There are no records to display' when searching product group with invalid data");
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

    //This method used to searched product group with valid data
    public boolean search_product_group_with_validdata(String validdata){
        boolean status = true;
        try{
            driver.findElement(searchOptionofProductGroup).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(searchOptionofProductGroup).sendKeys(validdata);
            Pojo_file_for_Product_group.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-product/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[1]/td[2]/p"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals(validdata)){
                    Assert.assertEquals(true,true,"Display searched product group from list");
                }else{
                    Assert.assertEquals(true,false,"When searching with full name of product group , not display it in list\n"+
                            "The reason is can't put spaces on search field");
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

    //This method used to move to add product group and click save button without filling fields
    public boolean click_save_btn_without_fillingFields(){
        boolean status = true;
        try{
            driver.findElement(searchOptionofProductGroup).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(addProductGroup).click();
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(saveBtnOfaddProductGroup).click();
            Pojo_file_for_Product_group.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"productModal\"]/div/div/app-new-product/div[1]/div/div[1]/div/div[1]/div/div")).isDisplayed() && driver.findElement(By.xpath("//*[@id=\"productModal\"]/div/div/app-new-product/div[1]/div/div[1]/div/div[3]/div/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validations under required fields when click save button without filling fields");
                }else{
                    Assert.assertEquals(true,false,"Display validations under required fields when click save button without filling fields");
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

    //This method used to  created product group
    public boolean create_product_group(String title, String barcode){
        boolean status = true;
        try{
            driver.findElement(categoryOption).click();
            Thread.sleep(2000);

            Select se = new Select(driver.findElement(categoryOption));
            List<WebElement> l = se.getOptions();
            System.out.println(l.size());
            try {
                driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-group_category_SELECT\"]/option[" +l.size()+ "]")).click();
                Pojo_file_for_product_item.timeout2000();
            }catch (Exception ex){
                if(driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-group_category_SELECT\"]/option[4]")).isDisplayed()) {
                    driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-group_category_SELECT\"]/option[4]")).click();
                    Pojo_file_for_Product_group.timeout2000();
                }else{
                    driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-group_category_SELECT\"]/option[3]"));
                    Pojo_file_for_Product_group.timeout2000();
                }
            }

            driver.findElement(subcategoryOption).click();
            Pojo_file_for_Product_group.timeout2000();

            Select se1 = new Select(driver.findElement(subcategoryOption));
            List<WebElement> l1 = se1.getOptions();
            System.out.println(l1.size());
            try {
                driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-group_subcategory_SELECT\"]/option")).click();
                Pojo_file_for_product_item.timeout2000();
            }catch (Exception ex){}

            driver.findElement(productItemOption).click();
            Pojo_file_for_Product_group.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"newProductDropdown\"]/option[2]")).isDisplayed()){
                    driver.findElement(By.xpath("//*[@id=\"newProductDropdown\"]/option[2]")).click();
                    Pojo_file_for_Product_group.timeout2000();

                }
            }catch (Exception ex){
                driver.findElement(categoryOption).click();
                Thread.sleep(2000);
                try {
                    driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-group_category_SELECT\"]/option[3]")).click();
                    Pojo_file_for_Product_group.timeout2000();
                }catch (Exception ex1){
                    driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-group_category_SELECT\"]/option[1]")).click();
                    Pojo_file_for_Product_group.timeout2000();
                }
                driver.findElement(subcategoryOption).click();
                Pojo_file_for_Product_group.timeout2000();
                driver.findElement(By.xpath("//*[@id=\"inventory-system_add-new-product-group_subcategory_SELECT\"]/option")).click();
                Pojo_file_for_product_item.timeout2000();
                driver.findElement(productItemOption).click();
                Pojo_file_for_Product_group.timeout2000();
                driver.findElement(By.xpath("//*[@id=\"newProductDropdown\"]/option[2]")).click();
                Pojo_file_for_Product_group.timeout2000();
                driver.findElement(plusIconofproductItem).click();
                Pojo_file_for_Product_group.timeout2000();
            }

            driver.findElement(titleField).sendKeys(title);
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(barcodeField).sendKeys(barcode);
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(saveBtnOfaddProductGroup).click();
            Pojo_file_for_Product_group.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-product/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody"));
                String val = ele.getText();
                System.out.println(val);

                if(val.contains(title)){
                    Assert.assertEquals(true,true,"Display newly created product group from list");
                }else{
                    Assert.assertEquals(true,false,"Not Display newly created product group from list");
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

    //This method used to move to edit product group and see the details
    public boolean moveTo_edit_product_group_and_see_product_Item(){
        boolean status = true;
        try{
            try {
                driver.findElement(By.id("inventory-system_product-group_edit_BUTTON4")).click();
                Pojo_file_for_Product_group.timeout2000();
            }catch (Exception ex){
                driver.findElement(By.id("inventory-system_product-group_edit_BUTTON1")).click();
                Pojo_file_for_Product_group.timeout2000();
            }

            try{
                WebElement ele = driver.findElement(By.id("newProductDropdown"));
                String val = ele.getText();
                System.out.println(val);

                if(val.equals("Select a product")){
                    Assert.assertEquals(true,false,"Not display selected product item inside the dropdown");
                }else{
                    Assert.assertEquals(true,true,"Display selected product item inside the dropdown");
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

    //THis method used to update selected product group
    public boolean update_selected_product_group(String updateTitle, String barcode, String description){
        boolean status = true;
        try{
            driver.findElement(titleField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(titleField).sendKeys(updateTitle);
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(barcodeField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(barcodeField).sendKeys(barcode);
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(textareaOfproductGroup).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(textareaOfproductGroup).sendKeys(description);
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(updateBtnforeditProductGroup).click();
            Pojo_file_for_Product_group.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-product/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody"));
                String val = ele.getText();
                System.out.println(val);

                if(val.contains(updateTitle)){
                    Assert.assertEquals(true,true,"Display updated product group from list");
                }else{
                    Assert.assertEquals(true,false,"Not display updated product group from list");
                }
            }catch (Exception ex){

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

    //This method used to delete selected product group
    public boolean delete_selected_product_group(){
        boolean status = true;
        try{
            try {
                driver.findElement(By.id("inventory-system_product-group_edit_BUTTON3")).click();
                Pojo_file_for_Product_group.timeout2000();
            }catch (Exception ex){
                driver.findElement(By.id("inventory-system_product-group_edit_BUTTON1")).click();
                Pojo_file_for_Product_group.timeout2000();
            }
            driver.findElement(deleteOptionOfselectedProductGroup).click();
            Pojo_file_for_Product_group.timeout2000();
            driver.findElement(deleteBtnofProductGroup).click();
            Pojo_file_for_Product_group.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-product/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody"));
                String val = ele.getText();
                System.out.println(val);

                WebElement ele2 = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-product/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[1]/td[2]/p"));
                String val2 = ele2.getText();
                System.out.println(val2);

                if(val.contains(val2)){
                    Assert.assertEquals(true,false,"Not deleting selected product group inside list");
                }else{
                    Assert.assertEquals(true,true,"Deleting selected product group inside list");
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





}
