package Smartstack.net.CRM_digital_assets.Running_test_files;

import Smartstack.net.CRM_digital_assets.Pojo_files.Pojo_file_for_add_edit_organization;
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

public class Add_Edit_organization {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Pojo_file_for_add_edit_organization obj2;
    Pojo_file_for_add_new_stakeholder obj3;
    Pojo_file_for_add_new_stakeholder obj4;

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
        report = new ExtentReports("./CRM_Test_Reports/Add_edit_organization_report.html");
        report.addSystemInfo("Smartstack","CRM/digital assets");
        report.addSystemInfo("performance","Add and Edit organization  Test Report");
        test = report.startTest("Organization Section");
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

            Add_Edit_organization.timeout2000();

            boolean status1 = obj1.test_move_to_CRM_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_CRM_section"),"Test Passed:  Move to the CRM section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_CRM_section"),"Test Failed:  Can't move to the CRM section");
            }

            Add_Edit_organization.timeout2000();

            boolean status2= obj1.test_move_to_organization_section();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_organization_section"),"Test Passed:  Move to the organization section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_organization_section"),"Test Failed:  Can't move to the organization section");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_add_organization_section() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_add_edit_organization(driver);
            boolean status = obj2.test_add_organization_section();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_add_organization_section"), "Test Passed:  Move to the add organization section");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_add_organization_section"), "Test Failed:  Can't move to the add organization section");
            }

            Add_Edit_organization.timeout2000();

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

        total_count ++;
        try{
            obj3 = new Pojo_file_for_add_new_stakeholder(driver);
            boolean status = obj3.test_click_update_button_without_data_addNewStakeholder_option();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_click_update_button_without_data_addNewStakeholder_option"),"Test Passed:  Click update button without entering data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_click_update_button_without_data_addNewStakeholder_option"),"Test Failed:   Can't click update button without entering data");
            }

            Add_Edit_organization.timeout2000();

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

        total_count ++;
        try{
            obj3 = new Pojo_file_for_add_new_stakeholder(driver);
            boolean status = obj3.test_fill_require_fields_of_add_stakeholder("march25Test1","fhjfhweu897","march25Test1@gmail.com","march25TestOrg1","march25Testtitle1");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_fill_require_fields_of_add_stakeholder"),"Test Passed:  Fill required fields of add new stakeholder");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_fill_require_fields_of_add_stakeholder"),"Test Failed:   Can't fill required fields of add new stakeholder");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_update_organization_and_search_organization() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_add_edit_organization(driver);
            boolean status = obj2.test_update_organization_and_search_organization("march25test");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_update_organization_and_search_organization"),"Test Passed:  Searching newly created organization");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_update_organization_and_search_organization"),"Test Failed:   Can't searching newly created organization");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_clear_field_of_edit_organization() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_add_edit_organization(driver);
            boolean status = obj2.test_clear_field_of_edit_organization();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_clear_field_of_edit_organization"),"Test Passed:  Clear required fields of edit organization");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_clear_field_of_edit_organization"),"Test Failed:  Not clear required fields of edit organization");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_edit_organization_section() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_add_edit_organization(driver);
            boolean status = obj2.test_edit_organization_section("8397543jghf","06544326789045","Beverie","Mapam","Beverie Mapam");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_edit_organization_section"),"Test Passed:  Move to edit organization and update some fields");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_edit_organization_section"),"Test Failed:  Move to edit organization and update some fields");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_select_contact_owner_of_edit_organization() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_add_edit_organization(driver);
            boolean status = obj2.test_select_contact_owner_of_edit_organization();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_select_contact_owner_of_edit_organization"),"Test Passed:  Select contact owner for edit organization section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_select_contact_owner_of_edit_organization"),"Test Failed:  Can't Select contact owner for edit organization section");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }


    @Test(priority = 9)
    public void test_linked_existing_stakeholders_option1() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_add_edit_organization(driver);
            boolean status = obj2.test_linked_existing_stakeholders_option1("Marji","Titleyy","Marji Titleyy");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_linked_existing_stakeholders_option1"),"Test Passed:  Linked existing stakeholder is working");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_linked_existing_stakeholders_option1"),"Test Failed:  Can't linked existing stakeholder is working");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 10)
    public void test_linked_existing_stakeholders_option2() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_add_edit_organization(driver);
            boolean status = obj2.test_linked_existing_stakeholders_option2();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_linked_existing_stakeholders_option2"),"Test Passed:  Linked existing stakeholder is working");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_linked_existing_stakeholders_option2"),"Test Failed:  Can't linked existing stakeholder is working");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 11)
    public void test_move_to_craete_new_contact_owner_section() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_add_edit_organization(driver);
            boolean status = obj2.test_move_to_craete_new_contact_owner_section();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_craete_new_contact_owner_section"),"Test Passed:  Move to create new contact owner section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_craete_new_contact_owner_section"),"Test Failed:  Can't move to create new contact owner section");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 12)
    public void test_click_update_button_without_data_add_NewStakeholder_option() {

        total_count ++;
        try{
            obj4 = new Pojo_file_for_add_new_stakeholder(driver);
            boolean status = obj4.test_click_update_button_without_data_addNewStakeholder_option();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_click_update_button_without_data_addNewStakeholder_option"),"Test Passed:  Move to create new contact owner section and click update button");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_click_update_button_without_data_addNewStakeholder_option"),"Test Failed:  Can't move to create new contact owner section  and click update button");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 13)
    public void test_fill_require_fields_of_add_stakeholder_section() {

        total_count ++;
        try{
            obj4 = new Pojo_file_for_add_new_stakeholder(driver);
            boolean status = obj4.test_fill_require_fields_of_add_stakeholder("new contact1","wiutrew895734","contact1@gmail.com","new org","new title");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_fill_require_fields_of_add_stakeholder"),"Test Passed:  Move to create new contact owner section and fill required fields");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_fill_require_fields_of_add_stakeholder"),"Test Failed:  Can't move to create new contact owner section  and can't fill required fields");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 14)
    public void test_grThrough_CRM_modules() {

        total_count ++;
        try{
            obj4 = new Pojo_file_for_add_new_stakeholder(driver);
            boolean status = obj4.test_grThrough_CRM_modules();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_grThrough_CRM_modules"),"Test Passed:  Move to create new contact owner section and move to modules section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_grThrough_CRM_modules"),"Test Failed:  Can't move to create new contact owner section  and can't move to modules");
            }

            Add_Edit_organization.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 15)
    public void test_search_create_new_contact_owner_insde_edit_organization() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_add_edit_organization(driver);
            boolean status = obj2.test_search_create_new_contact_owner_insde_edit_organization();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_create_new_contact_owner_insde_edit_organization"),"Test Passed:  Display newly created contact owner inside edit organization");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_create_new_contact_owner_insde_edit_organization"),"Test Failed:  Can't display newly created contact owner inside edit organization");
            }

            Add_Edit_organization.timeout2000();

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
