package Smartstack.net.Authentication_access.Running_test_files;

import Smartstack.net.Authentication_access.Pojo_files.Pojo_file_for_stakeholder_group_tab;
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

public class Stakeholder_group_section {

    WebDriver driver;

    First_test_file_for_smartstack obj1;

    Pojo_file_for_stakeholder_group_tab obj2;

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
        report = new ExtentReports("./Authentication_Test_Reports/Stackeholder_group_report.html");
        report.addSystemInfo("Smartstack","Authentication/access");
        report.addSystemInfo("performance","Stackeholder group section Test Report");
        test = report.startTest("Stakeholder group section");
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

            Stakeholder_group_section.timeout2000();

            boolean status1 = obj1.test_move_to_authentication_access();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_authentication_access"),"Test Passed:  Move to the authentication section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_authentication_access"),"Test Failed:  can't move to the authentication section");
            }

            Stakeholder_group_section.timeout2000();

            boolean status2  = obj1.test_move_to_stakeholderGroup_section();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_stakeholderGroup_section"),"Test Passed:  Move to the stakeholder group section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_stakeholderGroup_section"),"Test Failed:  can't move to the stakeholder group section");
            }

            Stakeholder_group_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void Test_add_new_stakeholder_group() {
        total_count ++;
        try{
            obj2= new Pojo_file_for_stakeholder_group_tab(driver);
            boolean status  =  obj2.test_add_new_stakeholder_group("test stakeholder","test group","test sub group","test segment","test subsegment","test subset","Test staekholder2");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_add_new_stakeholder_group"),"Test Passed:  Create stakeholder groups");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_add_new_stakeholder_group"),"Test Failed:  Can't create stakeholder groups");
            }

            Stakeholder_group_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 3)
    public void test_edit_stakeholder_group() {
        total_count ++;
        try{
            obj2= new Pojo_file_for_stakeholder_group_tab(driver);
            boolean status  =  obj2.test_edit_stakeholder_group("1","1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_edit_stakeholder_group"),"Test Passed:  Display updated stakeholder group");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_edit_stakeholder_group"),"Test Failed:  Can't update the stakeholder group");
            }

            Stakeholder_group_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 4)
    public void test_stakeholder_group_settings() {
        total_count ++;
        try{
            obj2= new Pojo_file_for_stakeholder_group_tab(driver);
            boolean status  =  obj2.test_stakeholder_group_settings();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_stakeholder_group_settings"),"Test Passed:  Display validation when clearing group name");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_stakeholder_group_settings"),"Test Failed:  Not display validation when clearing group name");
            }

            Stakeholder_group_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 5)
    public void test_add_stakeholder_section1() {
        total_count ++;
        try{
            obj2= new Pojo_file_for_stakeholder_group_tab(driver);
            boolean status  =  obj2.test_add_stakeholder_section1("kfj38458");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_add_stakeholder_section1"),"Test Passed:  Not display stakeholder list when clearing search field");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_add_stakeholder_section1"),"Test Failed:  Not display stakeholder list when clearing search field");
            }

            Stakeholder_group_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 6)
    public void test_with_add_staekholder_section2() {
        total_count ++;
        try{
            obj2= new Pojo_file_for_stakeholder_group_tab(driver);
            boolean status  =  obj2.test_with_add_staekholder_section2("jayamini","Abeysinghe","jayaminiAbeysinghe");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_with_add_staekholder_section2"),"Test Passed: Display stakeholder list when searching with full name");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_with_add_staekholder_section2"),"Test Failed:  Not display stakeholder list when searching with full name");
            }

            Stakeholder_group_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 7)
    public void test_with_add_stakeholder_section3() {
        total_count ++;
        try{
            obj2= new Pojo_file_for_stakeholder_group_tab(driver);
            boolean status  =  obj2.test_with_add_stakeholder_section3("jayamini");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_with_add_stakeholder_section3"),"Test Passed: Display newly addesd stakeholder for selected stakeholder group");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_with_add_stakeholder_section3"),"Test Failed:  Not  Display newly addesd stakeholder for selected stakeholder group");
            }

            Stakeholder_group_section.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test(priority = 8)
    public void test_delete_stakeholderGroup() {
        total_count ++;
        try{
            obj2= new Pojo_file_for_stakeholder_group_tab(driver);
            boolean status  =  obj2.test_delete_stakeholderGroup();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_delete_stakeholderGroup"),"Test Passed: Deleting selected stakeholder group");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_delete_stakeholderGroup"),"Test Failed:  Not Deleting selected stakeholder group");
            }

            Stakeholder_group_section.timeout2000();

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
