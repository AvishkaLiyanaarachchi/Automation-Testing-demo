package Smartstack.net.Authentication_access.Running_test_files;

import Smartstack.net.Authentication_access.Pojo_files.Search_and_filter_stakeholder;
import Smartstack.net.First_Test_Files.First_test_file_for_smartstack;
import Smartstack.net.Main_Test_Files.Smartstack_dashboard;
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

public class Search_and_filter_stakeholder_in_list {

    WebDriver driver;

    First_test_file_for_smartstack obj1;
    Search_and_filter_stakeholder obj2;

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
        report = new ExtentReports("./Authentication_Test_Reports/Search_and_filter_stakeholders_report.html");
        report.addSystemInfo("Smartstack","Authentication/access");
        report.addSystemInfo("performance","Search and filter stakeholders inside list Test Report");
        test = report.startTest("Stakeholder list");
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

            Search_and_filter_stakeholder_in_list.timeout2000();

            boolean status1 = obj1.test_move_to_authentication_access();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_authentication_access"),"Test Passed:  Move to the authentication section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_authentication_access"),"Test Failed:  can't move to the authentication section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Search_and_filter_stakeholder_in_list.timeout2000();

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_search_option_of_stakeholder_list() {
        total_count ++;
        try{
            obj2 = new Search_and_filter_stakeholder(driver);
            boolean status = obj2.test_search_option_of_stakeholder_list("urtowiey4897584","Marji","Titleyy","mtitley597@disqus.com");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_option_of_stakeholder_list"),"Test Passed:  Display stakeholder according to the searched data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_option_of_stakeholder_list"),"Test Failed:  Not display stakeholder according to the searched data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Search_and_filter_stakeholder_in_list.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_search_option_of_stakeholder_list_with_fullName() {
        total_count ++;
        try{
            obj2 = new Search_and_filter_stakeholder(driver);
            boolean status = obj2.test_search_option_of_stakeholder_list_with_fullName("Marji Titleyy");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_option_of_stakeholder_list_with_fullName"),"Test Passed:  Display stakeholder When searching with full name");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_option_of_stakeholder_list_with_fullName"),"Test Failed:  Not display stakeholder When searching with full name");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Search_and_filter_stakeholder_in_list.timeout1000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_open_filter_stakeholder_group_option() {
        total_count ++;
        try{
            obj2 = new Search_and_filter_stakeholder(driver);
            boolean status = obj2.test_open_filter_stakeholder_group_option();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_open_filter_stakeholder_group_option"),"Test Passed:  Display correct stakeholder list according to the selected stakeholder group");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_open_filter_stakeholder_group_option"),"Test Failed:  Not display correct stakeholder list according to the selected stakeholder group");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Search_and_filter_stakeholder_in_list.timeout1000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_filter_with_staholderGroups() {
        total_count ++;
        try{
            obj2 = new Search_and_filter_stakeholder(driver);
            boolean status = obj2.test_filter_with_staholderGroups();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_filter_with_staholderGroups"),"Test Passed:  Not display correct stakeholder list when selecting stakeholder group as administrator");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_filter_with_staholderGroups"),"Test Failed:  Not display correct stakeholder list when selecting stakeholder group as administrator");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Search_and_filter_stakeholder_in_list.timeout1000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_filter_with_showAll_options() {
        total_count ++;
        try{
            obj2 = new Search_and_filter_stakeholder(driver);
            boolean status = obj2.test_filter_with_showAll_options();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_filter_with_showAll_options"),"Test Passed:  Display stakeholder list according to the selected show all option");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_filter_with_showAll_options"),"Test Failed:  Not display stakeholder list according to the selected show all option");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Search_and_filter_stakeholder_in_list.timeout1000();
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
