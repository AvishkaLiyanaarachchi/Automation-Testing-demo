package Smartstack.net.CRM_digital_assets.Running_test_files;

import Smartstack.net.CRM_digital_assets.Pojo_files.Pojo_file_for_customize_settings;
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

public class Customize_settings {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Pojo_file_for_customize_settings obj2;

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
        report = new ExtentReports("./CRM_Test_Reports/Customize_Settings_report.html");
        report.addSystemInfo("Smartstack","CRM/digital assets");
        report.addSystemInfo("performance","Customize settings Test Report");
        test = report.startTest("Customize Settings");
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

            Customize_settings.timeout2000();

            boolean status1 = obj1.test_move_to_CRM_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_CRM_section"),"Test Passed:  Move to the CRM section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_CRM_section"),"Test Failed:  Can't move to the CRM section");
            }

            Customize_settings.timeout2000();

            boolean status2= obj1.test_customize_settings_section();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_customize_settings_section"),"Test Passed:  Move to the customize settings section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_customize_settings_section"),"Test Failed:  Can't move to the customize settings section");
            }

            Customize_settings.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_move_to_the_customize_settings_section() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_customize_settings(driver);
            boolean status = obj2.test_move_to_the_customize_settings_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_the_customize_settings_section"),"Test Passed:  Move to the customize settings section and display search option");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_the_customize_settings_section"),"Test Failed:  Can't move to the customize settings section not display search option");
            }

            Customize_settings.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_custom_menu_titles_with_invalidData() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_customize_settings(driver);
            boolean status = obj2.test_custom_menu_titles_with_invalidData("(^&*^&*^");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_custom_menu_titles_with_invalidData"),"Test Passed:  Update custom menu titles with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_custom_menu_titles_with_invalidData"),"Test Failed:  Can't update custom menu titles with invalid data");
            }

            Customize_settings.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_update_custom_menuTitles() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_customize_settings(driver);
            boolean status = obj2.test_update_custom_menuTitles("ABC","CDE");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_update_custom_menuTitles"),"Test Passed:  Display updated custom menu titles");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_update_custom_menuTitles"),"Test Failed:  Can't display updated custom menu titles");
            }

            Customize_settings.timeout2000();

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
