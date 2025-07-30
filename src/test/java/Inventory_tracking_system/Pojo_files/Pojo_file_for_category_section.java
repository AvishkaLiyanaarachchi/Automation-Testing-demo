package Inventory_tracking_system.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Pojo_file_for_category_section {

    By sectionLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/li[2]");   By categoryLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/ul/li[1]/a");     By addCAtegoryLink = By.id("inventory-system_category_add-new-category_BUTTON");
    By saveBtnofaddCategory = By.id("inventory-system_add-new-category_save_BUTTON");     By categorynameField = By.id("inventory-system_add-new-category_name_INPUT");     By selectCategoryFromList = By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[3]");
    By addSubcategoryBtn = By.id("inventory-system_subcategory_add-new-subcategory_BUTTON");    By saveBtnOfSubcategory = By.id("inventory-system_add-new-subcategory_save_BUTTON");    By subcategoryField = By.id("inventory-system_add-new-subcategory_name_INPUT");
    By editCategoryBtn = By.id("inventory-system_category_edit_BUTTON");    By updateBtnOfeditCategory = By.id("inventory-system_add-new-category_update_BUTTON");   By editBtnofsubcategory = By.id("inventory-system_subcategory_edit_BUTTON1");
    By updateBtnOfSubcategory = By.id("inventory-system_add-new-subcategory_update_BUTTON");    By deleteOptionofselectedCategory = By.id("inventory-system_add-new-category_delete_BUTTON");   By deleteBtnOfselectedcategory = By.xpath("//*[@id=\"categoryModal\"]/div/div/app-new-category/p-confirmdialog/div/div/div[3]/button[2]");
    By deleteSubcategoryOption = By.id("inventory-system_add-new-subcategory_delete_BUTTON");   By deleteBtnOfsubcategory = By.xpath("//*[@id=\"categoryModal\"]/div/div/app-new-sub-category/p-confirmdialog/div/div/div[3]/button[2]");


    WebDriver driver;

    public Pojo_file_for_category_section(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    //This method used to move to category section clcik save button of add category section
    public boolean move_to_category_section_and_create_category_method1(){
        boolean status = true;
        try{
            driver.findElement(sectionLink).click();
            Thread.sleep(4000);
            driver.findElement(categoryLink).click();
            Thread.sleep(4000);
            driver.findElement(addCAtegoryLink).click();
            Pojo_file_for_category_section.timeout2000();
            driver.findElement(saveBtnofaddCategory).click();
            Pojo_file_for_category_section.timeout2000();

            try{
                if(driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/app-new-category/div[1]/div/div/div/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation under category name field when click save button without category name");
                }else{
                    Assert.assertEquals(true,false,"Not display validation under category name field when click save button without category name");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }
            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }
    }

    //This method used to create new category
    public boolean create_new_category_inside_categoryTable(String categoryName){
        boolean status = true;
        try{
            try{
                driver.findElement(addCAtegoryLink).click();
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(categorynameField).sendKeys(categoryName);
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(saveBtnofaddCategory).click();
                Pojo_file_for_category_section.timeout2000();
            }catch (Exception ex){}

            driver.findElement(categorynameField).sendKeys(categoryName);
            Pojo_file_for_category_section.timeout2000();
            driver.findElement(saveBtnofaddCategory).click();
            Pojo_file_for_category_section.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody"));
                String val= ele.getText();
                System.out.println(val);

                if(val.contains(categoryName)){
                    Assert.assertEquals(true,true,"Display newly created category inside category list");
                }else{
                    Assert.assertEquals(true,false,"Not Display newly created category inside category list");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }
    }

    //This method used to click save button of create sub category without name
    public boolean create_subCategoryfrom_list(){
        boolean status = true;
        try{
            try {
                List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"pn_id_83-table\"]/tbody"));
                int numOfRecordsList = elements.size();
                //int numOfRecords = (numOfRecordsList - 1);
                System.out.println(numOfRecordsList);

                List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pn_id_83-table\"]/tbody"));
                System.out.println(rows);

                List<WebElement> rows1 = driver.findElements(By.xpath("//*[@id=\"pn_id_83-table\"]/tbody/tr[1]"));
                System.out.println(rows1);
            }catch (Exception ex){}

            try {
                try{
                    driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[1]")).click();
                    Pojo_file_for_category_section.timeout2000();
                }catch (Exception ex){}

                try {
                    driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[4]")).click();
                    Pojo_file_for_category_section.timeout2000();
                }catch (Exception ex) {
                    driver.findElement(selectCategoryFromList);
                    Pojo_file_for_category_section.timeout2000();
                }
                driver.findElement(addSubcategoryBtn).click();
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(saveBtnOfSubcategory).click();
                Pojo_file_for_category_section.timeout2000();

                try {
                    if (driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/app-new-sub-category/div[1]/div/div/div[2]/div")).isDisplayed()) {
                        Assert.assertEquals(true, true, "Display validation under sub category name field when click save button without filling field");
                    }else{
                        Assert.assertEquals(true, false, "Not Display validation under sub category name field when click save button without filling field");
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }catch (Exception ex){}

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }
    }

    //This method used to create  sub category
    public boolean create_sub_categoryfrom_list(String subcategoryName){
        boolean status = true;
        try{
            try{
                driver.findElement(addSubcategoryBtn).click();
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(subcategoryField).sendKeys(subcategoryName);
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(saveBtnOfSubcategory).click();
                Pojo_file_for_category_section.timeout2000();
            }catch (Exception ex){}

            driver.findElement(subcategoryField).sendKeys(subcategoryName);
            Pojo_file_for_category_section.timeout2000();
            driver.findElement(saveBtnOfSubcategory).click();
            Pojo_file_for_category_section.timeout2000();

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[2]/div/div[2]/div/p-table/div/div/table/tbody"));
                String val = ele.getText();
                System.out.println(val);

                if(val.contains(subcategoryName)){
                    Assert.assertEquals(true,true,"Display newly created sub category inside list");
                }else{
                    Assert.assertEquals(true,false,"Not display newly created sub category inside list");
                }

            }catch (Exception ex){
                System.out.println(ex);
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }
    }

    //This mehtod used to click update button of sub category when remove name
    public boolean edit_category_fromList_method1(){
        boolean status = true;
        try{
            try {
                List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"pn_id_12-table\"]/tbody"));
                int numOfRecordsList = elements.size();
                //int numOfRecords = (numOfRecordsList - 1);
                System.out.println(numOfRecordsList);

                List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pn_id_12-table\"]/tbody"));
                System.out.println(rows);

                List<WebElement> rows1 = driver.findElements(By.xpath("//*[@id=\"pn_id_12-table\"]/tbody/tr[1]"));
                System.out.println(rows1);
            }catch (Exception ex){}

            try {
                driver.findElement(By.id("inventory-system_category_edit_BUTTON4")).click();
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(categorynameField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(updateBtnOfeditCategory).click();
                Pojo_file_for_category_section.timeout2000();

            }catch (Exception ex){
                driver.findElement(By.id("inventory-system_category_edit_BUTTON1")).click();
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(categorynameField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(updateBtnOfeditCategory).click();
                Pojo_file_for_category_section.timeout2000();
            }

            try{
                if(driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/app-new-category/div[1]/div/div/div/div")).isDisplayed()){
                    Assert.assertEquals(true,true,"When click update button without category name , display validation");
                }else{
                    Assert.assertEquals(true,false,"When click update button without category name , not display validation");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }
    }

    //This method used to click update button of selected sub category without name
    public boolean edit_selected_category_from_list(String updatenmae){
        boolean status = true;
        try{
            try {
                List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"pn_id_12-table\"]/tbody"));
                int numOfRecordsList = elements.size();
                //int numOfRecords = (numOfRecordsList - 1);
                System.out.println(numOfRecordsList);

                List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pn_id_12-table\"]/tbody"));
                System.out.println(rows);

                List<WebElement> rows1 = driver.findElements(By.xpath("//*[@id=\"pn_id_12-table\"]/tbody/tr[1]"));
                System.out.println(rows1);
            }catch (Exception ex){}

            try{
                driver.findElement(By.id("inventory-system_category_edit_BUTTON1")).click();
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(categorynameField).sendKeys(updatenmae);
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(updateBtnOfeditCategory).click();
                Pojo_file_for_category_section.timeout2000();

            }catch (Exception ex){
                driver.findElement(categorynameField).sendKeys(updatenmae);
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(updateBtnOfeditCategory).click();
                Thread.sleep(2000);
            }

            try{
                WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody"));
                String val = ele.getText();
                System.out.println(val);

                if(val.contains(updatenmae)){
                    Assert.assertEquals(true,true,"Display updated category name from list");
                }else{
                    Assert.assertEquals(true,false,"Not Display updated category name from list");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }
    }

    //This method used to update sub category
    public boolean edit_subCategory_from_list_method1(){
        boolean status = true;
        try{
            try {
                List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"pn_id_13-table\"]/tbody"));
                int numOfRecordsList = elements.size();
                //int numOfRecords = (numOfRecordsList - 1);
                System.out.println(numOfRecordsList);

                List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pn_id_13-table\"]/tbody"));
                System.out.println(rows);

                List<WebElement> rows1 = driver.findElements(By.xpath("//*[@id=\"pn_id_13-table\"]/tbody/tr"));
                System.out.println(rows1);
            }catch (Exception ex){}


                try {
                    driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[4]")).click();
                    Pojo_file_for_category_section.timeout2000();
                }catch (Exception ex){
                    driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[1]")).click();
                    Pojo_file_for_category_section.timeout2000();
                }
                driver.findElement(editBtnofsubcategory).click();
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(subcategoryField).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(updateBtnOfSubcategory).click();
                Pojo_file_for_category_section.timeout2000();

                try{
                    if(driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/app-new-sub-category/div[1]/div/div/div[2]/div")).isDisplayed()){
                        Assert.assertEquals(true,true,"Display validation under sub category name field when click update button without name");
                    }else{
                        Assert.assertEquals(true,false,"Not display validation under sub category name field when click update button without name");
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }
    }

    //This method used eidt sub actegory
    public boolean edit_subcategfory_from_list_method2(String updateSubcategory){
        boolean status = true;
        try{
            try{
                driver.findElement(editBtnofsubcategory).click();
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(subcategoryField).sendKeys(updateSubcategory);
                Pojo_file_for_category_section.timeout2000();
                driver.findElement(updateBtnOfSubcategory).click();
                Pojo_file_for_category_section.timeout2000();
            }catch (Exception ex){}

            driver.findElement(subcategoryField).sendKeys(updateSubcategory);
            Pojo_file_for_category_section.timeout2000();
            driver.findElement(updateBtnOfSubcategory).click();
            Thread.sleep(4000);

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[2]/div/div[2]/div/div/div")).isDisplayed()){
                    Assert.assertEquals(true,false,"Not display updated sub category , display message inside sub category table");
                }else{
                    Assert.assertEquals(true,true,"Display updated sub category inside sub category table");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }
    }

    //This method used to clcik delete option of selected  category
    public boolean delete_selected_category_from_list(){
        boolean status = true;
        try{
            try {
                List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"pn_id_12-table\"]/tbody"));
                int numOfRecordsList = elements.size();
                //int numOfRecords = (numOfRecordsList - 1);
                System.out.println(numOfRecordsList);

                List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pn_id_12-table\"]/tbody"));
                System.out.println(rows);

                List<WebElement> rows1 = driver.findElements(By.xpath("//*[@id=\"pn_id_12-table\"]/tbody/tr[1]"));
                System.out.println(rows1);
            }catch (Exception ex){}

            try {
                driver.findElement(By.id("inventory-system_category_edit_BUTTON3")).click();
                Pojo_file_for_category_section.timeout2000();
            }catch (Exception ex){
                driver.findElement(By.id("inventory-system_category_edit_BUTTON4")).click();
                Pojo_file_for_category_section.timeout2000();
            }
            driver.findElement(deleteOptionofselectedCategory).click();
            Pojo_file_for_category_section.timeout2000();
            driver.findElement(deleteBtnOfselectedcategory).click();
            Pojo_file_for_category_section.timeout2000();

            try{
                if(driver.findElement(By.id("exampleModalLabel")).isDisplayed()){
                    Assert.assertEquals(true,true,"Display validation popup when click delete option of category which use for create product item");
                }else{
                    Assert.assertEquals(true,false,"Not display validation popup when click delete option of category which use for create product item");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }
    }

    //This method used to click delete option of selected sub category
    public boolean delete_subcategory_from_list(){
        boolean status = true;
        try{
            try {
                List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"pn_id_13-table\"]/tbody"));
                int numOfRecordsList = elements.size();
                //int numOfRecords = (numOfRecordsList - 1);
                System.out.println(numOfRecordsList);

                List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"pn_id_13-table\"]/tbody"));
                System.out.println(rows);

                List<WebElement> rows1 = driver.findElements(By.xpath("//*[@id=\"pn_id_13-table\"]/tbody/tr"));
                System.out.println(rows1);
            }catch (Exception ex){}

            try {
                driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[4]")).click();
                Pojo_file_for_category_section.timeout2000();
            }catch (Exception ex){
                driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[1]/div/div[2]/div/p-table/div/div/table/tbody/tr[1]")).click();
                Pojo_file_for_category_section.timeout2000();
            }
            driver.findElement(editBtnofsubcategory).click();
            Pojo_file_for_category_section.timeout2000();
            driver.findElement(deleteSubcategoryOption).click();
            Pojo_file_for_category_section.timeout2000();
            driver.findElement(deleteBtnOfsubcategory).click();
            Pojo_file_for_category_section.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/app-category/div/div[3]/div/div/div/h5")).isDisplayed() || driver.findElement(subcategoryField).isDisplayed()){
                    Assert.assertEquals(true,true,"Can't delete sub category which use for create product items so display message");
                }else{
                    Assert.assertEquals(true,false,"Delete sub category which use for create product items so display message");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }

            status= true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"This method is not work");
            status = false;
            return status;
        }

    }

    //This method used to close option of delete popup in sub category
    public boolean close_delete_option_of_subcategory(){
        boolean status = true;
        try{
            driver.findElement(By.id("inventory-system_add-new-subcategory_close_BUTTON2")).click();
            Pojo_file_for_category_section.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true, false, "This method is not works");
            status = false;
            return status;
        }
    }

    ///This method used to close option of delete popup in  category
    public boolean close_delete_option_of_category(){
        boolean status = true;
        try{
            driver.findElement(By.id("inventory-system_add-new-category_close_BUTTON2")).click();
            Pojo_file_for_category_section.timeout2000();

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
