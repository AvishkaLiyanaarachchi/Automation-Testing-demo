package Smartstack.net.Authentication_access.Running_test_files;

import Smartstack.net.Authentication_access.Pojo_files.Pojo_file_for_Edit_Stakeholder;
import Smartstack.net.Authentication_access.Pojo_files.Search_and_filter_stakeholder;
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

public class Edit_Stakeholder {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Pojo_file_for_Edit_Stakeholder obj;

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

    public static void timeout1000(){
        try{
            Thread.sleep(1000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @BeforeClass
    public static void startTest()
    {
        report = new ExtentReports("./Authentication_Test_Reports/Edit_stakeholders_report.html");
        report.addSystemInfo("Smartstack","Authentication/access");
        report.addSystemInfo("performance","Edit Stakeholder inside list Test Report");
        test = report.startTest("Edit Stakeholder section");
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
    public void test_login_section() {

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

            Edit_Stakeholder.timeout2000();

            boolean status1 = obj1.test_move_to_authentication_access();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_login_section"),"Test Passed:  Move to the authentication section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_login_section"),"Test Failed:  can't move to the authentication section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Edit_Stakeholder.timeout2000();

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_with_edit_stakeholder() {
        total_count ++;
        try{
            obj = new Pojo_file_for_Edit_Stakeholder(driver);
            boolean status = obj.test_with_edit_stakeholder("march13","065789065435","0657854367893","0708954367892","Pork Rd","Melborn","ABC","3847urhe","Aus","678976543");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_with_edit_stakeholder"),"Test Passed:  Display edited stakeholder");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_with_edit_stakeholder"),"Test Failed:  Not display edited stakeholder");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Edit_Stakeholder.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_add_stakeholderGroup_option() {
        total_count ++;
        try{
            obj = new Pojo_file_for_Edit_Stakeholder(driver);
            boolean status = obj.test_add_stakeholderGroup_option("900");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_add_stakeholderGroup_option"),"Test Passed:  Display selected stakeholder group with access options");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_add_stakeholderGroup_option"),"Test Failed:  Can't select stakehodler group");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Edit_Stakeholder.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_select_localization_settings() {
        total_count ++;
        try{
            obj = new Pojo_file_for_Edit_Stakeholder(driver);
            boolean status = obj.test_select_localization_settings("march13","jfhlds3948574","Eng");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_select_localization_settings"),"Test Passed:  Display selected stakeholder group with access options");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_select_localization_settings"),"Test Failed:  Can't select stakehodler group");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Edit_Stakeholder.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_stakeholder_Access_setting() {
        total_count ++;
        try{
            obj = new Pojo_file_for_Edit_Stakeholder(driver);
            boolean status = obj.test_stakeholder_Access_setting("8975jrwe");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_stakeholder_Access_setting"),"Test Passed:  Not display stakeholder dashboard access settings");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_stakeholder_Access_setting"),"Test Failed:  Not display stakeholder list when filtering and searching");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Edit_Stakeholder.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_social_accounts_section() {
        total_count ++;
        try{
            obj = new Pojo_file_for_Edit_Stakeholder(driver);
            boolean status = obj.test_social_accounts_section("57489hfhldjf","https://www.google.com/","https://au.linkedin.com/","test profile");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_social_accounts_section"),"Test Passed:  Create new social account");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_social_accounts_section"),"Test Failed:  Not Create new social account");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Edit_Stakeholder.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_manage_social_accounts() {
        total_count ++;
        try{
            obj = new Pojo_file_for_Edit_Stakeholder(driver);
            boolean status = obj.test_manage_social_accounts("1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_manage_social_accounts"),"Test Passed: manage social account section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_manage_social_accounts"),"Test Failed:  Can't manage social account section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Edit_Stakeholder.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 9)
    public void test_place_lived_section() {
        total_count ++;
        try{
            obj = new Pojo_file_for_Edit_Stakeholder(driver);
            boolean status = obj.test_place_lived_section("pork city","melborn");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_place_lived_section"),"Test Passed: Update place lived section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_place_lived_section"),"Test Failed:  Can't update place lived section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Edit_Stakeholder.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    @Test(priority = 10)
    public void test_update_selected_stakeholder() {
        total_count ++;
        try{
            obj = new Pojo_file_for_Edit_Stakeholder(driver);
            boolean status = obj.test_update_selected_stakeholder();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_update_selected_stakeholder"),"Test Passed: Update selected stakeholder");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_update_selected_stakeholder"),"Test Failed:  Not Update selected stakeholder");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Edit_Stakeholder.timeout2000();
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
