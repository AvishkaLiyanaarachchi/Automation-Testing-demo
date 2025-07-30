package Smartstack.net.Ecommerce.Running_java_files;

import Smartstack.net.Ecommerce.Pojo_files.Pojo_file_for_product_category;
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

public class Product_category {

    WebDriver driver;

    First_test_file_for_smartstack obj1;

    Pojo_file_for_product_category obj2;

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
        report = new ExtentReports("./Ecommerce_Test_Reports/Product_category_section_report.html");
        report.addSystemInfo("Smartstack","e-Commerce");
        report.addSystemInfo("performance","Create/update/delete product category with sub category Test Report");
        test = report.startTest("Product Category");
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
    public void test_move_to_Ecommerce_section() {

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

            Product_category.timeout2000();

            boolean status1 = obj1.test_move_to_ecommerce_section();
            if(status1 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_ecommerce_section"),"Test Passed:  Move to the Ecommerce section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_ecommerce_section"),"Test Failed:  Can't move to the Ecommerce section");
            }

            Product_category.timeout2000();

            boolean status2 = obj1.test_move_to_product_category_tab();
            if(status2 == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_move_to_product_category_tab"),"Test Passed:  Move to the product category of Ecommerce section");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_move_to_product_category_tab"),"Test Failed:  Can't move to the product category of Ecommerce section");
            }

            Product_category.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_create_product_category_with_invalidData() {

        total_count++;
        try{
            obj2 = new Pojo_file_for_product_category(driver);
            boolean status = obj2.test_create_product_category_with_invalidData("&%&%","Category1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_product_category_with_invalidData"),"Test Passed:  Create product category with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_product_category_with_invalidData"),"Test Failed:  Can't create product category with invalid data");
            }

            Product_category.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_create_product_sub_category() {

        total_count++;
        try{
            obj2 = new Pojo_file_for_product_category(driver);
            boolean status = obj2.test_create_product_sub_category("&%&%","Sub category 1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_product_category"),"Test Passed:  Create product sub category with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_product_category"),"Test Failed:  Can't create product sub category with invalid data");
            }

            Product_category.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_create_segment() {

        total_count++;
        try{
            obj2 = new Pojo_file_for_product_category(driver);
            boolean status = obj2.test_create_segment("&%&%","segment 1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_segment"),"Test Passed:  Create segment with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_segment"),"Test Failed:  Can't create segment with invalid data");
            }

            Product_category.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_create_subsegment() {

        total_count++;
        try{
            obj2 = new Pojo_file_for_product_category(driver);
            boolean status = obj2.test_create_subsegment("&%&%","Sub segment 1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_subsegment"),"Test Passed:  Create sub segment with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_subsegment"),"Test Failed:  Can't create sub segment with invalid data");
            }

            Product_category.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_create_type() {

        total_count++;
        try{
            obj2 = new Pojo_file_for_product_category(driver);
            boolean status = obj2.test_create_type("&%&%","Type 1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_type"),"Test Passed:  Create type with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_type"),"Test Failed:  Can't create type with invalid data");
            }

            Product_category.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_create_varient() {

        total_count++;
        try{
            obj2 = new Pojo_file_for_product_category(driver);
            boolean status = obj2.test_create_varient("&%&%","Varient 1");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_create_varient"),"Test Passed:  Create varient with invalid data");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_create_varient"),"Test Failed:  Can't create varient with invalid data");
            }

            Product_category.timeout2000();

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_edit_product_category() {

        total_count++;
        try{
            obj2 = new Pojo_file_for_product_category(driver);
            boolean status = obj2.test_edit_product_category("update category");
            if(status == true){
                pass_count ++;
                Assert.assertEquals(true, pass_method_list.add("test_edit_product_category"),"Test Passed:  Update product category");
            }else{
                fail_count ++;
                Assert.assertEquals(false, fail_method_list.add("test_edit_product_category"),"Test Failed:  Can't update product category");
            }

            Product_category.timeout2000();

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
