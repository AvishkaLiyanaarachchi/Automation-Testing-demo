package Smartstack.net.Authentication_access.Running_test_files;

import Smartstack.net.Authentication_access.Pojo_files.Pojo_file_for_settings;
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

public class Settings {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Pojo_file_for_settings obj2;

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
        report = new ExtentReports("./Authentication_Test_Reports/General_settings and email_template_report.html");
        report.addSystemInfo("Smartstack","Authentication/access");
        report.addSystemInfo("performance","Administrator registration and email templates");
        test = report.startTest("Settings");
    }

    //THis method run before all methods
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

    @Test(priority =  1)
    public void test_move_to_the_general_settings_section() {
        total_count ++;
        try {
            obj1 = new First_test_file_for_smartstack(driver);
            boolean status = obj1.test_loginSection_with_password_and_code();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_login_section"), "Test Passed:  Move to the smartstack dashboard");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_login_section"), "Test Failed:  can't move to the smartstack dashboard");
            }

            Settings.timeout2000();

            boolean status1 = obj1.test_move_to_authentication_access();
            if (status1 == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_authentication_access"), "Test Passed:  Move to the authentication section");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_authentication_access"), "Test Failed:  can't move to the authentication section");
            }

            Settings.timeout2000();

            boolean status2 = obj1.test_settings_tab();
            if (status2 == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_settings_tab"), "Test Passed:  Move to the general settings section");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_settings_tab"), "Test Failed:  can't move to the general settings section");
            }

            Settings.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_administrator_registration() {
        total_count ++;
        obj2 = new Pojo_file_for_settings(driver);
        boolean status = obj2.test_administrator_registration("8572859hjhgf");
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_administrator_registration"), "Test Passed:  Search field is working , when entering invalid data , clear stakeholder list");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_administrator_registration"), "Test Failed:  Search field is not working , when entering invalid data not clear stakeholder list");
        }

        Settings.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);


    }

    @Test(priority = 3)
    public void test_search_field_of_administrator_registration() {
        total_count ++;
        obj2 = new Pojo_file_for_settings(driver);
        boolean status = obj2.test_search_field_of_administrator_registration("Jayamini");
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_search_field_of_administrator_registration"), "Test Passed:  Search field is working , display stakeholder according to the searched data");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_search_field_of_administrator_registration"), "Test Failed:  Search field is not working , Not display stakeholder according to the searched data");
        }

        Settings.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);


    }

    @Test(priority = 4)
    public void test_select_stakeholder_for_new_admin_registration() {
        total_count ++;
        obj2 = new Pojo_file_for_settings(driver);
        boolean status = obj2.test_select_stakeholder_for_new_admin_registration();
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_select_stakeholder_for_new_admin_registration"), "Test Passed:  Display  selected stakeholders");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_select_stakeholder_for_new_admin_registration"), "Test Failed:  Disable new stakeholder registration so not display search option, Search option display inside enable section of new stakeholder registration");
        }

        Settings.timeout3000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 5)
    public void test_move_to_email_template() {
        total_count ++;
        obj1 = new First_test_file_for_smartstack(driver);
        boolean status = obj1.test_email_template_tab();
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_email_template_tab"), "Test Passed:  move to email template section");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_email_template_tab"), "Test Failed: Can't move to  email template section");
        }

        Settings.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 6)
    public void test_enbale_disable_administrator_email_template() {
        total_count ++;
        obj2 = new Pojo_file_for_settings(driver);
        boolean status = obj2.test_enbale_disable_administrator_email_template();
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_enbale_disable_administrator_email_template"), "Test Passed:  Enable/disable administrator email templates");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_enbale_disable_administrator_email_template"), "Test Failed: Can't enable/disable administrator email templates");
        }

        Settings.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 7)
    public void test_website_email_template() {
        total_count ++;
        obj2 = new Pojo_file_for_settings(driver);
        boolean status = obj2.test_website_email_template();
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_website_email_template"), "Test Passed:  Enable/disable website email templates");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_website_email_template"), "Test Failed: Can't enable/disable website email templates");
        }

        Settings.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 8)
    public void test_select_email_templates() {
        total_count ++;
        obj2 = new Pojo_file_for_settings(driver);
        boolean status = obj2.test_select_email_templates("Create template");
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_select_email_templates"), "Test Passed:  Restore default template");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_select_email_templates"), "Test Failed: Not restore default template");
        }

        Settings.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 9)
    public void test_create_signature_section() {
        total_count ++;
        obj2 = new Pojo_file_for_settings(driver);
        boolean status = obj2.test_create_signature_section("*(^&&(*&^","(*^&(&^&^","new signature","Create signature");
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_create_signature_section"), "Test Passed:  Updating selected signature");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_create_signature_section"), "Test Failed: Not display signature title inside edit signature");
        }

        Settings.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 10)
    public void test_edit_signature_section() {
        total_count ++;
        obj2 = new Pojo_file_for_settings(driver);
        boolean status = obj2.test_edit_signature_section("Update signature title","Update signature");
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_edit_signature_section"), "Test Passed:  Can't create signature with invalid data");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_edit_signature_section"), "Test Failed: Create signature with invalid data");
        }

        Settings.timeout3000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 11)
    public void test_move_to_customization_settings() {
        total_count ++;
        obj1 = new First_test_file_for_smartstack(driver);
        boolean status = obj1.test_customization_settings();
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_edit_signature_section"), "Test Passed:  Move to customization settings");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_edit_signature_section"), "Test Failed: Can't move to customization settings");
        }

        Settings.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 12)
    public void test_with_customization_settings() {
        total_count ++;
        obj2 = new Pojo_file_for_settings(driver);
        boolean status = obj2.test_with_customization_settings("Update signature title","Update signature");
        if(status == true){
            pass_count++;
            Assert.assertEquals(true, pass_method_list.add("test_with_customization_settings"), "Test Passed:  Update default menu as custom menu");
        } else {
            fail_count++;
            Assert.assertEquals(false, fail_method_list.add("test_with_customization_settings"), "Test Failed: Can't update default menu as custom menu");
        }

        Settings.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

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
