package Smartstack.net.Ecommerce.Running_java_files;

import Smartstack.net.Ecommerce.Pojo_files.Pojo_file_for_update_delete_product;
import Smartstack.net.First_Test_Files.First_test_file_for_smartstack;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Update_delete_product {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Pojo_file_for_update_delete_product obj2;

    int pass_count;
    int fail_count;
    int total_count;
    ArrayList<String> pass_method_list = new ArrayList<String>();
    ArrayList<String> fail_method_list = new ArrayList<String>();
    static ExtentTest test;
    static ExtentReports report;

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void timeout3000(){
        try{
            Thread.sleep(3000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @BeforeClass
    public void beforeClass() {
        try{
            WebDriverManager.edgedriver().setup();//Setup the chrome driver
//            ChromeOptions ops = new ChromeOptions();
//            ops.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver();
            driver.manage().deleteAllCookies();
            Thread.sleep(7000);
            driver.get("https://performance.smartstak.net/");//Give the URL
            driver.manage().window().maximize(); //maximize the browser window
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 1)
    public void test_move_to_Ecommerce_section() {

        total_count ++;
        try{
            obj1 = new First_test_file_for_smartstack(driver);
            boolean status = obj1.test_loginSection_with_password_and_code();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_login_to_the_system"),"Test Passed:  Move to the system");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_login_to_the_system"),"Test Failed:  Can't move to the system");
            }

            Update_delete_product.timeout2000();

            boolean status1 = obj1.test_move_to_ecommerce_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_ecommerce_section"),"Test Passed:  Move to the Ecommerce section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_ecommerce_section"),"Test Failed:  Can't move to the Ecommerce section");
            }

            Update_delete_product.timeout2000();

            boolean status2 = obj1.test_move_product_tab();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_product_tab"),"Test Passed:  Move to the product tab of Ecommerce section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_product_tab"),"Test Failed:  Can't move to the product tab of Ecommerce section");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_search_newly_create_product() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_search_newly_create_product("testApril1Product1");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_newly_create_product"),"Test Passed:  Search product and move to edit section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_newly_create_product"),"Test Failed:  Can't search product and move to edit section");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_manage_expandable_content_section_editProduct_section() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_manage_expandable_content_section_editProduct_section();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_manage_expandable_content_section_editProduct_section"),"Test Passed:  Manage expandable content section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_manage_expandable_content_section_editProduct_section"),"Test Failed:  Can't manage expandable content section");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_create_expandable_content_with_invalidData() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_create_expandable_content_with_invalidData("%$#&*");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_expandable_content_with_invalidData"),"Test Passed:  enter invalid data to title section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_expandable_content_with_invalidData"),"Test Failed:  Can't enter invalid data to title section");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_create_edit_delete_manage_expandable_content_section() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_create_edit_delete_manage_expandable_content_section("test expandable 1","Create expandable content","Update expandable content");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_edit_delete_manage_expandable_content_section"),"Test Passed:  Create/update/delete expandable content");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_edit_delete_manage_expandable_content_section"),"Test Failed:  Can't create/update/delete expandable content");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_inventory_section_of_edit_product() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_inventory_section_of_edit_product("*&%$#","Create SKU","Create barcode");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_inventory_section_of_edit_product"),"Test Passed:  Create inventory section of edit product");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_inventory_section_of_edit_product"),"Test Failed:  Can't create inventory section of edit product");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_quantity_and_shipping_section_of_edit_product() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_quantity_and_shipping_section_of_edit_product("100","957308467387333333333333556444423456745765");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_quantity_and_shipping_section_of_edit_product"),"Test Passed:  Enter invalid quantity shipping amount");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_quantity_and_shipping_section_of_edit_product"),"Test Failed:  Can't enter invalid quantity shipping amount");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_varient_section_of_edit_product() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_varient_section_of_edit_product("Size","XL");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_varient_section_of_edit_product"),"Test Passed:  Create/update/delete varient for edit product");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_varient_section_of_edit_product"),"Test Failed:  Can't create/update/delete varient for edit product");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 9)
    public void test_seo_section_of_edit_product() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_seo_section_of_edit_product("google","XLcreate site","keywords");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_seo_section_of_edit_product"),"Test Passed:  Update SEO section of edit product");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_seo_section_of_edit_product"),"Test Failed:  Can't update SEO section of edit product");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 10)
    public void test_vendor_section() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_vendor_section();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_vendor_section"),"Test Passed: Deleting selected vendor");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_vendor_section"),"Test Failed:  Can't delete selected vendor");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 11)
    public void test_select_couponCode_and_discount_for_edit_product() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_update_delete_product(driver);
            boolean status = obj2.test_select_couponCode_and_discount_for_edit_product("1");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_select_couponCode_and_discount_for_edit_product"),"Test Passed: SElect coupon code and discount");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_select_couponCode_and_discount_for_edit_product"),"Test Failed:  Can't select coupon code and discount");
            }

            Update_delete_product.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
