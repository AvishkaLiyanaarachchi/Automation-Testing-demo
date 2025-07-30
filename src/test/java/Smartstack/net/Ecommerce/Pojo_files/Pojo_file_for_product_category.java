package Smartstack.net.Ecommerce.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Pojo_file_for_product_category {

    By addnewBtn = By.id("eCommerce_product-category_Type_AddNewType_BUTTON");  By categoryInput = By.id("eCommerce_product-category_Type_AddNewType_INPUT");   By confirmTick = By.id("eCommerce_product-category_Type_AddNewType_Check_icon");
    By addnewSubcategoryBtn = By.id("eCommerce_product-category_Subject_AddNewType_AddNew_BUTTON");     By subcategoryInputField = By.id("eCommerce_product-category_Subject_AddNewType_INPUT");    By confirmTickOfsubcategory = By.id("eCommerce_product-category_Subject_AddNewType_Check_icon");
    By selectSubCategory = By.id("eCommerce_product-category_Subject_Name_0");      By addnewBtnofSegment = By.id("eCommerce_product-category_Topic_AddNewType_AddNew_BUTTON");     By segmentInput = By.id("eCommerce_product-category_Topic_AddNewType_INPUT");
    By confirmTickOfsegment = By.id("eCommerce_product-category_Topic_AddNewType_Check_icon");     By selectSegment = By.id("eCommerce_product-category_Topic_Name_0");     By addnewBtnOfsubSegment = By.id("eCommerce_product-category_Category_AddNewType_AddNew_BUTTON");
    By subSegmentInput = By.id("eCommerce_product-category_Category_AddNewType_INPUT");     By confirmTickOfsubsegment = By.id("eCommerce_product-category_Category_AddNewType_Check_icon");    By selectSubsegment = By.id("eCommerce_product-category_Category_Name_0");
    By addNewbtnOfType = By.id("eCommerce_product-category_SubCategory_AddNewType_AddNew_BUTTON");      By inputOftype = By.id("eCommerce_product-category_SubCategory_AddNewType_INPUT");  By confirmTickOftype= By.id("eCommerce_product-category_SubCategory_AddNewType_Check_icon");
    By selectType= By.id("eCommerce_product-category_SubCategory_Name_0");      By addNewVarientBtn = By.id("eCommerce_product-category_SuperCategory_AddNewType_AddNew_BUTTON");   By varientInput = By.id("eCommerce_product-category_SuperCategory_AddNewType_INPUT");
    By confirmTickOfVarient = By.id("eCommerce_product-category_SuperCategory_AddNewType_Check_icon");      By selectVarient = By.id("eCommerce_product-category_SuperCategory_Name_0");

    WebDriver driver;

    public Pojo_file_for_product_category(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    public boolean test_create_product_category_with_invalidData(String invalidData, String validData){
        boolean status = true;
        try{
            driver.findElement(addnewBtn).click();
            Pojo_file_for_product_category.timeout2000();
            try {
                WebElement ele = driver.findElement(categoryInput);
                ele.sendKeys(invalidData);
                Pojo_file_for_product_category.timeout2000();

                try {
                    String val = ele.getAttribute("value");
                    System.out.println(val);
                    if (val.equals(invalidData)) {
                        Assert.assertEquals(true, false, "Enter invalid data when creating product category");
                    }
                } catch (Exception ex) {
                }
            }catch (Exception ex){
                driver.findElement(categoryInput).sendKeys(validData);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTick).click();
                Pojo_file_for_product_category.timeout2000();

                driver.findElement(addnewBtn).click();
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(categoryInput).sendKeys(validData);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTick).click();
                Pojo_file_for_product_category.timeout2000();

                try{
                    if(driver.findElement(By.xpath("//*[@id=\"eCommerce_product-category_Type_Section\"]/div[7]/div/div[2]")).isDisplayed()){
                        Assert.assertEquals(true,false,"Can't create already exist product category");
                    }
                }catch (Exception ex1){
                    Assert.assertEquals(true,false,"Create already exist product category , not display validation");
                }
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display add new button for create product category");
            status = false;
            return status;
        }
    }

    public boolean test_create_product_sub_category(String invalidSubcategory, String validSubcategory){
        boolean status = true;
        try{
            try{
                driver.findElement(confirmTick).click();
                Pojo_file_for_product_category.timeout2000();
            }catch (Exception ex){}

                List<WebElement> elements = driver.findElements(By.xpath("//div[@id='eCommerce_product-category_Type_Section']/div"));
                int numOfRecordsList = elements.size();
                int numOfRecords = (numOfRecordsList - 3);
                System.out.println(numOfRecords);

                driver.findElement(By.id("eCommerce_product-category_Type_Name_"+numOfRecords)).click();
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(addnewSubcategoryBtn).click();
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(addnewSubcategoryBtn).click();
                Pojo_file_for_product_category.timeout2000();
                try {
                    driver.findElement(subcategoryInputField).sendKeys(invalidSubcategory);
                    Pojo_file_for_product_category.timeout2000();
                    driver.findElement(confirmTickOfsubcategory).click();
                    Pojo_file_for_product_category.timeout2000();

                    try {
                        WebElement ele = driver.findElement(selectSubCategory);
                        String val = ele.getText();
                        System.out.println(val);
                        if (val.equals(invalidSubcategory)) {
                            Assert.assertEquals(true, false, "Create sub category using invalid data");
                        }
                    } catch (Exception ex) {
                    }
                }catch (Exception ex){
                    driver.findElement(subcategoryInputField).sendKeys(validSubcategory);
                    Pojo_file_for_product_category.timeout2000();
                    driver.findElement(confirmTickOfsubcategory).click();
                    Pojo_file_for_product_category.timeout2000();
                }

            status = true;
            return  status;

        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display add new button for create product category");
            status = false;
            return status;
        }
    }

    public boolean test_create_segment(String invalidSegment, String validSegment){
        boolean status = true;
        try{
            driver.findElement(selectSubCategory).click();
            Pojo_file_for_product_category.timeout2000();
            driver.findElement(addnewBtnofSegment).click();
            Pojo_file_for_product_category.timeout2000();
            try {
                driver.findElement(segmentInput).sendKeys(invalidSegment);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTickOfsegment).click();
                Pojo_file_for_product_category.timeout2000();

                try{
                    WebElement ele= driver.findElement(selectSegment);
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals(invalidSegment)){
                        Assert.assertEquals(true,false,"Create segment with invalid data");
                    }
                }catch (Exception ex){}
            }catch (Exception ex){
                driver.findElement(segmentInput).sendKeys(validSegment);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTickOfsegment).click();
                Pojo_file_for_product_category.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display add new button of create product category");
            status = false;
            return status;
        }
    }

    public boolean test_create_subsegment(String invalidSubsegment, String validSubsegment){
        boolean status = true;
        try{
            driver.findElement(selectSegment).click();
            Pojo_file_for_product_category.timeout2000();
            driver.findElement(addnewBtnOfsubSegment).click();
            Pojo_file_for_product_category.timeout2000();
            try{
                driver.findElement(subSegmentInput).sendKeys(invalidSubsegment);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTickOfsubsegment).click();
                Pojo_file_for_product_category.timeout2000();
                try{
                    WebElement ele = driver.findElement(selectSubsegment);
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals(invalidSubsegment)){
                        Assert.assertEquals(true,false,"Create sub segment with invalid data");
                    }
                }catch (Exception ex){
                }
            }catch (Exception ex){
                driver.findElement(subSegmentInput).sendKeys(validSubsegment);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTickOfsubsegment).click();
                Pojo_file_for_product_category.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display add new button of create product category");
            status = false;
            return status;
        }
    }

    public boolean test_create_type(String invalidType, String validType){
        boolean status = true;
        try{
            driver.findElement(selectSubsegment).click();
            Pojo_file_for_product_category.timeout2000();
            driver.findElement(addNewbtnOfType).click();
            Pojo_file_for_product_category.timeout2000();
            try{
                driver.findElement(inputOftype).sendKeys(invalidType);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTickOftype).click();
                Pojo_file_for_product_category.timeout2000();

                try{
                    WebElement ele = driver.findElement(selectType);
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals(invalidType)){
                        Assert.assertEquals(true,false,"Create type with invalid data");
                    }
                }catch (Exception ex){}
            }catch (Exception ex){
                driver.findElement(inputOftype).sendKeys(validType);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTickOftype).click();
                Pojo_file_for_product_category.timeout2000();
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display add new button of create product category");
            status = false;
            return status;
        }
    }

    public boolean test_create_varient(String invalidVarient , String validVarient){
        boolean status = true;
        try{
            driver.findElement(selectType).click();
            Pojo_file_for_product_category.timeout2000();
            driver.findElement(addNewVarientBtn).click();
            Pojo_file_for_product_category.timeout2000();
            try{
                driver.findElement(varientInput).sendKeys(invalidVarient);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTickOfVarient).click();
                Pojo_file_for_product_category.timeout2000();

                try{
                    WebElement ele = driver.findElement(selectVarient);
                    String val = ele.getText();
                    System.out.println(val);

                    if(val.equals(invalidVarient)){
                        Assert.assertEquals(true,false,"Create varient with invalid data");
                    }
                }catch (Exception ex){}

            }catch (Exception ex){
                driver.findElement(varientInput).sendKeys(validVarient);
                Pojo_file_for_product_category.timeout2000();
                driver.findElement(confirmTickOfVarient).click();
                Pojo_file_for_product_category.timeout2000();
            }

            status = true;
            return  status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_edit_product_category(String updateCategory){
        boolean status = true;
        try{
            List<WebElement> elements = driver.findElements(By.xpath("//div[@id='eCommerce_product-category_Type_Section']/div"));
            int numOfRecordsList = elements.size();
            int numOfRecords = (numOfRecordsList - 3);
            System.out.println(numOfRecords);

            driver.findElement(By.id("eCommerce_product-category_Type_Popup_button_"+numOfRecords)).click();
            Pojo_file_for_product_category.timeout2000();
            driver.findElement(By.id("eCommerce_product-category_Type_Edit_Click_"+numOfRecords)).click();
            Pojo_file_for_product_category.timeout2000();
            driver.findElement(By.id("eCommerce_product-category_Type_Edit_Name_INPUT_"+numOfRecords)).sendKeys(updateCategory);
            Pojo_file_for_product_category.timeout2000();
            driver.findElement(By.id("eCommerce_product-category_Type_Edit_Check_icon_")).click();  //Not add number of confirm tick in edit product category
            Pojo_file_for_product_category.timeout2000();

            driver.findElement(By.id("eCommerce_product-category_Type_Popup_button_"+numOfRecords)).click();
            Pojo_file_for_product_category.timeout2000();
            driver.findElement(By.id("eCommerce_product-category_Type_Delete_Click_"+numOfRecords)).click();
            Pojo_file_for_product_category.timeout2000();
            driver.findElement(By.id("Elements_alert-box_Delete_BUTTON")).click();
            Pojo_file_for_product_category.timeout2000();

            status = true;
            return  status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }
}
