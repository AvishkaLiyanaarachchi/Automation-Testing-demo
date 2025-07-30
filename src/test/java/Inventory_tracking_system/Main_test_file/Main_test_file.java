package Inventory_tracking_system.Main_test_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Main_test_file {

    By logoutOption = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/li[3]/a");    By categoryLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/ul/li[1]/a");
    By productGroupLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/ul/li[2]/a");     By productItemLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/ul/li[3]/a");
    By vendorLink = By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/ul/li[4]/a");
    WebDriver driver;

    public Main_test_file(WebDriver driver) {
        this.driver = driver;
    }

    Page_factory_pattern obj;

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    //This method used to create object for page factory class and call their method
    public boolean test_login_method1(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.clickSigninBtn_without_EmailAndPassword();
            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    //This method used to create object for page factory class and call their method
    public boolean test_login_method2(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.click_signIn_bto_with_emailAddress("admin@gmail.com");
            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    //This method used to create object for page factory class and call their method
    public boolean test_login_method3(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.click_signIn_btn_with_password("123");
            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    //This method used to create object for page factory class and call their method
    public boolean test_login_method4(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.click_signIn_btn_with_invalid_emailAddress_and_password("hdsjhdsj","kjs");

            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    //This method used to create object for page factory class and call their method
    public boolean test_login_method5(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.click_login_btn_with_valid_emailAddress_and_password("admin@gmail.com","123");

            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    //This method used to logout from the system
    public boolean logout_from_the_system(){
        boolean status = true;
        try{
            driver.findElement(logoutOption).click();
            Thread.sleep(4000);

            try{
                if(driver.findElement(By.id("inventory-system_login_email_INPUT")).isDisplayed()){
                    Assert.assertEquals(true,true,"Successfully logout from the system");
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Successfully logout from the system");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true, false, "This method is not works , display exception");
            status = false;
            return status;
        }
    }

    //This method used to move product category
    public boolean moveTo_category_section(){
        boolean status = true;
        try{
            try{
                driver.findElement(By.id("inventory-system_add-new-product-item_close_BUTTON2"));
                Main_test_file.timeout2000();
            }catch (Exception ex){}
            driver.findElement(categoryLink).click();
            Thread.sleep(3000);

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true, false, "This method is not works , display exception");
            status = false;
            return status;
        }
    }

    //This used to move to product group
    public boolean moveTo_product_group_section(){
        boolean status = true;
        try{
            driver.findElement(productGroupLink).click();
            Thread.sleep(3000);

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true, false, "This method is not works , display exception");
            status = false;
            return status;
        }
    }

    //This used to move to product item
    public boolean moveTo_product_item_section(){
        boolean status = true;
        try{
            driver.findElement(productItemLink).click();
            Thread.sleep(3000);

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true, false, "This method is not works , display exception");
            status = false;
            return status;
        }
    }

    //This used to move to vendor section
    public boolean moveTo_vendor_section(){
        boolean status = true;
        try{
            driver.findElement(vendorLink).click();
            Thread.sleep(3000);

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true, false, "This method is not works , display exception");
            status = false;
            return status;
        }
    }

}
