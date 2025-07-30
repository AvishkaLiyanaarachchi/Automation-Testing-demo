package Smartstack.net.Ecommerce.Running_java_files;

import Smartstack.net.Ecommerce.Pojo_files.Pojo_file_for_add_product;
import Smartstack.net.Ecommerce.Pojo_files.Pojo_file_for_product_section;
import Smartstack.net.First_Test_Files.First_test_file_for_smartstack;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Objects;

public class Product_section {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Pojo_file_for_product_section obj2;
    Pojo_file_for_add_product obj3;

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
    public static void startTest()
    {
        report = new ExtentReports("./Ecommerce_Test_Reports/Product_section_report.html");
        report.addSystemInfo("Smartstack","e-Commerce");
        report.addSystemInfo("performance","Paginations, records per page and search options of product Test Report");
        test = report.startTest("Product");
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

            Product_section.timeout2000();

            boolean status1 = obj1.test_move_to_ecommerce_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_ecommerce_section"),"Test Passed:  Move to the Ecommerce section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_ecommerce_section"),"Test Failed:  Can't move to the Ecommerce section");
            }

            Product_section.timeout2000();

            boolean status2 = obj1.test_move_product_tab();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_product_tab"),"Test Passed:  Move to the product tab of Ecommerce section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_product_tab"),"Test Failed:  Can't move to the product tab of Ecommerce section");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_select_paginations_of_product() {
        total_count++;
        try{
            obj2 =new Pojo_file_for_product_section(driver);
            boolean status = obj2.test_select_paginations_of_product();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_select_paginations_of_product"),"Test Passed:  Select paginations of product list");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_select_paginations_of_product"),"Test Failed: Can't   Select paginations of product list");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_search_product_section() {
        total_count++;
        try{
            obj2 =new Pojo_file_for_product_section(driver);
            boolean status = obj2.test_search_product_section("&*&*%$$#","Test","1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_product_section"),"Test Passed:  Search product and display product");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_product_section"),"Test Failed: Can't Search product and display product");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_search_product_with_fullname() {
        total_count++;
        try{
            obj2 =new Pojo_file_for_product_section(driver);
            boolean status = obj2.test_search_product_with_fullname("Test 1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_product_with_fullname"),"Test Passed:  Search product with full name");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_product_with_fullname"),"Test Failed: Can't  Search product with full name");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_search_product_with_vendorName() {
        total_count++;
        try{
            obj2 =new Pojo_file_for_product_section(driver);
            boolean status = obj2.test_search_product_with_vendorName("Vendor 1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_product_with_vendorName"),"Test Passed:  Search product with vendor name");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_product_with_vendorName"),"Test Failed: Can't  Search product with vwndor name");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_move_option_of_product() {
        total_count++;
        try{
            obj2 =new Pojo_file_for_product_section(driver);
            boolean status = obj2.test_move_option_of_product("%$#&*");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_option_of_product"),"Test Passed:  Move product with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_option_of_product"),"Test Failed: Can't Move product with invalid data");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_move_option_inside_product_list() {
        total_count++;
        try{
            obj2 =new Pojo_file_for_product_section(driver);
            boolean status = obj2.test_move_option_inside_product_list("1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_option_inside_product_list"),"Test Passed:  Move product between list");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_option_inside_product_list"),"Test Failed: Can't Move product between list");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_import_products() {
        total_count++;
        try{
            obj2 =new Pojo_file_for_product_section(driver);
            boolean status = obj2.test_import_products();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_import_products"),"Test Passed:  importing product");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_import_products"),"Test Failed: Not importing product");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 9)
    public void test_export_products_section() {
        total_count++;
        try{
            obj2 =new Pojo_file_for_product_section(driver);
            boolean status = obj2.test_export_products_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_export_products_section"),"Test Passed:  Exporting product");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_export_products_section"),"Test Failed: Not exporting product");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 10)
    public void test_move_add_product_section() {
        total_count++;
        try{
            obj3 =new Pojo_file_for_add_product(driver);
            boolean status = obj3.test_move_add_product_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_add_product_section"),"Test Passed:  Move to add product section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_add_product_section"),"Test Failed: Can't Move to add product section");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 11)
    public void test_add_product_with_invalidData() {
        total_count++;
        try{
            obj3 =new Pojo_file_for_add_product(driver);
            boolean status = obj3.test_add_product_with_invalidData("testApril1Product1","create new product","&*(%$","*&$#%","*&%$#");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_add_product_with_invalidData"),"Test Passed:  Create product with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_add_product_with_invalidData"),"Test Failed: Can't Create product with invalid data");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 12)
    public void test_add_product_with_validData() {

        total_count++;
        try {
            obj3 = new Pojo_file_for_add_product(driver);
            boolean status = obj3.test_add_product_with_validData("100","50","vendor1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_add_product_with_validData"),"Test Passed:  Create new product");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_add_product_with_validData"),"Test Failed: Can't create new product");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 13)
    public void test_search_newly_create_product() {

        total_count++;
        try {
            obj3 = new Pojo_file_for_add_product(driver);
            boolean status = obj3.test_search_newly_create_product("testApril1Product2");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_newly_create_product"),"Test Passed: display searching newly create product");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_newly_create_product"),"Test Failed:  Can't search newly create product");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 14)
    public void test_featured_visible_outOFstock_options_in_product_section() {

        total_count++;
        try {
            obj2 = new Pojo_file_for_product_section(driver);
            boolean status = obj2.test_featured_visible_outOFstock_options_in_product_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_featured_visible_outOFstock_options_in_product_section"),"Test Passed: display featured/visible/clone products");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_featured_visible_outOFstock_options_in_product_section"),"Test Failed:  Not display featured/visible/clone products");
            }

            Product_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

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
