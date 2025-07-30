package Smartstack.net.Main_Test_Files;

import Smartstack.net.Authentication_access.Pojo_files.Individual_Stakeholder;
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

public class Smartstack_dashboard {

    WebDriver driver;

    First_test_file_for_smartstack obj1;

    Individual_Stakeholder obj2;

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
        report = new ExtentReports("./Authentication_Test_Reports/Loading stakeholder list and add new stakeholder_report.html");
        report.addSystemInfo("Smartstack","Authentication/access");
        report.addSystemInfo("performance","Loading stakeholder list and add new stakeholder Test Report");
        test = report.startTest("Stakeholder list");
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

    //THis method used to test stackholder dashboard section
    @Test(priority = 1)
    public void test_login_section_with_emailAddress() {

        total_count ++;
        try{
            obj1 = new First_test_file_for_smartstack(driver);
            boolean status = obj1.test_login_section();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_login_section"),"Test Passed:  Email section of Login section , working correctly");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_login_section"),"Test Failed:  Not display validation when click log in button without password");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Smartstack_dashboard.timeout2000();

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_login_section_with_password_and_code() {

        total_count++;
        try {
            obj1 = new First_test_file_for_smartstack(driver);
            boolean status1 = obj1.test_loginSection_with_password_and_code();
            if (status1 == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_loginSection_with_password_and_code"), "Test passed:  Move to the smartstack dashboard");
            } else {
                fail_count++;
                Assert.assertEquals(false, fail_method_list.add("test_loginSection_with_password_and_code"), "Not move to the Smartstack dashboard");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Smartstack_dashboard.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_move_to_authentication_access() {

        total_count ++;
        try{
            obj1 = new First_test_file_for_smartstack(driver);
            boolean status = obj1.test_move_to_authentication_access();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_authentication_access"),"Move to authentication/access");
            }else{
                fail_count ++;
                Assert.assertEquals(false,fail_method_list.add("test_move_to_authentication_access") , "can't move to the authentication/access");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Smartstack_dashboard.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_pagination_move_option_of_stakeholderList(){

        total_count ++;
        try{
            obj2 = new Individual_Stakeholder(driver);
            boolean status = obj2.test_stakeholder_list("1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_stakeholder_list"),"Display stakeholder list and moved between list");
            }else{
                fail_count ++;
                Assert.assertEquals(false,fail_method_list.add("test_stakeholder_list"),"Not moved stakeholder between list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Smartstack_dashboard.timeout1000();

        }catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_add_new_stakeholder_section1(){

        total_count ++;
        try{
            obj2 = new Individual_Stakeholder(driver);
            boolean status = obj2.test_add_new_stakeholder_section1("test20","jkfhjshf21312","test20@gmail.com","fds","3434","123","123");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_add_new_stakeholder_section1"),"Fill add stakeholder some details");
            }else{
                fail_count ++;
                Assert.assertEquals(false,fail_method_list.add("test_add_new_stakeholder_section1"),"Can't fill add stekeholder some details");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Smartstack_dashboard.timeout1000();
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_add_new_stakeholder_section2(){

        total_count ++;
        try{
            obj2 = new Individual_Stakeholder(driver);
            boolean status = obj2.test_add_new_stakeholder_section2("fsdf","4324","123","123","a@gmail.com");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_add_new_stakeholder_section2"),"Create a new stakeholder");
            }else{
                fail_count ++;
                Assert.assertEquals(false,fail_method_list.add("test_add_new_stakeholder_section2"),"Can't create a new stakeholder");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Smartstack_dashboard.timeout2000();
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_search_and_delete_created_stakeholder(){

        total_count ++;
        try{
            obj2 = new Individual_Stakeholder(driver);
            boolean status = obj2.test_search_and_delete_created_stakeholder("test20");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_search_and_delete_created_stakeholder"),"Searching and deleting selected stakeholder");
            }else{
                fail_count ++;
                Assert.assertEquals(false,fail_method_list.add("test_search_and_delete_created_stakeholder"),"Can't searching and deleting selected stakeholder");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Smartstack_dashboard.timeout2000();
        }catch (Exception ex) {
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
