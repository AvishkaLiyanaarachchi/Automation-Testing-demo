package Meris_hub.Running_test_files;

import Meris_hub.Main_test_files.Main_test_file;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Objects;

public class Merishub {

    WebDriver driver;

    Main_test_file obj;
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
    public static void startTest(){
        report = new ExtentReports("./Meris hub/Login page report.html");
        report.addSystemInfo("Meris hub","Login section");
        test = report.startTest("Meris hub Report");
    }

    @BeforeClass
    public void beforeClass(){
        try{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://internal.meris.com.au/");
            driver.manage().window().maximize();

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 1)
    public void test_method_1() {
        total_count ++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_method1();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_method_1"),"Test passed:-  Display validations when click login button without email and password");
            }else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_method_1"),"Test failed:- Not display validations when click login button without email and password");
            }
            System.out.println("pass method counts: "+pass_count);
            System.out.println("fail method counts: "+fail_count);
            System.out.println("pass method lists: "+pass_method_list);
            System.out.println("fail method lists: "+fail_method_list);

            Merishub.timeout2000();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_method_2() {
        total_count ++;
        try{
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_method2();
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_method_2"), "Test passed:- Display validations for invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(true, fail_method_list.add("test_method_2"), "Test failed:- Not display validations for invalid data");
            }
            System.out.println("pass method counts: "+pass_count);
            System.out.println("fail method counts: "+fail_count);
            System.out.println("pass method lists: "+pass_method_list);
            System.out.println("fail method lists: "+fail_method_list);

            Merishub.timeout2000();
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
