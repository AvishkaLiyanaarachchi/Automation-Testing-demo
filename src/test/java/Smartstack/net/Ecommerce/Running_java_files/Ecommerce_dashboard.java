package Smartstack.net.Ecommerce.Running_java_files;

import Smartstack.net.CRM_digital_assets.Running_test_files.Stakeholders;
import Smartstack.net.Ecommerce.Pojo_files.Pojo_file_for_dashboard_section;
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

public class Ecommerce_dashboard {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Pojo_file_for_dashboard_section obj2;

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
        report = new ExtentReports("./Ecommerce_Test_Reports/Ecommerce_dashboard_report.html");
        report.addSystemInfo("Smartstack","e-Commerce");
        report.addSystemInfo("performance","Dashboard section all/awaiting payment/awaiting fulfillment/shipped and completed Test Report");
        test = report.startTest("Dashboard");
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

            Ecommerce_dashboard.timeout2000();

            boolean status1 = obj1.test_move_to_ecommerce_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_ecommerce_section"),"Test Passed:  Move to the Ecommerce section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_ecommerce_section"),"Test Failed:  Can't move to the Ecommerce section");
            }

            Ecommerce_dashboard.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_move_to_the_dashboard_section() {

        total_count++;
        try {
            obj2 = new Pojo_file_for_dashboard_section(driver);
            boolean status = obj2.test_move_to_the_dashboard_section();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_the_dashboard_section"), "Test Passed:  Move to the dashboard section of Ecommerce");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_the_dashboard_section"), "Test Failed:  Can't move to the dashboard section of Ecommerce");
            }

            Ecommerce_dashboard.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_show_hide_options_for_dashboard() {

        total_count++;
        try {
            obj2 = new Pojo_file_for_dashboard_section(driver);
            boolean status = obj2.test_show_hide_options_for_dashboard();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_show_hide_options_for_dashboard"), "Test Passed:  Show/hide options of dashboard");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_show_hide_options_for_dashboard"), "Test Failed:  Can't show/hide options of dashboard");
            }

            Ecommerce_dashboard.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    //Can't move to the awaiting payment, awaiting fulfillment, shipped and completed tabs because display same IDs with product , coupon codes ...etc

