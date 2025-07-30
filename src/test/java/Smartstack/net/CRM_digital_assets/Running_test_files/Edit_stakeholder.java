package Smartstack.net.CRM_digital_assets.Running_test_files;

import Smartstack.net.CRM_digital_assets.Pojo_files.POjo_file_foe_edit_stakeholder;
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

public class Edit_stakeholder {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    POjo_file_foe_edit_stakeholder obj2;

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
        report = new ExtentReports("./CRM_Test_Reports/Edit_Stakeholder_report.html");
        report.addSystemInfo("Smartstack","CRM/digital assets");
        report.addSystemInfo("performance","Edit Stakeholder Test Report");
        test = report.startTest("Stakeholders section");
    }

    @BeforeClass
    public void beforeClass() {
        try{
            WebDriverManager.edgedriver().setup();//Setup the chrome driver
//            ChromeOptions ops = new ChromeOptions();
//            ops.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver();
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

            Stakeholders.timeout2000();

            boolean status1 = obj1.test_move_to_CRM_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_CRM_section"),"Test Passed:  Move to the CRM section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_CRM_section"),"Test Failed:  Can't move to the CRM section");
            }

            Stakeholders.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_edit_stakeholder_section() {
        total_count++;
        try{
            obj2 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj2.test_edit_stakeholder_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_edit_stakeholder_section"),"Test Passed:  Move to the edit stakeholder section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_edit_stakeholder_section"),"Test Failed:  Can't move to the edit stakeholder section");
            }

            Stakeholders.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_status_option_of_edit_stakeholder() {
        total_count++;
        try{
            obj2 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj2.test_status_option_of_edit_stakeholder("new status","1","status1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_status_option_of_edit_stakeholder"),"Test Passed: Create and update status");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_status_option_of_edit_stakeholder"),"Test Failed:  Can't create and update status");
            }

            Stakeholders.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_call_option_of_edit_stakeholder() {
        total_count++;
        try{
            obj2 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj2.test_call_option_of_edit_stakeholder("(*^&^hghjkg","to do","to meet","875628756174637256287461786472659734635674574");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_call_option_of_edit_stakeholder"),"Test Passed: Select call options, date and time");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_call_option_of_edit_stakeholder"),"Test Failed:  Can't Select call options, date and time");
            }

            Stakeholders.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_adjust_balance_section() {
        total_count++;
        try{
            obj2 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj2.test_adjust_balance_section("-2","100","Create adjust balance");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_adjust_balance_section"),"Test Passed: Create adjust balance of edit stakeholder");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_adjust_balance_section"),"Test Failed:  Can't create adjust balance of edit stakeholder");
            }

            Stakeholders.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_create_log_section_and_add_newEmail() {
        total_count++;
        try{
            obj2 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj2.test_create_log_section_and_add_newEmail("hjgjhg87678");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_log_section_and_add_newEmail"),"Test Passed: Move to create log section and add new email address");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_log_section_and_add_newEmail"),"Test Failed:  Can't move to create log section and add invalid new email address");
            }

            Stakeholders.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_tag_section() {
        total_count++;
        try{
            obj2 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj2.test_tag_section("new tag1","065435678909","894574hfkjdf","Andreas","Andreas Dametti");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_tag_section"),"Test Passed: Move to create log section and add new email address");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_tag_section"),"Test Failed:  Can't move to create log section and add invalid new email address");
            }

            Stakeholders.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_update_organization_details_of_edit_stakeholder() {
        total_count++;
        try{
            obj2 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj2.test_update_organization_details_of_edit_stakeholder("1","1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_update_organization_details_of_edit_stakeholder"),"Test Passed: Update selected stakeholder details");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_update_organization_details_of_edit_stakeholder"),"Test Failed:  Can't update selected stakeholder details");
            }

            Stakeholders.timeout2000();

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
