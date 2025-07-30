package Inventory_tracking_system.Running_test_files;

import Inventory_tracking_system.Main_test_file.Main_test_file;
import Inventory_tracking_system.Pojo_files.Pojo_file_for_Product_group;
import Inventory_tracking_system.Pojo_files.Pojo_file_for_category_section;
import Inventory_tracking_system.Pojo_files.Pojo_file_for_product_item;
import Inventory_tracking_system.Pojo_files.Pojo_file_for_vendor_section;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Objects;

public class Inventory_system {

    WebDriver driver;

    Main_test_file obj;
    Pojo_file_for_category_section obj2;
    Pojo_file_for_Product_group obj3;
    Pojo_file_for_vendor_section obj4;
    Pojo_file_for_product_item obj5;
    int pass_count;
    int fail_count;
    int total_count;
    ArrayList<String> pass_method_list = new ArrayList<String>();
    ArrayList<String> fail_method_list = new ArrayList<String>();

    static ExtentTest test;
    static ExtentReports report;

    public static void timeout2000() {
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @BeforeClass
    public static void startTest()
    {
        report = new ExtentReports("./Inventory_System_Test_Reports/Login_section_report.html");
        report.addSystemInfo("Inventory Tracking System","Login section");
        report.addSystemInfo("Category","Add/update/delete category and sub category");
        test = report.startTest("Add/update/delete category and sub category");
    }

    //THis method run before all methods
    @BeforeClass
    public void beforeClass() {
        try {
            WebDriverManager.chromedriver().setup();//Setup the chrome driver
//            ChromeOptions ops = new ChromeOptions();
//            ops.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver();
            //driver.manage().deleteAllCookies();
            //Thread.sleep(5000);
            driver.get("https://inventory.iitcglobal.net/");//Give the URL
            driver.manage().window().maximize(); //maximize the browser window
            //Thread.sleep(5000);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    @Test(priority = 1)
    public void test_login_section_method1() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_method1();
            if(status == true){
                pass_count++;

                Assert.assertEquals(true, pass_method_list.add("test_login_method1"), "Test Passed:-  Display validation under email address and password feilds when click sign in button without data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_method1"), "Test failed:-  Not display validation under email address and password feilds when click sign in button without data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 1)
    public void test_login_section_method2() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_method2();
            if(status == true){
                pass_count++;

                Assert.assertEquals(true, pass_method_list.add("test_login_method2"), "Test Passed:-  Display validation under  password feilds when click sign in button without data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_method2"), "Test failed:-  Not display validation under password feilds when click sign in button without data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 3)
    public void test_login_section_method3() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_method3();
            if(status == true){
                pass_count++;

                Assert.assertEquals(true, pass_method_list.add("test_login_method3"), "Test Passed:-  Display validation under  email address feild when click sign in button without data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_method3"), "Test failed:-  Not display validation under email address feild when click sign in button without data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 4)
    public void test_login_section_method4() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_method4();
            if(status == true){
                pass_count++;

                Assert.assertEquals(true, pass_method_list.add("test_login_method4"), "Test Passed:-  Display validation under  email address and password feilds with invalid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_method4"), "Test failed:-  Not display validation under email address and password feilds with invalid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 5)
    public void test_login_section_method5() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_method5();
            if(status == true){
                pass_count++;

                Assert.assertEquals(true, pass_method_list.add("test_login_method5"), "Test Passed:-  Move to the dashboard with valid account details");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_method5"), "Test failed:-  Not move to the dashboard with valid account details");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 6)
    public void test_move_to_category_section_and_create_category_method1() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.move_to_category_section_and_create_category_method1();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_category_section_and_create_category_method1"), "Test Passed:-  MOve to category section craete category");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_category_section_and_create_category_method1"), "Test failed:-  Can't mOve to category section craete category");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 7)
    public void test_create_new_category_inside_categoryTable() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.create_new_category_inside_categoryTable("wood");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("create_new_category_inside_categoryTable"), "Test Passed:-  Create new category from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("create_new_category_inside_categoryTable"), "Test failed:-  Can't create new category from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 8)
    public void test_create_subCategoryfrom_list() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.create_subCategoryfrom_list();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("create_subCategoryfrom_list"), "Test Passed:- Move to subcategory list and  Create new sub category from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("create_subCategoryfrom_list"), "Test failed:-  Can't Move to subcategory list and  Create new sub category from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 9)
    public void test_create_sub_categoryfrom_list() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.create_sub_categoryfrom_list("jac wood");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("create_sub_categoryfrom_list"), "Test Passed:-Create new sub category from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("create_sub_categoryfrom_list"), "Test failed:-  Can't Create new sub category from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 10)
    public void test_edit_category_fromList_method1() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.edit_category_fromList_method1();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_category_fromList_method1"), "Test Passed:-Move to edit sub category section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_category_fromList_method1"), "Test failed:-  Can't Move to edit sub category section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 11)
    public void test_edit_selected_category_from_list() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.edit_selected_category_from_list("Wood1");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_selected_category_from_list"), "Test Passed:-Update sub category from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_selected_category_from_list"), "Test failed:- Can't update sub category from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 12)
    public void test_edit_subCategory_from_list_method1() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.edit_subCategory_from_list_method1();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_subCategory_from_list_method1"), "Test Passed:-Update sub category from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_subCategory_from_list_method1"), "Test failed:- Can't update sub category from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 13)
    public void test_edit_subcategfory_from_list_method2() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.edit_subcategfory_from_list_method2("jac wood1");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_subcategfory_from_list_method2"), "Test Passed:-Update sub category from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_subcategfory_from_list_method2"), "Test failed:- Can't update sub category from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 14)
    public void test_moveTo_vendor_search_vendor_by_invalidData() {
        total_count++;
        try{
            obj4 = new Pojo_file_for_vendor_section(driver);
            boolean status = obj4.moveTo_vendor_search_vendor_by_invalidData("jdfhjh746732");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_vendor_search_vendor_by_invalidData"), "Test Passed:- search vendor list with entering invalid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_vendor_search_vendor_by_invalidData"), "Test failed:- Can't search vendor list with entering invalid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 15)
    public void test_search_vendor_with_validData() {
        total_count++;
        try{
            obj4 = new Pojo_file_for_vendor_section(driver);
            boolean status = obj4.search_vendor_with_validData("Default");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_vendor_with_validData"), "Test Passed:- search vendor list with entering valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_vendor_with_validData"), "Test failed:- Can't search vendor list with entering valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 16)
    public void test_moveTo_add_vendor_and_click_saveBtn_without_data() {
        total_count++;
        try{
            obj4 = new Pojo_file_for_vendor_section(driver);
            boolean status = obj4.moveTo_add_vendor_and_click_saveBtn_without_data();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_add_vendor_and_click_saveBtn_without_data"), "Test Passed:- Display validation when click save button without filling data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_add_vendor_and_click_saveBtn_without_data"), "Test failed:- Not Display validation when click save button without filling data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }
    @Test(priority = 17)
    public void test_create_new_vendor_inside_list() {
        total_count++;
        try{
            obj4 = new Pojo_file_for_vendor_section(driver);
            boolean status = obj4.create_new_vendor_inside_list("new vendor1");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("create_new_vendor_inside_list"), "Test Passed:- Create new vendor inside vendor table");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("create_new_vendor_inside_list"), "Test failed:- Can't Create new vendor inside vendor table");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 18)
    public void test_edit_selected_vendor_inside_list_method1() {
        total_count++;
        try{
            obj4 = new Pojo_file_for_vendor_section(driver);
            boolean status = obj4.edit_selected_vendor_inside_list_method1();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_selected_vendor_inside_list_method1"), "Test Passed:- Move to edit section and click update button without vendor name");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_selected_vendor_inside_list_method1"), "Test failed:- Can't move to edit section and click update button without vendor name");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 19)
    public void test_edit_selected_vendor_from_list_method2() {
        total_count++;
        try{
            obj4 = new Pojo_file_for_vendor_section(driver);
            boolean status = obj4.edit_selected_vendor_from_list_method2("Update new vendor");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_selected_vendor_from_list_method2"), "Test Passed:- Move to edit section and update vendor");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_selected_vendor_from_list_method2"), "Test failed:- Can't move to edit section and update vendor");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 20)
    public void test_moveTo_product_item_and_search_with_invalidData() {
        total_count++;
        try{
            obj5 = new Pojo_file_for_product_item(driver);
            boolean status = obj5.moveTo_product_item_and_search_with_invalidData("dfhd7632");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_product_item_and_search_with_invalidData"), "Test Passed:- Search product item with invalid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_product_item_and_search_with_invalidData"), "Test failed:- Can't search product item with invalid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }


    }

    @Test(priority = 21)
    public void test_search_product_with_validdata() {
        total_count++;
        try{
            obj5 = new Pojo_file_for_product_item(driver);
            boolean status = obj5.search_product_with_validdata("Iphone");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_product_with_validdata"), "Test Passed:- Search product item with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_product_with_validdata"), "Test failed:- Can't search product item with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }


    }

    @Test(priority = 22)
    public void test_moveTo_add_product_item_andclcik_save_btn_without_filling_fields() {
        total_count++;
        try{
            obj5 = new Pojo_file_for_product_item(driver);
            boolean status = obj5.moveTo_add_product_item_andclcik_save_btn_without_filling_fields();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_add_product_item_andclcik_save_btn_without_filling_fields"), "Test Passed:- Display validation when click save button without data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_add_product_item_andclcik_save_btn_without_filling_fields"), "Test failed:- Not Display validation when click save button without data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }


    }

    @Test(priority = 23)
    public void test_add_product_item_for_list_method1() {
        total_count++;
        try{
            obj5 = new Pojo_file_for_product_item(driver);
            boolean status = obj5.add_product_item_for_list_method1("new table","1500.00","2000.00","20","01/10/2024","08/10/2024","ZAB0001A1B","22/11/2024");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_product_item_for_list_method1"), "Test Passed:- Create new product item");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_product_item_for_list_method1"), "Test failed:- Can't Create new product item");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }


    }

    @Test(priority = 24)
    public void test_aadd_product_for_list_method2() {
        total_count++;
        try{
            obj5 = new Pojo_file_for_product_item(driver);
            boolean status = obj5.add_product_for_list_method2();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_product_for_list_method2"), "Test Passed:- Create new product item");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_product_for_list_method2"), "Test failed:- Can't create new product item");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }


    }

    @Test(priority = 25)
    public void test_edit_selected_product_item_from_list_method1() {
        total_count++;
        try{
            obj5 = new Pojo_file_for_product_item(driver);
            boolean status = obj5.edit_selected_product_item_from_list_method1("-3","-5","-7","-40","ZAB11102ab");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_selected_product_item_from_list_method1"), "Test Passed:- Enter minus value for edit product item section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_selected_product_item_from_list_method1"), "Test failed:- Can't enter minus value for edit product item section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }


    }


    @Test(priority = 26)
    public void test_edit_selected_product_group_from_list_method2() {
        total_count++;
        try{
            obj5 = new Pojo_file_for_product_item(driver);
            boolean status = obj5.edit_selected_product_group_from_list_method2("dfsd545","Black","sdhkjsah344354","XS","new table1");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_selected_product_group_from_list_method2"), "Test Passed:- Updating selected product item from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_selected_product_group_from_list_method2"), "Test failed:- Can't update selected product item from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }


    }


    @Test(priority = 27)
    public void test_bulk_upload_section() {
        total_count++;
        try{
            obj5 = new Pojo_file_for_product_item(driver);
            boolean status = obj5.bulk_upload_section();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("bulk_upload_section"), "Test Passed:- Bulk upload option is work");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("bulk_upload_section"), "Test failed:- Not works bulk upload option");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }


    }

    @Test(priority = 28)
    public void test_search_product_group_with_invalidData() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_Product_group(driver);
            boolean status = obj3.search_product_group_with_invalidData("dfdsf23432");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_product_group_with_invalidData"), "Test Passed:- Not display data when searching with invalid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_product_group_with_invalidData"), "Test failed:- Display data when searching with invalid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 29)
    public void test_search_product_group_with_validdata() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_Product_group(driver);
            boolean status = obj3.search_product_group_with_validdata("Red kolor shirt");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_product_group_with_validdata"), "Test Passed:- Display data when searching with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_product_group_with_validdata"), "Test failed:- Not display data when searching with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 30)
    public void test_click_save_btn_without_fillingFields() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_Product_group(driver);
            boolean status = obj3.click_save_btn_without_fillingFields();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_save_btn_without_fillingFields"), "Test Passed:- Display validation when click save button without filling fields");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_save_btn_without_fillingFields"), "Test failed:- Not display validation when click save button without filling fields");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 31)
    public void test_create_product_group() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_Product_group(driver);
            boolean status = obj3.create_product_group("Test product1","ZZSS123");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("create_product_group"), "Test Passed:- Create product group from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("create_product_group"), "Test failed:- Can't create product group from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 32)
    public void test_moveTo_edit_product_group_and_see_product_Item() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_Product_group(driver);
            boolean status = obj3.moveTo_edit_product_group_and_see_product_Item();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_edit_product_group_and_see_product_Item"), "Test Passed:- Move to product group and see the selected product item");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_edit_product_group_and_see_product_Item"), "Test failed:- Move to product group and can't see the selected product item");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 33)
    public void test_update_selected_product_group() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_Product_group(driver);
            boolean status = obj3.update_selected_product_group("Update test product1","ABc123","Update test product");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("update_selected_product_group"), "Test Passed:- Updating selected product group from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("update_selected_product_group"), "Test failed:- Can't updating selected product group from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 34)
    public void test_moveTo_category_section() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.moveTo_category_section();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_category_section"), "Test Passed:- Move to category section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_category_section"), "Test failed:- Can't move to category section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 35)
    public void test_delete_subcategory_from_list() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.delete_subcategory_from_list();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("delete_subcategory_from_list"), "Test Passed:- Deleting selected sub category");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("delete_subcategory_from_list"), "Test failed:- Can't delete selected_sub category");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 36)
    public void test_close_delete_option_of_subcategory() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.close_delete_option_of_subcategory();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("close_delete_option_of_subcategory"), "Test Passed:- Closing delete option popup");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("close_delete_option_of_subcategory"), "Test failed:- Can't closing delete option popup");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 37)
    public void test_delete_selected_category_from_list() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.delete_selected_category_from_list();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("delete_selected_category_from_list"), "Test Passed:- Deleting selected product group");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("delete_selected_category_from_list"), "Test failed:- Can't delete_selected_product_group");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 38)
    public void test_close_delete_option_of_category() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.close_delete_option_of_category();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("close_delete_option_of_category"), "Test Passed:- Closing delete option popup of category");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("close_delete_option_of_category"), "Test failed:- Can't closing delete option popup of category");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 39)
    public void test_moveTo_vendor_section() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.moveTo_vendor_section();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_vendor_section"), "Test Passed:- Move to vendor section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_vendor_section"), "Test failed:- Can't move to vendor section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 40)
    public void test_deleting_selected_vendor_from_list() {
        total_count++;
        try{
            obj4 = new Pojo_file_for_vendor_section(driver);
            boolean status = obj4.deleting_selected_vendor_from_list();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("deleting_selected_vendor_from_list"), "Test Passed:- Deleting selected vendor from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("deleting_selected_vendor_from_list"), "Test failed:- Can't deleting selected vendor from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 41)
    public void test_moveTo_product_group_section() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.moveTo_product_group_section();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_product_group_section"), "Test Passed:- Move to product group section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_product_group_section"), "Test failed:- Can't move to product group section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 42)
    public void test_delete_selected_product_group() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_Product_group(driver);
            boolean status = obj3.delete_selected_product_group();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("delete_selected_product_group"), "Test Passed:- Deleting selected product group");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("delete_selected_product_group"), "Test failed:- Can't deleting selected product group");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 43)
    public void test_moveTo_product_item_section() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.moveTo_product_item_section();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_product_item_section"), "Test Passed:- Move to product item section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_product_item_section"), "Test failed:- Can't move to product item section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }


    @Test(priority = 44)
    public void test_deleting_selected_productItem() {
        total_count++;
        try{
            obj5 = new Pojo_file_for_product_item(driver);
            boolean status = obj5.deleting_selected_productItem();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("deleting_selected_productItem"), "Test Passed:- Deleting selected product item");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("deleting_selected_productItem"), "Test failed:- Can't deleting selected product item");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Thread.sleep(4000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 45)
    public void test_moveTo_category_section1() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.moveTo_category_section();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("moveTo_category_section"), "Test Passed:- Move to category section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("moveTo_category_section"), "Test failed:- Can't move to category section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 46)
    public void test_delete_subcategory_from_list1() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.delete_subcategory_from_list();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("delete_subcategory_from_list"), "Test Passed:- Deleting selected sub category");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("delete_subcategory_from_list"), "Test failed:- Can't delete selected_sub category");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 47)
    public void test_delete_selected_category_from_list1() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_category_section(driver);
            boolean status = obj2.delete_selected_category_from_list();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("delete_selected_category_from_list"), "Test Passed:- Deleting selected product group");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("delete_selected_category_from_list"), "Test failed:- Can't delete_selected_product_group");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }


    @Test(priority = 48)
    public void test_logout_from_the_system() {
        total_count++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.logout_from_the_system();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("logout_from_the_system"), "Test Passed:- Logout from the system");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("logout_from_the_system"), "Test failed:- Can't logout from the system");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Inventory_system.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @AfterMethod
    public void getResult(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE)
        {
            //Take base64Screenshot screenshot for extent reports
            String base64Screenshot =
                    "data:image/png;base64," + ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);
            //test.log(LogStatus.FAIL , test.addBase64ScreenShot(base64Screenshot));
            test.log(LogStatus.FAIL , "Test Failed: " +result.getName()+"&nbsp&nbsp\n\n"+
                    "<p><b>"+result.getThrowable()+"<p><b>"+ " " + test.addBase64ScreenShot(base64Screenshot));


        } else if (result.getStatus()==ITestResult.SUCCESS) {
            test.log(LogStatus.PASS, "Test Passed:  "+result.getName());
        }else{
            test.log(LogStatus.SKIP, "Test Skipped: "+result.getName());
        }

    }
    // extent.endTest(test);


//    @AfterClass
//    public void afterClass() {
//        driver.quit();
//    }

    @AfterTest
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }

}
