package Smartstack.net.CRM_digital_assets.Running_test_files;

import Smartstack.net.Authentication_access.Pojo_files.Pojo_file_for_Edit_Stakeholder;
import Smartstack.net.CRM_digital_assets.Pojo_files.POjo_file_foe_edit_stakeholder;
import Smartstack.net.CRM_digital_assets.Pojo_files.Pojo_file_for_add_edit_leads;
import Smartstack.net.CRM_digital_assets.Pojo_files.Pojo_file_for_add_new_stakeholder;
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

public class Add_edit_lead {

    WebDriver driver;

    First_test_file_for_smartstack obj1;

    Pojo_file_for_add_edit_leads obj2;
    Pojo_file_for_add_new_stakeholder obj3;
    POjo_file_foe_edit_stakeholder obj4;

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
        report = new ExtentReports("./CRM_Test_Reports/Add-Edit_lead_test_report.html");
        report.addSystemInfo("Smartstack","CRM/digital assets");
        report.addSystemInfo("performance","Add edit lead Test Report");
        test = report.startTest("Leads list");
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

            Add_edit_lead.timeout2000();

            boolean status1 = obj1.test_move_to_CRM_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_CRM_section"),"Test Passed:  Move to the CRM section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_CRM_section"),"Test Failed:  Can't move to the CRM section");
            }

            Add_edit_lead.timeout2000();

            boolean status2= obj1.test_move_to_leads_section();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_leads_section"),"Test Passed:  Move to the leads section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_leads_section"),"Test Failed:  Can't move to the leads section");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_move_to_add_new_lead_section() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_add_edit_leads(driver);
            boolean status = obj2.test_move_to_addnew_stakeholder_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_addnew_stakeholder_section"),"Test Passed:  Move to the add new lead section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_addnew_stakeholder_section"),"Test Failed:  Can't move to the add new lead section");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_click_update_button_without_data_addNewStakeholder_option() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_add_new_stakeholder(driver);
            boolean status = obj3.test_click_update_button_without_data_addNewStakeholder_option();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_click_update_button_without_data_addNewStakeholder_option"),"Test Passed:  Move to the add new lead section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_click_update_button_without_data_addNewStakeholder_option"),"Test Failed:  Can't move to the add new lead section");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_fill_require_fields_of_add_stakeholder() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_add_new_stakeholder(driver);
            boolean status = obj3.test_fill_require_fields_of_add_stakeholder("march27lead1","5748htrwtjh","27lead2@gmail.com","march26TestOrg1","march26TestTtle1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_fill_require_fields_of_add_stakeholder"),"Test Passed:  Fill required fields od add new lead section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_fill_require_fields_of_add_stakeholder"),"Test Failed:  Can't fill required fields od add new lead section");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_select_status_in_add_new_lead() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_add_edit_leads(driver);
            boolean status = obj2.test_select_status_in_add_new_lead("test lead1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_select_status_in_add_new_lead"),"Test Passed:  Select status of add new lead section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_select_status_in_add_new_lead"),"Test Failed:  Can't select status of add new lead section");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_grThrough_CRM_modules() {
        total_count++;
        try{
            obj3 = new Pojo_file_for_add_new_stakeholder(driver);
            boolean status = obj3.test_grThrough_CRM_modules();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_grThrough_CRM_modules"),"Test Passed:  Go through CRM modules inside add new leadn");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_grThrough_CRM_modules"),"Test Failed:  Can't go through CRM modules inside add new leadn");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_search_newlead() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_add_edit_leads(driver);
            boolean status = obj2.test_search_newlead("march27lead1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_newlead"),"Test Passed:  Search newly created lead");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_newlead"),"Test Failed:  Can't search newly created lead");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_clear_searchField() {
        total_count++;
        try{
            obj2 = new Pojo_file_for_add_edit_leads(driver);
            boolean status = obj2.test_clear_searchField();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_clear_searchField"),"Test Passed:  Clear search field of lead list");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_clear_searchField"),"Test Failed:  Can't clear search field of lead list");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 9)
    public void test_edit_stakeholder_section() {
        total_count++;
        try{
            obj4 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj4.test_edit_stakeholder_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_edit_stakeholder_section"),"Test Passed:  Move to edit stakeholder section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_edit_stakeholder_section"),"Test Failed:  Can't move to edit stakeholder section");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 10)
    public void test_call_option_of_edit_stakeholder() {
        total_count++;
        try{
            obj4 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj4.test_call_option_of_edit_stakeholder("&*^*&%^*&%","to do","to meet","0495765762361274562876276527647236534643263653");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_call_option_of_edit_stakeholder"),"Test Passed:  call option is working correctly");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_call_option_of_edit_stakeholder"),"Test Failed:  call option is not working correctly");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 11)
    public void test_adjust_balance_section() {
        total_count++;
        try{
            obj4 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj4.test_adjust_balance_section("-100","100","create adjust balance");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_adjust_balance_section"),"Test Passed:  Create adjust balance correctly");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_adjust_balance_section"),"Test Failed:  Can't create adjust balance correctly");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 12)
    public void test_create_log_section_and_add_newEmail() {
        total_count++;
        try{
            obj4 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj4.test_create_log_section_and_add_newEmail("0958340jflksjf");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_log_section_and_add_newEmail"),"Test Passed:  Create log correctly");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_log_section_and_add_newEmail"),"Test Failed:  Can't create log correctly");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 13)
    public void test_tag_section() {
        total_count++;
        try{
            obj4 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj4.test_tag_section("test tag2","0657890765434","9697ghgjgg","Beverie","Beverie Mapam");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_tag_section"),"Test Passed:  Create log and select contact owner correctly");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_tag_section"),"Test Failed:  Can't create log and select contact owner correctly");
            }

            Add_edit_lead.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 14)
    public void test_update_organization_details_of_edit_stakeholder() {
        total_count++;
        try{
            obj4 = new POjo_file_foe_edit_stakeholder(driver);
            boolean status = obj4.test_update_organization_details_of_edit_stakeholder("test","test");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_update_organization_details_of_edit_stakeholder"),"Test Passed:  Update organization section correctly");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_update_organization_details_of_edit_stakeholder"),"Test Failed:  Can't  update organization section correctly");
            }

            Add_edit_lead.timeout2000();

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
