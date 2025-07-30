package manager_x.net.Running_test_files;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import manager_x.net.Main_test_file.Main_test_file;
import manager_x.net.Pojo_files.Pojo_file_for_login_as_admin_and_move_to_system;
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

public class ManagerX_dashboard_login_as_admin {

    WebDriver driver;

    Main_test_file obj;

    Pojo_file_for_login_as_admin_and_move_to_system obj2;

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
        report = new ExtentReports("./ManagerX_Test_Reports/Admin_Dashboard_report.html");
        report.addSystemInfo("Manager_x","Dashboard");
        report.addSystemInfo("live site","Admin dashboard Test Report");
        test = report.startTest("Admin Dashboard");
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
            boolean status = obj.test_login_section1();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_login_section1"), "Test Passed:-  Can't login to teh system without email address and password");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_section1"), "Test failed:-  Login to the system without email address and password");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }


    @Test(priority = 2)
    public void test_login_method2() {
        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_section2();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_login_section2"), "Test Passed:-  Can't login to teh system with email address only");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_section2"), "Test failed:-  Login to the system with email address only");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 3)
    public void test_login_method3() {
        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_section3();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_login_section3"), "Test Passed:-  Can't login to teh system with password only");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_section3"), "Test failed:-  Login to the system with password only");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
    @Test(priority = 4)
    public void test_login_method4() {
        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_section4();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_login_section4"), "Test Passed:-  Can't login to teh system with invalid email address and password");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_section4"), "Test failed:-  Login to the system with invalid email address and password");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 5)
    public void test_login_method5() {
        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_section5();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_login_section5"), "Test Passed:-  Login to the system with valid account details");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_section5"), "Test failed:-   Can't login to the system with valid account details");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 6)
    public void test_select_address_section() {
        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status =obj.test_select_address_section();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_select_address_section"), "Test Passed:-  Select property address and display details");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_select_address_section"), "Test failed:-   Can't select property address and not display details");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 7)
    public void test_move_to_client_section_select_pagination() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.move_to_client_section_select_pagination("dgf43543");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_client_section_select_pagination"), "Test Passed:-  MOve to client and select paginations");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_client_section_select_pagination"), "Test failed:-   Can't move to client an select paginations");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 8)
    public void test_search_client_with_valid_data() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.search_client_with_valid_data("Shawn","Shawn Edwards");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_client_with_valid_data"), "Test Passed:-  Display clients when searching with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_client_with_valid_data"), "Test failed:-   Can't display clients when searching with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 9)
    public void test_add_new_client_method1() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_new_client_method1();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_client_method1"), "Test Passed:-  Display validation when click submit button without filling fields");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_client_method1"), "Test failed:-   Can't display validation when click submit button without filling fields");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 10)
    public void test_add_new_client_method2() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_new_client_method2("client1","test1","fdsf45435");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_client_method2"), "Test Passed:-  Display validation under email field for invalid email");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_client_method2"), "Test failed:-   Can't display validation under email field for invalid email");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 11)
    public void test_add_new_client_method3() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_new_client_method3("clientab12@gmail.com","464362354265","2 Vermont Street","Horsham","Vic","3400");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_client_method3"), "Test Passed:-  Display newly creatred client under list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_client_method3"), "Test failed:-   Can't display newly create client under list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 12)
    public void test_open_property_address_option() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.open_property_address_option();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("open_property_address_option"), "Test Passed:-  Open property address option and display address");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("open_property_address_option"), "Test failed:-   Can't open property address option and display address");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 13)
    public void test_edit_cleint_from_list() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.edit_cleint_from_list("1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_cleint_from_list"), "Test Passed:-  Updating client from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_cleint_from_list"), "Test failed:-   Can't updating client from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 14)
    public void test_move_contacts_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.move_contacts_section("fd345345d");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_contacts_section"), "Test Passed:-  Move to the contacts section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_contacts_section"), "Test failed:-   Can't move to the contacts section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 15)
    public void test_search_with_validdata_inside_contacts_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.search_with_validdata_inside_contacts_section("Shawn","Shawn Edwards");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_with_validdata_inside_contacts_section"), "Test Passed:-  Search contacts with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_with_validdata_inside_contacts_section"), "Test failed:-   Can't search contacts with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 16)
    public void test_add_new_contact() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_new_contact();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_contact"), "Test Passed:-  Move to add new contact section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_contact"), "Test failed:-   Can't move to add new contact section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 17)
    public void test_add_new_contact_method2() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_new_contact_method2("Contact2","my test2","f534532");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_contact_method2"), "Test Passed:-  Can't create contact with invalid email address");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_contact_method2"), "Test failed:-  Create contact with invalid email address");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 18)
    public void test_add_new_contact_mehtod3() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_new_contact_mehtod3("contactab2@gmail.com","123","46345237474","test ABC");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_contact_method2"), "Test Passed:-  Create new  contact");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_contact_method2"), "Test failed:-  Can't create new contact");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 19)
    public void test_edit_contact_from_list() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.edit_contact_from_list("1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_contact_from_list"), "Test Passed:-  Updating selected contact from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_contact_from_list"), "Test failed:-  Can't update selected contact from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 20)
    public void test_import_contact_for_list() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.import_contact_for_list();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("import_contact_for_list"), "Test Passed:-  Importing contact from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("import_contact_for_list"), "Test failed:-  Can't importing contact from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 21)
    public void test_move_to_stagesList_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.move_to_stagesList_section("dfhjdfh542");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_stagesList_section"), "Test Passed:-  Move to stages list and search with invalid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_stagesList_section"), "Test failed:-  Can't move to stages list and search with invalid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 22)
    public void test_search_stages_list() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.search_stages_list("planning");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_stages_list"), "Test Passed:-  Move to stages list and search with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_stages_list"), "Test failed:-  Can't move to stages list and search with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 23)
    public void test_move_ta_task_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.move_ta_task_section("rwerwefs");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_ta_task_section"), "Test Passed:-  Move to task section and search with invalid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_ta_task_section"), "Test failed:-  Can't move to task section and search with invalid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 24)
    public void test_search_task_with_validData() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.search_task_with_validData("Appeal");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_task_with_validData"), "Test Passed:-  Move to task section and search with valid data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_task_with_validData"), "Test failed:-  Can't move to task section and search with valid data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 25)
    public void test_add_new_task_method1() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_new_task_method1();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_task_method1"), "Test Passed:-  add new task");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_task_method1"), "Test failed:-  Can't add new tas");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 26)
    public void test_move_to_stage_level_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.move_to_stage_level_section();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_stage_level_section"), "Test Passed:- Move to stage level section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_stage_level_section"), "Test failed:- Can't Move to stage level section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 27)
    public void test_add_stage_and_move_to_subStage() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_stage_and_move_to_subStage("test stage1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_stage_and_move_to_subStage"), "Test Passed:- Move to stage level section and add stage");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_stage_and_move_to_subStage"), "Test failed:- Can't Move to stage level section and add stage");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 28)
    public void test_add_sub_stage_and_move_to_sub_category_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_sub_stage_and_move_to_sub_category_section("test sub stage1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_sub_stage_and_move_to_sub_category_section"), "Test Passed:- Move to stage level section and add sub stage");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_sub_stage_and_move_to_sub_category_section"), "Test failed:- Can't Move to stage level section and add sub stage");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 29)
    public void test_create_sub_category_in_stage_level() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.create_sub_category_in_stage_level("test sub stage category 1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_sub_stage_and_move_to_sub_category_section"), "Test Passed:- Move to stage level section and add sub stage category");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_sub_stage_and_move_to_sub_category_section"), "Test failed:- Can't Move to stage level section and add sub stage categpry");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
    @Test(priority = 30)
    public void test_add_new_task_method2() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_new_task_method2("test task1","Create task");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_task_method2"), "Test Passed:-  add new task");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_task_method2"), "Test failed:-  Can't add new tas");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 31)
    public void test_move_to_calender_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.move_to_calender_section("kjsfhdj347543");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_calender_section"), "Test Passed:- Move to the calender section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_calender_section"), "Test failed:- Can't move_to_calender_section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 32)
    public void test_edit_task_from_list() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.edit_task_from_list("1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_task_from_list"), "Test Passed:- Move to the edit task section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_task_from_list"), "Test failed:- Can't move to the edit task section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 33)
    public void test_edit_task_with_entering_subTask_subNote() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.edit_task_with_entering_subTask_subNote("sub task1","Sub note1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_task_with_entering_subTask_subNote"), "Test Passed:- Updating task with add subtask and sub note");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_task_with_entering_subTask_subNote"), "Test failed:- Can't updating task with add subtask and sub note");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 34)
    public void test_move_to_contract_and_search() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.move_to_contract_and_search("fds4534","Deposit");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_contract_and_search"), "Test Passed:- Move to contract and search data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_contract_and_search"), "Test failed:- Can't Move to contract and search data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 35)
    public void test_move_to_notification_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.move_to_notification_section("fds4534");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_notification_section"), "Test Passed:- Move to notification and search data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_notification_section"), "Test failed:- Can't Move to notification and search data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 36)
    public void test_search_notification_from_list_move_to_setitngs() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.search_notification_from_list_move_to_setitngs("soil test");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("search_notification_from_list_move_to_setitngs"), "Test Passed:- Move to notification and search data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("search_notification_from_list_move_to_setitngs"), "Test failed:- Can't Move to notification and search data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 37)
    public void test_update_setting_section_move_toAccess_level_section() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.update_setting_section_move_toAccess_level_section("Admin","user","Admin");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("update_setting_section_move_toAccess_level_section"), "Test Passed:- Move to access levels section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("update_setting_section_move_toAccess_level_section"), "Test failed:- Can't Move to access levels section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Test(priority = 38)
    public void test_add_new_role_in_accessLevel() {
        total_count++;
        try {
            obj2 = new Pojo_file_for_login_as_admin_and_move_to_system(driver);
            boolean status =obj2.add_new_role_in_accessLevel("Test admin");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_role_in_accessLevel"), "Test Passed:- Move to access levels section and add role");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_role_in_accessLevel"), "Test failed:- Can't Move to access levels section and add role");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            ManagerX_dashboard_login_as_admin.timeout2000();

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

