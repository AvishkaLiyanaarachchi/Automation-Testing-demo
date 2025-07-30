package Inventory_tracking_system.Running_test_files;

import Inventory_tracking_system.Pojo_files.Pojo_file_for_user_register;
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

public class User_regitration {

    WebDriver driver;

    Pojo_file_for_user_register obj;
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
        report = new ExtentReports("./Inventory_System_Test_Reports/User_Registration_section_report.html");
        report.addSystemInfo("Inventory Tracking System","User Registration section");
        report.addSystemInfo("Sign up","New user registration");
        test = report.startTest("New user registration");
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
    public void test_click_signUp_btn_without_filling_fields() {
        total_count++;
        try{
            obj = new Pojo_file_for_user_register(driver);
            boolean status = obj.click_signUp_btn_without_filling_fields();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_signUp_btn_without_filling_fields"), "Test Passed:-  Display validations under name, email address, password and re enter password fields when click sign up button without data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_signUp_btn_without_filling_fields"), "Test failed:-  Not Display validations under name, email address, password and re enter password fields when click sign up button without dataa");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            User_regitration.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 2)
    public void test_click_signup_btn_with_name_and_email_fieldsOnly() {
        total_count++;
        try{
            obj = new Pojo_file_for_user_register(driver);
            boolean status = obj.click_signup_btn_with_name_and_email_fieldsOnly("Testuser2","testuser2@gmail.com");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_signup_btn_with_name_and_email_fieldsOnly"), "Test Passed:-  Display validation under password fields when click sign up button without passwords");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_signup_btn_with_name_and_email_fieldsOnly"), "Test failed:-  Not display validation under password fields when click sign up button without passwords");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            User_regitration.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 3)
    public void test_click_signup_btn_with_password_without_name_and_email() {
        total_count++;
        try{
            obj = new Pojo_file_for_user_register(driver);
            boolean status = obj.click_signup_btn_with_password_without_name_and_email("123","123");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_signup_btn_with_password_without_name_and_email"), "Test Passed:-  Display validations under name, email address fields when click sign up button without data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_signup_btn_with_password_without_name_and_email"), "Test failed:-  Not display validations under name, email address fields when click sign up button without data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            User_regitration.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 4)
    public void test_filling_user_registration_fields_with_invaliddata() {
        total_count++;
        try{
            obj = new Pojo_file_for_user_register(driver);
            boolean status = obj.filling_user_registration_fields_with_invaliddata("user2","dfsfwerewr");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("filling_user_registration_fields_with_invaliddata"), "Test Passed:-  User registration with invalid name, email address");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("filling_user_registration_fields_with_invaliddata"), "Test failed:- Can't user registration with invalid name, email address");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            User_regitration.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 5)
    public void test_filling_user_registration_fields_with_validdata() {
        total_count++;
        try{
            obj = new Pojo_file_for_user_register(driver);
            boolean status = obj.filling_user_registration_fields_with_validdata("test user2","testuser2@gmail.com","123","123");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("filling_user_registration_fields_with_validdata"), "Test Passed:-  Move to the dashboard when login with valid user account");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("filling_user_registration_fields_with_validdata"), "Test failed:- Can't move to the dashboard when login with valid user account");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            User_regitration.timeout2000();
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
