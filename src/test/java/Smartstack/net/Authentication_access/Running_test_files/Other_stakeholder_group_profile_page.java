package Smartstack.net.Authentication_access.Running_test_files;

import Smartstack.net.Authentication_access.Pojo_files.Pojo_file_for_Customize_layout_and_profile;
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

public class Other_stakeholder_group_profile_page {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Pojo_file_for_Customize_layout_and_profile obj2;

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

    @BeforeClass
    public static void startTest()
    {
        report = new ExtentReports("./Authentication_Test_Reports/Other_stakeholder_profile_page_section_report.html");
        report.addSystemInfo("Smartstack","Authentication/access");
        report.addSystemInfo("performance","Other stakeholder profile page Test Report");
        test = report.startTest("Other stakeholder group profile page section");
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
    public void test_login_section_and_move_to_stakeholder_group_section() {

        total_count ++;
        try{
            obj1 = new First_test_file_for_smartstack(driver);
            boolean status = obj1.test_loginSection_with_password_and_code();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_login_section"),"Test Passed:  Move to the smartstack dashboard");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_login_section"),"Test Failed:  can't move to the smartstack dashboard");
            }

            Other_stakeholder_group_profile_page.timeout2000();

            boolean status1 = obj1.test_move_to_authentication_access();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_authentication_access"),"Test Passed:  Move to the authentication section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_authentication_access"),"Test Failed:  can't move to the authentication section");
            }

            Other_stakeholder_group_profile_page.timeout2000();

            boolean status2  = obj1.test_move_to_customize_permission_section();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_customize_permission_section"),"Test Passed:  Move to the customize permission section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_customize_permission_section"),"Test Failed:  can't move to the customize permission section");
            }

            Other_stakeholder_group_profile_page.timeout2000();

            boolean status3  = obj1.test_other_stakeholder_group_profile_page_section();
            if(status3 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_other_stakeholder_group_profile_page_section"),"Test Passed:  Move to the other stakeholder group profile page section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_other_stakeholder_group_profile_page_section"),"Test Failed:  can't move to the other stakeholder group profile page section");
            }

            Other_stakeholder_group_profile_page.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_enable_disable_profile_details() {

        obj2 = new Pojo_file_for_Customize_layout_and_profile(driver);
        boolean status = obj2.test_enable_disable_profile_details("2");
        if(status == true){
            pass_count ++;
            Assert.assertEquals(true, pass_method_list.add("test_enable_disable_profile_details"),"Test Passed:  Enable/disable profile details options");
        }else{
            fail_count ++;
            Assert.assertEquals(false, fail_method_list.add("test_enable_disable_profile_details"),"Test Failed:  Can't enable/disable profile details options");
        }

        Other_stakeholder_group_profile_page.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 3)
    public void test_add_more_prodile_details1() {

        obj2 = new Pojo_file_for_Customize_layout_and_profile(driver);
        boolean status = obj2.test_add_more_prodile_details1();
        if(status == true){
            pass_count ++;
            Assert.assertEquals(true, pass_method_list.add("test_add_more_prodile_details1"),"Test Passed:  Display add more profile details section when click update without field name");
        }else{
            fail_count ++;
            Assert.assertEquals(false, fail_method_list.add("test_add_more_prodile_details1"),"Test Failed: Not display add more profile details section when click update without field name");
        }

        Customize_layout_and_profile.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 4)
    public void test_add_more_proife_details_section2() {

        obj2 = new Pojo_file_for_Customize_layout_and_profile(driver);
        boolean status = obj2.test_add_more_proife_details_section2("Company name","1");
        if(status == true){
            pass_count ++;
            Assert.assertEquals(true, pass_method_list.add("test_add_more_proife_details_section2"),"Test Passed:  Display newly added profile details inside list");
        }else{
            fail_count ++;
            Assert.assertEquals(false, fail_method_list.add("test_add_more_proife_details_section2"),"Test Failed: Not display newly added profile details");
        }

        Customize_layout_and_profile.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 5)
    public void test_enbale_disable_some_options() {

        obj2 = new Pojo_file_for_Customize_layout_and_profile(driver);
        boolean status = obj2.test_enbale_disable_some_options("gdfgdf467457","Eng");
        if(status == true){
            pass_count ++;
            Assert.assertEquals(true, pass_method_list.add("test_enbale_disable_some_options"),"Test Passed:  Enable/disable some options and localization settings");
        }else{
            fail_count ++;
            Assert.assertEquals(false, fail_method_list.add("test_enbale_disable_some_options"),"Test Failed: Can't enable/disable some options and localization settings");
        }

        Customize_layout_and_profile.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 6)
    public void test_social_profile_options() {

        obj2 = new Pojo_file_for_Customize_layout_and_profile(driver);
        boolean status = obj2.test_social_profile_options("1");
        if(status == true){
            pass_count ++;
            Assert.assertEquals(true, pass_method_list.add("test_social_profile_options"),"Test Passed:  Enable/disable social profiles and move the between list");
        }else{
            fail_count ++;
            Assert.assertEquals(false, fail_method_list.add("test_social_profile_options"),"Test Failed: Can't enable/disable social profiles and move the between list");
        }

        Customize_layout_and_profile.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 7)
    public void test_add_more_social_profile1() {

        obj2 = new Pojo_file_for_Customize_layout_and_profile(driver);
        boolean status = obj2.test_add_more_social_profile1("jsfsdklthwuefjldafhweu8tjfsdbvhnfdioyuerigfjsklvnaeutyugjoifkgbhnsdljfghwerut8ghfghfdlheruigojf");
        if(status == true){
            pass_count ++;
            Assert.assertEquals(true, pass_method_list.add("test_add_more_social_profile1"),"Test Passed:  Display character limitation for add more social profile");
        }else{
            fail_count ++;
            Assert.assertEquals(false, fail_method_list.add("test_add_more_social_profile1"),"Test Failed: Not Display character limitation for add more social profile");
        }

        Customize_layout_and_profile.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 8)
    public void test_add_more_social_profile2() {

        obj2 = new Pojo_file_for_Customize_layout_and_profile(driver);
        boolean status = obj2.test_add_more_social_profile2("","new app");
        if(status == true){
            pass_count ++;
            Assert.assertEquals(true, pass_method_list.add("test_add_more_social_profile2"),"Test Passed: Closing edit option when click update button without editing field of social profile");
        }else{
            fail_count ++;
            Assert.assertEquals(false, fail_method_list.add("test_add_more_social_profile2"),"Test Failed: Not closing edit option when click update button without editing field of social profile");
        }

        Customize_layout_and_profile.timeout2000();

        System.out.println("pass method Count: " + pass_count);
        System.out.println("Fail method count: " + fail_count);
        System.out.println("Pass method lists: " + pass_method_list);
        System.out.println("Fail method lists: " + fail_method_list);

    }

    @Test(priority = 8)
    public void test_edit_and_delete_social_profile() {

        obj2 = new Pojo_file_for_Customize_layout_and_profile(driver);
        boolean status = obj2.test_edit_and_delete_social_profile("1");
        if(status == true){
            pass_count ++;
            Assert.assertEquals(true, pass_method_list.add("test_edit_and_delete_social_profile"),"Test Passed: Editing and deleting selected social profile");
        }else{
            fail_count ++;
            Assert.assertEquals(false, fail_method_list.add("test_edit_and_delete_social_profile"),"Test Failed: Not Editing and deleting selected social profile");
        }

        Customize_layout_and_profile.timeout2000();

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
