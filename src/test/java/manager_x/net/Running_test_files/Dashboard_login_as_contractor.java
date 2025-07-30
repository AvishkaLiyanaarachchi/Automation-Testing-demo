package manager_x.net.Running_test_files;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import manager_x.net.Main_test_file.Main_test_file;
import manager_x.net.Pojo_files.Pojo_file_for_login_as_contractor_and_moveTo_dashboard;
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

public class Dashboard_login_as_contractor {

    WebDriver driver;

    Main_test_file obj;
    Pojo_file_for_login_as_contractor_and_moveTo_dashboard obj2;

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
        report = new ExtentReports("./ManagerX_Test_Reports/Contractor_Dashboard_report.html");
        report.addSystemInfo("Manager_x","Dashboard");
        report.addSystemInfo("live site","Contractor dashboard Test Report");
        test = report.startTest("Contractor Dashboard");
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
            driver.get("https://omega.iitcglobal.net/");//Give the URL
            driver.manage().window().maximize(); //maximize the browser window
            //Thread.sleep(5000);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 1)
    public void test_login_method1() {
        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status = obj.test_click_contractor_loginBtn_without_filling_fields();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_click_contractor_loginBtn_without_filling_fields"), "Test Passed:-  Can't login to teh system without email address and password");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_click_contractor_loginBtn_without_filling_fields"), "Test failed:-  Login to the system without email address and password");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 2)
    public void test_login_method2() {
        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_as_contractor();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_login_as_contractor"), "Test Passed:-  Login to the system with valid contractor account");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_as_contractor"), "Test failed:-  can't login to the system with valid contractor account");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
    @Test(priority = 3)
    public void test_select_property_address_and_search_tasks() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.select_property_address_and_search_tasks("jshjkh734");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("select_property_address_and_search_tasks"), "Test Passed:-  Select property address and search with invalid data of task section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("select_property_address_and_search_tasks"), "Test failed:-  Can't select property address and search with invalid data of task section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 4)
    public void test_search_task_with_validData() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.search_task_with_validData("planning");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_task_with_validData"), "Test Passed:-  Search task with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_task_with_validData"), "Test failed:-  Can't search task with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 5)
    public void test_move_to_task_details_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.move_to_task_details_section();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_task_details_section"), "Test Passed:-  Move to task details section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_task_details_section"), "Test failed:-  Can't move_to_task_details_section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 6)
    public void test_move_to_calender_and_searchData() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.move_to_calender_and_searchData("fhoy345");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_calender_and_searchData"), "Test Passed:-  Move to calender and search with invalid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_calender_and_searchData"), "Test failed:-  Can't Move to calender and search with invalid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 7)
    public void test_search_validdata_of_calender() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.search_validdata_of_calender("test");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_validdata_of_calender"), "Test Passed:-  Move to calender and search with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_validdata_of_calender"), "Test failed:-  Can't Move to calender and search with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 8)
    public void test_move_to_notification_and_searchData() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.move_to_notification_and_searchData("dfdsf2543");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_notification_and_searchData"), "Test Passed:-  Move to notifications and search with invalid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_notification_and_searchData"), "Test failed:-  Can't Move to calender and search with invalid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 9)
    public void test_search_with_validData_of_notifications() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.search_with_validData_of_notifications("soil test");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_with_validData_of_notifications"), "Test Passed:-  Move to notifications and search with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_with_validData_of_notifications"), "Test failed:-  Can't Move to calender and search with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 10)
    public void test_move_to_contacts_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.move_to_contacts_section("xfsd34534");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_contacts_section"), "Test Passed:-  Move to contacts and search with invalid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_contacts_section"), "Test failed:-  Can't Move to contacts and search with invalid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 11)
    public void test_search_contacts_with_validData() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.search_contacts_with_validData("Shawn","Shawn Edwards");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_contacts_with_validData"), "Test Passed:-  Move to contacts and search with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_contacts_with_validData"), "Test failed:-  Can't Move to contacts and search with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 12)
    public void test_move_to_settings_and_clear_fields() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.move_to_settings_and_clear_fields();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_settings_and_clear_fields"), "Test Passed:-  move_to_settings_and_clear_fields");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_settings_and_clear_fields"), "Test failed:-  Can't move_to_settings_and_clear_fields");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 13)
    public void test_update_setting_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_contractor_and_moveTo_dashboard(driver);
            boolean status = obj2.update_setting_section("Contractor1","user1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("update_setting_section"), "Test Passed:-  move_to_settings_and_update settings");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("update_setting_section"), "Test failed:-  Can't move_to_settings_and_update settings");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_contractor.timeout2000();

        } catch (Exception ex) {
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
