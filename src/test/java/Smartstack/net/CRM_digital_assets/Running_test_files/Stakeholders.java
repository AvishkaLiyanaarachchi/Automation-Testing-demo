package Smartstack.net.CRM_digital_assets.Running_test_files;

import Smartstack.net.CRM_digital_assets.Pojo_files.Pojo_file_for_Stakeholders;
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

public class Stakeholders {

    WebDriver driver;

    First_test_file_for_smartstack obj1;

    Pojo_file_for_Stakeholders obj2;

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
        report = new ExtentReports("./CRM_Test_Reports/Stakeholders_section_report.html");
        report.addSystemInfo("Smartstack","CRM/digita assets");
        report.addSystemInfo("performance","Stakeholder list Test Report");
        test = report.startTest("Stakeholders section");
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
    public void test_pagination_and_move_option_of_stakeholderList() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_Stakeholders(driver);
            boolean status = obj2.test_pagination_and_move_option_of_stakeholderList("1");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_pagination_and_move_option_of_stakeholderList"),"Test Passed:  pagination section and move option are working");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_pagination_and_move_option_of_stakeholderList"),"Test Failed:  pagination section and move option aren't working");
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
    public void test_records_perpage_option_and_sorting_option() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_Stakeholders(driver);
            boolean status = obj2.test_records_perpage_option_and_sorting_option();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_records_perpage_option_and_sorting_option"),"Test Passed:  Records per page and sorting options are working");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_records_perpage_option_and_sorting_option"),"Test Failed:  Records per page and sorting options are working");
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
    public void test_search_option_of_stakeholderList() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_Stakeholders(driver);
            boolean status = obj2.test_search_option_of_stakeholderList("ghfjh76y547","Beverie ","Mapam","bmapam4ys@census.gov","Beverie Mapam");

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_option_of_stakeholderList"),"Test Passed:  Search option is working");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_search_option_of_stakeholderList"),"Test Failed:  Search option is not working");
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
    public void test_viewing_and_view_stakeholder_options() {

        total_count ++;
        try{
            obj2 = new Pojo_file_for_Stakeholders(driver);
            boolean status = obj2.test_viewing_and_view_stakeholder_options();

            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_viewing_and_view_stakeholder_options"),"Test Passed:  Viewing and view stakeholder option are working");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_viewing_and_view_stakeholder_options"),"Test Failed:  Viewing and view stakeholder option are not working");
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
