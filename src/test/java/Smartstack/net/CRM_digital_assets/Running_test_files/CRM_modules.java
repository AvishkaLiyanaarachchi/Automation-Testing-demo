package Smartstack.net.CRM_digital_assets.Running_test_files;

import Smartstack.net.CRM_digital_assets.Pojo_files.Pojo_file_CRM_modules;
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

public class CRM_modules {

    WebDriver driver;

    First_test_file_for_smartstack obj1;

    Pojo_file_CRM_modules obj2;

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
        report = new ExtentReports("./CRM_Test_Reports/CRM_modules_report.html");
        report.addSystemInfo("Smartstack","CRM/digital assets");
        report.addSystemInfo("performance","CRM Modules Test Report");
        test = report.startTest("CRM modules section");
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
    public void test_move_to_CRM_section() {

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

            CRM_modules.timeout2000();

            boolean status1 = obj1.test_move_to_CRM_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_CRM_section"),"Test Passed:  Move to the CRM section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_CRM_section"),"Test Failed:  Can't move to the CRM section");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_history_section() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_history_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_history_section"),"Test Passed:  Move to the history section and filtering");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_history_section"),"Test Failed:  Can't move to the history section and filtering");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_digital_assets() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_digital_assets();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_digital_assets"),"Test Passed:  Move to the digital assets section and create folders and sub folders");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_digital_assets"),"Test Failed:  Can't move to the digital assets section and create folders and sub folders");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_email_section_of_modules() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_email_section_of_modules("hdjsh746y73264","create content", "test email1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_email_section_of_modules"),"Test Passed:  Move to create email section and enter invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_email_section_of_modules"),"Test Failed:  Can't move to create email section and can't enter invalid data");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_create_signature() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_create_signature("*&%*^^*%","create content","create signature1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_signature"),"Test Passed:  Create signature with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_signature"),"Test Failed:  Can't create signature with invalid data");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_edit_signature_option() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_edit_signature_option("update signature");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_edit_signature_option"),"Test Passed:  Update selected signature");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_edit_signature_option"),"Test Failed:  Can't update selected signature");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_filter_email() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_filter_email("lfhuweo925742","test");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_filter_email"),"Test Passed:  Filtering with date range, subject and stakeholders");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_filter_email"),"Test Failed:  Can't filtering with date range, subject and stakeholders");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_create_new_note_section1() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_create_new_note_section1("(^(*&^)","tes");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_new_note_section1"),"Test Passed:  Enter note title for invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_new_note_section1"),"Test Failed:  Can't enter note title for invalid data");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 9)
    public void test_craete_note_section2() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_craete_note_section2("create note");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_craete_note_section2"),"Test Passed:  Create a new note");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_craete_note_section2"),"Test Failed:  Can't create a new note");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 10)
    public void test_filter_note() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_filter_note("note1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_filter_note"),"Test Passed:  Filtering notes in note section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_filter_note"),"Test Failed:  Can't filtering notes in note section");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 11)
    public void test_create_task_section() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_create_task_section("tas","create task");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_task_section"),"Test Passed:  Create a new task");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_task_section"),"Test Failed:  Can't create a new task");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 12)
    public void test_filter_taskTypes() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_filter_taskTypes("New task");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_filter_taskTypes"),"Test Passed:  Filtering tasks");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_filter_taskTypes"),"Test Failed:  Can't filtering tasks");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 13)
    public void test_move_to_subscriptions_tab() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_move_to_subscriptions_tab();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_subscriptions_tab"),"Test Passed:  Move to the subscription section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_subscriptions_tab"),"Test Failed:  Can't move to the subscription section");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 14)
    public void test_create_service_section() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_create_service_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_service_section"),"Test Passed: Create a new service");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_service_section"),"Test Failed:  Can't create a new service");
            }

            CRM_modules.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 15)
    public void test_invoices_tab() {

        total_count++;
        try{
            obj2 = new Pojo_file_CRM_modules(driver);
            boolean status = obj2.test_invoices_tab();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_invoices_tab"),"Test Passed: Move to invoices section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_invoices_tab"),"Test Failed:  Can't move to invoices section");
            }

            CRM_modules.timeout2000();

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
