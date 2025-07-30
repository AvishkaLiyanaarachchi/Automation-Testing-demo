package Smartstack.net.Ecommerce.Running_java_files;

import Smartstack.net.Ecommerce.Pojo_files.Pojo_file_for_coupon_code;
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

public class Coupon_codes {

    WebDriver driver;

    First_test_file_for_smartstack obj1;

    Pojo_file_for_coupon_code obj2;

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
        report = new ExtentReports("./Ecommerce_Test_Reports/Coupon_codes_section_report.html");
        report.addSystemInfo("Smartstack","e-Commerce");
        report.addSystemInfo("performance","SElect paghinations, records per page options, move option and add coupon code section");
        test = report.startTest("Coupon Codes");
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

            Coupon_codes.timeout2000();

            boolean status1 = obj1.test_move_to_ecommerce_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_ecommerce_section"),"Test Passed:  Move to the Ecommerce section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_ecommerce_section"),"Test Failed:  Can't move to the Ecommerce section");
            }

            Coupon_codes.timeout2000();

            boolean status2 = obj1.test_move_to_couponCode_section();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_couponCode_section"),"Test Passed:  Move to the coupon code tab of Ecommerce section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_couponCode_section"),"Test Failed:  Can't move to the coupon code tab of Ecommerce section");
            }

            Coupon_codes.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_select_paginations_and_recordsperpage_options() {
        total_count ++;
        try{
            obj2 = new Pojo_file_for_coupon_code(driver);
            boolean status = obj2.test_select_paginations_and_recordsperpage_options();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_select_paginations_and_recordsperpage_options"),"Test Passed:  Select paginations and records per page options of coupon codes");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_select_paginations_and_recordsperpage_options"),"Test Failed:  Can't Select paginations and records per page options of coupon codes");
            }

            Coupon_codes.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 3)
    public void test_select_move_option_of_couponList() {
        total_count ++;
        try{
            obj2 = new Pojo_file_for_coupon_code(driver);
            boolean status = obj2.test_select_move_option_of_couponList("&*%$#","1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_select_move_option_of_couponList"),"Test Passed:  Move the record between list");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_select_move_option_of_couponList"),"Test Failed:  Can't move the record between list");
            }

            Coupon_codes.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 4)
    public void test_select_status_option() {
        total_count ++;
        try{
            obj2 = new Pojo_file_for_coupon_code(driver);
            boolean status = obj2.test_select_status_option();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_select_status_option"),"Test Passed:  Display selected status of coupon code");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_select_status_option"),"Test Failed:  Can't Display selected status of coupon code");
            }

            Coupon_codes.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 5)
    public void test_move_to_add_couponCode_section() {
        total_count ++;
        try{
            obj2 = new Pojo_file_for_coupon_code(driver);
            boolean status = obj2.test_move_to_add_couponCode_section("%$#&%%","Test coupon code1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_add_couponCode_section"),"Test Passed:  Move to the add coupon code section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_add_couponCode_section"),"Test Failed:  Can't move to the add coupon code section");
            }

            Coupon_codes.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 6)
    public void test_create_coupon_code_section1() {
        total_count ++;
        try{
            obj2 = new Pojo_file_for_coupon_code(driver);
            boolean status = obj2.test_create_coupon_code_section1("abcd","100");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_coupon_code_section1"),"Test Passed:  Create coupon code with filling required fields");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_coupon_code_section1"),"Test Failed:  Can't Create coupon code with filling required fields");
            }

            Coupon_codes.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 7)
    public void test_create_coupon_code_section2() {
        total_count ++;
        try{
            obj2 = new Pojo_file_for_coupon_code(driver);
            boolean status = obj2.test_create_coupon_code_section2();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_coupon_code_section2"),"Test Passed:  Display selected start and end time when creating coupon code");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_coupon_code_section2"),"Test Failed:  Not Display selected start and end time when creating coupon code");
            }

            Coupon_codes.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 8)
    public void test_create_coupon_code() {
        total_count ++;
        try{
            obj2 = new Pojo_file_for_coupon_code(driver);
            boolean status = obj2.test_create_coupon_code();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_coupon_code"),"Test Passed:  Create a new coupon code");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_coupon_code"),"Test Failed:  Can't create a ew coupon code");
            }

            Coupon_codes.timeout2000();

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
