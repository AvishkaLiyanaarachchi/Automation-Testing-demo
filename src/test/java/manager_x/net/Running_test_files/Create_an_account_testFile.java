package manager_x.net.Running_test_files;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import manager_x.net.Pojo_files.Create_an_account;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Objects;

public class Create_an_account_testFile {

    WebDriver driver;

    Create_an_account obj;

    int pass_count;
    int fail_count;
    int total_count;
    ArrayList<String> pass_method_list = new ArrayList<String>();
    ArrayList<String> fail_method_list = new ArrayList<String>();
    static ExtentTest test;
    static ExtentReports report;

    public static void timeout2000() {
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @BeforeClass
    public static void startTest()
    {
        report = new ExtentReports("./ManagerX_Test_Reports/Create_an_account_report.html");
        report.addSystemInfo("Manager_x","Dashboard");
        report.addSystemInfo("live site","Create an account Test Report");
        test = report.startTest("Create an account");
    }

    //THis method run before all methods
    @BeforeClass
    public void beforeClass() {
        try {
            WebDriverManager.chromedriver().setup();//Setup the chrome driver
//            ChromeOptions ops = new ChromeOptions();
//            ops.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver();
            //driver.manage().deleteAllCookies();
            //Thread.sleep(5000);
            driver.get("https://managerxpro.com");//Give the URL
            driver.manage().window().maximize(); //maximize the browser window
            //Thread.sleep(5000);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 1)
    public void create_an_account_method1() {
        total_count++;
        try{
            obj = new Create_an_account(driver);
            boolean status = obj.click_create_an_account_btn_without_email_and_password();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_create_an_account_btn_without_email_and_password"), "Test Passed:-  Can't login create an account section without email address and password");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_create_an_account_btn_without_email_and_password"), "Test failed:-  Login to create an account section without email address and password");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Create_an_account_testFile.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void create_an_account_method2() {
        total_count++;
        try{
            obj = new Create_an_account(driver);
            boolean status = obj.click_create_an_account_button_with_invalid_email_and_password("sdhas","3532");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_create_an_account_button_with_invalid_email_and_password"), "Test Passed:-  Can't login create an account section with invalid email address and password");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_create_an_account_button_with_invalid_email_and_password"), "Test failed:-  Login to create an account section with invalid email address and password");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Create_an_account_testFile.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void create_an_account_method3() {
        total_count++;
        try{
            obj = new Create_an_account(driver);
            boolean status = obj.click_create_an_account_button_with_email_and_password("testadmin5@gmail.com","123");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_create_an_account_button_with_email_and_password"), "Test Passed:-  Login to create an account section with valid email address and password");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_create_an_account_button_with_invalid_email_and_password"), "Test failed:-  Can't login to create an account section with valid email address and password");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Create_an_account_testFile.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void create_an_account_method4() {
        total_count++;
        try{
            obj = new Create_an_account(driver);
            boolean status = obj.click_create_admin_accountBtn_without_filling_fields();
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_create_admin_accountBtn_without_filling_fields"), "Test Passed:-  When click create admin account button without filling fields, display validations");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_create_admin_accountBtn_without_filling_fields"), "Test failed:-  Not display validation when click create admin account button without filling fields");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Create_an_account_testFile.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void create_an_account_method5() {
        total_count++;
        try{
            obj = new Create_an_account(driver);
            boolean status = obj.create_admin_account("admin","test1","23748374","1901/11 Barrack Square","Perth","WA","6000");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("create_admin_account"), "Test Passed:-  Create admin account");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("create_admin_account"), "Test failed:-  Can't create admin account");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Create_an_account_testFile.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void create_an_account_method6() {
        total_count++;
        try{
            obj = new Create_an_account(driver);
            boolean status = obj.click_create_account_of_projectManager("testpm5@gmail.com","123");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_create_account_of_projectManager"), "Test Passed:-  Display validation when click create project manager account button without filling fields");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_create_account_of_projectManager"), "Test failed:-  Not display validation when click create project manager account button without filling fields");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Create_an_account_testFile.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void create_an_account_method7() {
        total_count++;
        try{
            obj = new Create_an_account(driver);
            boolean status = obj.creeta_account_for_project_manager("project manager","test1","845728973485325","Test1");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_create_account_of_projectManager"), "Test Passed:-  Display validation when click create project manager account button without filling fields");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_create_account_of_projectManager"), "Test failed:-  Not display validation when click create project manager account button without filling fields");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Create_an_account_testFile.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void create_an_account_method8() {
        total_count++;
        try{
            obj = new Create_an_account(driver);
            boolean status = obj.click_create_accountBTn_for_contractor("testcon5@gmail.com","123");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_create_accountBTn_for_contractor"), "Test Passed:-  Display validations when click create an individual contractor button without filling fields");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_create_accountBTn_for_contractor"), "Test failed:-  Not display validations when click create an individual contractor button without filling fields");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Create_an_account_testFile.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 9)
    public void ccreate_an_account_method9() {
        total_count++;
        try{
            obj = new Create_an_account(driver);
            boolean status = obj.create_account_for_contractor("contractor","test1","63636365346");
            if(status == true){
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("click_create_accountBTn_for_contractor"), "Test Passed:-  Create an contractor account");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("click_create_accountBTn_for_contractor"), "Test failed:-  Not create an contractor account");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Create_an_account_testFile.timeout2000();
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