//    @Test(priority = 4)
//    public void test_move_to_awaiting_payment_section() {
//
//        total_count++;
//        try {
//            obj1 = new First_test_file_for_smartstack(driver);
//            boolean status = obj1.test_move_to_awaiting_payment_section();
//            if (status == true) {
//                pass_count++;
//                Assert.assertEquals(true, pass_method_list.add("test_move_to_awaiting_payment_section"), "Test Passed:  Move to the awaiting payment section");
//            } else {
//                fail_count++;
//                Assert.assertEquals(false, fail_method_list.add("test_move_to_awaiting_payment_section"), "Test Failed:  Can't move to the awaiting payment section");
//            }
//
//            Ecommerce_dashboard.timeout2000();
//
//            System.out.println("pass method Count: " + pass_count);
//            System.out.println("Fail method count: " + fail_count);
//            System.out.println("Pass method lists: " + pass_method_list);
//            System.out.println("Fail method lists: " + fail_method_list);
//
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//    }
//
//    @Test(priority = 5)
//    public void test_move_to_the_awaitignPayment_shipped_completed_sections() {
//
//        total_count++;
//        try {
//            obj2 = new Pojo_file_for_dashboard_section(driver);
//            boolean status = obj2.test_move_to_the_awaitignPayment_shipped_completed_sections();
//            if (status == true) {
//                pass_count++;
//                Assert.assertEquals(true, pass_method_list.add("test_move_to_the_awaitignPayment_shipped_completed_sections"), "Test Passed:  Move to the awaiting payment/shipped/completed section");
//            } else {
//                fail_count++;
//                Assert.assertEquals(false, fail_method_list.add("test_move_to_the_awaitignPayment_shipped_completed_sections"), "Test Failed:  Can't move to the awaiting payment/shipped/completed section");
//            }
//
//            Ecommerce_dashboard.timeout2000();
//
//            System.out.println("pass method Count: " + pass_count);
//            System.out.println("Fail method count: " + fail_count);
//            System.out.println("Pass method lists: " + pass_method_list);
//            System.out.println("Fail method lists: " + fail_method_list);
//
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//    }
//
//    @Test(priority = 6)
//    public void test_move_to_awaiting_fullfillment_section() {
//
//        total_count++;
//        try {
//            obj1 = new First_test_file_for_smartstack(driver);
//            boolean status = obj1.test_move_to_awaiting_fullfillment_section();
//            if (status == true) {
//                pass_count++;
//                Assert.assertEquals(true, pass_method_list.add("test_move_to_awaiting_fulfillment_section"), "Test Passed:  Move to the awaiting fulfillment section");
//            } else {
//                fail_count++;
//                Assert.assertEquals(false, fail_method_list.add("test_move_to_awaiting_fulfillment_section"), "Test Failed:  Can't move to the awaiting fulfillment section");
//            }
//
//            Ecommerce_dashboard.timeout2000();
//
//            System.out.println("pass method Count: " + pass_count);
//            System.out.println("Fail method count: " + fail_count);
//            System.out.println("Pass method lists: " + pass_method_list);
//            System.out.println("Fail method lists: " + fail_method_list);
//
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//    }
//
//    @Test(priority = 7)
//    public void test_move_to_the_awaitignPayment_shipped_completed_sections1() {
//
//        total_count++;
//        try {
//            obj2 = new Pojo_file_for_dashboard_section(driver);
//            boolean status = obj2.test_move_to_the_awaitignPayment_shipped_completed_sections();
//            if (status == true) {
//                pass_count++;
//                Assert.assertEquals(true, pass_method_list.add("test_move_to_the_awaitignPayment_shipped_completed_sections"), "Test Passed:  Move to the awaiting payment/shipped/completed section");
//            } else {
//                fail_count++;
//                Assert.assertEquals(false, fail_method_list.add("test_move_to_the_awaitignPayment_shipped_completed_sections"), "Test Failed:  Can't move to the awaiting payment/shipped/completed section");
//            }
//
//            Ecommerce_dashboard.timeout2000();
//
//            System.out.println("pass method Count: " + pass_count);
//            System.out.println("Fail method count: " + fail_count);
//            System.out.println("Pass method lists: " + pass_method_list);
//            System.out.println("Fail method lists: " + fail_method_list);
//
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//    }
//
//    @Test(priority = 8)
//    public void test_shipped_section_dashboard() {
//
//        total_count++;
//        try {
//            obj1 = new First_test_file_for_smartstack(driver);
//            boolean status = obj1.test_shipped_section_dashboard();
//            if (status == true) {
//                pass_count++;
//                Assert.assertEquals(true, pass_method_list.add("test_shipped_section_dashboard"), "Test Passed:  Move to the shipped section");
//            } else {
//                fail_count++;
//                Assert.assertEquals(false, fail_method_list.add("test_shipped_section_dashboard"), "Test Failed:  Can't move to the shipped section");
//            }
//
//            Ecommerce_dashboard.timeout2000();
//
//            System.out.println("pass method Count: " + pass_count);
//            System.out.println("Fail method count: " + fail_count);
//            System.out.println("Pass method lists: " + pass_method_list);
//            System.out.println("Fail method lists: " + fail_method_list);
//
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//    }
//
//    @Test(priority = 9)
//    public void test_move_to_the_awaitignPayment_shipped_completed_sections2() {
//
//        total_count++;
//        try {
//            obj2 = new Pojo_file_for_dashboard_section(driver);
//            boolean status = obj2.test_move_to_the_awaitignPayment_shipped_completed_sections();
//            if (status == true) {
//                pass_count++;
//                Assert.assertEquals(true, pass_method_list.add("test_move_to_the_awaitignPayment_shipped_completed_sections"), "Test Passed:  Move to the awaiting payment/shipped/completed section");
//            } else {
//                fail_count++;
//                Assert.assertEquals(false, fail_method_list.add("test_move_to_the_awaitignPayment_shipped_completed_sections"), "Test Failed:  Can't move to the awaiting payment/shipped/completed section");
//            }
//
//            Ecommerce_dashboard.timeout2000();
//
//            System.out.println("pass method Count: " + pass_count);
//            System.out.println("Fail method count: " + fail_count);
//            System.out.println("Pass method lists: " + pass_method_list);
//            System.out.println("Fail method lists: " + fail_method_list);
//
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//    }
//
//    @Test(priority = 10)
//    public void test_completed_section_of_dashboard() {
//
//        total_count++;
//        try {
//            obj1 = new First_test_file_for_smartstack(driver);
//            boolean status = obj1.test_completed_section_of_dashboard();
//            if (status == true) {
//                pass_count++;
//                Assert.assertEquals(true, pass_method_list.add("test_completed_section_of_dashboard"), "Test Passed:  Move to the completed section");
//            } else {
//                fail_count++;
//                Assert.assertEquals(false, fail_method_list.add("test_completed_section_of_dashboard"), "Test Failed:  Can't move to the completed section");
//            }
//
//            Ecommerce_dashboard.timeout2000();
//
//            System.out.println("pass method Count: " + pass_count);
//            System.out.println("Fail method count: " + fail_count);
//            System.out.println("Pass method lists: " + pass_method_list);
//            System.out.println("Fail method lists: " + fail_method_list);
//
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//    }
//
//    @Test(priority = 11)
//    public void test_move_to_the_awaitignPayment_shipped_completed_sections3() {
//
//        total_count++;
//        try {
//            obj2 = new Pojo_file_for_dashboard_section(driver);
//            boolean status = obj2.test_move_to_the_awaitignPayment_shipped_completed_sections();
//            if (status == true) {
//                pass_count++;
//                Assert.assertEquals(true, pass_method_list.add("test_move_to_the_awaitignPayment_shipped_completed_sections"), "Test Passed:  Move to the awaiting payment/shipped/completed section");
//            } else {
//                fail_count++;
//                Assert.assertEquals(false, fail_method_list.add("test_move_to_the_awaitignPayment_shipped_completed_sections"), "Test Failed:  Can't move to the awaiting payment/shipped/completed section");
//            }
//
//            Ecommerce_dashboard.timeout2000();
//
//            System.out.println("pass method Count: " + pass_count);
//            System.out.println("Fail method count: " + fail_count);
//            System.out.println("Pass method lists: " + pass_method_list);
//            System.out.println("Fail method lists: " + fail_method_list);
//
//        }catch (Exception ex){
//            System.out.println(ex);
//        }
//    }

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
