package Smartstack.net.CRM_digital_assets.Running_test_files;

import Smartstack.net.CRM_digital_assets.Pojo_files.Pojo_file_for_digital_assets_mnagement;
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

public class Digital_assets_management_section {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Pojo_file_for_digital_assets_mnagement obj2;

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
        report = new ExtentReports("./CRM_Test_Reports/Digital_assets_Management_section_report.html");
        report.addSystemInfo("Smartstack","CRM/digital assets");
        report.addSystemInfo("performance","Manage stakeholder digital assets and manage email template Test Report");
        test = report.startTest("Digital Assets Management");
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

            Digital_assets_management_section.timeout2000();

            boolean status1 = obj1.test_move_to_CRM_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_CRM_section"),"Test Passed:  Move to the CRM section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_CRM_section"),"Test Failed:  Can't move to the CRM section");
            }

            Digital_assets_management_section.timeout2000();

            boolean status2= obj1.test_digital_assets_management_section();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_digital_assets_management_section"),"Test Passed:  Move to the digital assets management section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_digital_assets_management_section"),"Test Failed:  Can't move to the digital assets management section");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_create_folder_section() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_create_folder_section("test folder 1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_create_folder_section"), "Test Passed:  Create folder and select stakeholder group to assign folder");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_create_folder_section"), "Test Failed:  Can't create folder and select stakeholder group to assign folder");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_move_folder_inside_list() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_move_folder_inside_list("1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_move_folder_inside_list"), "Test Passed:  Move the folder between list");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_move_folder_inside_list"), "Test Failed:  Can't move the folder between list");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_create_subfolder_and_edit_delete_folder() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_create_subfolder_and_edit_delete_folder("sub folder1","super folder1","1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_create_subfolder_and_edit_delete_folder"), "Test Passed:  Create/update/delete folders and sub folders");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_create_subfolder_and_edit_delete_folder"), "Test Failed:  Can't  create/update/delete folders and sub folders");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_select_stakehodler_group_to_assign_folders_section() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_select_stakehodler_group_to_assign_folders_section();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_select_stakehodler_group_to_assign_folders_section"), "Test Passed:  Select stakeholder group to assign folder");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_select_stakehodler_group_to_assign_folders_section"), "Test Failed:  Select stakeholder group to assign folder");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_select_folders_to_assign() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_select_folders_to_assign();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_select_folders_to_assign"), "Test Passed:  Select folders for assign");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_select_folders_to_assign"), "Test Failed:  Can't select folders for assign");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_create_folder_of_email_template() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_create_folder_of_email_template("test folder");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_create_folder_of_email_template"), "Test Passed:  Create new folder in email template section");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_create_folder_of_email_template"), "Test Failed:  Can't create new folder in email template section");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_create_subFolders() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_create_subFolders("Sub folder1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_create_subFolders"), "Test Passed:  Create sub folders");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_create_subFolders"), "Test Failed:  Can't create sub folders");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_move_to_the_smartstack_tab() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_move_to_the_smartstack_tab();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_the_smartstack_tab"), "Test Passed:  Move to the smartstack section of email template");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_the_smartstack_tab"), "Test Failed:  Can't  move to the smartstack section of email template");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 9)
    public void test_move_to_the_community_tab() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_move_to_the_community_tab();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_the_community_tab"), "Test Passed:  Move to the community section of email template");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_the_community_tab"), "Test Failed:  Can't  move to the community section of email template");
            }

            Digital_assets_management_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 10)
    public void test_move_to_the_you_shared_with_community_tab() {
        total_count ++;
        try {
            obj2 = new Pojo_file_for_digital_assets_mnagement(driver);
            boolean status = obj2.test_move_to_the_you_shared_with_community_tab();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_the_you_shared_with_community_tab"), "Test Passed:  Move to the you shared community section of email template");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_the_you_shared_with_community_tab"), "Test Failed:  Can't  move to the you shared community section of email template");
            }

            Digital_assets_management_section.timeout2000();

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
