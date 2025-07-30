package Smartstack.net.Ecommerce.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_add_product {

    By addProductBtn = By.id("eCommerce_product-list_AddProduct_BUTTON");   By addproductLink = By.id("eCommerce_product-list_ProductOptions_AddNewProduct");   By saveBtnOfAddProduct = By.id("eCommerce_add-product_Main_Buttons_Save");
    By productTitleInput = By.id("eCommerce_add-product_ProductTitle_INPUT");   By productes = By.xpath("//*[@id=\"Elements_text_editor5_main\"]/div/div[2]/ckeditor/div[2]/div[2]/div");
    By productPriceInput = By.id("eCommerce_add-product_Pricing_INPUT");    By costInput = By.id("eCommerce_add-product_Cost_INPUT");   By vendorField = By.id("eCommerce_add-product_Input-sectiont_vendor_INPUT");
    By searchField = By.id("eCommerce_product_Search_INPUT");    By editOption = By.id("eCommerce_product-list_Update_BUTTON_0");
    WebDriver driver;

    public Pojo_file_for_add_product(WebDriver driver) {
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

    public boolean test_move_add_product_section(){
        boolean status = true;
        try{
            driver.findElement(addProductBtn).click();
            Pojo_file_for_add_product.timeout2000();
            driver.findElement(addproductLink).click();
            Pojo_file_for_add_product.timeout2000();
            driver.findElement(saveBtnOfAddProduct).click();
            Pojo_file_for_add_product.timeout2000();

            try{
                if(driver.findElement(By.id("eCommerce_product-list_tr_0")).isDisplayed()){
                    Assert.assertEquals(true,false,"When click save button without filling fields , not display validation");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display add product button");
            status = false;
            return status;
        }
    }

    public boolean test_add_product_with_invalidData(String title, String description, String invalidprice, String invalidcost, String invalidvendor){
        boolean status = true;
        try{
            driver.findElement(productTitleInput).sendKeys(title);
            Pojo_file_for_add_product.timeout2000();
            try {
                driver.findElement(productes).sendKeys(description);
                Pojo_file_for_add_product.timeout2000();
            }catch (Exception ex){}
            WebElement ele1 = driver.findElement(productPriceInput);
            ele1.sendKeys(invalidprice);
            Pojo_file_for_add_product.timeout2000();
            WebElement eel2 = driver.findElement(costInput);
            ele1.sendKeys(invalidcost);
            Pojo_file_for_add_product.timeout2000();
            WebElement ele3 = driver.findElement(vendorField);
            ele3.sendKeys(invalidvendor);

            try{
                String val1 = ele1.getAttribute("value");
                String val2 = eel2.getAttribute("value");
                String val3 = ele3.getAttribute("value");

                if(val3.equals(invalidprice) || val2.equals(invalidcost) || val3.equals(invalidvendor)){
                    Assert.assertEquals(true,false,"Create product with entering invalid data to price, cost and vendor sections");
                }
            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_add_product_with_validData(String price, String cost, String vendor){
        boolean status = true;
        try{
            driver.findElement(productPriceInput).clear();
            driver.findElement(productPriceInput).sendKeys(price);
            Pojo_file_for_add_product.timeout2000();
            driver.findElement(costInput).clear();
            driver.findElement(costInput).sendKeys(cost);
            Pojo_file_for_add_product.timeout2000();
            driver.findElement(vendorField).clear();
            driver.findElement(vendorField).sendKeys(vendor);
            Pojo_file_for_add_product.timeout2000();
            driver.findElement(saveBtnOfAddProduct).click();
            Pojo_file_for_add_product.timeout2000();

            try{
                if(driver.findElement(productTitleInput).isEnabled()){
                    Assert.assertEquals(true,false,"After filling required fields of add product section , not creating product so not move to the product list");
                }
            }catch (Exception ex){}


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display add product section");
            status = false;
            return status;
        }
    }

    public boolean test_search_newly_create_product(String arg1){
        boolean status = true;
        try{
            driver.findElement(searchField).sendKeys(arg1);
            Pojo_file_for_add_product.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display newly created product so not display it when searching");
            status = false;
            return status;
        }
    }



}
